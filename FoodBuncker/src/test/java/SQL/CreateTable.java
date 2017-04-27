package SQL;

import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable {

	public CreateTable() {
		
		String[] table = {"ORDERMENU", "MORDER", "MENU", "REPLYBOARD", "BOARD", "PLAN", "OPENCLOSE", "PLACE", "TRUCKIMAGE", "TRUCKINFO"};
		String cntTable = "Select count(*) as cnt from tab where tname=";
		String drop = "Drop Table ";
	
		String[] createTable = {
				"CREATE TABLE TRUCKINFO "
						+ "(T_NO NUMBER(5) Constraint T_NO_PK Primary Key, "
						+ "T_CHEF VARCHAR2(20) NOT NULL, "
						+ "T_NAME VARCHAR2(30) NOT NULL, "
						+ "T_PHONE VARCHAR2(15) NOT NULL, "
						+ "T_OPEN VARCHAR2(50) NOT NULL, "
						+ "T_EMAIL VARCHAR2(50) NOT NULL, "
						+ "T_NUM VARCHAR2(20) NOT NULL, "
						+ "T_ID VARCHAR2(20) NOT NULL, "
						+ "T_PASSWORD VARCHAR2(20) NOT NULL, "
						+ "T_KEYWORD VARCHAR2(200) NOT NULL, "
						+ "T_BODY VARCHAR2(2000) NOT NULL, "
						+ "T_ISSHOW CHAR(1) NOT NULL)",
				"CREATE TABLE TRUCKIMAGE "
						+ "(TI_NO NUMBER(5) Constraint TI_NO_PK Primary Key, "
						+ "TI_T_NO NUMBER(5) references TRUCKINFO(T_NO), "
						+ "TI_SAVENAME VARCHAR2(100) NOT NULL, "
						+ "TI_IMGBODY VARCHAR2(200) NOT NULL, "
						+ "TI_THUMB VARCHAR2(100) NOT NULL, "
						+ "TI_GRADE NUMBER(1) NOT NULL, "
						+ "TI_ISSHOW CHAR(1) NOT NULL)",
				"CREATE TABLE PLACE "
						+ "(P_NO NUMBER(5) Constraint P_NO_PK Primary Key, "
						+ "P_ADDRESS VARCHAR2(200) NOT NULL, "
						+ "P_LAT NUMBER(18, 15) NOT NULL, "
						+ "P_LNG NUMBER(18, 15) NOT NULL, "
						+ "P_DATE DATE NOT NULL, "
						+ "P_ISSHOW CHAR(1) NOT NULL)",
				"CREATE TABLE OPENCLOSE "
						+ "(OC_NO NUMBER(5) Constraint OC_NO_PK Primary Key, "
						+ "OC_T_NO NUMBER(5) references TRUCKINFO(T_NO), "
						+ "OC_OPEN DATE NOT NULL, "
						+ "OC_CLOSE DATE, "
						+ "OC_P_NO NUMBER(5) references PLACE(P_NO))",
				"CREATE TABLE PLAN "
						+ "(PP_NO NUMBER(5) Constraint PP_NO_PK Primary Key, "
						+ "PP_T_NO NUMBER(5) References TRUCKINFO(T_NO), "
						+ "PP_P_NO NUMBER(5) References PLACE(P_NO), "
						+ "PP_DATE VARCHAR2(50) NOT NULL)",
				"CREATE TABLE BOARD "
						+ "(B_NO NUMBER(10) Constraint B_NO_PK Primary Key, "
						+ "B_T_NO NUMBER(5) references TRUCKINFO(T_NO), "
						+ "B_BODY VARCHAR2(200) NOT NULL, "
						+ "B_DATE DATE NOT NULL, "
						+ "B_ISSHOW CHAR(1) NOT NULL)",
				"CREATE TABLE REPLYBOARD "
						+ "(RB_NO NUMBER(10) Constraint RB_NO_PK Primary Key, "
						+ "RB_B_NO NUMBER(5) references BOARD(B_NO), "
						+ "RB_BODY VARCHAR2(200) NOT NULL, "
						+ "RB_DATE DATE NOT NULL, "
						+ "RB_ISSHOW CHAR(1) NOT NULL)",
				"CREATE TABLE MENU "
						+ "(M_NO NUMBER(5) Constraint M_NO_PK Primary Key, "
						+ "M_T_NO NUMBER(5) NOT NULL, "
						+ "M_NAME VARCHAR2(50) NOT NULL, "
						+ "M_PRICE NUMBER(5) NOT NULL, "
						+ "M_BODY VARCHAR2(500) NOT NULL, "
						+ "M_SAVENAME VARCHAR2(100) NOT NULL, "
						+ "M_THUMB VARCHAR2(100) NOT NULL, "
						+ "M_GRADE CHAR(1) NOT NULL, "
						+ "M_KEYWORD VARCHAR2(200) NOT NULL, "
						+ "M_ISSHOW CHAR(1) NOT NULL)",
				"CREATE TABLE MORDER "
						+ "(O_NO NUMBER(10) Constraint O_NO_PK Primary Key, "
						+ "O_T_NO NUMBER(5) References TRUCKINFO(T_NO), "
						+ "O_ORDTIME DATE NOT NULL, "
						+ "O_PAYTIME DATE NOT NULL, "
						+ "O_SERVTIME DATE NOT NULL, "
						+ "O_TEMP NUMBER(2,1) NOT NULL, "
						+ "O_HUMI NUMBER(3) NOT NULL, "
						+ "O_RAIN NUMBER(3) NOT NULL, "
						+ "O_GENDER CHAR(1) NOT NULL, "
						+ "O_AGE NUMBER(1) NOT NULL)",
				"CREATE TABLE ORDERMENU "
						+ "(OM_NO NUMBER(10) Constraint OM_NO_PK Primary Key, "
						+ "OM_O_NO NUMBER(10) references MORDER(O_NO), "
						+ "OM_M_NO NUMBER(5) NOT NULL, "
						+ "OM_NUM NUMBER(2) NOT NULL)"
		};
		
		MyJDBC db = null;
		Statement stmt = null;
		ResultSet rs = null ;
		try{
			db = new MyJDBC();
			stmt = db.getSTMT();
			
			for(int i = 0 ; i < table.length ; i++){
//				System.out.println(cntTable + "'" + table[i]+ "'");
				rs = stmt.executeQuery(cntTable + "'" + table[i]+ "'");
				rs.next();
				int tno = rs.getInt("cnt");
//				System.out.println((i + 1) + "번째 테이블의 갯수 : " + tno);
				if(tno == 0){
					continue;
				}
				else {
					stmt.execute(drop + table[i]);
//					System.out.println("Table : " + table[i] + " 삭제 완료!");
				}
			}
			System.out.println("******* 테이블 삭제 완료 **********");

			for(int i = 0 ; i < createTable.length ; i++){
//				System.out.println(table[9-i] + " : 생성시도 ");
				stmt.execute(createTable[i]);
//				System.out.println(table[9-i] + " : 생성완료 ");
			}
			
			System.out.println("######## 테이블 생성 완료! #########");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{db.close(rs);
				db.close(stmt);
				db.close(db.con);
			}
			catch(Exception ef){
				ef.printStackTrace();
			}
		}
		
		new InsertPlace();
		
		
	}

	public static void main(String[] args) {
		new CreateTable();
	}

}

package SQL;

import java.sql.ResultSet;
import java.sql.Statement;

public class InsertPlace {

	public InsertPlace() {
		
		String[] insertP = {
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '강서구 개화동 31-2 경인아라뱃길 판개목', '아라뱃길 판개목' , 37.599330, 126.800171, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '서대문구 연희동 연희로11마길 86-77 서대문지역자활센터', '서대문 연희동',37.572724, 126.926247, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '중구 서소문동 덕수궁길 61', '중구 덕수궁' , 37.564195, 126.973704, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '중구 을지로 281, 동대문디자인플라자', '중구 동대문',37.567203, 127.009904, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '중구 장충단로 60', '중구 장충단공원', 37.550087, 127.000469, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '성동구 왕십리로 222, 한양대학교', '성동구 한양대학교', 37.557368, 127.045311, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '광진구 군자동 능동로 209, 세종대학교', '광진구 세종대학교', 37.550438, 127.073107, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '광진구 능동 능동로216 어린이대공원', '광진구 어린이 대공원', 37.548488, 127.080794, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '송파구 잠실동 10', '송파구 잠실1동', 37.514235, 127.073574, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '송파구 장지동 600-2, 공영주차장', '송파구 공영주차장', 37.470316, 127.128028, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '서초구 서초동 몽마르뜨 공원', '서초구 몽마르뜨공원',37.495329, 127.003589, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '서초구 방배동 493-3', '서초구 방배1동',37.478144, 126.982515, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '서초구 앙재2동 바우뫼로12길 40, 서초문화예술공원', '서초문화예술공원', 37.468929, 127.031271, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '서초구 강남대로 201, 서초구민회관', '서초구민회관',37.482003, 127.036024, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '양천구 목1동 914 목동주경기장', '양천구 목동주경기장',37.530024, 126.882127, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '양천구 목5동 906 파리공원', '양천구 파리공원', 37.534539, 126.877132, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '금천구 시흥동 893 금빛공원', '금천구 금빛공원', 37.452740, 126.904373, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '금천구 시흥동 꾸러기공원', '금천구 꾸러기공원', 37.443166, 126.905875, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '도봉구 차1동 산48-13 창골축구장', '도봉구 창골축구장', 37.648239, 127.041083, to_date('2015/01/01','YYYY/MM/DD'), 'Y')", 
				"INSERT INTO Place VALUES((SELECT NVL(MAX(P_No), 0) + 1 FROM Place), '노원구 월계2동 산63', '노원구 월계1동', 37.638383, 127.051231, to_date('2015/01/01','YYYY/MM/DD'), 'Y')"
		}; 
		
		
		MyJDBC db = null;
		Statement stmt = null;
		try{
			db = new MyJDBC();
			stmt = db.getSTMT();
			
			for(int i = 0 ; i < insertP.length ; i++){
				stmt.execute(insertP[i]);
			}
			System.out.println("******* 위치정보 테이블 입력 완료 **********");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				db.close(stmt);
				db.close(db.con);
			}
			catch(Exception ef){
				ef.printStackTrace();
			}
		}
	}
//	
//	public static void main(String[] args){
//		new InsertPlace();
//	}

}

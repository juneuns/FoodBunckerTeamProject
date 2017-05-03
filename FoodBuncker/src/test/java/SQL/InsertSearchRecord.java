package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertSearchRecord {
	ArrayList<String> list = new ArrayList<>();
	String sql;
	MyJDBC db = new MyJDBC();
	Statement stmt = db.getSTMT();
	ResultSet rs = null;
	int menulen;
	
	public InsertSearchRecord(){
		setMenulen();
		for(int i = 1 ; i < menulen+1 ; i++){
			sql = "select m_keyword from menu where m_no="+i;
			try{
				rs = stmt.executeQuery(sql);
				rs.next();
				String[] word = rs.getString(1).trim().split("#");
				for(int j = 0 ; j < word.length ; j++){
					sql = "select sr_no AS NO,sr_record AS RECORD from searchrecord where sr_word='"+word[j]+"'";
					if(word[j] != null && word[j].length() !=0){ 
						//System.out.println(word[j]+j);
						rs = stmt.executeQuery(sql);
						if(rs.next()){
							String result = rs.getString("RECORD");
							int no = rs.getInt("NO");
							int pos = result.indexOf(","+i+":");
							if(pos == -1){
								String addWord = result+","+i+":10";
								//System.out.println(addWord);
								sql = "update searchrecord set sr_record='"+addWord+"' where sr_no="+no;
								stmt.execute(sql);
							}else{
								int intIndex = result.indexOf(',', pos+1);
								String preResult = result.substring(0, pos+1);
								String midResult = result.substring(pos+1,intIndex);
								String sufResult = result.substring(intIndex);
								String[] temp = midResult.split(":");
								int intTemp = Integer.parseInt(temp[1]);
								intTemp = intTemp+1;
								temp[1] = String.valueOf(intTemp);
								midResult = temp[0]+temp[1];
								String updateWord = preResult + midResult + sufResult;
								//System.out.println(updateWord);
								sql = "update searchrecord set sr_record='"+updateWord+"' where sr_no="+no;
								stmt.execute(sql);
							}
						
						}else{
							sql = "insert into searchrecord values((SELECT NVL(MAX(sr_No), 0) + 1 FROM searchrecord), '"+word[j]+"',',"+i+":10')";
							stmt.execute(sql);
						}
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}			
		}
		db.close(rs);
		db.close(stmt);
		db.close(db.con);
			System.out.println("******* searchrecord 입력 완료 **********");
	}
	
	public void setMenulen(){
		String sql1 = "select count(*) from menu";
		try{
			rs = stmt.executeQuery(sql1);
			rs.next();
			this.menulen = rs.getInt(1);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
}

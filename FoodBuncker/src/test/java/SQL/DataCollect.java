package SQL;

import java.io.BufferedInputStream;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * 서울 데이터 광장 인증키 : 6b76785a7573756e36397a46435742
 * http://openapi.seoul.go.kr:8088/(인증키)/xml/InfoTrdarSelng/1/5/201606
 * pno	ALLEY_TRDAR_NO
1	12254
2	12512
3	12516
4	12253
5	12518
6	12248
7	12621
8	12611
9	13095
10	13341
11	13245
12	13336
13	13380
14	13471
15	12844
16	13513
17	13500
18	13493
19	11954
20	12201

 */
public class DataCollect {
	public static final String MOVING = "InfoTrdarFlpop";
	public static final String SELLING = "InfoTrdarSelng";
	public ArrayList<String> list = new ArrayList();
	String createSql;
	String dropSql = "drop table selldata";
	MyJDBC db = new MyJDBC();
	Statement stmt = db.getSTMT();
	StringBuffer insertSql;
	ArrayList keyList = new ArrayList();
	ArrayList valueList = new ArrayList();
	
	public DataCollect(String item) throws Exception{
	 	String strMonth = "201501";
	 	JSONParser jsonparser = new JSONParser();
	 	JSONObject jsonobject = (JSONObject)jsonparser.parse(readUrl(1,1,"201602",item));
	 	JSONObject json = (JSONObject) jsonobject.get(item);
        //System.out.println(json);
        JSONArray data = (JSONArray) json.get("row");
        long dataTotalCount = 0;
        for(int i = 0; i <data.size() ; i++){
        	JSONObject entity = (JSONObject)data.get(i);
        	Set keySet = entity.keySet();
        	createSql = "create table selldata (sd_no number(10) primary key";
        	keySet.stream().forEach(n->{
        		createSql = createSql + ","+n+" varchar2(50)";
        	});
        	createSql = createSql + ")"; 
        	//System.out.println(createSql);
        }
        for(int k = 10 ; k < 13 ; k++){
        	strMonth = "2016"+k;
        	System.out.println(strMonth+"입력시작");
        	jsonobject = (JSONObject)jsonparser.parse(readUrl(1,1,strMonth,item));
        	json = (JSONObject) jsonobject.get(item);
        	dataTotalCount = (long) json.get("list_total_count");
        	int m = 1;
        	int a = 999;
        	while(true){
        		jsonobject = (JSONObject)jsonparser.parse(readUrl(m,m+a,strMonth,item));
            	json = (JSONObject) jsonobject.get(item);
        		data = (JSONArray) json.get("row");
        		for(int i = 0; i <data.size() ; i++){
        			insertSql = new StringBuffer();
        			JSONObject entity = (JSONObject)data.get(i);
        			Set keySet = entity.keySet();
        			keyList.clear();
        			valueList.clear();
        			keySet.stream().forEach(n->{
        				//System.out.println("n : "+n);
        				keyList.add(n);
        				valueList.add(entity.get(n));
        				//System.out.println(" : "+entity.get(n));
        			});
        			insertSql.append("insert into selldata (sd_no,");
        			for(int j = 0 ; j < keyList.size() ; j++){
        				insertSql.append(keyList.get(j));
        				if(j != keyList.size()-1){
        					insertSql.append(",");
        				}
        			}
        			insertSql.append(") values ((SELECT NVL(MAX(sd_no),0)+1 FROM selldata),");
        			for(int j = 0 ; j < valueList.size() ; j++){
        				insertSql.append("'"+valueList.get(j)+"'");
        				if(j != valueList.size()-1){
        					insertSql.append(",");
        				}
        			}
        			insertSql.append(")");
        			list.add(insertSql.toString());
        		}//end data for
        		if(m+2000 < dataTotalCount) {
        			m = m+1000;
        			System.out.println("dataTotalCount : "+dataTotalCount+"  m : "+m+"  a : "+a);
        		}else{
        			m = m+1000;
        			a = (int)dataTotalCount - m;
        			System.out.println("dataTotalCount : "+dataTotalCount+"  m : "+m+"  a : "+a);
        		}
        		if(m+1000 > dataTotalCount) break;
        		
        	}//end while
        }//end strMonth for
        
        try{
        	stmt.execute(dropSql);
        	System.out.println("테이블 삭제 완료");
        }catch(Exception e){}
        
        try{
        	stmt.execute(createSql);
        	System.out.println("테이블 생성 완료");
        }catch(Exception e){
        	e.printStackTrace();
        }
        
        list.stream().forEach(n->{
        	//System.out.println(n);
			try {
				stmt.execute(n);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
		db.close(stmt);
		db.close(db.con);
		System.out.println("추정매출 입력완료");
      

	}    
    private static String readUrl(int startNo,int endNo, String yearmonth,String item) throws Exception {
        BufferedInputStream reader = null;
        try {
            URL url = new URL(
                    "http://openapi.seoul.go.kr:8088/"
                    + "6b76785a7573756e36397a46435742/"
                    + "json/"
                    + item+"/"
                    + startNo+"/"+endNo+"/"
                    + yearmonth);
            reader = new BufferedInputStream(url.openStream());
            StringBuffer buffer = new StringBuffer();
            int i;
            byte[] b = new byte[4096];
            while( (i = reader.read(b)) != -1){
              buffer.append(new String(b, 0, i));
            }
            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
 
    
    public static void main(String[] args) {
        try {
            //new DataCollect(MOVING);
            new DataCollect(SELLING);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}

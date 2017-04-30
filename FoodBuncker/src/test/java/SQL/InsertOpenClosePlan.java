package SQL;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class InsertOpenClosePlan {
	ArrayList<String> list = new ArrayList<>();
	String sql;
	MyJDBC db = null;
	Statement stmt = null;
	/* no,
	 * t_no => 1-8,
	 * open => date,
	 * close => date,
	 * p_no => 1-20
	 */
	
	public InsertOpenClosePlan(){
		
		for(int i = 1 ; i < 9 ; i++){
			LocalDate open = LocalDate.of(2015, 1, 1);
			for(int j = 0 ; j < 875 ; j++){
				int place = (int)(Math.random()*(20-1+1)+1);
				//System.out.println(open);
				sql="insert into openclose values((SELECT NVL(MAX(Oc_No), 0) + 1 FROM openclose),"+i+",to_date('"+open+"-10','YYYY-MM-DD-HH24'),to_date('"+open+"-20','YYYY-MM-DD-HH24'),"+place+")";
				list.add(sql);
				sql="insert into plan values((SELECT NVL(MAX(pp_No), 0) + 1 FROM plan),"+i+","+place+",to_date('"+open+"','YYYY-MM-DD'))";
				list.add(sql);
				open = open.plusDays(1);
			}
		}
		try{
			db = new MyJDBC();
			stmt = db.getSTMT();
			
			list.parallelStream().forEach(n->{
				try {
					stmt.execute(n);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});
			System.out.println("******* openclose,plan 입력 완료 **********");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				db.close(stmt);
				db.close(db.con);
			}
			catch(Exception ef){
				ef.printStackTrace();
			}
		}
		
		
	}
}

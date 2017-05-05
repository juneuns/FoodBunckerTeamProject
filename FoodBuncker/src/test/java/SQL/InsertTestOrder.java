package SQL;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class InsertTestOrder {
	ArrayList<String> list = new ArrayList<>();
	String sql;
	MyJDBC db = new MyJDBC();
	Statement stmt = db.getSTMT();
	public InsertTestOrder(){
		String[] order = {
			"insert into morder values ((select nvl(max(o_no),0)+1 from morder),1,to_date('2017/05/05 12:00','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:10','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:20','YYYY/MM/DD HH24:MI'),12,10,0,'M',2)",
			"insert into morder values ((select nvl(max(o_no),0)+1 from morder),1,to_date('2017/05/05 12:10','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:15','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:15','YYYY/MM/DD HH24:MI'),12,10,0,'M',2)",
			"insert into morder values ((select nvl(max(o_no),0)+1 from morder),1,to_date('2017/05/05 12:20','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:25','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:25','YYYY/MM/DD HH24:MI'),12,10,0,'M',2)",
			"insert into morder values ((select nvl(max(o_no),0)+1 from morder),1,to_date('2017/05/05 12:30','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:30','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:30','YYYY/MM/DD HH24:MI'),12,10,0,'M',2)",
			"insert into morder values ((select nvl(max(o_no),0)+1 from morder),1,to_date('2017/05/05 12:30','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:30','YYYY/MM/DD HH24:MI'),to_date('2017/05/05 12:30','YYYY/MM/DD HH24:MI'),12,10,0,'M',2)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),1,1,1)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),1,2,1)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),1,3,2)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),2,1,1)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),2,2,4)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),3,2,1)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),3,3,1)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),3,4,1)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),4,1,5)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),4,2,3)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),5,1,1)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),5,2,2)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),5,3,3)",
			"insert into ordermenu values ((select nvl(max(om_no),0)+1 from ordermenu),5,4,4)",
		};
		Arrays.asList(order).stream().forEach(n->{
			try{
				stmt.execute(n);
			}catch(Exception e){
				e.printStackTrace();
			}
		});
		db.close(stmt);
		db.close(db.con);
		System.out.println("morder입력 완료");
		
	}
	public static void main(String[] args){
		new InsertTestOrder();
	}
}

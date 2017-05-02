package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertRangeCalc {
	ArrayList<String> list = new ArrayList<>();
	String sql;
	MyJDBC db = null;
	Statement stmt = null;
	ResultSet rs = null;
	double oldLng;
	double oldLat;
	double newLng=127.0489959;
	double newLat=37.5045083;
	String strMonth="";
	int distance;
	
	public InsertRangeCalc(){
		for(int i = 1 ; i < 9 ; i++){
			sql = "select to_char(oc_open,'YYYYMM') AS PDATE, p_lng AS LNG, p_lat AS LAT from place,openclose where oc_p_no=p_no AND oc_t_no="+i+"order by oc_open";
			try{
				db = new MyJDBC();
				stmt = db.getSTMT();
				rs = stmt.executeQuery(sql);
				while(rs.next()){
					String yearMonth = rs.getString("PDATE");
					oldLng = newLng;
					oldLat = newLat;
					newLng = rs.getDouble("LNG");
					newLat = rs.getDouble("LAT");
					if(strMonth.equals(yearMonth)){
						distance = distance + getDistanceKm(oldLat,oldLng,newLat,newLng);
					}else{
						if(distance > 0){
							String sql1 = "insert into rangecal values((SELECT NVL(MAX(rg_No), 0) + 1 FROM rangecal),'"+strMonth+"',"+i+","+distance+")";
							list.add(sql1);
						}
						strMonth = yearMonth;
						distance = 0;
						distance = distance + getDistanceKm(oldLat,oldLng,newLat,newLng);
					}
				}	
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					db.close(rs);
					db.close(stmt);
					db.close(db.con);
				}
				catch(Exception ef){
					ef.printStackTrace();
				}
				
			}
		}
		
		try{
			db = new MyJDBC();
			stmt = db.getSTMT();
			list.stream().forEach(n->{
				try {
					stmt.execute(n);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});			
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
		System.out.println("******* RangeCalc 입력 완료 **********");
	}
	public int getDistanceKm(double lat1, double lng1, double lat2, double lng2){
		int R = 6371; //KM
		double dLat = degToRad(lat2-lat1);
		double dLon = degToRad(lng2-lng1);
		double a = Math.sin(dLat/2) * Math.sin(dLat/2) + Math.cos(degToRad(lat1)) * Math.cos(degToRad(lat2)) * Math.sin(dLon/2) * Math.sin(dLon/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));	
		double d = R * c;
		int e = (int)d;
		return e;
	}
	public double degToRad(double deg){
		return deg * (Math.PI/180);
	}
	
//	public static void main(String[] args){
//		new InsertRangeCalc();
//	}
}

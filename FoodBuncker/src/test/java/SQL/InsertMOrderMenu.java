package SQL;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class InsertMOrderMenu {
	MyJDBC db = new MyJDBC();
	Statement stmt = db.getSTMT();
	ResultSet rs = null ;
	ArrayList<Float> monthRatio = new ArrayList<>() ; 
	ArrayList<Float> placeRatio = new ArrayList<>() ;
//	ArrayList tempRatio;
//	ArrayList rainRatio;
	ArrayList<String> insertList1 = new ArrayList();
	ArrayList<String> insertList2 = new ArrayList();
	String sql;
	int ono = 0;
	public InsertMOrderMenu(){
		
		
		sql = "select smonth,sum(summonth) as ssummonth, round(ratio_to_report(sum(summonth)) over(partition by grouping_id(smonth))*100,2) as ratio "
			+ "from"
			+"(select substr(sd_yearmonth,6,2) as smonth,sum(sd_selltotal) as summonth from SELLDATA group by sd_yearmonth order by substr(sd_yearmonth,6,2))" 
			+"group by smonth order by smonth";
		
		try{
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				float ratio = rs.getFloat("ratio");
				monthRatio.add(ratio);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		sql = "";
		sql = "select pno,sum(summonth) as ssummonth, round(ratio_to_report(sum(summonth)) over(partition by grouping_id(pno))*100,2) as ratio"
			+" from"
			+" (select sd_p_no as pno,sum(sd_selltotal) as summonth from SELLDATA group by sd_p_no order by sd_p_no)" 
			+" group by pno order by pno";
		
		try{
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				float ratio = rs.getFloat("ratio");
				placeRatio.add(ratio);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	try{
		for(int i = 0 ; i < 8 ; i++){
			
//			insertList1.clear();
//			insertList2.clear();
//			
//			sql = "delete from morder";
//			insertList1.add(sql);
//			sql = "delete from ordermenu";
//			insertList1.add(sql);
			
			ArrayList<MenuInfoVO> menuInfoList = getMenuInfoList(i+1);
			
			LocalDateTime start = LocalDateTime.of(2015, 1,1,10,0);
			LocalDateTime hourEnd = LocalDateTime.of(2015, 1,1,11,0);
			LocalDateTime quarterEnd = LocalDateTime.of(2015,1,1,14,0);
			LocalDateTime dayEnd = LocalDateTime.of(2015, 1,1,22,0);
			LocalDateTime monthend = LocalDateTime.of(2015, 1,31,22,0);
			LocalDateTime yearEnd = LocalDateTime.of(2015, 12,31,22,0);
			LocalDateTime now = start;
			 
			while(now.isBefore((LocalDateTime.of(2017, 5,14,22,0)))){
			while(now.isBefore(yearEnd) && now.isBefore((LocalDateTime.of(2017, 5,14,22,0)))){// 1년 
					int yearSaleSum = (int)(Math.random()*(500000-400000)+400000)*1000;
//				System.out.println("yearSaleSum : "+yearSaleSum);	
					while(now.isBefore(monthend) && now.isBefore(yearEnd)){// 1달
						int monthSaleSum = (int)((yearSaleSum*(monthRatio.get(monthend.getMonthValue()-1))/100*getFactor())/1000)*1000;
				System.out.println("monthSaleSum : "+monthSaleSum+" monthRatio : "+monthRatio.get(monthend.getMonthValue()-1)+"  now: "+now);		
						while(now.isBefore(dayEnd) && now.isBefore(monthend)){//하루
							int pno = getPno(dayEnd,i+1);
							int daySaleSum =(int)(((((float)monthSaleSum/now.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth()) *(1+((getWeekRatio(dayEnd,pno))/100-0.143)))*getFactor())/1000)*1000;
//				System.out.println("daySaleSum : "+daySaleSum);			
							while(now.isBefore(quarterEnd) && now.isBefore(dayEnd)){//3시간씩
								int quarterSum = (int)((daySaleSum * (getQuarterRatio(now,pno)))/100/1000)*1000;
//				System.out.println("quarterSum : "+quarterSum);			
								while(now.isBefore(quarterEnd)){ //1시간씩
//				System.out.println("now : "+now+" hourEnd : "+hourEnd+" quarterEnd : "+quarterEnd+"  dayEnd : "+dayEnd);
									HourRatioVO vo = new HourRatioVO(now,pno);
									int hourSum = (int)(((quarterSum/3f * (vo.hourSaleRatio))*getFactor())/1000)*1000;
				//System.out.println("hourSum : "+hourSum);
									int insertHourSum = 0;
									while(hourSum >= insertHourSum && now.isBefore(hourEnd) ){
				//System.out.println("now : "+now+" hourSum : "+hourSum+"  insertHourSum : "+insertHourSum);
										//if(now.isAfter(hourEnd))break;
										if(vo.rain > 100.0){
											hourSum = (int)(hourSum * 0.2 * getFactor()/1000)*1000;
										}else if(vo.rain > 50.0){
											hourSum = (int)(hourSum * 0.4 * getFactor()/1000)*1000;
										}else if(vo.rain > 30.0){
											hourSum = (int)(hourSum * 0.6 * getFactor()/1000)*1000;
										}else if(vo.rain > 10.0){
											hourSum = (int)(hourSum * 0.7 * getFactor()/1000)*1000;
										}else if(vo.rain > 5.0){
											hourSum = (int)(hourSum * 0.8 * getFactor()/1000)*1000;
										}
										String gender = "M";
										if((vo.manRatio/100)<Math.random()){
											gender = "F";
										}
										float ageFactor = (float)(Math.random());
										int oage = 0;
										float age1020 = vo.age10Ratio/100 + vo.age20Ratio/100;
										float age102030 = age1020 + vo.age30Ratio/100;
										float age10203040 = age102030 + vo.age40Ratio/100;
										float age1020304050 = age10203040 + vo.age50Ratio/100;
										float age102030405060 = 1-age1020304050;
										if(ageFactor<(vo.age10Ratio/100)){
											oage = 1;
										}else if(ageFactor>=(vo.age10Ratio/100) && ageFactor < age1020){
											oage = 2;
										}else if(ageFactor >= age1020 && ageFactor < age102030){
											oage = 3;
										}else if(ageFactor >= age102030 && ageFactor < age10203040){
											oage = 4;
										}else if(ageFactor >= age10203040 && ageFactor < age1020304050){
											oage = 5;
										}else{
											oage = 6;
										}
										
										int cookTime = (int)(Math.random()*(15-5)+5);
										String orderTime = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd/HH/mm"));
										String payTime = now.plusMinutes(2).format(DateTimeFormatter.ofPattern("yyyy/MM/dd/HH/mm"));
										String servTime = now.plusMinutes(cookTime).format(DateTimeFormatter.ofPattern("yyyy/MM/dd/HH/mm"));
										sql = "insert into morder values((select nvl(max(o_no),0)+1 from morder),"+(i+1)+",to_date('"+orderTime+"','YYYY/MM/DD/HH24/MI'),to_date('"+payTime+"','YYYY/MM/DD/HH24/MI'),to_date('"+servTime+"','YYYY/MM/DD/HH24/MI'),"+vo.temperature+","+vo.humi+","+vo.rain+",'"+gender+"',"+oage+")";
										//insertList1.add(sql);
										try{
											stmt.execute(sql);
										}catch(Exception e){
											e.printStackTrace();
										}
										
										int menuNum = menuInfoList.size();
										for(int k = 0 ; k < menuNum ; k++){
											int count = (int)(Math.random()*3);
											if(count == 0) continue;
											sql = "insert into ordermenu values((select nvl(max(om_no),0)+1 from ordermenu),(select nvl(max(o_no),0) from morder),"+menuInfoList.get(k).mno+","+count+")";
			//System.out.println("k : "+k+" mno : "+menuInfoList.get(k).mno);
											//insertList2.add(sql);
											try{
												stmt.execute(sql);
											}catch(Exception e){
												e.printStackTrace();
											}
											insertHourSum = insertHourSum + (count*menuInfoList.get(k).price);
										}
										now = now.plusMinutes((int)(Math.random()*(20-2)+2));
										if(now.getHour()>=22) break;
									}
									now = hourEnd;
									if(now.getHour()>=22) break;
									hourEnd = hourEnd.plusHours(1);
								}//end hour
								now = quarterEnd;
								if(now.getHour()>=22) break;
								//hourEnd = now.plusHours(1);
								quarterEnd = quarterEnd.plusHours(3);
							}//end quarter
							start = start.plusDays(1);
							now = start;
							if(now.isAfter((LocalDateTime.of(2017, 5,14,22,0)))) break;
							hourEnd = start.plusHours(1);
							quarterEnd = start.plusHours(4);
							dayEnd = dayEnd.plusDays(1);
						}//end day
						//start = start.plusDays(1);
						now = start;
						if(now.isAfter((LocalDateTime.of(2017, 5,14,22,0)))) break;
						hourEnd = start.plusHours(1);
						quarterEnd = start.plusHours(4);
						
						//dayEnd = dayEnd.plusDays(1);
						monthend = monthend.plusMonths(1);
					}//end month
					start = start.plusDays(1);
					now = start;
					if(now.isAfter((LocalDateTime.of(2017, 5,14,22,0)))) break;
					hourEnd = start.plusHours(1);
					quarterEnd = start.plusHours(4);
					dayEnd = dayEnd.plusDays(1);
					//monthend.plusMonths(1);
				}//end year	
			now = start;
			if(now.isAfter((LocalDateTime.of(2017, 5,14,22,0)))) break;
			yearEnd = yearEnd.plusYears(1);
			}
				
			
//			insertList(insertList1);
//			insertList(insertList2);
			System.out.println("morder,ordermenu 트럭"+(i+1)+" 완료");
		
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			db.close(rs);
			db.close(stmt);
			db.close(db.con);
		}
	}
	
	public float getFactor(){
		return (float)(Math.random()*(1.2-0.8)+0.8);
	}
	
	public float getWeekRatio(LocalDateTime now, int pno) throws Exception{
		String wcolName = "";
		int weekValue = now.getDayOfWeek().getValue();
		switch(weekValue){
			case 1:
				wcolName = "sd_monrate";
				break;
			case 2:
				wcolName = "sd_tuesrate";
				break;
			case 3:
				wcolName = "sd_wedrate";
				break;
			case 4:
				wcolName = "sd_thurrate";
				break;
			case 5:
				wcolName = "sd_frirate";
				break;
			case 6:
				wcolName = "sd_satrate";
				break;
			case 7:
				wcolName = "sd_sunrate";
				break;
		}
		String yearMonth = String.valueOf((now.getYear()==2017)?2016:now.getYear())+((now.getMonthValue()<10)?("0"+String.valueOf(now.getMonthValue())):String.valueOf(now.getMonthValue()));
		
		sql = "select "+wcolName+" from selldata where sd_p_no = "+pno+" and sd_yearmonth like '%"+yearMonth+"%'";
		rs = stmt.executeQuery(sql);
		rs.next();
		return rs.getFloat(1);
	}
	
	public float getQuarterRatio(LocalDateTime now, int pno) throws Exception{
		String qcolName="";
		int wtime = now.getHour();
		if(wtime >= 10 && wtime < 14){
			qcolName = "sd_1014rate";
		}else if(wtime >= 14 && wtime <17){
			qcolName = "sd_1417rate";
		}else if(wtime >=17 && wtime < 20){
			qcolName = "sd_1721rate";
		}else if(wtime >=20){
			qcolName = "sd_2124rate";
		}
		
		String yearMonth = String.valueOf((now.getYear()==2017)?2016:now.getYear())+((now.getMonthValue()<10)?("0"+String.valueOf(now.getMonthValue())):String.valueOf(now.getMonthValue()));
		sql = "select "+qcolName+" from selldata where sd_p_no = "+pno+" and sd_yearmonth like '%"+yearMonth+"%'";
//System.out.println("qcolName : "+qcolName+"  pno : "+pno+"  yearmonth : "+yearMonth);
		rs = stmt.executeQuery(sql);
		rs.next();
		return rs.getFloat(1);
	}
	
	public int getPno(LocalDateTime now, int tno) throws Exception{
		String yearmonthday = String.valueOf((now.getYear()==2017)?2016:now.getYear())+((now.getMonthValue()<10)?("0"+String.valueOf(now.getMonthValue())):String.valueOf(now.getMonthValue()))+((now.getDayOfMonth()<10)?("0"+String.valueOf(now.getDayOfMonth())):String.valueOf(now.getDayOfMonth()));
		sql = "select oc_p_no from openclose where oc_t_no="+tno+" and to_char(oc_open,'YYYYMMDD')='"+yearmonthday+"'";
		rs = stmt.executeQuery(sql);
		rs.next();
		return rs.getInt(1);
	}
	
	public class HourRatioVO{
		float hourSaleRatio;
		float manRatio;
		float age10Ratio;
		float age20Ratio;
		float age30Ratio;
		float age40Ratio;
		float age50Ratio;
		float age60ratio;
		float temperature;
		float humi;
		float rain;
		
		public HourRatioVO(LocalDateTime now, int pno) throws Exception{
			hourSaleRatio =(float)(Math.random()*(1.1f-0.9f)+0.9f);
			String strYear = String.valueOf((now.getYear()==2017)?2016:now.getYear());
			String strMonth = String.valueOf(now.getMonthValue());
			String strDay = String.valueOf(now.getDayOfMonth());
			String strHour = String.valueOf(now.getHour());
			String yearMonth = strYear + ((now.getMonthValue()<10)?("0"+strMonth):strMonth);
			String hcolName = strYear + ((now.getMonthValue()<10)?("0"+strMonth):strMonth) + ((now.getDayOfMonth()<10)?("0"+strDay):strDay) + ((now.getHour()<10)?("0"+strHour):strHour);
			sql = "select sd_manrate,sd_10rate,sd_20rate,sd_30rate,sd_40rate,sd_50rate,sd_60rate from selldata where sd_p_no="+pno+" and sd_yearmonth like '%"+yearMonth+"%'";
			
				rs = stmt.executeQuery(sql);
				rs.next();
	//System.out.println("hourvo  now : "+now+"  pno : "+pno+"  yearmonth : "+yearMonth);
				this.manRatio = rs.getFloat(1);
				this.age10Ratio = rs.getFloat(2);
				this.age20Ratio = rs.getFloat(3);
				this.age30Ratio = rs.getFloat(4);
				this.age40Ratio = rs.getFloat(5);
				this.age50Ratio = rs.getFloat(6);
				this.age60ratio = rs.getFloat(7);
			
			
				sql = "select temp,rain,humi from weatherrecord where to_char(wdate,'YYYYMMDDHH24') like '%"+hcolName+"%'";
			
				rs = stmt.executeQuery(sql);
				rs.next();
//System.out.println(hcolName);
				this.temperature = rs.getFloat(1);
				this.rain = rs.getFloat(2);
				this.humi = rs.getFloat(3);
			
		}
	}
	
	public class MenuInfoVO{
		int mno;
		int price;
	}
	
	public void insertList(ArrayList<String> list) throws Exception{
		list.stream().forEach(n->{
				try {
					stmt.execute(n);
				} catch (SQLException e) {
					e.printStackTrace();
				}
		});
	}
	
	public int getMaxMOrderNo() throws Exception{
		String morderNoSql = "SELECT NVL(MAX(o_no),0)+1 FROM morder";
		int maxNo;
		rs = stmt.executeQuery(morderNoSql);
		rs.next();
		maxNo = rs.getInt(1);
		return maxNo;
	}
	public ArrayList<MenuInfoVO> getMenuInfoList(int tno) throws Exception{
		String getMenuInfoSql = "select m_no,m_price from menu where m_t_no="+tno;
		
		ArrayList<MenuInfoVO> list = new ArrayList<>();
		rs = stmt.executeQuery(getMenuInfoSql);
		while(rs.next()){
			MenuInfoVO vo = new MenuInfoVO();
			vo.mno = rs.getInt(1);
			vo.price = rs.getInt(2);
			list.add(vo);
		}
		return list;
	}
	
//	public static void main(String[] args){
//		new InsertMOrderMenu();
//	}
}

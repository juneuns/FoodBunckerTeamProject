package com.foodbuncker.service;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.PMenuSearchDAO;
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.PMenuSearchVO;

public class PMenuSearchService {
	
	@Autowired
	public PMenuSearchDAO dao;
	
	public ArrayList<PMenuSearchVO> selectMenu(PageUtil pInfo,String word){
		int start = (pInfo.nowPage-1)*pInfo.pageRow +1;
		int end = start + pInfo.pageRow - 1;
		int pageRow = pInfo.pageRow;
		if(word == null || word == "" || word.length() == 0 ){
			HashMap<String,Integer> map = new HashMap<>();
			map.put("start", start);
			map.put("end", end);
			return dao.selectMenu(map);
		}else{
			try{
				HashMap tempMap = dao.selectSearchRecord(word);
				ArrayList<PMenuSearchVO> allMenu = dao.selectAllMenu();
				String resultSet = ((String)tempMap.get("RECORD")).substring(1);
				String[] temp = resultSet.trim().split(",");
				List<String> resultList = Arrays.asList(temp);
				resultList.sort(new Comparator(){
					@Override
					public int compare(Object o1, Object o2) {
						String oldStr = (String)o1;
						String newStr = (String)o2;
						int oldCount = Integer.parseInt(oldStr.substring(oldStr.indexOf(':')+1));
						int newCount = Integer.parseInt(newStr.substring(newStr.indexOf(':')+1));
						return -(oldCount-newCount);
					}			
				});
				ArrayList<Integer> noList = (ArrayList)resultList.stream().map(n->Integer.parseInt(n.substring(0, n.indexOf(':')))).collect(Collectors.toList());
				int total = allMenu.size();
				for(int i = 1 ; i < total+1 ; i++){
					if(!noList.contains(i)){
						noList.add(i);
					}
				}
				
				ArrayList<Integer> finalListNo = (ArrayList)noList.stream().skip(start-1).limit(pageRow).collect(Collectors.toList());
				ArrayList<PMenuSearchVO> finalList = new ArrayList<>();
				finalListNo.stream().forEach(n->{
					Optional<PMenuSearchVO> tempVO = allMenu.stream().filter(m->m.no==n).findFirst();
					finalList.add(tempVO.get());
				});
				return finalList;
			}catch(Exception e){
				HashMap<String,Integer> map = new HashMap<>();
				map.put("start", start);
				map.put("end", end);
//				System.out.println("결과가 없어요.");
//				e.printStackTrace();
				return dao.selectMenu(map);
			}
		}
	}
	
	public int changePage(String strPage){
		int nowPage = 0;
		try{
			nowPage = Integer.parseInt(strPage);
		}catch(Exception e){
			nowPage = 1;
		}
		return nowPage;
	}
	
	public PageUtil pageInfo(int nowPage){
		int total = dao.selectCount();
		PageUtil pInfo = new PageUtil(nowPage,total,9,1);
		return pInfo;
	}
	
	public ArrayList selectTNow(){
		return dao.selectTNow();
	}
	
	public ArrayList selectAllTruck(){
		return dao.selectAllTruck();
	}
	
	public ArrayList selectTWeekPlan(){
		HashMap map = new HashMap();
		LocalDate startDate = LocalDate.now();
		String strStartDate = startDate.getYear()+"/"+startDate.getMonthValue()+"/"+startDate.getDayOfMonth();
		LocalDate endDate = startDate.plusDays(6);
		String strEndDate = endDate.getYear()+"/"+endDate.getMonthValue()+"/"+endDate.getDayOfMonth();
		map.put("startdate", strStartDate);
		map.put("enddate", strEndDate);
		return dao.selectTWeekPlan(map);
	}
	
	public ArrayList selectOneTPlan(String strTno){
		int tno = 0;
		try{
			tno = Integer.parseInt(strTno);
		}catch(Exception e){
			tno = 1;
		}
		return dao.selectOneTPlan(tno);
	}
	public String getStartDate(){
		LocalDate sDate = LocalDate.now();
		String startDate = sDate.getYear()+"년 "+sDate.getMonthValue()+"월"+sDate.getDayOfMonth()+"일("+sDate.getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.KOREA)+")";
		return startDate;
	}
	public String getEndDate(){
		LocalDate eDate = LocalDate.now().plusDays(6);
		String endDate = eDate.getYear()+"년 "+eDate.getMonthValue()+"월"+eDate.getDayOfMonth()+"일("+eDate.getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.KOREA)+")";
		return endDate;
	}
	public ArrayList<String> getDayWeek(){
		ArrayList<String> dayWeekList = new ArrayList<>();
		PMenuSearchVO vo = new PMenuSearchVO();
		dayWeekList.add(vo.getpDayWeek1());
		dayWeekList.add(vo.getpDayWeek2());
		dayWeekList.add(vo.getpDayWeek3());
		dayWeekList.add(vo.getpDayWeek4());
		dayWeekList.add(vo.getpDayWeek5());
		dayWeekList.add(vo.getpDayWeek6());
		dayWeekList.add(vo.getpDayWeek7());
		return dayWeekList;
	}
	
	public String getTName(String strTno){
		int tno = 0;
		try{
			tno = Integer.parseInt(strTno);
		}catch(Exception e){
			tno = 1;
		}
		return dao.selectOneTName(tno);
	}
	public void searchRecordProc(String word, int no){
		if(word == null || word == "" || word.length() == 0 ){
			return;
		}else{
			try{
				HashMap map = dao.selectSearchRecord(word);
				int recordNo = Integer.parseInt(String.valueOf(map.get("NO")));
				String record = (String)map.get("RECORD");
				int pos = record.indexOf(","+no+":");
				if(pos == -1){
					record = record+","+no+":1";
				}else{
					int intIndex = record.indexOf(',', pos+1);
					if(intIndex == -1){
						String preResult = record.substring(0,pos+1);
						String midResult = record.substring(pos+1);
						String[] temp = midResult.split(":");
	//System.out.println("record : "+record+"  temp[0] : "+temp[0]+"  temp[1] : "+temp[1]);
						int intTemp = Integer.parseInt(temp[1]);
						intTemp = intTemp+1;
						temp[1] = String.valueOf(intTemp);
						record = preResult+temp[0]+":"+temp[1];
					}else{
						String preResult = record.substring(0, pos+1);
						//System.out.println("intIndex : "+intIndex+",  preResult : "+preResult);
						String midResult = record.substring(pos+1,intIndex);
						String sufResult = record.substring(intIndex);
						String[] temp = midResult.split(":");
						int intTemp = Integer.parseInt(temp[1]);
						intTemp = intTemp+1;
						temp[1] = String.valueOf(intTemp);
						midResult = temp[0]+":"+temp[1];
						record = preResult + midResult + sufResult;
					}
				}
				HashMap updateMap = new HashMap();
				updateMap.put("record", record);
				updateMap.put("no", recordNo);
				dao.updateSearchRecord(updateMap);
			}catch(Exception e){
				//e.printStackTrace();
				String record = ","+no+":1";
				HashMap insertMap = new HashMap();
				insertMap.put("word",word);
				insertMap.put("record", record);
				dao.insertSearchRecord(insertMap);
			}
		}
	}

}

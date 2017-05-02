package com.foodbuncker.service;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.PMenuSearchDAO;
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.PMenuSearchVO;

public class PMenuSearchService {
	@Autowired
	public PMenuSearchDAO dao;
	
	public ArrayList<PMenuSearchVO> selectMenu(PageUtil pInfo){
		int start = (pInfo.nowPage-1)*pInfo.pageRow +1;
		int end = start + pInfo.pageRow - 1;
		HashMap<String,Integer> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		return dao.selectMenu(map);
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

}

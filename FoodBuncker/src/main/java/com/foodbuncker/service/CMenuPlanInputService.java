package com.foodbuncker.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.CMenuPlanInputDAO;

public class CMenuPlanInputService {
	@Autowired
	CMenuPlanInputDAO dao;
	
	public ArrayList selectAllPlace(){
		return dao.selectAllPlace();
	}
	
	public ArrayList selectOneTPlan(int tno){
		return dao.selectOneTPlan(tno);
	}
	
	public void insertPlan(String strPno, String strDate, HttpSession session){
		int pno = Integer.parseInt(strPno);
		//int tno = (int)session.getAttribute("UTNO");
		int tno = 1;
		long longDate = Long.parseLong(strDate);
		Date tempDate = new Date(longDate);
		LocalDate pdate = LocalDate.from(LocalDateTime.ofInstant(tempDate.toInstant(), ZoneId.systemDefault()));
		String strpdate = pdate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		//System.out.println("tempDate : "+tempDate+"  pdate : "+pdate+" strpdate : "+strpdate);
		HashMap map = new HashMap();
		map.put("pno", pno);
		map.put("tno",tno);
		map.put("pdate", strpdate);
		dao.insertPlan(map);
	}
	
	public void deletePlan(String strDate,String pname, HttpSession session){
		//int tno = (int)session.getAttribute("UTNO");
		int tno = 1;
		long longDate = Long.parseLong(strDate);
		Date tempDate = new Date(longDate);
		LocalDate pdate = LocalDate.from(LocalDateTime.ofInstant(tempDate.toInstant(), ZoneId.systemDefault()));
		String strpdate = pdate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("pname : "+pname+"  pdate : "+pdate);
		HashMap map = new HashMap();
		map.put("pname", pname);
		map.put("tno",tno);
		map.put("pdate", strpdate);
		dao.deletePlan(map);
	}

}

package com.foodbuncker.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodbuncker.service.PMenuSearchService;
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.PMenuSearchVO;

@Controller
public class PMenuSearchController {
	@Autowired
	PMenuSearchService service;
	
	@RequestMapping("/person/Menu.food")
	public ModelAndView menuView(ModelAndView mv,HttpServletRequest req){
		int nowPage = service.changePage(req.getParameter("nowPage"));
		PageUtil pInfo = service.pageInfo(nowPage);		
		ArrayList<PMenuSearchVO> list = service.selectMenu(pInfo);
		mv.addObject("PINFO",pInfo);
		mv.addObject("LIST",list);
		mv.setViewName("/person/Menu");
		return mv;
	}
	
	
	@RequestMapping("/person/MenuAddView.food")
	public ModelAndView menuAddView(ModelAndView mv, HttpServletRequest req){
		//System.out.println("ajax 호출 왔어요. ");
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		//System.out.println(nowPage);
		PageUtil pInfo = service.pageInfo(nowPage);
		ArrayList<PMenuSearchVO> list = service.selectMenu(pInfo);
		mv.addObject("PINFO",pInfo);
		mv.addObject("nowPage",nowPage);
		mv.addObject("LIST",list);
		mv.setViewName("/person/MenuAddViewAjax");
		//System.out.println(list.size());
		return mv;
	}
	
	@RequestMapping("/person/Search.food")
	public ModelAndView searchView(ModelAndView mv, HttpServletRequest req){
		ArrayList oneTPlan = service.selectOneTPlan(req.getParameter("tno"));
		ArrayList allTruck = service.selectAllTruck();
		ArrayList tNowList = service.selectTNow();
		ArrayList tWeekPlan = service.selectTWeekPlan();
		String startDate = service.getStartDate();
		String endDate = service.getEndDate();
		ArrayList dayWeekList = service.getDayWeek();
		mv.addObject("DAYWEEKLIST",dayWeekList);
		mv.addObject("STARTDATE",startDate);
		mv.addObject("ENDDATE",endDate);
		mv.addObject("ONETPLAN",oneTPlan);
		mv.addObject("ALLTRUCK",allTruck);
		mv.addObject("TNOWLIST",tNowList);
		mv.addObject("TWEEKPLAN",tWeekPlan);
		mv.setViewName("/person/Search");
		return mv;
	}
	
	
}

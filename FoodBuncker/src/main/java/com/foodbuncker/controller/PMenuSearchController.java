package com.foodbuncker.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import com.foodbuncker.service.PMenuSearchService;
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.PMenuSearchVO;

/**
 * 
 * @author sungmo
 *
 */
@Controller
public class PMenuSearchController {
	@Autowired
	PMenuSearchService service;
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/Menu.food")
	public ModelAndView menuView(ModelAndView mv,HttpServletRequest req){
		String word="";
		int nowPage = service.changePage(req.getParameter("nowPage"));
		try{
			word = req.getParameter("word");
			//System.out.println("첫번째 : "+word);
		}catch(Exception e){
			word = "";
		}
		PageUtil pInfo = service.pageInfo(nowPage);		
		ArrayList<PMenuSearchVO> list = service.selectMenu(pInfo,word);
		mv.addObject("WORD",word);
		mv.addObject("PINFO",pInfo);
		mv.addObject("LIST",list);
		mv.setViewName("/person/Menu");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/MenuAddView.food")
	public ModelAndView menuAddView(ModelAndView mv, HttpServletRequest req){
		String word="";
		String strPage = req.getParameter("nowPage");
		int nowPage = Integer.parseInt(strPage);
		PageUtil pInfo = service.pageInfo(nowPage);
		try{
			String temp = req.getParameter("word");
			word = temp.trim().substring(temp.indexOf("'")+1, temp.lastIndexOf("'"));
			//System.out.println("두번째 : "+word);
		}catch(Exception e){
			word = "";
		}
		ArrayList<PMenuSearchVO> list = service.selectMenu(pInfo,word);
		mv.addObject("PINFO",pInfo);
		mv.addObject("nowPage",nowPage);
		mv.addObject("LIST",list);
		mv.addObject("WORD",word);
		mv.setViewName("/person/MenuAddViewAjax");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/Search.food")
	public ModelAndView searchView(ModelAndView mv, HttpServletRequest req){
		String strTno = req.getParameter("tno");
		String clip = req.getParameter("clip");
		ArrayList oneTPlan = service.selectOneTPlan(strTno);
		ArrayList allTruck = service.selectAllTruck();
		ArrayList tNowList = service.selectTNow();
		ArrayList tWeekPlan = service.selectTWeekPlan();
		String startDate = service.getStartDate();
		String endDate = service.getEndDate();
		String tName = service.getTName(strTno);
		ArrayList dayWeekList = service.getDayWeek();
		mv.addObject("DAYWEEKLIST",dayWeekList);
		mv.addObject("STARTDATE",startDate);
		mv.addObject("ENDDATE",endDate);
		mv.addObject("ONETPLAN",oneTPlan);
		mv.addObject("ALLTRUCK",allTruck);
		mv.addObject("TNOWLIST",tNowList);
		mv.addObject("TWEEKPLAN",tWeekPlan);
		mv.addObject("TNAME",tName);
		mv.setViewName("/person/Search");
		
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/TruckSearch.food")
	public ModelAndView truckSearch(ModelAndView mv, HttpServletRequest req){
		ArrayList oneTPlan = service.selectOneTPlan(req.getParameter("tno"));
		mv.addObject("ONETPLAN",oneTPlan);
		mv.setViewName("/person/TruckSearchAjax");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/MenuSearchRecordProc.food")
	public ModelAndView menuSearchRecordProc(ModelAndView mv, HttpServletRequest req){
		String strNo = req.getParameter("no");
		int no = Integer.parseInt(strNo);
		String word="";
		try{
			word = req.getParameter("word");
			//System.out.println("word:"+word);
		}catch(Exception e){
			e.printStackTrace();
			word = "";
			//System.out.println("word");
		}
		service.searchRecordProc(word, no);
		String tno = req.getParameter("tno");
		RedirectView rv = new RedirectView();
		rv.addStaticAttribute("tno", tno);
		rv.setUrl("../person/DetailView.food");
		mv.setView(rv);
		return mv;
	}
	
	
}

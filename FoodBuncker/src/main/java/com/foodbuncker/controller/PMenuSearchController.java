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
	
	@RequestMapping("/person/Search.food")
	public ModelAndView search(ModelAndView mv){
		mv.setViewName("/person/Search");
		return mv;
	}
	
	
}

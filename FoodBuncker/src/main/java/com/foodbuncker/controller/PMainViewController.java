package com.foodbuncker.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodbuncker.service.PMainViewService;

@Controller
public class PMainViewController {
	@Autowired
	public PMainViewService pmvService;
	
	@RequestMapping("/person/MainWindow.food")
	public ModelAndView mainView(ModelAndView mv){
		ArrayList list = pmvService.selectMenu();
		ArrayList list2 = pmvService.selectReview();
		ArrayList list3 = pmvService.selectTruck();
				
		mv.addObject("LIST", list);
		mv.addObject("LIST2", list2);
		mv.addObject("LIST3", list3);
		mv.setViewName("/person/MainWindow");
		return mv;
	}
	
	@RequestMapping("/person/DetailView.food")
	public ModelAndView detailView(ModelAndView mv, HttpServletRequest req){
		String strtno = req.getParameter("tno");
		int tno = Integer.parseInt(strtno);
		ArrayList list = pmvService.selectMenuView(tno);
		
		mv.addObject("LIST", list);
		mv.setViewName("/person/DetailView");
		return mv;
	}
	
	@RequestMapping("/person/About.food")
	public ModelAndView aboutView(ModelAndView mv){
		mv.setViewName("/person/About");
		return mv;
	}
	
	@RequestMapping("/person/Gallery.food")
	public ModelAndView galleryView(ModelAndView mv){
		mv.setViewName("/person/Gallery");
		return mv;
	}
}

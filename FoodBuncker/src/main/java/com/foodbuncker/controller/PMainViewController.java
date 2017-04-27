package com.foodbuncker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PMainViewController {

	@RequestMapping("/person/MainWindow.food")
	public ModelAndView mainView(ModelAndView mv){
		mv.setViewName("/person/MainWindow");
		return mv;
	}
	
	@RequestMapping("/person/DetailView.food")
	public ModelAndView detailView(ModelAndView mv){
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

package com.foodbuncker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PMenuSearchController {
	
	@RequestMapping("/person/Menu.food")
	public ModelAndView menuView(ModelAndView mv){
		mv.setViewName("/person/Menu");
		return mv;
	}
	
	@RequestMapping("/person/Search.food")
	public ModelAndView search(ModelAndView mv){
		mv.setViewName("/person/Search");
		return mv;
	}
}

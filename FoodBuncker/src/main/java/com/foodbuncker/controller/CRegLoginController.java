package com.foodbuncker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CRegLoginController {
	
	@RequestMapping("/chef/LoginForm.food")
	public ModelAndView loginForm(ModelAndView mv){
		mv.setViewName("chef/LoginForm");
		return mv;
	}
	
	@RequestMapping("/chef/RegForm.food")
	public ModelAndView regForm(ModelAndView mv){
		mv.setViewName("chef/RegForm");
		return mv;
	}
	
	@RequestMapping("/chef/TempSave.food")
	public ModelAndView tempSave(ModelAndView mv){
		mv.setViewName("chef/TempSave");
		return mv;
	}
	
	@RequestMapping("/chef/RegProc.food")
	public ModelAndView regProc(ModelAndView mv){
		mv.setViewName("chef/ChefMain");
		return mv;
	}
	
	@RequestMapping("/chef/InfoModify.food")
	public ModelAndView infoModify(ModelAndView mv){
		mv.setViewName("chef/InfoModify");
		return mv;
	}
	
	@RequestMapping("/chef/InfoModifyProc.food")
	public ModelAndView infoModifyProc(ModelAndView mv){
		mv.setViewName("/chef/ChefMain.food");
		return mv;
	}
}

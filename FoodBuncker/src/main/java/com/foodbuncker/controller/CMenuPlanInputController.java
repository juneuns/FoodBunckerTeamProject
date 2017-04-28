package com.foodbuncker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CMenuPlanInputController {

	@RequestMapping("/chef/Main.food")
	public ModelAndView chefMainView(ModelAndView mv){
		mv.setViewName("chef/ChefMain");
		return mv;
	}
	
	@RequestMapping("/chef/PlanModify.food")
	public ModelAndView planModify(ModelAndView mv){
		mv.setViewName("chef/PlanModify");
		return mv;
	}
	
	@RequestMapping("/chef/Review.food")
	public ModelAndView review(ModelAndView mv){
		mv.setViewName("chef/Review");
		return mv;
	}
	
	@RequestMapping("/chef/MenuModify.food")
	public ModelAndView menuModify(ModelAndView mv){
		mv.setViewName("chef/MenuModify");
		return mv;
	}
	
	@RequestMapping("/chef/PhotoUpload.food")
	public ModelAndView photoUpload(ModelAndView mv){
		mv.setViewName("chef/PhotoUpload");
		return mv;
	}
	
}

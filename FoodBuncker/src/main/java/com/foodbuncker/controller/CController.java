package com.foodbuncker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CController {
	
	@RequestMapping("/chef/Main.food")
	public ModelAndView chefMainView(ModelAndView mv){
		mv.setViewName("chef/ChefMain");
		return mv;
	}
	
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
	
	@RequestMapping("/chef/OrderBoard.food")
	public ModelAndView orderBoard(ModelAndView mv){
		mv.setViewName("chef/OrderBoard");
		return mv;
	}
	
	@RequestMapping("/chef/Invoice.food")
	public ModelAndView invoice(ModelAndView mv){
		mv.setViewName("chef/Invoice");
		return mv;
	}
	
	@RequestMapping("/chef/PayProc.food")
	public ModelAndView payProc(ModelAndView mv){
		mv.setViewName("chef/OrderBoard");
		return mv;
	}
	
	@RequestMapping("/chef/PlanModify.food")
	public ModelAndView planModify(ModelAndView mv){
		mv.setViewName("chef/PlanModify");
		return mv;
	}
	
	@RequestMapping("/chef/Review.food")
	public ModelAndView Review(ModelAndView mv){
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

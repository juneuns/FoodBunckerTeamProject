package com.foodbuncker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class COrderPayController {

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
}

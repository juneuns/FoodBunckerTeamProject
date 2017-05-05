package com.foodbuncker.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodbuncker.service.COrderPayService;

@Controller
public class COrderPayController {
	@Autowired
	COrderPayService service;

	@RequestMapping("/chef/OrderBoard.food")
	public ModelAndView orderBoard(ModelAndView mv,HttpSession session){
		ArrayList orderList = service.selectAllOrder(session);
		ArrayList orderMenuList = service.selectAllOrderMenu();
		mv.addObject("ORDERLIST",orderList);
		mv.addObject("ORDERMENULIST",orderMenuList);
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

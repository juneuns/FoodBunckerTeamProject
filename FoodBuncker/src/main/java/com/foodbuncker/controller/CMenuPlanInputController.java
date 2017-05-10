package com.foodbuncker.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodbuncker.service.CMenuPlanInputService;

@Controller
public class CMenuPlanInputController {
	@Autowired
	CMenuPlanInputService service;
	
	@RequestMapping("/chef/Main.food")
	public ModelAndView chefMainView(ModelAndView mv){
		mv.setViewName("chef/ChefMain");
		return mv;
	}
	
	@RequestMapping("/chef/PlanModify.food")
	public ModelAndView planModify(ModelAndView mv,HttpSession session){
		//int tno = (int)session.getAttribute("UTNO");
		int tno = 1;
		ArrayList oneTPlan = service.selectOneTPlan(tno);
		ArrayList allPlace = service.selectAllPlace();
		mv.addObject("ONETPLAN",oneTPlan);
		mv.addObject("ALLPLACE",allPlace);		
		mv.setViewName("chef/PlanModify");
		return mv;
	}
	
	@RequestMapping("/chef/PlanModifyProc.food")
	public void modifyPlan(HttpServletRequest req, HttpSession session){
		service.insertPlan(req.getParameter("pno"), req.getParameter("pdate"), session);
	}
	
	@RequestMapping("/chef/PlanDeleteProc.food")
	public void deletePlanProc(HttpServletRequest req, HttpSession session){
		service.deletePlan(req.getParameter("pdate"), req.getParameter("pname"), session);
	}
	
}

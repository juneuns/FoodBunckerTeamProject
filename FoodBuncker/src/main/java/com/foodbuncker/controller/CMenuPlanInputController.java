package com.foodbuncker.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.foodbuncker.service.CMenuPlanInputService;

/**
 * 
 * @author sungmo
 *
 */
@Controller
public class CMenuPlanInputController {
	@Autowired
	CMenuPlanInputService service;
	
	/**
	 * 
	 * @param mv
	 * @param session
	 * @return
	 */
	@RequestMapping("/chef/PlanModify.food")
	public ModelAndView planModify(ModelAndView mv,HttpSession session){
		int tno = (int)session.getAttribute("UTNO");
		ArrayList oneTPlan = service.selectOneTPlan(tno);
		ArrayList allPlace = service.selectAllPlace();
		mv.addObject("ONETPLAN",oneTPlan);
		mv.addObject("ALLPLACE",allPlace);		
		mv.setViewName("chef/PlanModify");
		return mv;
	}
	
	/**
	 * 
	 * @param req
	 * @param session
	 */
	@RequestMapping("/chef/PlanModifyProc.food")
	public void modifyPlan(HttpServletRequest req, HttpSession session){
		service.insertPlan(req.getParameter("pno"), req.getParameter("pdate"), session);
	}
	
	/**
	 * 
	 * @param req
	 * @param session
	 */
	@RequestMapping("/chef/PlanDeleteProc.food")
	public void deletePlanProc(HttpServletRequest req, HttpSession session){
		service.deletePlan(req.getParameter("pdate"), req.getParameter("pname"), session);
	}
	
}

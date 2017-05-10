package com.foodbuncker.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.foodbuncker.service.CMainDataService;
import com.foodbuncker.vo.CMainDataVO;

@Controller
public class CMainDataController {
	@Autowired
	CMainDataService service;
	
	@RequestMapping("../chef/ChefMain.food")
	public ModelAndView viewChefMain(ModelAndView mv, HttpSession session, HttpServletRequest req){
		System.out.println("메인함수 시행");
		int tno = 0;
		try{
			String strTno = (String)session.getAttribute("UTNO");
			tno = Integer.parseInt(strTno);
		}catch(Exception e){
			String strTno = req.getParameter("tno");
			try{
				tno = Integer.parseInt(strTno);
				session.setAttribute("UTNO", tno);
			}catch(Exception e1){
				RedirectView rv = new RedirectView();
				rv.setUrl("../chef/LoginForm.food");
				mv.setView(rv);
				return mv;
			}
		}
		ArrayList<CMainDataVO> reviewList = service.selectOneTReview(tno);
		mv.addObject("REVIEWLIST",reviewList);
		mv.setViewName("chef/ChefMain");
		return mv;
	}
	
	@RequestMapping("../chef/ChefData.food")
	public ModelAndView viewChefData(ModelAndView mv,HttpServletRequest req){
		return mv;
	}

}

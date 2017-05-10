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
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.CMainDataVO;

@Controller
public class CMainDataController {
	@Autowired
	CMainDataService service;
	
	@RequestMapping("/chef/ChefMain.food")
	public ModelAndView viewChefMain(ModelAndView mv, HttpSession session, HttpServletRequest req){
		int tno = 1;
		try{
			tno = (int)session.getAttribute("UTNO");
		}catch(Exception e){
			String strTno = req.getParameter("tno");
			try{
				tno = Integer.parseInt(strTno);
				session.setAttribute("UTNO", tno);
			}catch(Exception e1){
//				RedirectView rv = new RedirectView();
//				rv.setUrl("../chef/LoginForm.food");
//				mv.setView(rv);
//				return mv;
			}
		}
		int nowPage = service.changePage(req.getParameter("nowPage"));
		PageUtil pInfo = service.pageInfo(nowPage,tno);	
		
		ArrayList<CMainDataVO> reviewList = service.selectOneTReview(pInfo,tno);
		mv.addObject("PINFO",pInfo);
		mv.addObject("REVIEWLIST",reviewList);
		mv.setViewName("chef/ChefMain");
		return mv;
	}
	
	@RequestMapping("/chef/ChefData.food")
	public ModelAndView viewChefData(ModelAndView mv,HttpServletRequest req){
		return mv;
	}

}

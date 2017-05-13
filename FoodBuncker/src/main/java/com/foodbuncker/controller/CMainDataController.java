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
				RedirectView rv = new RedirectView();
				rv.setUrl("../chef/LoginForm.food");
				mv.setView(rv);
				return mv;
			}
		}
		
		
		ArrayList<CMainDataVO> reviewList = service.selectOneTReview(tno);
		ArrayList<CMainDataVO> menuCountRatio = service.selectMenuCountRatio(tno);
		ArrayList<CMainDataVO> weekSaleRatio = service.selectWeekSaleRatio(tno);
		ArrayList<CMainDataVO> genderSaleRatio = service.selectGenderSaleRatio(tno);
		ArrayList<CMainDataVO> ageSaleRatio = service.selectAgeSaleRatio(tno);
		String[] colorCode = service.getColorCode();
		mv.addObject("TNO",tno);
		mv.addObject("REVIEWLIST",reviewList);
		mv.addObject("MENUCOUNTRATIO",menuCountRatio);
		mv.addObject("WEEKSALERATIO",weekSaleRatio);
		mv.addObject("GENDERSALERATIO",genderSaleRatio);
		mv.addObject("AGESALERATIO",ageSaleRatio);
		mv.addObject("COLORCODE",colorCode);
		mv.setViewName("chef/ChefMain");
		return mv;
	}
	
	@RequestMapping("/chef/ChefData.food")
	public ModelAndView viewChefData(ModelAndView mv,HttpServletRequest req){
		return mv;
	}
	
	@RequestMapping("/chef/Review.food")
	public ModelAndView review(ModelAndView mv, HttpServletRequest req, HttpSession session){
		int tno = 1;
		try{
			tno = (int)session.getAttribute("UTNO");
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
		String strPage = req.getParameter("nowPage");
		int nowPage = service.changePage(strPage);
		PageUtil pInfo = service.pageInfo(nowPage,tno);
		
		ArrayList<CMainDataVO> list = service.selectOneTALLReview(pInfo, tno);
		mv.addObject("TNO",tno);
		mv.addObject("LIST",list);
		mv.addObject("PINFO",pInfo);
		mv.setViewName("/chef/Review");
		return mv;
	}
	
}

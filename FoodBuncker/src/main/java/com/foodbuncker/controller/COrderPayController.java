package com.foodbuncker.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.foodbuncker.service.COrderPayService;
import com.foodbuncker.vo.COrderPayVO;

@Controller
public class COrderPayController {
	@Autowired
	COrderPayService service;

	@RequestMapping("/chef/OrderBoard.food")
	public ModelAndView orderBoard(ModelAndView mv,HttpSession session,HttpServletRequest req){
		String strTno = req.getParameter("tno");
		try{
			ArrayList orderList = service.selectAllOrder(session,strTno);
			ArrayList orderMenuList = service.selectAllOrderMenu();
			COrderPayVO vo = service.selectOpenClosePlace(session);
			mv.addObject("ORDERLIST",orderList);
			mv.addObject("ORDERMENULIST",orderMenuList);
			mv.addObject("OPENCLOSEPLACE",vo);
			mv.setViewName("chef/OrderBoard");
		}catch(Exception e){
			e.printStackTrace();
			RedirectView rv = new RedirectView();
			rv.setUrl("../chef/LoginForm.food");
			mv.setView(rv);
		}
		return mv;
	}
	
	@RequestMapping("/chef/Invoice.food")
	public ModelAndView invoice(ModelAndView mv,HttpServletRequest req){
		String strOno = req.getParameter("ono");
		ArrayList orderMenuList = service.selectOrderMenu(strOno);
		COrderPayVO orderInfo = service.selectOneOrderInfo(strOno);
		mv.addObject("ORDERMENULIST",orderMenuList);
		mv.addObject("ORDERINFO",orderInfo);
		mv.setViewName("chef/Invoice");
		return mv;
	}
	
	@RequestMapping("/chef/PayProc.food")
	public ModelAndView payProc(ModelAndView mv,HttpServletRequest req){
		String strOno = req.getParameter("ono");
		String strTno = req.getParameter("tno");
		service.updatePayTime(strOno);
		RedirectView rv = new RedirectView();
		rv.addStaticAttribute("tno", strTno);
		rv.setUrl("../chef/OrderBoard.food");
		mv.setView(rv);
		return mv;
	}
	
	@RequestMapping("/chef/OpenProc.food")
	public ModelAndView openProc(ModelAndView mv,HttpServletRequest req){
		String strTno = req.getParameter("tno");
		String strPno = req.getParameter("pno");
		service.insertOpenTime(strTno, strPno);
		RedirectView rv = new RedirectView();
		rv.addStaticAttribute("tno", strTno);
		rv.setUrl("../chef/OrderBoard.food");
		mv.setView(rv);
		return mv;
	}
	
	@RequestMapping("/chef/CloseProc.food")
	public ModelAndView closeProc(ModelAndView mv, HttpServletRequest req){
		String strTno = req.getParameter("tno");
		service.updateCloseTime(strTno);
		RedirectView rv = new RedirectView();
		rv.addStaticAttribute("tno", strTno);
		rv.setUrl("../chef/OrderBoard.food");
		mv.setView(rv);
		return mv;
	}
	
	@RequestMapping("/chef/CookEndProc.food")
	public ModelAndView updateServTime(ModelAndView mv, HttpServletRequest req){
		String strOno = req.getParameter("ono");
		String strTno = req.getParameter("tno");
		service.updateServTime(strOno);
		RedirectView rv = new RedirectView();
		rv.addStaticAttribute("tno", strTno);
		rv.setUrl("../chef/OrderBoard.food");
		mv.setView(rv);
		return mv;
	}
}

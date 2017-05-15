package com.foodbuncker.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.foodbuncker.service.COrderPayService;
import com.foodbuncker.vo.COrderPayVO;
import com.sun.javafx.event.RedirectedEvent;

import oracle.sql.ARRAY;

/**
 * 
 * @author sungmo
 * @author jingwan
 */
@Controller
public class COrderPayController {
	@Autowired
	COrderPayService service;

	/**
	 * 
	 * @param mv
	 * @param session
	 * @param req
	 * @return
	 */
	@RequestMapping("/chef/OrderBoard.food")
	public ModelAndView orderBoard(ModelAndView mv,HttpSession session,HttpServletRequest req){
		String strTno = req.getParameter("tno");
		String strPno = req.getParameter("pno");
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
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
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
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
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
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
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
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
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
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
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
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/chef/OrderInputForm.food")
	public ModelAndView orderInputForm(ModelAndView mv, HttpServletRequest req){
		String strTno = req.getParameter("tno");
		String gen = req.getParameter("gen");
		String age = req.getParameter("age");
		ArrayList<COrderPayVO> list = service.selectOneTMenu(strTno);
		int tno = service.tnoChange(strTno);
		String strpno = req.getParameter("pno");
		int pno = service.pnoChange(strpno);
		
		mv.addObject("TNO", tno);
		mv.addObject("PNO", pno);
		mv.addObject("AGE", age);
		mv.addObject("GEN", gen);
		mv.addObject("LIST",list);
		mv.setViewName("/chef/OrderInput");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @param session
	 * @return
	 */
	@RequestMapping("/chef/OrderInputProc.food")
	public ModelAndView orderInputProc(ModelAndView mv, HttpServletRequest req, HttpSession session){
		String  stno = req.getParameter("tno");
		int tno = service.tnoChange(stno);
		String  spno = req.getParameter("pno");
		int pno = service.pnoChange(spno);
		String gen = req.getParameter("gen");
		String strage = req.getParameter("age");
		int age = Integer.parseInt(strage);
		
		String[] mName = req.getParameterValues("mName");
		String[] price = req.getParameterValues("price");
		String[] ea = req.getParameterValues("mnum");
		String[] mno = req.getParameterValues("amno");
		
		service.insertOrderInput(mName, price, ea, tno, mno, gen, age);
		int oNum = service.selectOrderNum();
		System.out.println(oNum);
		
		RedirectView rv = new RedirectView();
		rv.addStaticAttribute("TNO", tno);
		rv.addStaticAttribute("PNO", pno);
		rv.addStaticAttribute("MNAME", mName);
		rv.addStaticAttribute("PRICE", price);
		rv.addStaticAttribute("EA", ea);
		rv.addStaticAttribute("MNO", mno);
		rv.addStaticAttribute("ONUM", oNum);
		mv.addObject("ONUM", oNum);
		mv.addObject("TNO", tno);
		mv.addObject("PNO", pno);
		if(!(session.getAttribute("UTNO") == null)){
			rv.setUrl("../chef/OrderBoard.food");
			mv.setView(rv);
		}
		else{
//			rv.setUrl("../person/userView.food");
			mv.setViewName("person/UserView");
		}
		return mv;
	}
	
}

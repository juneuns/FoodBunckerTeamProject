package com.foodbuncker.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.foodbuncker.service.PMainViewService;
import com.foodbuncker.util.PageUtil;

/**
 * 
 * @author jingwan
 *
 */
@Controller
public class PMainViewController {
	@Autowired
	public PMainViewService pmvService;
	
	/**
	 * 
	 * @param mv
	 * @return
	 */
	@RequestMapping("/person/MainWindow.food")
	public ModelAndView mainView(ModelAndView mv){
		ArrayList list = pmvService.selectMenu();
		ArrayList list2 = pmvService.selectReview();
		ArrayList list3 = pmvService.selectTruck();
				
		mv.addObject("LIST", list);
		mv.addObject("LIST2", list2);
		mv.addObject("LIST3", list3);
		mv.setViewName("/person/MainWindow");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/DetailView.food")
	public ModelAndView detailView(ModelAndView mv, HttpServletRequest req){
		String strtno = req.getParameter("tno");
		int tno = Integer.parseInt(strtno);
		String strPage = req.getParameter("nowPage");
		int nowPage = pmvService.changePage(strPage);
	
		System.out.println(nowPage);
		ArrayList list = pmvService.selectMenuView(tno);
		ArrayList list2 = pmvService.selectReviewView(tno);
		ArrayList clist = pmvService.selectChef(tno);
		ArrayList mlist = pmvService.selectMain(tno);
		ArrayList glist = pmvService.selectGeneral(tno);
		ArrayList mmlist = pmvService.selectMainMenu(tno);
		int km = pmvService.selectKM(tno);
		int sell = pmvService.selectSellMenu(tno);
		int cus = pmvService.selectCustomer(tno);
		int place = pmvService.selectPlace(tno);
		
		mv.addObject("TNO", tno);
		mv.addObject("LIST", list);
		mv.addObject("LIST2", list2);
		mv.addObject("CLIST", clist);
		mv.addObject("MLIST", mlist);
		mv.addObject("GLIST", glist);
		mv.addObject("MMLIST", mmlist);
		mv.addObject("KM", km);
		mv.addObject("SELL", sell);
		mv.addObject("CUS", cus);
		mv.addObject("PLACE", place);
		mv.addObject("NOWPAGE", nowPage);
		mv.setViewName("/person/DetailView");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/About.food")
	public ModelAndView aboutView(ModelAndView mv, HttpServletRequest req){
//		String strtno = req.getParameter("tno");
//		int tno = Integer.parseInt(strtno);

		int sTotal = pmvService.selectSellTotal();
		int cTotal = pmvService.selectCusTotal();
		int pTotal = pmvService.selectPlaceTotal();
		int ChefTotal = pmvService.selectChefTotal();
		ArrayList rlist = pmvService.selectReview();
		ArrayList mlist = pmvService.selectMenu();
		
		mv.addObject("STOTAL", sTotal);
		mv.addObject("CTOTAL", cTotal);
		mv.addObject("PTOTAL", pTotal);
		mv.addObject("CHEFTOTAL", ChefTotal);
		mv.addObject("RLIST", rlist);
		mv.addObject("MLIST", mlist);
		mv.setViewName("/person/About");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/Gallery.food")
	public ModelAndView galleryView(ModelAndView mv, HttpServletRequest req){
		String strPage = req.getParameter("nowPage");
		int nowPage = pmvService.changePage(strPage);
		PageUtil pInfo = pmvService.pageInfo(nowPage);
		
		ArrayList ilist = pmvService.selectImage(pInfo);

		mv.addObject("PINFO", pInfo);
		mv.addObject("ILIST", ilist);
		mv.addObject("nowPage", nowPage);
		mv.setViewName("/person/Gallery");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/moreGallery.food")
	public ModelAndView moreGallery(ModelAndView mv, HttpServletRequest req){
		String strPage = req.getParameter("nowPage");
		int nowPage = pmvService.changePage(strPage);
		
		PageUtil pInfo = pmvService.pageInfo(nowPage);
		ArrayList ilist = pmvService.selectImage(pInfo);
		
		mv.addObject("PINFO", pInfo);
		mv.addObject("ILIST", ilist);
		mv.addObject("nowPage", nowPage);
		
		mv.setViewName("/person/moreGallery");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/moreReview.food")
	public ModelAndView moreReview(ModelAndView mv, HttpServletRequest req){
		String strtno = req.getParameter("tno");
		int tno = Integer.parseInt(strtno);
		String strPage = req.getParameter("nowPage");
		int nowPage = pmvService.changePage(strPage);
		
		PageUtil pInfo = pmvService.pageInfo(nowPage);
		
		ArrayList rlist = pmvService.selectTReviewView(pInfo, tno);
		
		mv.addObject("TNO", tno);
		mv.addObject("nowPage", nowPage);
		mv.addObject("PINFO", pInfo);
		mv.addObject("TRLIST", rlist);
		mv.setViewName("/person/moreReview");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/userView.food")
	public ModelAndView userMainView(ModelAndView mv, HttpServletRequest req){
		String strtno = req.getParameter("tno");
		int tno = pmvService.tnoChange(strtno);
		String strpno = req.getParameter("pno");
		int pno = pmvService.pnoChange(strpno);
		
		mv.addObject("TNO", tno);
		mv.addObject("PNO", pno);
		mv.setViewName("/person/UserView");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/reveiwForm.food")
	public ModelAndView reveiwForm(ModelAndView mv, HttpServletRequest req){
		String strtno = req.getParameter("tno");
		int tno = Integer.parseInt(strtno);
		String strpno = req.getParameter("pno");
		int pno = Integer.parseInt(strpno);
		
		mv.addObject("TNO", tno);
		mv.addObject("PNO", pno);
		mv.setViewName("/person/reveiwForm");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/person/reviewProc.food")
	public ModelAndView reveiwProc(ModelAndView mv, HttpServletRequest req){
		String strtno = req.getParameter("tno");
		int tno = Integer.parseInt(strtno);
		String strpno = req.getParameter("pno");
		int pno = 0;
		try {
			pno = Integer.parseInt(strpno);
		} catch (Exception e) {
			pno = 1;
		}
		 
		String body = req.getParameter("body");
		
		pmvService.insertReview(tno, body);
		
//		RedirectView rv = new RedirectView();
//		rv.addStaticAttribute("TNO", tno);
//		rv.addStaticAttribute("PNO", pno);
//		rv.setUrl("../person/UserView.food");
//		mv.setView(rv);
//		return mv;
		
		mv.addObject("TNO", tno);
		mv.addObject("PNO", pno);
		mv.setViewName("/person/UserView");
		return mv;
	}
}

package com.foodbuncker.controller;

import java.util.ArrayList;
import java.util.HashMap;

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


/**
 * 
 * @author sungmo
 *
 */
@Controller
public class CMainDataController {
	@Autowired
	CMainDataService service;
	
	/**
	 * 
	 * @param mv
	 * @param session
	 * @param req
	 * @return
	 */
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
		ArrayList<CMainDataVO> placeSaleSum = service.selectPlaceSaleSum(tno);
		ArrayList<CMainDataVO> daySaleSum = service.selectDaySaleSum(tno);
		HashMap<String,Integer> yearSaleRatio = service.selectYearSaleRatio(tno);
		HashMap<String,Integer> monthSaleRatio = service.selectMonthSaleRatio(tno);
		HashMap<String,Integer> daySaleRatio = service.selectDaySaleRatio(tno);
		HashMap<String,Integer> hourSaleRatio = service.selectHourSaleRatio(tno);
		ArrayList<CMainDataVO> rainSaleRatio = service.selectRainSaleRatio(tno);
		ArrayList<CMainDataVO> tempSaleRatio = service.selectTempSaleRatio(tno);
		String[] colorCode = service.getColorCode();
		mv.addObject("TNO",tno);
		mv.addObject("REVIEWLIST",reviewList);
		mv.addObject("MENUCOUNTRATIO",menuCountRatio);
		mv.addObject("WEEKSALERATIO",weekSaleRatio);
		mv.addObject("GENDERSALERATIO",genderSaleRatio);
		mv.addObject("AGESALERATIO",ageSaleRatio);
		mv.addObject("COLORCODE",colorCode);
		mv.addObject("PLACESALESUM",placeSaleSum);
		mv.addObject("DAYSALESUM",daySaleSum);
		mv.addObject("YEARSALERATIO",yearSaleRatio);
		mv.addObject("MONTHSALERATIO",monthSaleRatio);
		mv.addObject("DAYSALERATIO",daySaleRatio);
		mv.addObject("HOURSALERATIO",hourSaleRatio);
		mv.addObject("RAINSALERATIO",rainSaleRatio);
		mv.addObject("TEMPSALERATIO",tempSaleRatio);
		mv.setViewName("chef/ChefMain");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/chef/ChefData.food")
	public ModelAndView viewChefData(ModelAndView mv,HttpServletRequest req){
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @param session
	 * @return
	 */
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
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/chef/HourSaleSum.food")
	public ModelAndView ajaxHourSaleSum(ModelAndView mv, HttpServletRequest req){
		String strTno = req.getParameter("tno");
		int tno = Integer.parseInt(strTno);
		ArrayList list = service.selectHourSaleSum(tno);
		mv.addObject("LIST",list);
		mv.setViewName("/chef/HourSaleSumAjax");
		return mv;
	}
	
	/**
	 * 
	 * @param mv
	 * @param req
	 * @return
	 */
	@RequestMapping("/chef/MonthSaleSum.food")
	public ModelAndView ajaxMonthSaleSum(ModelAndView mv, HttpServletRequest req){
		String strTno = req.getParameter("tno");
		int tno = Integer.parseInt(strTno);
		ArrayList list = service.selectMonthSaleSum(tno);
		mv.addObject("LIST",list);
		mv.setViewName("/chef/MonthSaleSumAjax");
		return mv;
	}
	
}

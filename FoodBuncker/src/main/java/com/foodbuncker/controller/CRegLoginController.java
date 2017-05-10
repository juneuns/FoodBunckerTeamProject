package com.foodbuncker.controller;
/**
 * 
 */


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.foodbuncker.service.CRegLoginService;
import com.foodbuncker.vo.CRegLoginVO;

@Controller
public class CRegLoginController {
	@Autowired
	public CRegLoginService cregLoginService;
	
	@RequestMapping("/chef/LoginForm.food")
	public ModelAndView loginForm(ModelAndView mv, HttpSession session){
		// 뷰만 넘겨준다.
		
		boolean isLogin = false ;
		boolean status = true ;
		try{
			isLogin = (boolean) session.getAttribute("isLogin");
		}
		catch(Exception e){}
		try{
			status = (boolean) session.getAttribute("STATUS");
		}
		catch(Exception e){}
		if (isLogin){
			// 이미 로그인 처리가 된 회원은 해당 뷰로 다시 보내자.
			CRegLoginVO cregVO = new CRegLoginVO();
			cregVO.cnt = 1 ;
			cregVO.id = (String) session.getAttribute("UID");
			cregVO.no = (int) session.getAttribute("UTNO");
			cregLoginService.sessionSettingSrvc(session, cregVO);
			
			RedirectView rv = new RedirectView();
			rv.setUrl("../chef/RedirectProc.food");
			mv.setView(rv);
		}
		else{
			// 로그인 처리가 안된 상태면 로그인 폼으로 보낸다.
			// 문자열 표시 파라메터도 같이 보낸다.
			mv.addObject("STATUS", status);
			status = true ;
			session.setAttribute("STATUS", status);
			mv.setViewName("chef/LoginForm");
		}
		return mv;
	}

	@RequestMapping("/chef/LoginProc.food")
	public ModelAndView loginProc(ModelAndView mv, HttpSession session, CRegLoginVO cregVO){
		// 정보에 맞는 회원이 있는지 알아본다.
		int cnt = cregLoginService.idCntSrvc(session, cregVO);
		cregVO.cnt = cnt ;
		RedirectView rv = new RedirectView();
		if (cnt == 1){
			// 회원 정보가 있는 경우 세션에 처리해준다.
			cregLoginService.sessionSettingSrvc(session, cregVO);
			
			// 뷰를 부르자.
			//	1. 회원정보만 입력된 상태.. 다시 입력 폼으로 돌아가야 한다.
//			rv.setUrl("../chef/RedirectProc.food");
//			mv.setView(rv);
			
			int tabNo = 0 ;
			try{
				tabNo = (int) session.getAttribute("tabNo");
			}
			catch(Exception e){}

			System.out.println("##################### RedirectView tabNo : " + tabNo);
			//		1. 회원정보만 입력된 상태.. 다시 입력 폼으로 돌아가야 한다.
			if(tabNo == 1 || tabNo == 2 ){
				rv.setUrl("../chef/RegForm.food");
				System.out.println("##################### RedirectView 1 & 2 : ");
			}else if(tabNo == 3){
			//	2. 메인 메뉴등록까지 완료된 상태..

				System.out.println("##################### RedirectView 3 : ");
				rv.setUrl("../chef/RegConf.food");
			}  else if(tabNo == 4){
			//	3. 모든 등록 절차가 완료된 상태...
				rv.setUrl("../chef/ChefMain.food");
			}
			mv.setView(rv);
			
		}
		else {
			// 1이 아닌 경우는 0이라는 말이고 로그인에 실패해서 로그인 폼으로 다시 가야한다.
			// 메세지 표시를 위해 문자열을 같이 보내주자.
			boolean status = false ;
			session.setAttribute("STATUS", status);
			rv.setUrl("../chef/LoginForm.food");
			mv.setView(rv);
		}
		return mv;

	}
	
	/*
	 * 로그인 처리된 사용자 redirect 처리 컨트롤러..
	 */
	@RequestMapping("/chef/RedirectProc.food")
	public ModelAndView redirectProc(ModelAndView mv, HttpSession session){
		int tabNo = 0 ;
		try{
			tabNo = (int) session.getAttribute("tabNo");
		}
		catch(Exception e){}

//		System.out.println("##################### RedirectView tabNo : " + tabNo);
		RedirectView rv = new RedirectView();
		//		1. 회원정보만 입력된 상태.. 다시 입력 폼으로 돌아가야 한다.
		if(tabNo == 1 || tabNo == 2 ){
//			mv.setViewName("chef/RegForm");
			rv.setUrl("../chef/RegForm.food");
//			System.out.println("##################### RedirectView 1 & 2 : ");
			mv.setView(rv);
		}else if(tabNo == 3){
		//	2. 메인 메뉴등록까지 완료된 상태..

//			System.out.println("##################### RedirectView 3 : ");
			rv.setUrl("../chef/RegConf.food");
			mv.setView(rv);
		}
		else if(tabNo == 4){
		//	3. 모든 등록 절차가 완료된 상태...
			rv.setUrl("../chef/ChefMain.food");
			mv.setView(rv);
//			mv.setViewName("chef/ChefMain");
		}
		return mv;
	}
	
	@RequestMapping("/chef/RegForm.food")
	public ModelAndView regForm(ModelAndView mv, CRegLoginVO cregVO, HttpSession session, HttpServletRequest req ){
		
		int tabNo ;
		System.out.println("regForm cregVO.tabNo : " + cregVO.tabNo);
		
		try{
//			tabNo = cregVO.tabNo;
			String stabNo = (String) req.getParameter("tabNo");
			tabNo = Integer.parseInt(stabNo);
		}
		catch(Exception e){
			tabNo = 0 ;
		}
		

		if(tabNo == 0){
			try{
				tabNo = (int) session.getAttribute("tabNo");
				}
				catch(Exception e){
					tabNo = 0 ;
				}
		}
		
		System.out.println("regForm tabNo : " + tabNo);
		session.setAttribute("tabNo", tabNo);
		// 뷰를 부르자.
		RedirectView rv = new RedirectView();
		if( tabNo == 3){
			rv.setUrl("../chef/RegConf.food");
			mv.setView(rv);
			
		}
		System.out.println("regForm session tabNo : " + tabNo);
		mv.addObject("tabNo", tabNo);
		mv.addObject("DATA", cregVO);
		mv.setViewName("chef/RegForm");
		return mv;
	}
	
	@RequestMapping("/chef/TempSave.food")
	public ModelAndView tempSave(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){

		RedirectView rv = new RedirectView();
		int tabNo = (int) session.getAttribute("tabNo");
		System.out.println("Tempsave tabNo : " + tabNo);
		if(tabNo == 0){
			try {
				cregLoginService.cRegInfoSrvc(session, cregVO);
			} catch (Exception e) {}
			
			// 정보가 등록 되었으면 로그인 처리도 해줘야 한다.
			System.out.println("############ TempsaveControll tabNo 0-099 : " + tabNo );
			int cnt = cregLoginService.idCntSrvc(session, cregVO);
			System.out.println("############ TempsaveControll tabNo 0-088 : " + tabNo );
			cregVO.cnt = cnt ;
			if (cnt == 1){
				// 회원 정보가 있는 경우 세션에 저장해준다.
				System.out.println("############ TempsaveControll tabNo 0-0 : " + tabNo );
				cregLoginService.sessionSettingSrvc(session, cregVO);
				tabNo = (int) session.getAttribute("tabNo");
				System.out.println("############ TempsaveControll tabNo 0-1 : " + tabNo );
			}
			
//			rv.setUrl("../chef/RegForm.food");
			System.out.println("############ TempsaveControll tabNo 0-2 : " + tabNo );
//			rv.addStaticAttribute("tabNo", cregVO.tabNo);
//			rv.addStaticAttribute("DATA", cregVO);
//			mv.setView(rv);
			mv.addObject("tabNo", tabNo);
			mv.addObject("DATA", cregVO);
			mv.setViewName("chef/RegForm");
		}
		else if(tabNo == 1){
			String chefImg = cregLoginService.uploadProc(cregVO.chefImg, session);
			String truckImg = cregLoginService.uploadProc(cregVO.truckImg, session);
			cregVO.chefImgName = chefImg ;
			cregVO.truckImgName = truckImg ;
			cregVO.no = (int) session.getAttribute("UTNO");
			// 데이터베이스에 기록하자.
			try {
				cregLoginService.cRegInfoSrvc(session, cregVO);
			} catch (Exception e) {}
			tabNo = (int) session.getAttribute("tabNo");
			System.out.println("############ TempsaveControll tabNo 1 : " + tabNo );
			
			rv.setUrl("../chef/RegForm.food");
//			mv.addObject("tabNo", cregVO.tabNo);
			mv.addObject("DATA", cregVO);
//			rv.addStaticAttribute("tabNo", cregVO.tabNo);
//			rv.addStaticAttribute("DATA", cregVO);
//			mv.setView(rv);
			mv.addObject("tabNo", tabNo);
			mv.setViewName("chef/RegForm");
		}
		else if(tabNo == 2){
			System.out.println("############ 11111111111111 #########");
			System.out.println("############ 11111111111111 ######### : " + cregVO.mmenuPrice);
			String mmenuImg = cregLoginService.uploadProc(cregVO.mmenuImg, session);
			System.out.println("############ 11111111111111 imgName : " + mmenuImg);
			cregVO.mmenuImgName = mmenuImg ;
			cregVO.no = (int) session.getAttribute("UTNO");
			
			System.out.println("############ 22222222222222 #########");
			System.out.println("############ TempsaveControll mmenuImgName" + cregVO.mmenuName );
			System.out.println("############ TempsaveControll NO : " + cregVO.no );
			System.out.println("############ TempsaveControll id : " + cregVO.id );
			System.out.println("############ TempsaveControll menucomnet : " + cregVO.mmenuComment );
			
			// 데이터베이스에 기록하자.
			try {
				cregLoginService.cRegInfoSrvc(session, cregVO);
			} catch (Exception e) {}
			tabNo = (int) session.getAttribute("tabNo");
//			mv.addObject("tabNo", cregVO.tabNo);
//			mv.addObject("DATA", cregVO);
//				mv.setViewName("chef/RegForm");
			rv.setUrl("../chef/RedirectProc.food");
			rv.addStaticAttribute("tabNo", cregVO.tabNo);
			rv.addStaticAttribute("DATA", cregVO);
			mv.setView(rv);
		}

		System.out.println("############ tabNo 2 TempsaveControll tabNo: " + tabNo );
		cregVO.tabNo = (int) session.getAttribute("tabNo");
		System.out.println("############ tabNo 2 TempsaveControll cregVO.tabNo: " + cregVO.tabNo );
		return mv;
	}
	
	/*
	 * 회원가입 확인 페이지 보여주기...
	 */
	@RequestMapping("/chef/RegConf.food")
	public ModelAndView regConf(ModelAndView mv, HttpSession session, CRegLoginVO cregVO){
		cregLoginService.sessionSettingSrvc(session, cregVO);
		int no = (int) session.getAttribute("UTNO");
		System.out.println("regconf session no : " + (int) session.getAttribute("UTNO"));
		CRegLoginVO data = cregLoginService.confirmReg(no);
		
		mv.addObject("DATA", data);
		mv.setViewName("chef/TempSave");
		return mv;
	}
	
	/*
	 * 회원가입 최종 완료 요청 처리 컨트롤러
	 */
	@RequestMapping("/chef/RegProc.food")
	public ModelAndView regProc(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){
		
		cregVO.no = (int) session.getAttribute("UTNO") ;
		try{
			cregVO.mmenuPrice = Integer.parseInt(cregVO.strPrice);
		}
		catch(Exception e){}
		System.out.println("###############regConf phone  여긴 오냐???#####  phone : " + cregVO.phone);
		cregLoginService.regProcSrvc(cregVO, session);
		System.out.println("###############regConf   여긴???#####");
		
		mv.addObject("DATA", cregVO);
		mv.setViewName("chef/ChefMain");
		return mv;
	}
	
	/*
	 * 회원 정보 보여주기 요청 처리 컨트롤러
	 */
	@RequestMapping("/chef/InfoModify.food")
	public ModelAndView infoModify(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){
		int no = (int) session.getAttribute("UTNO");
		cregVO.no = no ;

		System.out.println("@@@@@@@@@@@@@@@@  Session VO NO  : " + cregVO.no);
		CRegLoginVO data = cregLoginService.memberinfoSrvc(cregVO);
		
		System.out.println("@@@@@@@@@@@@@@@@  INfoModify  chef : " + data.chef);
		mv.addObject("DATA", data);
		mv.setViewName("chef/InfoModify");
		return mv;
	}
	
	/*
	 * 회원정보 처리 요청 전담 컨트롤러
	 */
	@RequestMapping("/chef/InfoModifyProc.food")
	public ModelAndView infoModifyProc(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){
		
		cregVO.no = (int) session.getAttribute("UTNO");

		System.out.println("################## modifyProc 작업 확인  phone number : " + cregVO.phone);
		
		// 회원 정보 수정해주고
		// 데이터 가져오자.
		CRegLoginVO data = cregLoginService.infoModifyProcSrvc(cregVO);
		System.out.println("################## modifyProc Update 성공 #######################");
		
		System.out.println("################## modifyProc 작업 확인  data.no : " + data.no);
		// 데이터는 뷰에게 전달해 준다.
		mv.addObject("DATA", data);
		mv.setViewName("/chef/InfoModify");
		return mv;
	}
	

//	@RequestMapping("/chef/ChefMain.food")
//	public ModelAndView chefMain(ModelAndView mv, HttpSession session){
//		
//		int no = (int) session.getAttribute("UTNO");
//		
//		mv.addObject("TNO", no);
//		mv.setViewName("/chef/ChefMain");
//		return mv;
//	}
	
	/*
	 * 메뉴 등록하면 보여주기 
	 */
	@RequestMapping("/chef/MenuModify.food")
	public ModelAndView menuModify(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){
		// 할일
		//		데이터 만들어서
		cregVO = cregLoginService.menuModifySrvc(cregVO, session);
		// 		뷰에거 넘겨주자
		mv.addObject("DATA", cregVO);
		mv.addObject("LIST", cregVO.list);
		mv.setViewName("chef/MenuModify");
		return mv ;
	}
	
}

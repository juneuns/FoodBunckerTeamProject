package com.foodbuncker.controller;
/**
 * 
 */


import java.util.ArrayList;
import java.util.Iterator;

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
	
	/*
	 * 로그인 폼 보여주기 전담 컨트롤러 함수
	 */
	@RequestMapping("/chef/LoginForm.food")
	public ModelAndView loginForm(ModelAndView mv, HttpSession session, CRegLoginVO cregVO){
		// 뷰만 넘겨준다.

//		System.out.println("##################### LoginTest  : ");
		// 세션을 조회하자.
		cregVO = cregLoginService.sessionSearchSrvc(session, cregVO);

		// 로그인 시도를 했는지 확인하는 변수
		boolean status = true ;
		
		try{
			status = (boolean) session.getAttribute("STATUS");
		}
		catch(Exception e){}
		
		if (cregVO.no > 0 ){
			// 이미 로그인 처리가 된 회원은 해당 뷰로 다시 보내자.
			cregVO.cnt = 1 ;	// 로그인 처리가 됬다는 말은 회원이 존재한다는 말...
			cregVO.id = (String) session.getAttribute("UID");
			
			RedirectView rv = new RedirectView();
			rv.setUrl("../chef/RedirectProc.food");
			mv.setView(rv);
		}
		else {
			// 로그인 처리가 안된 상태면 로그인 폼으로 보낸다.
			// 문자열 표시 파라메터도 같이 보낸다.
			mv.addObject("STATUS", status);
			status = true ;
			session.setAttribute("STATUS", status);
			mv.setViewName("chef/LoginForm");
		}
		return mv;
	}

	/*
	 * 로그인 요청 전담 처리 컨트롤러 함수
	 */
	@RequestMapping("/chef/LoginProc.food")
	public ModelAndView loginProc(ModelAndView mv, HttpSession session, CRegLoginVO cregVO){

		System.out.println("##################### login proc cregVO.cnt 1 : " + cregVO.cnt);
		System.out.println("##################### login proc cregVO.id 1 : " + cregVO.id);
		// 정보에 맞는 회원이 있는지 알아본다.
		int cnt = cregLoginService.idCntSrvc(session, cregVO);
		cregVO.cnt = cnt ;
		System.out.println("##################### login proc cregVO.cnt 2 : " + cregVO.cnt);
		RedirectView rv = new RedirectView();
		if (cnt == 1){
			// 회원 정보가 있는 경우 세션에 처리해준다.
			cregVO.cnt = cnt ;
			session.setAttribute("CNT", cnt);
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
				rv.addStaticAttribute("tabNo", tabNo);
				rv.setUrl("../chef/RegForm.food");
				System.out.println("##################### RedirectView 1 & 2 : ");
			}else if(tabNo == 3){
			//	2. 메인 메뉴등록까지 완료된 상태..

				System.out.println("##################### RedirectView 3 : ");
				rv.addStaticAttribute("tabNo", tabNo);
				rv.setUrl("../chef/RegConf.food");
			}  else if(tabNo == 4){
			//	3. 모든 등록 절차가 완료된 상태...
				rv.addStaticAttribute("tabNo", tabNo);
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
			rv.addStaticAttribute("tabNo", tabNo);
			rv.setUrl("../chef/RegForm.food");
//			System.out.println("##################### RedirectView 1 & 2 : ");
			mv.setView(rv);
		}else if(tabNo == 3){
		//	2. 메인 메뉴등록까지 완료된 상태..

//			System.out.println("##################### RedirectView 3 : ");
			rv.addStaticAttribute("tabNo", tabNo);
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
	public ModelAndView regForm(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){
		
		try{
			cregVO.tabNo = (int) session.getAttribute("tabNo");
		}
		catch(Exception e){
			cregVO.tabNo = 0 ;
		}
		System.out.println("regForm cregVO.tabNo : " + cregVO.tabNo);
		session.setAttribute("tabNo", cregVO.tabNo);
		// 뷰를 부르자.
		if (cregVO.tabNo < 3){
			mv.addObject("tabNo", cregVO.tabNo);
			mv.addObject("DATA", cregVO);
			mv.setViewName("chef/RegForm");
		}
		else{
			RedirectView rv = new RedirectView();
			rv.setUrl("../chef/RedirectProc.food");
			mv.setView(rv);
		}
		return mv;
	}
	
	@RequestMapping("/chef/TempSave.food")
	public ModelAndView tempSave(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){

		System.out.println("############ TempsaveControll chef 0-001 : " + cregVO.chef );
		RedirectView rv = new RedirectView();
		int tabNo = (int) session.getAttribute("tabNo");
		System.out.println("Tempsave tabNo : " + tabNo);
		if(tabNo == 0){
			try {
				cregLoginService.cRegInfoSrvc(session, cregVO);
				tabNo = 1 ;
				session.setAttribute("tabNo", tabNo);
			} catch (Exception e) {}
			
			// 정보가 등록 되었으면 로그인 처리도 해줘야 한다.
			System.out.println("############ TempsaveControll tabNo 0-099 : " + tabNo );
			int cnt = cregLoginService.idCntSrvc(session, cregVO);
			System.out.println("############ TempsaveControll tabNo 0-088 : " + tabNo );
			cregVO.cnt = cnt ;
//			if (cnt == 1){
//				// 회원 정보가 있는 경우 세션에 저장해준다.
//				System.out.println("############ TempsaveControll tabNo 0-0 : " + tabNo );
//				tabNo = (int) session.getAttribute("tabNo");
//				System.out.println("############ TempsaveControll tabNo 0-1 : " + tabNo );
//			}
			
			System.out.println("############ TempsaveControll tabNo 0-2 : " + tabNo );
//			rv.addStaticAttribute("tabNo", tabNo);
//			rv.setUrl("../chef/RegForm.food");
			mv.addObject("tabNo", tabNo);
			mv.setViewName("chef/RegForm");
		}
		else if(tabNo == 1){
			try{
			String chefImg = cregLoginService.uploadProc(cregVO.chefImg, session);
			String truckImg = cregLoginService.uploadProc(cregVO.truckImg, session);
			cregVO.chefImgName = chefImg ;
			cregVO.truckImgName = truckImg ;
			}catch(Exception e){System.out.println("******파일 이름 가져오기 에러!");}
			cregVO.no = (int) session.getAttribute("UTNO");
			
			// 데이터베이스에 기록하자.
			try {
				cregLoginService.cRegInfoSrvc(session, cregVO);
			} catch (Exception e) {}
			tabNo = (int) session.getAttribute("tabNo");
			System.out.println("############ TempsaveControll tabNo 1 : " + tabNo );
			
			mv.addObject("tabNo", tabNo);
			mv.setViewName("chef/RegForm");
//			rv.setUrl("../chef/LoginForm.food");
//			mv.setView(rv);
		}
		else if(tabNo == 2){
			System.out.println("############ 11111111111111 #########");
			System.out.println("############ 11111111111111 ######### : " + cregVO.mmenuPrice);
			String mmenuImg = cregLoginService.uploadProc(cregVO.mmenuImg, session);
			System.out.println("############ 11111111111111 imgName : " + mmenuImg);
			cregVO.mmenuImgName = mmenuImg ;
			cregVO.no = (int) session.getAttribute("UTNO");
			
//			System.out.println("############ 22222222222222 #########");
//			System.out.println("############ TempsaveControll menucomnet : " + cregVO.mmenuComment );
			
			// 데이터베이스에 기록하자.
			try {
				cregLoginService.cRegInfoSrvc(session, cregVO);
			} catch (Exception e) {}
			tabNo = (int) session.getAttribute("tabNo");
//			mv.addObject("tabNo", cregVO.tabNo);
//			mv.addObject("DATA", cregVO);
//				mv.setViewName("chef/RegForm");
			rv.setUrl("../chef/RegForm.food");
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
		int no = 0 ;
		try{
			no = (int) session.getAttribute("UTNO");
		}catch(Exception e){
			RedirectView rv = new RedirectView();
			rv.setUrl("../person/MainWindow.food");
			mv.setView(rv);
			return mv;
			
		}
		cregVO.no = no ;

//		System.out.println("@@@@@@@@@@@@@@@@  Session VO NO  : " + cregVO.no);
		CRegLoginVO data = cregLoginService.memberinfoSrvc(cregVO);
		
//		System.out.println("@@@@@@@@@@@@@@@@  INfoModify  chef : " + data.chef);
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

//		System.out.println("################## modifyProc 작업 확인  phone number : " + cregVO.phone);
		
		// 회원 정보 수정해주고
		// 데이터 가져오자.
		CRegLoginVO data = cregLoginService.infoModifyProcSrvc(cregVO);
//		System.out.println("################## modifyProc Update 성공 #######################");
		
//		System.out.println("################## modifyProc 작업 확인  data.no : " + data.no);
		// 데이터는 뷰에게 전달해 준다.
		mv.addObject("DATA", data);
		mv.setViewName("/chef/InfoModify");
		return mv;
	}

	
	/*
	 * 메뉴 등록화면 보여주기 요청 처리..
	 */
	@RequestMapping("/chef/MenuModify.food")
	public ModelAndView menuModify(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){
		// 할일
		//		데이터 만들어서
		try{
			cregVO = cregLoginService.menuModifySrvc(cregVO, session);
			// 		뷰에거 넘겨주자
			mv.addObject("DATA", cregVO);
			mv.addObject("LIST", cregVO.list);
			mv.setViewName("chef/MenuModify");
			
		}catch(Exception e){
			RedirectView rv = new RedirectView();
			rv.setUrl("../person/MainWindow.food");
			mv.setView(rv);
		}
		return mv ;
	}
	
	/*
	 * 메뉴 등록 요청 처리..
	 */
	@RequestMapping("/chef/MenuModProc.food")
	public ModelAndView menuModProc(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){
		
		// 할일
		//		데이터 넣어주고...
		try{
			String mmenuImg = cregLoginService.uploadProc(cregVO.mmenuImg, session);
			cregVO.mmenuImgName = mmenuImg ;
			cregVO.mmenugrade = "S" ;
			cregVO.no = (int) session.getAttribute("UTNO");

			System.out.println("############   controller menu sname #############" + cregVO.mmenuImgName);
		}catch(Exception e){System.out.println("******파일 이름 가져오기 에러!");}
		cregLoginService.menuModProcSrvc(cregVO);
		// 		뷰 호출...
		System.out.println("******메뉴 디비 저장 완료...");
		
		RedirectView rv = new RedirectView();
		rv.setUrl("../chef/MenuModify.food");
		mv.setView(rv);
		
//		mv.setViewName("chef/MenuModify");
		return mv ;
	}
	
	
	/*
	 * 일반사진 등록 전담 컨트롤러
	 */
	@RequestMapping("/chef/PhotoUpload.food")
	public ModelAndView photoUpload(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){
		// 할일 
		// 	데이터 만들고

		CRegLoginVO data = cregLoginService.photoUploadSrvc(cregVO, session);
		
		CRegLoginVO data1 = new CRegLoginVO();
		CRegLoginVO data2 = new CRegLoginVO();
		
		ArrayList list1 = (ArrayList) data.list1 ;

		Iterator itor = list1.iterator();
		while(itor.hasNext()){
			data1 = (CRegLoginVO) itor.next();
		}
		System.out.println("list1 내용 data1.mImgName : " + data1.mImgName);
		
		ArrayList list2 = (ArrayList) data.list2 ;
		System.out.println("list size : " + list2.size());
		
		Iterator itor2 = list2.iterator();
		while(itor2.hasNext()){
			data2 = (CRegLoginVO) itor2.next();
		}
		System.out.println("list2 내용 data2.mImgName : " + data2.mImgName);
		ArrayList list = data.list ;
		
		mv.addObject("TDATA", data1);
		mv.addObject("CDATA", data2);
		mv.addObject("LIST", list);
		mv.setViewName("chef/PhotoUpload");
		return mv;
	}
	
	/*
	 * 일반사진 등록 요청 전담 컨트롤러
	 */
	@RequestMapping("/chef/PhotoUploadProc.food")
	public ModelAndView photoUploadProc(ModelAndView mv, CRegLoginVO cregVO, HttpSession session){
		// 할일 
		// 	데이터 만들고
		
		cregLoginService.photoUpProcSrvc(cregVO, session);
		// 		뷰 호출...
		System.out.println("******메뉴 디비 저장 완료...");
		
		RedirectView rv = new RedirectView();
		rv.setUrl("../chef/PhotoUpload.food");
		mv.setView(rv);
		return mv;
	}
}

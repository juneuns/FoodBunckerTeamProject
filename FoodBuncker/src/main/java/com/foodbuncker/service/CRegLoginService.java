package com.foodbuncker.service;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.foodbuncker.dao.CRegLoginDAO;
import com.foodbuncker.util.FileUtil;
import com.foodbuncker.vo.CRegLoginVO;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 * 
 * @author jeon eun seok
 * since 	2017.05.01
 *
 */
public class CRegLoginService {
	@Autowired
	CRegLoginDAO cregLoginDAO;
	
	//  아이디 체크 전담 서비스 함수
	public int idCntSrvc(HttpSession session, CRegLoginVO cregVO){
		int cnt;
		String id = cregVO.id;
		String pw = cregVO.pw;
		
		System.out.println(id + " : " + pw);
		cnt = cregLoginDAO.cLoginProcDAO(cregVO);
		// 이곳에 접근했다는 말은 이미 로그인 폼을 접근 했다는 말이므로 변수를 세션에 저장해주자.
	 	// 이후  어떤 상황이든지 로그인 폼에 다시 접근하게 되므로 로그인폼 접근 변수를 다시 셋팅한다.
		return cnt;
	}
	
	public void sessionSettingSrvc(HttpSession session, CRegLoginVO cregVO){
		boolean isLogin = false ;
		int tabNo = 0;
		if(cregVO.cnt == 0){
			// 이경우는 그런 회원이 없는 경우다..
			isLogin = false ;
		}
		else {
			// 이 경우는 회원 정보가 존재 한다는 말이다.
			isLogin = true ;
			
			// 아이디는 세션에 저장해주자.
			session.setAttribute("UID", cregVO.id);
			
			System.out.println("session set ID : " + cregVO.id);
			
			// 회원 번호는 데이터베이스에서 가져오자.
//			System.out.println("############# selectInfoNoDAO 진입전 ##############");
			int tno = cregLoginDAO.selectInfoNoDAO(cregVO);
			cregVO.no = tno ;
//			System.out.println("############# selectInfoNoDAO 진입후 ##############");
			session.setAttribute("UTNO", tno);
			System.out.println("session set UTNO : " + cregVO.no);
			cregVO.no = tno ;
			tabNo = 1;
			int imgCnt = cregLoginDAO.selectTImgCNTDAO(cregVO);
			int mImgCnt = cregLoginDAO.selectMImgCNTDAO(cregVO);
			if(imgCnt > 0){
				tabNo = 2 ;
			}
			if(mImgCnt > 0){
				tabNo = 3 ;
			}
		}
		session.setAttribute("isLogin", isLogin);
		session.setAttribute("tabNo", tabNo);
		
		System.out.println(session.getAttribute("sessionset   tabNo" + tabNo));
		return ;
	}
	
	/*
	 * 회원 정보 전담 서비스 함수
	 */
	public CRegLoginVO cLoginInfoSrvc(HttpSession session, CRegLoginVO cregVO){
		// db에서 기본 정보를 꺼내오자.
		
		CRegLoginVO data = cregLoginDAO.selectInfoDAO(cregVO);
		return data;
	}
	
	/*
	 * 회원 등록 전담 처리 서비스 함수
	 */
	public CRegLoginVO cRegInfoSrvc(HttpSession session, CRegLoginVO cregVO){
		System.out.println("############# creginfoservice cregVO NO : " + cregVO.no);
		int tabNo = 0 ;
		try{
			tabNo = (int) session.getAttribute("tabNo");
		}
		catch(Exception e){}
		CRegLoginVO data = new CRegLoginVO();
		cregVO.tabNo = tabNo ;
		if(cregVO.tabNo == 0){
			cregLoginDAO.insertTInfoDAO(cregVO);
			int cnt = cregLoginDAO.cLoginProcDAO(cregVO);
			data = cregLoginDAO.selectInfoDAO(cregVO);
			if(cnt > 0 ){
				tabNo = 1 ;
				session.setAttribute("tabNo", tabNo );
				System.out.println("############# infosrvc tabNo0 : " + tabNo);
				System.out.println("############# infosrvc session tabNo0 : " + session.getAttribute("tabNo"));
			}

			data.tabNo = tabNo;
			data.cnt = cnt;
		}
		else if(cregVO.tabNo == 1){
			cregVO.sname = cregVO.truckImgName ;
			cregVO.imgbody = cregVO.truckComment ;
			cregVO.tigrade = 1 ;
			cregLoginDAO.insertTImgDAO(cregVO);
			
			cregVO.sname = cregVO.chefImgName ;
			cregVO.imgbody = cregVO.chefComment ;
			cregVO.tigrade = 2 ;
			cregLoginDAO.insertTImgDAO(cregVO);
			int tmp = cregLoginDAO.selectTImgCNTDAO(cregVO);
			if(tmp > 0){
				tabNo = 2 ;
				session.setAttribute("tabNo", tabNo );
				System.out.println("############# infosrvc tabNo1 : " + tabNo);
			}
			data.tabNo =  tabNo ;
			data.cnt = 1 ;
		}
		else if(tabNo == 2){
			cregVO.sname = cregVO.mmenuImgName ;
			cregVO.imgbody = cregVO.mmenuComment ;
			cregVO.mmenugrade = "M" ;
			
			System.out.println("############# tabNo" + tabNo);
			
			cregLoginDAO.insertTMenuDAO(cregVO);
			System.out.println("############# main 메뉴 이미지 업로드완료");
			cregLoginDAO.insertMMenuDAO(cregVO);
			int tmp = cregLoginDAO.selectMImgCNTDAO(cregVO);
			if(tmp > 0){
				tabNo = 3 ;
				session.setAttribute("tabNo", tabNo );
			}
			data.tabNo = tabNo ;
			data.cnt = 1 ;
			System.out.println("############# 메뉴table 이미지 업로드완료");
			System.out.println("############# cRegInfoSrvc tabNo : " + tabNo);
		}
		return data;
	}
	
	/*
	 * 이미지파일 업로드 전담 처리함수
	 */
	public String uploadProc(MultipartFile imgfile, HttpSession session){

		// 파일이 업로드된 실제 경로를 알아내자.
		String path = session.getServletContext().getRealPath("image");
		System.out.println(path);
		
		// 업로드할 파일이 여러개 있으므로 배열로 처리한다.
		String oriName = new String();
		String saveName = new String();
		// 원파일 이름을 알아내고 같은 이름이 있으면 다른 이름으로 바꾸자.
		oriName = imgfile.getOriginalFilename();
		saveName = FileUtil.rename(path, oriName);
		try{
			// 파일을 저장하자.
			File file = new File(path, saveName);
			imgfile.transferTo(file);
		}
		catch(Exception e){}
		
		return saveName;
	}
	
	/*
	 * 회원등록 확인 전담 서비스 함수
	 */
	public CRegLoginVO confirmReg(int no){
		int tno = no ;
		System.out.println("confim service utno : " + no);
		
		CRegLoginVO data = (CRegLoginVO) cregLoginDAO.selectAllRegInfoDAO(no);
		String tmp = data.keyword ;
		
		try{
			data.keyword1 = tmp.split("#")[1];
		} catch(Exception e){}
		try{
			data.keyword2 = tmp.split("#")[2];
		} catch(Exception e){}
		try{
			data.keyword3 = tmp.split("#")[3];
		} catch(Exception e){}
		try{
			data.keyword4 = tmp.split("#")[4];
		} catch(Exception e){}
		try{
			data.keyword5 = tmp.split("#")[5];
		} catch(Exception e){}
		
		System.out.println("confirm Reg keyword : " + data.keyword1);
		
		return data;
	}
	
	/*
	 * 회원가입 최종 완료 처리 전담 서비스 함수
	 */
	public void regProcSrvc(CRegLoginVO cregVO, HttpSession session){
		// 회원 정보 업데이트 해주고...
		cregLoginDAO.updateRegConf(cregVO);
		System.out.println("###############업데이트 완료#####");
		// 만약 이미지가 변경 되었으면 다시 넣어준다.
				
		// 만약 이미지 변경이 없으면 데이터만 업데이트 해준다.
				
		return ;
	}
	
	/*
	 * 회원 기본 정보 가저오기 전담 서비스 함수
	 */
	public CRegLoginVO memberinfoSrvc(CRegLoginVO cregVO){
		System.out.println("@@@@@@@@@@@@@@@@  mod srvc VO NO  : " + cregVO.no);
		
		return cregLoginDAO.selectMemberInfoDAO(cregVO.no);
	}
	
}

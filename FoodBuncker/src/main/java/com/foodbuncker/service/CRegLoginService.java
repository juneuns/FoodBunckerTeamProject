package com.foodbuncker.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

import org.imgscalr.Scalr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.foodbuncker.dao.CRegLoginDAO;
import com.foodbuncker.util.FileUtil;
import com.foodbuncker.vo.CRegLoginVO;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 * 
 * @author jeon eun seok
 * @since 	2017.05.01
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
		return cnt;
	}
	
	// 세션 조회 전담 처리 서비스 함수
	public CRegLoginVO sessionSearchSrvc(HttpSession session,CRegLoginVO cregVO){
		try{
			cregVO.no = (int) session.getAttribute("UTNO");
		}
		catch(Exception e){
			cregVO.no = 0 ;
		}
		
		return cregVO ;
	}
	
	// 세션 셋팅 전담 처리 서비스 함수
	public void sessionSettingSrvc(HttpSession session, CRegLoginVO cregVO){
		
		int tabNo = 0;
		if(cregVO.cnt == 0){
			// 이경우는 그런 회원이 없는 경우다.
			// 이 경우는 회원 등록이 필요한 경우...
		}
		else {
			// 이 경우는 회원 정보가 존재 한다는 말이다.
			// 아이디는 세션에 저장해주자.
			session.setAttribute("UID", cregVO.id);
			
			System.out.println("session set ID : " + cregVO.id);
			
			// 회원 번호는 데이터베이스에서 가져오자.
			try{
				cregVO = cregLoginDAO.selectInfoDAO(cregVO);
			}catch(Exception e){}
//			System.out.println("############# selectInfoNoDAO 진입후 ##############");
			session.setAttribute("UTNO", cregVO.no);
			System.out.println("session set UTNO : " + cregVO.no);
//			cregVO.no = tno ;
			
			// 회원 등록 절차 확인을 하자.
			if(cregVO.isShow.equals("S")){
				// 기본 정보만 등록한 상태..
				tabNo = 1;
			}
			if(cregVO.isShow.equals("T")){
				// 트럭이미지와 쉐프이미지를 등록한 상태
				tabNo = 2 ;
			}
			if(cregVO.isShow.equals("R")){
				// 메뉴이미지를 등록한 상태..
				tabNo = 3 ;
			}
			if(cregVO.isShow.equals("Y")){
				// 모든 등록 절차가 완료된 상태..
				tabNo = 4 ;
			}
			cregVO.tabNo = tabNo ;
			session.setAttribute("tabNo", tabNo);
		}
		
		System.out.println(session.getAttribute("sessionset   tabNo : " + tabNo));
		return ;
	}
	
	/*
	 * 회원 로그인 정보 처리 전담 서비스 함수
	 */
	public CRegLoginVO cLoginInfoSrvc(HttpSession session, CRegLoginVO cregVO){
		// db에서 기본 정보를 꺼내오자.
		cregVO = cregLoginDAO.selectInfoDAO(cregVO);
		cregVO.cnt = 1 ;
		return cregVO;
	}
	
	
	/*
	 * 회원 기본 정보 등록 전담 처리 서비스 함수
	 */
	public CRegLoginVO cRegInfoSrvc(HttpSession session, CRegLoginVO cregVO) throws Exception{
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
			cregVO = cregLoginDAO.selectInfoDAO(cregVO);
			cregVO.cnt = cnt ;
			cregVO.isShow = "T";
			cregVO.no = (int) session.getAttribute("UTNO");
			cregLoginDAO.updateMemberisShow(cregVO);
			System.out.println("############# infosrvc cnt 0 : " + cregVO.cnt);
//			if(cnt > 0 ){
				tabNo = 1 ;
				session.setAttribute("tabNo", tabNo );
				System.out.println("############# infosrvc tabNo0 : " + tabNo);
				System.out.println("############# infosrvc session tabNo0 : " + session.getAttribute("tabNo"));
//			}

			cregVO.tabNo = tabNo;
			cregVO.cnt = cnt;
		}
		else if(cregVO.tabNo == 1){
			//  트럭이미지 저장하고
			cregVO.sname = insertTruckImgSrvc(cregVO, session);
			// thumbnail 파일을 저장해주자.
			cregVO.truckThumb = makeThumbImg(cregVO.sname, session);
			
			// 쉐프이미지 저장하자.
			cregVO.sname = insertChefImgSrvc(cregVO, session);
			// thumbnail 파일을 저장해주자.
			cregVO.chefThumb = makeThumbImg(cregVO.sname, session);
			
			int tmp = cregLoginDAO.selectTImgCNTDAO(cregVO);
			System.out.println("############# infosrvc 1  img cnt : " + tmp);
			cregVO.isShow = "R";
			cregVO.no = (int) session.getAttribute("UTNO");
			cregLoginDAO.updateMemberisShow(cregVO);
//			if(tmp > 0){
				tabNo = 2 ;
				session.setAttribute("tabNo", tabNo );
				System.out.println("############# infosrvc tabNo1 : " + tabNo);
//			}
			cregVO.tabNo =  tabNo ;
			cregVO.cnt = 1 ;
		}
		else if(tabNo == 2){
			// 이미지 파일을 저장하고...
			cregVO.mmenugrade = "M" ;
			cregVO.sname = insertMMenuImgSrvc(cregVO, session);
			// thumbnail 파일을 저장해주자.
			cregVO.thumbName = makeThumbImg(cregVO.sname, session);
			
			System.out.println("############# tabNo" + tabNo);
			int tmp = cregLoginDAO.selectMImgCNTDAO(cregVO);
			cregVO.isShow = "Y";
			cregVO.no = (int) session.getAttribute("UTNO");
			cregLoginDAO.updateMemberisShow(cregVO);
//			if(tmp > 0){
				tabNo = 3 ;
				session.setAttribute("tabNo", tabNo );
//			}
			cregVO.tabNo = tabNo ;
			cregVO.cnt = 1 ;
			System.out.println("############# 메뉴table 이미지 업로드완료");
//			System.out.println("############# cRegInfoSrvc tabNo : " + tabNo);
		}
		else if(tabNo ==3){
			
		}
		else if(tabNo == 4){
			
		}
		else{
			
		}
		
		return cregVO;
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
	

	
	// thumnail 파일 저장함수
	// 다른 곳에서도 써야 하므로 함수를 따로 만들어주자.
	public String makeThumbImg(String fileName, HttpSession session) throws Exception{
		// 파일이 업로드된 실제 경로를 알아내자.
		String path = session.getServletContext().getRealPath("image");
				
		// 버퍼에 이미지 저장
		BufferedImage srcImg = ImageIO.read(new File(path, fileName));
		// 버퍼에 리사이즈된 이미지 저장
		BufferedImage thumbImg = Scalr.resize(srcImg, Scalr.Method.AUTOMATIC, Scalr.Mode.FIT_TO_HEIGHT, 150);
		// 이미지 이름 규칙
		String thumbName = "thumb_" + fileName;
		
		File file = new File(path, thumbName);
		// 파일 포멧을 알아보자.
		String formatName = fileName.substring(fileName.lastIndexOf(".") + 1 );
		
		// 파일 저장..
		ImageIO.write(thumbImg, formatName.toUpperCase(), file);
		// 파일 이름은 알려주자.
		return thumbName ;
	}

	/*
	 * 트럭이미지 파일 전담 처리 서비스 함수
	 */
	public String insertTruckImgSrvc(CRegLoginVO cregVO, HttpSession session){
		
		cregVO.sname = uploadProc(cregVO.truckImg, session);
		cregVO.imgbody = cregVO.truckComment ;
		cregVO.tigrade = 1 ;
		cregLoginDAO.insertTImgDAO(cregVO);
		System.out.println("############# truck 이미지 업로드완료");
		return cregVO.sname;
	}
	
	/*
	 * 쉐프 이미지 파일 전담 처리 서비스 함수
	 */
	public String insertChefImgSrvc(CRegLoginVO cregVO, HttpSession session){
		cregVO.sname = uploadProc(cregVO.chefImg, session) ;
		cregVO.imgbody = cregVO.chefComment ;
		cregVO.tigrade = 2 ;
		cregLoginDAO.insertTImgDAO(cregVO);
		System.out.println("############# chef 이미지 업로드완료");
		return cregVO.sname ;
	}
	
	/*
	 * 메인메뉴 이미지 파일 전담 처리 서비스 함수
	 */
	public String insertMMenuImgSrvc(CRegLoginVO cregVO, HttpSession session){
		cregVO.sname = uploadProc(cregVO.mmenuImg, session) ;
		cregVO.imgbody = cregVO.mmenuComment ;
		cregVO.tigrade = 3 ;
		cregLoginDAO.insertTImgDAO(cregVO);
		System.out.println("############# main 메뉴 이미지 업로드완료");
		cregLoginDAO.insertMMenuDAO(cregVO);
		System.out.println("############# 메뉴 이미지 업로드완료");
		return cregVO.sname;
	}
	
	/*
	 * 메뉴 이미지 파일 전담 처리 서비스 함수
	 */
	public String insertMenuImgSrvc(CRegLoginVO cregVO, HttpSession session){
		cregVO.sname = uploadProc(cregVO.mmenuImg, session) ;
		cregVO.imgbody = cregVO.mmenuComment ;
		cregLoginDAO.insertMMenuDAO(cregVO);
		System.out.println("############# 메뉴 이미지 업로드완료");
		return cregVO.sname;
	}
	
	/*
	 * 회원등록 확인 전담 서비스 함수
	 */
	public CRegLoginVO confirmReg(int no){
		
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
		
		return data;
	}
	
	/*
	 * 회원가입 최종 완료 처리 전담 서비스 함수
	 */
	public void regProcSrvc(CRegLoginVO cregVO, HttpSession session){
		
		// 회원 정보 업데이트 해주고...
		cregLoginDAO.updateRegConf(cregVO);
		System.out.println("###############회원 정보 업데이트 완료#####");
		// 만약 이미지가 변경 되었으면 다시 넣어준다.
		
		// 쉐프이미지 변경 처리
		cregVO.chefImgName = cregVO.chefImg.getOriginalFilename();
		cregVO.imgbody = cregVO.chefComment ;
		cregVO.sname = cregVO.oldChefImg ;
		/*if(cregVO.oldChefImg != cregVO.chefImgName){
			// 파일을 저장하자. 위의 함수를 이용해주자. 반환값 파일이름이있으니 VO에 넣어주자.
			//  db 기록 기존 파일 안보이게 처리하고...
			cregLoginDAO.updateTImgIsShowDAO(cregVO);
			// 파일 저장하고
			cregVO.sname = uploadProc(cregVO.chefImg, session);			
			// db에 저장하자.
			cregVO.chefImgName = cregVO.sname ;
			cregVO.tigrade = 2 ;
			cregLoginDAO.insertTImgDAO(cregVO);
			System.out.println("###############쉐프이미지 업데이트 완료#####");
		} else {*/
			// db 기록(이미지 설명)만 업데이트하자.
			cregVO.tigrade = 2 ;
			cregLoginDAO.updateTImgDAO(cregVO);
		/*}*/
		
		// 트럭이미지 변경 처리
		cregVO.truckImgName = cregVO.truckImg.getOriginalFilename();
		cregVO.imgbody = cregVO.truckComment ;
		cregVO.sname = cregVO.oldTruckImg ;
		/*if(cregVO.oldTruckImg != cregVO.truckImgName){
			//  파일 저장하고
			cregVO.truckImgName = uploadProc(cregVO.truckImg, session);
			// db 안보이게 업데이트해주고...
			cregLoginDAO.updateTImgIsShowDAO(cregVO);
			// db에 기록하자.
			cregVO.sname = cregVO.truckImgName ;
			cregVO.tigrade = 1 ;
			cregLoginDAO.insertTImgDAO(cregVO);
			System.out.println("###############트럭이미지 추가 완료#####");
		} else {*/
			// db 기록(이미지 설명)만 업데이트하자.
			cregVO.tigrade = 1 ;
			cregLoginDAO.updateTImgDAO(cregVO);
		/*}*/
		
		// 메뉴 이미지 변경 처리
		cregVO.mmenuImgName = cregVO.mmenuImg.getOriginalFilename();
		cregVO.imgbody = cregVO.mmenuComment ;
		cregVO.sname = cregVO.oldMenuImg ;
/*		if(cregVO.oldMenuImg != cregVO.mmenuImgName){
			// db 기록 안보이게 업데이트해주고
			cregLoginDAO.updateTImgIsShowDAO(cregVO);
			cregLoginDAO.updateMImgIsShowDAO(cregVO);
			// 파일 저장하고 파일 이름 받자.
			cregVO.mmenuImgName = uploadProc(cregVO.mmenuImg, session);
			// db에 기록하자. 테이블 두개에 기록해야한다.
			cregVO.sname = cregVO.mmenuImgName ;
			cregVO.tigrade = 3 ;
			cregVO.mmenugrade = "M" ;
			cregLoginDAO.insertTImgDAO(cregVO);
			System.out.println("############### 메인 메뉴 이미지 insert 완료#####");
			cregLoginDAO.insertMMenuDAO(cregVO);
			System.out.println("############### 메뉴 이미지 insert 완료#####");
		} else {*/
			// db 기록 업데이트하자.
			cregVO.tigrade = 3 ;
			cregVO.mmenugrade = "M" ;
			cregLoginDAO.updateTImgDAO(cregVO);
			System.out.println("############### 메인 메뉴 이미지 업데이트 완료#####");
			cregLoginDAO.updateMImgDAO(cregVO);
			System.out.println("############### 메뉴 이미지 업데이트 완료#####");
		/*}*/
			
			session.setAttribute("tabNo", 4);
				
		return ;
	}
	
	/*
	 * 회원 기본 정보 가저오기 전담 서비스 함수
	 */
	public CRegLoginVO memberinfoSrvc(CRegLoginVO cregVO){
		System.out.println("@@@@@@@@@@@@@@@@  mod srvc VO NO  : " + cregVO.no);
		
		return cregLoginDAO.selectMemberInfoDAO(cregVO.no);
	}
	
	/*
	 * 회원 기본 정보 수정 서비스 함수
	 */
	public CRegLoginVO infoModifyProcSrvc(CRegLoginVO cregVO){
		System.out.println("##################### InfoModservice dao before NO : " + cregVO.no);
		cregLoginDAO.updateModifyTInfo(cregVO);
		System.out.println("##################### InfoModservice dao after NO : " + cregVO.no);
		
		
		return cregLoginDAO.selectMemberInfoDAO(cregVO.no);
	}
	
	/*
	 * 회원 메뉴 정보 가져오기 전담 서비스 함수
	 */
	public CRegLoginVO menuModifySrvc(CRegLoginVO cregVO, HttpSession session){
		// 메인메뉴 가져오자
		cregVO.no = (int) session.getAttribute("UTNO");
		cregVO.tigrade = 3 ;
		ArrayList list = (ArrayList) cregLoginDAO.selectTImgDAO(cregVO);
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			cregVO = (CRegLoginVO) itr.next();
		}

		cregVO.mmenugrade = "M" ;
		CRegLoginVO vo2 = new CRegLoginVO();
		ArrayList list2 = (ArrayList) cregLoginDAO.selectMenuDAO(cregVO);
		Iterator itr2 = list2.iterator();
		while(itr2.hasNext()){
			vo2 = (CRegLoginVO) itr2.next();
		}
		cregVO.mmenuName = vo2.mmenuName ;
		cregVO.mNo = vo2.mNo ;
		cregVO.mmenuPrice = vo2.mmenuPrice;
		cregVO.mmenuComment = vo2.mmenuComment ;
		cregVO.sname = vo2.sname ;
		cregVO.keyword = vo2.keyword ;
		System.out.println("&&&&&&&&&&&&&&&&&& 메인메뉴 받기 완료");
		System.out.println("&&&&&&&&&&&&&&&&&& 메인메뉴 받기 확인  price : " + cregVO.mmenuPrice);
		
		// 서브 메뉴 가져오자...
		cregVO.mmenugrade = "S" ;
		cregVO.list = (ArrayList) cregLoginDAO.selectMenuDAO(cregVO);
		System.out.println("&&&&&&&&&&&&&&&&&& 서브메뉴 받기 완료");
		
		return cregVO;
	}
}

package com.foodbuncker.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

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
			//  트럭이미지 저장하고
			cregVO.sname = insertTruckImgSrvc(cregVO, session);
			// thumbnail 파일을 저장해주자.
			cregVO.truckThumb = makeThumbImg(cregVO.sname, session);
			
			// 쉐프이미지 저장하자.
			cregVO.sname = insertChefImgSrvc(cregVO, session);
			// thumbnail 파일을 저장해주자.
			cregVO.chefThumb = makeThumbImg(cregVO.sname, session);
			
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
			// 이미지 파일을 저장하고...
			cregVO.mmenugrade = "M" ;
			cregVO.sname = insertMMenuImgSrvc(cregVO, session);
			// thumbnail 파일을 저장해주자.
			cregVO.thumbName = makeThumbImg(cregVO.sname, session);
			
			System.out.println("############# tabNo" + tabNo);
			int tmp = cregLoginDAO.selectMImgCNTDAO(cregVO);
			if(tmp > 0){
				tabNo = 3 ;
				session.setAttribute("tabNo", tabNo );
			}
			data.tabNo = tabNo ;
			data.cnt = 1 ;
			System.out.println("############# 메뉴table 이미지 업로드완료");
//			System.out.println("############# cRegInfoSrvc tabNo : " + tabNo);
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
		if(cregVO.oldChefImg != cregVO.chefImgName){
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
		} else {
			// db 기록(이미지 설명)만 업데이트하자.
			cregLoginDAO.updateTImgDAO(cregVO);
		}
		
		// 트럭이미지 변경 처리
		cregVO.truckImgName = cregVO.truckImg.getOriginalFilename();
		cregVO.imgbody = cregVO.truckComment ;
		cregVO.sname = cregVO.oldTruckImg ;
		if(cregVO.oldTruckImg != cregVO.truckImgName){
			//  파일 저장하고
			cregVO.truckImgName = uploadProc(cregVO.truckImg, session);
			// db 안보이게 업데이트해주고...
			cregLoginDAO.updateTImgIsShowDAO(cregVO);
			// db에 기록하자.
			cregVO.sname = cregVO.truckImgName ;
			cregVO.tigrade = 1 ;
			cregLoginDAO.insertTImgDAO(cregVO);
			System.out.println("###############트럭이미지 추가 완료#####");
		} else {
			// db 기록(이미지 설명)만 업데이트하자.
			cregLoginDAO.updateTImgDAO(cregVO);
		}
		
		// 메뉴 이미지 변경 처리
		cregVO.mmenuImgName = cregVO.mmenuImg.getOriginalFilename();
		cregVO.imgbody = cregVO.mmenuComment ;
		cregVO.sname = cregVO.oldMenuImg ;
		if(cregVO.oldMenuImg != cregVO.mmenuImgName){
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
		} else {
			// db 기록 업데이트하자.
			cregLoginDAO.updateTImgDAO(cregVO);
			System.out.println("############### 메인 메뉴 이미지 업데이트 완료#####");
			cregLoginDAO.updateMImgDAO(cregVO);
			System.out.println("############### 메뉴 이미지 업데이트 완료#####");
		}
				
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
	public void menuModifySrvc(CRegLoginVO cregVO, HttpSession session){
		// 메인메뉴 가져오자
		cregVO.no = (int) session.getAttribute("UTNO");
		cregVO.mmenugrade = "M" ;
		ArrayList mList = new ArrayList();
		mList = cregLoginDAO.selectMenuDAO(cregVO);
		

		cregVO.mmenugrade = "M" ;
		
		return ;
	}
	
}

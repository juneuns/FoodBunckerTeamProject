package com.foodbuncker.dao;
/**
 * 
 */

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.vo.CRegLoginVO;

public class CRegLoginDAO {

	@Autowired
	SqlSessionTemplate sqlSession;
	
	/*
	 * 로그인 처리 질의 명령 전담함수
	 */
	public int cLoginProcDAO(CRegLoginVO cregVO){
		int cnt = sqlSession.selectOne("foodbuncker.CRegLogin.Login", cregVO);
		return cnt;
	}
	
	/*
	 * 회원 넘버 질의 명령 실행 전담 함수
	 */
	public int selectTImgCNTDAO(CRegLoginVO cregVO){
//		System.out.println("################ selectTImgCNTDAO NO :" + cregVO.no);
		int tmpno = (int) sqlSession.selectOne("foodbuncker.CRegLogin.selectImgTable", cregVO);

//		System.out.println("################ selectTImgCNTDAO sql :" + tmpno);
		return tmpno;
	}
	
	/*
	 * 회원 넘버 질의 명령 실행 전담 함수
	 */
	public int selectMImgCNTDAO(CRegLoginVO cregVO){
		int tmpno = (int) sqlSession.selectOne("foodbuncker.CRegLogin.selectMenuTable", cregVO);
		return tmpno;
	}
	
	/*
	 * 회원 넘버 질의 명령 실행 전담 함수
	 */
	public int selectInfoNoDAO(CRegLoginVO cregVO){
		int tmpno = (int) sqlSession.selectOne("foodbuncker.CRegLogin.selectTNo", cregVO);
		return tmpno;
	}
	
	/*
	 * 로그인 정보 질의 명령 전담 함수
	 */
	public CRegLoginVO selectInfoDAO(CRegLoginVO cregVO){
		cregVO = (CRegLoginVO) sqlSession.selectOne("foodbuncker.CRegLogin.selectLoginInfo", cregVO);
		return cregVO;
	}
	
	/*
	 * 회원 기본 정보 질의 명령 전담 함수
	 */
	public CRegLoginVO selectMemberInfoDAO(int no){
		CRegLoginVO cregVO = (CRegLoginVO) sqlSession.selectOne("foodbuncker.CRegLogin.selectMemberInfo", no);
		return cregVO;
	}
	
	/*
	 * 회원 정보 확인 질의 명령 전담 함수
	 */
	public CRegLoginVO selectAllRegInfoDAO(int no){
		System.out.println("regconfirm DAO no : " + no);
		return (CRegLoginVO) sqlSession.selectOne("foodbuncker.CRegLogin.selectRegAll", no);
	}
	
	/*
	 * 트럭이미지 가져오기 질의명령 처리함수 
	 */
	public ArrayList selectTImgDAO(CRegLoginVO cregVO){
			ArrayList list = (ArrayList) sqlSession.selectList("foodbuncker.CRegLogin.selectTImgSql", cregVO);
			return list ;
	}
	
	/*
	 * 회원 메뉴 가져오기 질의명령 처리함수 
	 */
	public ArrayList selectMenuDAO(CRegLoginVO cregVO){
			ArrayList list = (ArrayList) sqlSession.selectList("foodbuncker.CRegLogin.selectMenuSql", cregVO);
			return list ;
	}
	
	/*
	 * 회원 1차 등록 질의 명령 전담 함수
	 */
	public void insertTInfoDAO(CRegLoginVO cregVO){
		sqlSession.insert("foodbuncker.CRegLogin.insertTInfo", cregVO);
	}
	
	/*
	 * 회원 트럭이미지테이블 등록 질의 명령 전담 함수
	 */
	public void insertTImgDAO(CRegLoginVO cregVO){
		sqlSession.insert("foodbuncker.CRegLogin.insertTImg", cregVO);
	}
	
	
	/*
	 * 메인메뉴 등록 질의 명령 처리 전담 함수
	 */
	public void insertMMenuDAO(CRegLoginVO cregVO){
		sqlSession.insert("foodbuncker.CRegLogin.insertMMenu", cregVO);
	}
	
	/*
	 * 회원정보 업데이트 질의 명령 전담함수
	 */
	public void updateRegConf(CRegLoginVO cregVO){
		sqlSession.update("foodbuncker.CRegLogin.updateTInfo", cregVO);
		return ;
	}
	
	/*
	 * 기존 트럭이미지 isShow 업데이트 질의 명령 처리 전담함수
	 */
	public void updateTImgIsShowDAO(CRegLoginVO cregVO){
		sqlSession.update("foodbuncker.CRegLogin.updateTImgisShow", cregVO);
		return ;
	}
	
	/*
	 * 기존 메뉴 이미지 isShow 업데이트 질의 명령 처리 전담함수
	 */
	public void updateMImgIsShowDAO(CRegLoginVO cregVO){
		sqlSession.update("foodbuncker.CRegLogin.updateMImgisShow", cregVO);
		return ;
	}
	
	/*
	 *트럭이미지 업데이트 질의 명령 처리 전담함수
	 */
	public void updateTImgDAO(CRegLoginVO cregVO){
		sqlSession.update("foodbuncker.CRegLogin.updateTImg", cregVO);
		return ;
	}
	
	/*
	 * 메뉴정보 업데이트 질의 명령 처리 전담함수
	 */
	public void updateMImgDAO(CRegLoginVO cregVO){
		sqlSession.update("foodbuncker.CRegLogin.updateMImg", cregVO);
		return ;
	}
	
	/*
	 * 회원 기본 정보 업데이트 지르이 명령 처리 전담 함수
	 */
	public void updateModifyTInfo(CRegLoginVO cregVO){
		sqlSession.update("foodbuncker.CRegLogin.updateMemberTInfo", cregVO);
	}
}

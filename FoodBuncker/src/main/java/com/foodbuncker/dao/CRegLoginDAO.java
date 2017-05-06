package com.foodbuncker.dao;
/**
 * 
 */

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
//		System.out.println("################ selectTImgCNTDAO ID :" + cregVO.id);
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
	 * 회원 1차 등록 질의 명령 전담 함수
	 */
	public void insertTInfoDAO(CRegLoginVO cregVO){
		sqlSession.insert("foodbuncker.CRegLogin.insertTInfo", cregVO);
	}
	
	/*
	 * 회원 2차 등록 질의 명령 전담 함수
	 */
	public void insertTImgDAO(CRegLoginVO cregVO){
		sqlSession.insert("foodbuncker.CRegLogin.insertTImg", cregVO);
	}
	
	/*
	 * 회원 3차 등록 질의 명령 전담 함수
	 */
	public void insertTMenuDAO(CRegLoginVO cregVO){
		sqlSession.insert("foodbuncker.CRegLogin.insertTMenu", cregVO);
	}
	
	/*
	 * 메인메뉴 등록 질의 명령 전담 함수
	 */
	public void insertMMenuDAO(CRegLoginVO cregVO){
		sqlSession.insert("foodbuncker.CRegLogin.insertMMenu", cregVO);
	}
}

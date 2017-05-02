package com.foodbuncker.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class PMainViewDAO {
	@Autowired
	public SqlSessionTemplate sqlSession;
		
	
	/*
	 * 메뉴정보 불러오기 질의 실행 함수
	 */
	public ArrayList selectMenu(){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectMenu");
	}
	
	/*
	 * 후기글 불러오기 질의 실행 함수
	 */
	public ArrayList selectReview(){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectReview");
	}
	
	/*
	 * 트럭정보 불러오기 질의 실행 함수
	 */
	public ArrayList selectTruck(){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectTruck");
	}
	
	/*
	 * 트럭 상세메뉴 검색 질의 실행 함수
	 */
	public ArrayList selectMenuView(int tno){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectMenuView", tno);
	}
}

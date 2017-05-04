package com.foodbuncker.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.vo.PMainViewVO;

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
	 * 트럭별 메뉴 검색 질의 실행 함수
	 */
	public ArrayList selectMenuView(int tno){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectMenuView", tno);
	}
	
	/*
	 * 트럭별 후기 검색 질의 실행 함수
	 */
	public ArrayList selectReviewView(int tno){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectReviewView", tno);
	}
	
	/*
	 * 트럭별 치프이미지, 설명 불러오기 질의 실행 함수
	 */
	public ArrayList selectChef(int tno){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectChef", tno);
	}
	
	/*
	 * 트럭별 메인이미지, 설명 불러오기 질의 실행 함수
	 */
	public ArrayList selectMain(int tno){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectMain", tno);
	}
	
	/*
	 * 트럭별 일반이미지, 설명 불러오기 질의 실행 함수
	 */
	public ArrayList selectGeneral(int tno){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectGeneral", tno);
	}
	
	/*
	 * 트럭별 메인메뉴 이미지, 설명 불러오기 질의 실행 함수
	 */
	public ArrayList selectMainMenu(int tno){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectMainMenu", tno);
	}
	
	/*
	 * 트럭별 운행거리 가져오기 질의 실행 함수
	 */
	public int selectKM(int tno){
		return (int) sqlSession.selectOne("foodbuncker.PMainView.selectKM", tno);
	}
	
	
}

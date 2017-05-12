package com.foodbuncker.dao;

import java.util.ArrayList;
import java.util.HashMap;

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
	 * 트럭별 후기 목록 질의 실행 함수
	 */
	public ArrayList selectTReviewView(HashMap map){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectTReviewView", map);
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
	
	/*
	 * 트럭별 총 메뉴판매 수 구하기 질의 실행 함수
	*/ 
	public int selectSellMenu(int tno){
		return (int) sqlSession.selectOne("foodbuncker.PMainView.selectSell", tno);
	}
	
	
	/*
	 * 트럭별 총 고객방문 수 구하기 질의 실행 함수
	 */
	public int selectCustomer(int tno){
		return sqlSession.selectOne("foodbuncker.PMainView.selectCustomer", tno);
	}
	
	/*
	 * 트럭별 영업장소 수 구하기 질의 실행 함수
	 */
	public int selectPlace(int tno){
		return sqlSession.selectOne("foodbuncker.PMainView.selectPlace", tno);
	}
	
	/*
	 * 총 메뉴판매 수 불러오기 질의 실행 함수
	 */
	public int selectSellTotal(){
		return sqlSession.selectOne("foodbuncker.PMainView.selectSellTotal");
	}
	
	/*
	 * 총 고객방문 수 불러오기 질의 실행 함수
	 */
	public int selectCusTotal(){
		return sqlSession.selectOne("foodbuncker.PMainView.selectCusTotal");
	}
	
	/*
	 * 총 서울내 영업장소 수 불러오기 질의 실행 함수
	 */
	public int selectPlaceTotal(){
		return sqlSession.selectOne("foodbuncker.PMainView.selectPlaceTotal");
	}
	
	/*
	 * 가입된 사업주 수 불러오기 질의 실행 함수
	 */
	public int selectChefTotal(){
		return sqlSession.selectOne("foodbuncker.PMainView.selectChefTotal");
	}
	
	/*
	 * 	총 데이터 개수 구하기 질의 명령
	 */
	public int getTotal() {
		return sqlSession.selectOne("foodbuncker.PMainView.selectTotal");
	}
	
	/*
	 * 전체 이미지 불러오기 질의 명령
	 */
	public ArrayList selectImage(HashMap map){
		return (ArrayList) sqlSession.selectList("foodbuncker.PMainView.selectImage", map);
	}
	
	/*
	 * 후기 입력하기 질의 실행 함수
	 */
	public void insertReview(PMainViewVO data){
		System.out.println(data.tno);
		System.out.println(data.body);
		sqlSession.update("foodbuncker.PMainView.insertReview", data);

		System.out.println(data.body);
	}
}

package com.foodbuncker.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.PMainViewDAO;
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.PMainViewVO;

public class PMainViewService {
	@Autowired
	public PMainViewDAO pmvDAO;
	
	/*
	 * 메뉴정보 불러오기 질의 실행 함수
	 */
	public ArrayList selectMenu(){
		ArrayList list = pmvDAO.selectMenu();
		ArrayList mlist = new ArrayList();
		Random ran = new Random();
		int a = 0;
		
		// 등록된 메뉴 무작위 18개 선정
		while(a < 18){
			int num = ran.nextInt(list.size());
			mlist.add(list.get(num));
			list.remove(num);
			a++;
		}
		return mlist;
	}
	
	/*
	 * 후기글 불러오기 질의 실행 함수
	 */
	public ArrayList selectReview(){
		ArrayList list = pmvDAO.selectReview();
		ArrayList rlist = new ArrayList();
		Random ran = new Random();
		int a = 0;
		
		// 등록된 후기글 무작위 8개 선정
		while(a < 8){
			int num = ran.nextInt(list.size());
			rlist.add(list.get(num));
			list.remove(num);
			a++;
		}
		return rlist;
	}
	
	/*
	 * 트럭정보 불러오기 질의 실행 함수
	 */
	public ArrayList selectTruck(){
		ArrayList list = pmvDAO.selectTruck();
		ArrayList tlist = new ArrayList();
		Random ran = new Random();
		int a = 0;
		
		// 등록된 트럭 정보 무작위 4개 선정
		while(a < 4){
			int num = ran.nextInt(list.size());
			tlist.add(list.get(num));
			list.remove(num);
			a++;
		}
		return tlist;
	}
	
	/*
	 * 트럭별 메뉴 검색 질의 실행 함수
	 */
	public ArrayList selectMenuView(int tno){
		return pmvDAO.selectMenuView(tno);
	}
	
	/*
	 * 트럭별 후기 검색 질의 실행 함수
	 */
	public ArrayList selectReviewView(int tno){
		ArrayList list = pmvDAO.selectReviewView(tno);
		ArrayList rlist = new ArrayList();
		int a = 0;
		
		// 최근 등록된 4개의 후기를 가져온다.
		while(a < 4){
			rlist.add(list.get(a));
			a++;
		}
		
		return rlist;
	}
	
	/*
	 * 트럭별 전체 후기 검색 질의 실행 함수
	 */
	public ArrayList selectTReviewView(PageUtil pInfo, int tno){
		int	start = (pInfo.nowPage - 1) * pInfo.pageRow + 1;
		int	end = start + pInfo.pageRow - 1;
		
		HashMap		map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		map.put("tno", tno);
		
		return pmvDAO.selectTReviewView(map);
	}		
	
	/*
	 * 트럭별 치프이미지, 설명 불러오기 질의 실행 함수
	 */
	public ArrayList selectChef(int tno){
		ArrayList list = pmvDAO.selectChef(tno);
		ArrayList clist = new ArrayList();
		Random ran = new Random();
		
		int num = ran.nextInt(list.size());
		clist.add(list.get(num));
		
		return clist;
	}
	
	/*
	 * 트럭별 메인이미지, 설명 불러오기 질의 실행 함수
	 */
	public ArrayList selectMain(int tno){
		ArrayList list = pmvDAO.selectMain(tno);
		ArrayList mlist = new ArrayList();
		Random ran = new Random();
		
		int num = ran.nextInt(list.size());
		mlist.add(list.get(num));
		
		return mlist;
	}
	
	/*
	 * 트럭별 일반이미지, 설명 불러오기 질의 실행 함수
	 */
	public ArrayList selectGeneral(int tno){
		ArrayList list = pmvDAO.selectGeneral(tno);
		ArrayList glist = new ArrayList();
		Random ran = new Random();
		
			int num = ran.nextInt(list.size());
			glist.add(list.get(num));
			list.remove(num);

			return glist;
	}
	
	/*
	 * 트럭별 메인메뉴 이미지, 설명 불러오기 질의 실행 함수
	 */
	public ArrayList selectMainMenu(int tno){
		ArrayList list = pmvDAO.selectMainMenu(tno);
		ArrayList mlist = new ArrayList();
		mlist.add(list.get(0));
		return mlist;
	}
	
	/*
	 * 트럭별 운행거리 가져오기 질의 실행 함수
	 */
	public int selectKM(int tno){
		return pmvDAO.selectKM(tno);
	}
	
	/*
	 * 트럭별 총 메뉴판매 수 구하기 질의 실행 함수
	*/ 
	public int selectSellMenu(int tno){
		return pmvDAO.selectSellMenu(tno);
	}
	
	
	/*
	 * 트럭별 총 고객방문 수 구하기 질의 실행 함수
	 */
	public int selectCustomer(int tno){
		return pmvDAO.selectCustomer(tno);
	}
	
	/*
	 * 트럭별 영업장소 수 구하기 질의 실행 함수
	 */
	public int selectPlace(int tno){
		return pmvDAO.selectPlace(tno);
	}
	
	/*
	 * 총 메뉴판매 수 불러오기 질의 실행 함수
	 */
	public int selectSellTotal(){
		return pmvDAO.selectSellTotal();
	}
	
	/*
	 * 총 고객방문 수 불러오기 질의 실행 함수
	 */
	public int selectCusTotal(){
		return pmvDAO.selectCusTotal();
	}
	
	/*
	 * 총 서울내 영업장소 수 불러오기 질의 실행 함수
	 */
	public int selectPlaceTotal(){
		return pmvDAO.selectPlaceTotal();
	}
	
	/*
	 * 가입된 사업주 수 불러오기 질의 실행 함수
	 */
	public int selectChefTotal(){
		return pmvDAO.selectChefTotal();
	}
	
	/*
	 * 	String Page를 int Page로 변화시켜서 사용하는 함수
	 */
	public int changePage(String strPage){
		int nowPage = 0;
		try {
			nowPage = Integer.parseInt(strPage);
		}
		catch(Exception e) {
			nowPage = 1;
		}
		return nowPage;
	}
	
	/*
	 * 	페이지 나눔 정보를 알아내기 위한 함수
	 */
	public PageUtil pageInfo(int nowPage) {
		int		total = pmvDAO.getTotal();
		PageUtil	pInfo = new PageUtil(nowPage, total, 10, 5);
		
		return pInfo;
	}
	
	/*
	 * 갤러리 이미지 불러오기 질의 실행 함수
	 */
	public ArrayList selectImage(PageUtil pInfo){
		int start = (pInfo.nowPage - 1) * pInfo.pageRow + 1;
		int end = start + pInfo.pageRow - 1;
		HashMap map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		
		return pmvDAO.selectImage(map);
	}
	
	/*
	 * 리뷰 입력하기 질의 실행 함수
	 */
	public void insertReview(int tno, String body){
		PMainViewVO data = new PMainViewVO();
		System.out.println(tno);
		System.out.println(body);
		System.out.println("-------");
		data.tno = tno;
		data.body = body;
		pmvDAO.insertReview(data);
	}
	
	/*
	 * pno change
	 */
	public int pnoChange(String strpno){
		int pno = 0;
		try {
			pno = Integer.parseInt(strpno);
		} catch (Exception e) {
			System.out.println("pno 예외 발생이욤");
			pno = 1;
		}
		return pno;
	}

	/*
	 * tno change
	 */
	public int tnoChange(String strtno){
		int pno = 0;
		try {
			pno = Integer.parseInt(strtno);
		} catch (Exception e) {
			System.out.println("tno 예외 발생이욤");
			pno = 1;
		}
		return pno;
	}
}

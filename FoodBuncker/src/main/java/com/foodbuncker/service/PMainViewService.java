package com.foodbuncker.service;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.PMainViewDAO;
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
	
}

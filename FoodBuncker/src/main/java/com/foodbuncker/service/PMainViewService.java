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
		
		while(a < 4){
			int num = ran.nextInt(list.size());
			tlist.add(list.get(num));
			list.remove(num);
			a++;
		}
		return tlist;
	}
	
	/*
	 * 트럭메뉴 상세 검색 질의 실행 함수
	 */
	public ArrayList selectMenuView(int tno){
		return pmvDAO.selectMenuView(tno);
	}
	
}

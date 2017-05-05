package com.foodbuncker.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.COrderPayDAO;
import com.foodbuncker.vo.COrderPayVO;

public class COrderPayService {
	@Autowired
	COrderPayDAO dao;
	ArrayList<Integer> orderNoList = new ArrayList<>();
	
	public ArrayList<COrderPayVO> selectAllOrder(HttpSession session){
		//int tno = (int)session.getAttribute("UTNO");
		int tno = 1;
		ArrayList<COrderPayVO> orderList =  dao.selectAllOrder(tno);
		orderList.stream().forEach(n->{
			int ono = n.getOno();
			System.out.println(ono);
			orderNoList.add(ono);
		});
		return orderList;
	}
	
	public ArrayList<COrderPayVO> selectAllOrderMenu(){
		ArrayList<COrderPayVO> allOrderMenu = new ArrayList<>();
		orderNoList.stream().forEach(n->{
			ArrayList<COrderPayVO> oneOrderMenu = (ArrayList)dao.selectAllOrderMenu(n);
			allOrderMenu.addAll(oneOrderMenu);
		});
		orderNoList.clear();
		return allOrderMenu;
	}

}

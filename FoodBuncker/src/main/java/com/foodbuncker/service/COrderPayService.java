package com.foodbuncker.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.COrderPayDAO;
import com.foodbuncker.vo.COrderPayVO;

public class COrderPayService {
	@Autowired
	COrderPayDAO dao;
	ArrayList<Integer> orderNoList = new ArrayList<>();
	
	public ArrayList<COrderPayVO> selectAllOrder(HttpSession session,String strTno){
		int tno;
		try{
			tno = (int)session.getAttribute("UTNO");
		}catch(Exception e){
			try{
				//tno = Integer.parseInt(strTno);
				tno = 1;
				session.setAttribute("UTNO", tno);
			}catch(Exception e1){
				return null;
			}
		}
		ArrayList<COrderPayVO> orderList =  dao.selectAllOrder(tno);
		orderList.stream().forEach(n->{
			int ono = n.getOno();
			//System.out.println(ono);
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
	
	public COrderPayVO selectOpenClosePlace(HttpSession session){
		//int tno = (int)session.getAttribute("UTNO");
		int tno = 1;
		COrderPayVO vo = new COrderPayVO();
		try{
			vo = dao.selectOpenClosePlace(tno);
			//System.out.println(vo.getOpenTime()+":"+vo.getCloseTime());
		}catch(Exception e){
			e.printStackTrace();
			vo.setTno(tno);
			COrderPayVO temp = dao.selectPnoPnameTname(tno);
			vo.setPno(temp.getPno());
			vo.setTname(temp.getTname());
			vo.openTime=new Date();
			vo.closeTime=new Date(1,1,1);
		}
		return vo;
	}
	
	public void insertOpenTime(String strTno, String strPno){
		HashMap map = new HashMap();
		map.put("tno", Integer.parseInt(strTno));
		map.put("pno", Integer.parseInt(strPno));
		dao.insertOpneTime(map);
	}
	
	public void updateCloseTime(String strTno){
		int tno = Integer.parseInt(strTno);
		//System.out.println("strTno: "+strTno+"   tno : "+tno);
		dao.updateCloseTime(tno);
	}
	
	public ArrayList selectOrderMenu(String strOno){
		int ono = Integer.parseInt(strOno);
		return dao.selectOrderMenu(ono);
	}
	
	public COrderPayVO selectOneOrderInfo(String strOno){
		int ono = Integer.parseInt(strOno);
		return dao.selectOneOrderInfo(ono);
	}
	
	public void updatePayTime(String strOno){
		int ono = Integer.parseInt(strOno);
		dao.updatePaytime(ono);
	}
	
	public void updateServTime(String strOno){
		int ono = Integer.parseInt(strOno);
		dao.updateServtime(ono);
	}

}

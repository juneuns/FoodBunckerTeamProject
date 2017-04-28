package com.foodbuncker.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.PMenuSearchDAO;
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.PMenuSearchVO;

public class PMenuSearchService {
	@Autowired
	public PMenuSearchDAO dao;
	
	public ArrayList<PMenuSearchVO> selectMenu(PageUtil pInfo){
		int start = (pInfo.nowPage-1)*pInfo.pageRow +1;
		int end = start + pInfo.pageRow - 1;
		HashMap<String,Integer> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		return dao.selectMenu(map);
	}
	
	public int changePage(String strPage){
		int nowPage = 0;
		try{
			nowPage = Integer.parseInt(strPage);
		}catch(Exception e){
			nowPage = 1;
		}
		return nowPage;
	}
	
	public PageUtil pageInfo(int nowPage){
		int total = dao.selectCount();
		PageUtil pInfo = new PageUtil(nowPage,total,9,1);
		return pInfo;
	}
	
	public ArrayList selectTNow(){
		return dao.selectTNow();
	}

}

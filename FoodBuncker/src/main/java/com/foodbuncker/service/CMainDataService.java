package com.foodbuncker.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.CMainDataDAO;
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.CMainDataVO;

public class CMainDataService {
	@Autowired
	CMainDataDAO dao;
	
	public ArrayList<CMainDataVO> selectOneTReview(PageUtil pInfo, int tno){
		//System.out.println("tno : "+tno);
		int start = (pInfo.nowPage-1)*pInfo.pageRow +1;
		int end = start + pInfo.pageRow - 1;
		HashMap map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		map.put("tno", tno);
		return dao.selectOneTReview(map);
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
	
	public PageUtil pageInfo(int nowPage, int tno){
		int total = dao.selectCount(tno);
		PageUtil pInfo = new PageUtil(nowPage,total,5,10);
		return pInfo;
	}

}

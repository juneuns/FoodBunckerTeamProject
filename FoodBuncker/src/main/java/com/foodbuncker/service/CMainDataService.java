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
	
	public ArrayList<CMainDataVO> selectOneTReview(int tno){
		return dao.selectOneTReview(tno);
	}
	
	public int changePage(String strPage){
		int	nowPage = 0;
		try {
			nowPage = Integer.parseInt(strPage);
		}
		catch(Exception e) {
			nowPage = 1;
		}
		return nowPage;
	}
	
	public PageUtil pageInfo(int nowPage,int tno){
		int total = dao.selectCount(tno);
		PageUtil pInfo = new PageUtil(nowPage, total, 15, 10);
		return pInfo;
	}
	
	public ArrayList<CMainDataVO> selectOneTALLReview(PageUtil pInfo, int tno){
		int start = (pInfo.nowPage-1)*pInfo.pageRow +1;
		int end = start + pInfo.pageRow - 1;
		HashMap map = new HashMap();
		map.put("tno",tno);
		map.put("start", start);
		map.put("end", end);
		
		return dao.selectOneTAllReview(map);
	}
}

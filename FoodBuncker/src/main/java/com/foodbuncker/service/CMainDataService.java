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
	
	public ArrayList<CMainDataVO> selectMenuCountRatio(int tno){
		return dao.selectMenuCountRatio(tno);
	}
	
	public ArrayList<CMainDataVO> selectWeekSaleRatio(int tno){
		return dao.selectWeekSaleRatio(tno);
	}
	
	public ArrayList<CMainDataVO> selectGenderSaleRatio(int tno){
		return dao.selectGenderSaleRatio(tno);
	}
	
	public ArrayList<CMainDataVO> selectAgeSaleRatio(int tno){
		return dao.selectAgeSaleRatio(tno);
	}
	
	public String[] getColorCode(){
		String[] colorCode = {"#349D4B","#818e2f","#9ed98c", "#dfd79f", "#e9c9be","#cab3e6","#b3bee6","#989add","#9f5ec9","#934bc3","#4051bf","#201849","#58281d"};
		return colorCode;
	}
	
	public ArrayList<CMainDataVO> selectPlaceSaleSum(int tno){
		return dao.selectPlaceSaleSum(tno);
	}
	
	public ArrayList<CMainDataVO> selectDaySaleSum(int tno){
		return dao.selectDaySaleSum(tno);
	}
	
	public HashMap<String,Integer> selectYearSaleRatio(int tno){
		return dao.selectYearSaleRatio(tno);
	}
	
	public HashMap<String,Integer> selectMonthSaleRatio(int tno){
		return dao.selectMonthSaleRatio(tno);
	}
	
	public HashMap<String,Integer> selectDaySaleRatio(int tno){
		return dao.selectDaySaleRatio(tno);
	}
	
	public HashMap<String,Integer> selectHourSaleRatio(int tno){
		return dao.selectHourSaleRatio(tno);
	}
	
	public ArrayList<CMainDataVO> selectRainSaleRatio(int tno){
		return dao.selectRainSaleRatio(tno);
	}
	
	public ArrayList<CMainDataVO> selectTempSaleRatio(int tno){
		return dao.selectTempSaleRatio(tno);
	}
	
	public ArrayList<CMainDataVO> selectHourSaleSum(int tno){
		return dao.selectHourSaleSum(tno);
	}
	
	public ArrayList<CMainDataVO> selectMonthSaleSum(int tno){
		return dao.selectMonthSaleSum(tno);
	}
}

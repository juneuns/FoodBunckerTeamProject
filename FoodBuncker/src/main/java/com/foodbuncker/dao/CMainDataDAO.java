package com.foodbuncker.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.vo.CMainDataVO;

public class CMainDataDAO {
	@Autowired
	public SqlSessionTemplate sqlSession;
	
	public ArrayList<CMainDataVO> selectOneTReview(int tno){
		return (ArrayList) sqlSession.selectList("foodbuncker.CMainData.selectOneTReview",tno);
	}
	
	public int selectCount(int tno){
		return sqlSession.selectOne("foodbuncker.CMainData.selectCount",tno);
	}
	
	public ArrayList<CMainDataVO> selectOneTAllReview(HashMap map){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectOneTAllReview",map);
	}
	
	public ArrayList<CMainDataVO> selectMenuCountRatio(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectMenuCountRatio",tno);
	}
	
	public ArrayList<CMainDataVO> selectWeekSaleRatio(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectWeekSaleRatio",tno);
	}
	
	public ArrayList<CMainDataVO> selectGenderSaleRatio(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectGenderSaleRatio",tno);
	}
	
	public ArrayList<CMainDataVO> selectAgeSaleRatio(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectAgeSaleRatio",tno);
	}
	
	public ArrayList<CMainDataVO> selectPlaceSaleSum(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectPlaceSaleSum",tno);
	}
	public ArrayList<CMainDataVO> selectDaySaleSum(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectDaySaleSum",tno);
	}
	public HashMap<String,Integer> selectYearSaleRatio(int tno){
		return (HashMap)sqlSession.selectOne("foodbuncker.CMainData.selectYearSaleRatio", tno);
	}
	public HashMap<String,Integer> selectMonthSaleRatio(int tno){
		return (HashMap)sqlSession.selectOne("foodbuncker.CMainData.selectMonthSaleRatio", tno);
	}
	public HashMap<String,Integer> selectDaySaleRatio(int tno){
		return (HashMap)sqlSession.selectOne("foodbuncker.CMainData.selectDaySaleRatio", tno);
	}
	public HashMap<String,Integer> selectHourSaleRatio(int tno){
		return (HashMap)sqlSession.selectOne("foodbuncker.CMainData.selectHourSaleRatio", tno);
	}
	public ArrayList<CMainDataVO> selectRainSaleRatio(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectRainSaleRatio", tno);
	}
	public ArrayList<CMainDataVO> selectTempSaleRatio(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectTempSaleRatio", tno);
	}
	public ArrayList<CMainDataVO> selectHourSaleSum(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectHourSaleSum",tno);
	}
	public ArrayList<CMainDataVO> selectMonthSaleSum(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMainData.selectMonthSaleSum",tno);
	}
}

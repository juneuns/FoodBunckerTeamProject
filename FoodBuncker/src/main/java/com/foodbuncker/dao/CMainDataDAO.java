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
}

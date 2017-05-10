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
}

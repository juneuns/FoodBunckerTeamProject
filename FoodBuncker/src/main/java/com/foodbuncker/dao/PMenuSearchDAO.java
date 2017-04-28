package com.foodbuncker.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.vo.PMenuSearchVO;

public class PMenuSearchDAO {
	@Autowired
	public SqlSessionTemplate sqlSession;
	
	public ArrayList<PMenuSearchVO> selectMenu(){
		return (ArrayList)sqlSession.selectList("foodbuncker.PMenuSearch.selectMenu");
	}

}

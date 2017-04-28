package com.foodbuncker.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.vo.PMenuSearchVO;

public class PMenuSearchDAO {
	@Autowired
	public SqlSessionTemplate sqlSession;
	
	public ArrayList<PMenuSearchVO> selectMenu(HashMap<String,Integer> map){
		return (ArrayList)sqlSession.selectList("foodbuncker.PMenuSearch.selectMenu", map);
	}
	
	public int selectCount(){
		return sqlSession.selectOne("foodbuncker.PMenuSearch.selectTotal");
	}
	
	public ArrayList selectTNow(){
		return (ArrayList)sqlSession.selectList("foodbuncker.PMenuSearch.selectTNow");
	}

}

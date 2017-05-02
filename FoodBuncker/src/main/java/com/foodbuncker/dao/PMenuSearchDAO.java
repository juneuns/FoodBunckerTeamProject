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
		return sqlSession.selectOne("foodbuncker.PMenuSearch.selectCount");
	}
	
	public ArrayList selectTNow(){
		return (ArrayList)sqlSession.selectList("foodbuncker.PMenuSearch.selectTNow");
	}
	
	public ArrayList selectTWeekPlan(HashMap map){
		return (ArrayList)sqlSession.selectList("foodbuncker.PMenuSearch.selectTWeekPlan",map);
	}
	
	public ArrayList selectAllTruck(){
		return (ArrayList)sqlSession.selectList("foodbuncker.PMenuSearch.selectAllTruck");
	}
	
	public ArrayList selectOneTPlan(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.PMenuSearch.selectOneTPlan",tno);
	}
	public String selectOneTName(int tno){
		return sqlSession.selectOne("foodbuncker.PMenuSearch.selectOneTName", tno);
	}

}

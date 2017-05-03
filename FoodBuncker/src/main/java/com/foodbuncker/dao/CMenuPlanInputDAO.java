package com.foodbuncker.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.vo.CMenuPlanInputVO;

public class CMenuPlanInputDAO {
	@Autowired
	public SqlSessionTemplate sqlSession;
	
	public ArrayList<CMenuPlanInputVO> selectAllPlace(){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMenuPlanInput.selectAllPlace");
	}
	
	public ArrayList<CMenuPlanInputVO> selectOneTPlan(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.CMenuPlanInput.selectOneTPlan",tno);
	}
	
	public void insertPlan(HashMap map){
		sqlSession.insert("foodbuncker.CMenuPlanInput.insertPlan",map);
	}
	
	public void deletePlan(HashMap map){
		sqlSession.delete("foodbuncker.CMenuPlanInput.deletePlan",map);
	}

}

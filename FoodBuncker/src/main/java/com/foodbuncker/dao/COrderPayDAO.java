package com.foodbuncker.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class COrderPayDAO {
	
	@Autowired
	public SqlSessionTemplate sqlSession;
	
	public ArrayList selectAllOrder(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.COrderPay.selectAllOrder",tno);
	}
	
	public ArrayList selectAllOrderMenu(int ono){
		return (ArrayList)sqlSession.selectList("foodbuncker.COrderPay.selectAllOrderMenu",ono);
	}

}

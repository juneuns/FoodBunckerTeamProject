package com.foodbuncker.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.vo.COrderPayVO;

public class COrderPayDAO {
	
	@Autowired
	public SqlSessionTemplate sqlSession;
	
	public ArrayList selectAllOrder(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.COrderPay.selectAllOrder",tno);
	}
	
	public ArrayList selectAllOrderMenu(int ono){
		return (ArrayList)sqlSession.selectList("foodbuncker.COrderPay.selectAllOrderMenu",ono);
	}
	
	public COrderPayVO selectOpenClosePlace(int tno){
		return sqlSession.selectOne("foodbuncker.COrderPay.selectOpenClosePlace",tno);
	}
	
	public void insertOpneTime(HashMap map){
		sqlSession.insert("foodbuncker.COrderPay.insertOpenTime",map);
	}
	
	public void updateCloseTime(int tno){
		sqlSession.update("foodbuncker.COrderPay.updateCloseTime",tno);
	}
	
	public ArrayList selectOrderMenu(int ono){
		return (ArrayList)sqlSession.selectList("foodbuncker.COrderPay.selectOrderMenu",ono);
	}
	
	public COrderPayVO selectPnoPnameTname(int tno){
		return sqlSession.selectOne("foodbuncker.COrderPay.selectPnoPnameTname",tno);
	}
	
	public COrderPayVO selectOneOrderInfo(int ono){
		return sqlSession.selectOne("foodbuncker.COrderPay.selectOneOrderInfo",ono);
	}
	
	public void updatePaytime(int ono){
		sqlSession.update("foodbuncker.COrderPay.updatePaytime",ono);
	}
	
	public void updateServtime(int ono){
		sqlSession.update("foodbuncker.COrderPay.updateServtime",ono);
	}
	
	public ArrayList<COrderPayVO> selectOneTMenu(int tno){
		return (ArrayList)sqlSession.selectList("foodbuncker.COrderPay.selectOneTMenu",tno);
	}

}

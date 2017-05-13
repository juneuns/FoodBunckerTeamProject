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

	/*
	 * 주문1 insert
	 */
	public void insertOrderInput(COrderPayVO data){
		sqlSession.insert("foodbuncker.COrderPay.orderProc", data);
	}
	/*
	 * 주문2 insert
	 */
	public void insertOrderInputTwo(COrderPayVO data){
		sqlSession.insert("foodbuncker.COrderPay.orderProcTwo", data);
	}
	
	/*
	 * 주문번호 가져오기
	 */
	public int selectOrderNum(){
		return sqlSession.selectOne("foodbuncker.COrderPay.selectOrderNum");
	}
}

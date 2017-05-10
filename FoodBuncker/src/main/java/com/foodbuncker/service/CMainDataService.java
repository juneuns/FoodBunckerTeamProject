package com.foodbuncker.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.CMainDataDAO;
import com.foodbuncker.vo.CMainDataVO;

public class CMainDataService {
	@Autowired
	CMainDataDAO dao;
	
	public ArrayList<CMainDataVO> selectOneTReview(int tno){
		System.out.println("tno : "+tno);
		return dao.selectOneTReview(tno);
	}

}

package com.foodbuncker.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.CMainDataDAO;
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.CMainDataVO;

public class CMainDataService {
	@Autowired
	CMainDataDAO dao;
	
	public ArrayList<CMainDataVO> selectOneTReview(int tno){
		return dao.selectOneTReview(tno);
	}
}

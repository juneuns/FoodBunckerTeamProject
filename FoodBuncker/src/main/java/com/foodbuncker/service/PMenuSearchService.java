package com.foodbuncker.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.foodbuncker.dao.PMenuSearchDAO;
import com.foodbuncker.vo.PMenuSearchVO;

public class PMenuSearchService {
	@Autowired
	public PMenuSearchDAO dao;
	
	public ArrayList<PMenuSearchVO> selectMenu(){
		return dao.selectMenu();
	}

}

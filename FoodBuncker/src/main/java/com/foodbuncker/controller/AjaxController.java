package com.foodbuncker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodbuncker.service.PMenuSearchService;
import com.foodbuncker.util.PageUtil;
import com.foodbuncker.vo.PMenuSearchVO;

@RestController
public class AjaxController {
	@Autowired
	PMenuSearchService service;
	
	@RequestMapping("../person/MenuAddView/{nowpage}.food")
	public ResponseEntity<List<PMenuSearchVO>> list(@PathVariable("nowPage") Integer nowPage){
		ResponseEntity<List<PMenuSearchVO>> entity = null;
		PageUtil pInfo = service.pageInfo(nowPage);	
		try{
			entity = new ResponseEntity<>(service.selectMenu(pInfo),HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}

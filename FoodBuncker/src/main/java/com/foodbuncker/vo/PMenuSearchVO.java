package com.foodbuncker.vo;

// vo type alias : "pmenuVO" 
public class PMenuSearchVO {
	int no;
	int tno;
	String name;
	int price;
	String body;
	String imgname;
	char grade;
	String keyword;
	String isshow;
	String tname;
	float plat;
	float plng;
	
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public float getPlat() {
		return plat;
	}
	public void setPlat(float plat) {
		this.plat = plat;
	}
	public float getPlng() {
		return plng;
	}
	public void setPlng(float plng) {
		this.plng = plng;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getIsshow() {
		return isshow;
	}
	public void setIsshow(String isshow) {
		this.isshow = isshow;
	}
	
}

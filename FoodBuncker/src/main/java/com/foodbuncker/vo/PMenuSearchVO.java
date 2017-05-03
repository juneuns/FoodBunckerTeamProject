package com.foodbuncker.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

// vo type alias : "pmenuVO" 
public class PMenuSearchVO {
	public int no;
	int tno;
	int pno;
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
	String pname;
	LocalDate pdate;
	String startDate;
	String endDate;
	String pDayWeek1;
	String pDayWeek2;
	String pDayWeek3;
	String pDayWeek4;
	String pDayWeek5;
	String pDayWeek6;
	String pDayWeek7;
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
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public LocalDate getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = LocalDate.from(LocalDateTime.ofInstant(pdate.toInstant(), ZoneId.systemDefault()));
	}
	public String getStartDate() {
		LocalDate sDate = LocalDate.now();
		String startDate = sDate.getYear()+"년 "+sDate.getMonthValue()+"월"+sDate.getDayOfMonth()+"일("+sDate.getDayOfWeek().toString().substring(0,3)+")";
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
		
	}
	public String getEndDate() {
		LocalDate eDate = LocalDate.now().plusDays(7);
		String endDate = eDate.getYear()+"년 "+eDate.getMonthValue()+"월"+eDate.getDayOfMonth()+"일("+eDate.getDayOfWeek().toString().substring(0,3)+")";
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getpDayWeek1() {
		return LocalDate.now().getDayOfMonth()+"일("+LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.KOREAN)+")";
	}
	public void setpDayWeek1(String pDayWeek1) {
		this.pDayWeek1 = pDayWeek1;
	}
	public String getpDayWeek2() {
		return LocalDate.now().plusDays(1).getDayOfMonth()+"일("+LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.KOREAN)+")";
	}
	public void setpDayWeek2(String pDayWeek2) {
		this.pDayWeek2 = pDayWeek2;
	}
	public String getpDayWeek3() {
		return LocalDate.now().plusDays(2).getDayOfMonth()+"일("+LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.KOREAN)+")";
	}
	public void setpDayWeek3(String pDayWeek3) {
		this.pDayWeek3 = pDayWeek3;
	}
	public String getpDayWeek4() {
		return LocalDate.now().plusDays(3).getDayOfMonth()+"일("+LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.KOREAN)+")";
	}
	public void setpDayWeek4(String pDayWeek4) {
		this.pDayWeek4 = pDayWeek4;
	}
	public String getpDayWeek5() {
		return LocalDate.now().plusDays(4).getDayOfMonth()+"일("+LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.KOREAN)+")";
	}
	public void setpDayWeek5(String pDayWeek5) {
		this.pDayWeek5 = pDayWeek5;
	}
	public String getpDayWeek6() {
		return LocalDate.now().plusDays(5).getDayOfMonth()+"일("+LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.KOREAN)+")";
	}
	public void setpDayWeek6(String pDayWeek6) {
		this.pDayWeek6 = pDayWeek6;
	}
	public String getpDayWeek7() {
		return LocalDate.now().plusDays(6).getDayOfMonth()+"일("+LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.NARROW, Locale.KOREAN)+")";
	}
	public void setpDayWeek7(String pDayWeek7) {
		this.pDayWeek7 = pDayWeek7;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
}

package com.foodbuncker.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

//vo type alias : "pmainVO"
public class PMainViewVO {
	public int no;
	public int mno;
	public int tno;
	public int tino;
	public int bno;
	public int mtno;
	public int btno;
	public int price;
	
	public char grade;
	
	public String name;
	public String mname;
	public String sname;
	public String tname;
	public String body;
	public String kword;
	public String chef;
	public String phone;
	public String open;
	public String email;
	public String num;
	public String id;
	public String imgbody;
	
	
	public Date wdate;
	
	
	
	
	
	
	
	public int getTino() {
		return tino;
	}

	public void setTino(int tino) {
		this.tino = tino;
	}

	public String getImgbody() {
		return imgbody;
	}

	public void setImgbody(String imgbody) {
		this.imgbody = imgbody;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public int getBtno() {
		return btno;
	}

	public void setBtno(int btno) {
		this.btno = btno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMtno() {
		return mtno;
	}

	public void setMtno(int mtno) {
		this.mtno = mtno;
	}

	public Date getWdate() {
		return wdate;
	}

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getChef() {
		return chef;
	}

	public void setChef(String chef) {
		this.chef = chef;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
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

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getKword() {
		return kword;
	}

	public void setKword(String kword) {
		this.kword = kword;
	}
	
	public String getShowdate() {
		SimpleDateFormat	form = new SimpleDateFormat("yyyy년 MM월 dd일");
		return		form.format(wdate);
	}

}

package com.foodbuncker.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

//vo alias : "corderVO"
public class COrderPayVO {
	int tno;
	int ono;
	LocalDateTime orderTime;
	LocalDateTime payTime;
	LocalDateTime servTime;
	int mno;
	int mnum;
	String mName;
	public Date openTime;
	public Date closeTime;
	int pno;
	String pname;
	String tname;
	int price;
	String savename;
	
	
	
	
	public String getSavename() {
		return savename;
	}
	public void setSavename(String savename) {
		this.savename = savename;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public int getOno() {
		return ono;
	}
	public void setOno(int ono) {
		this.ono = ono;
	}
	public LocalDateTime getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderDate) {
		this.orderTime = LocalDateTime.ofInstant(orderDate.toInstant(), ZoneId.systemDefault());
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public LocalDateTime getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payDate) {
		this.payTime = LocalDateTime.ofInstant(payDate.toInstant(), ZoneId.systemDefault());
	}
	public LocalDateTime getServTime() {
		return servTime;
	}
	public void setServTime(Date servDate) {
		this.servTime = LocalDateTime.ofInstant(servDate.toInstant(),ZoneId.systemDefault());
	}
	public Date getOpenTime() {
		return openTime;
	}
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	public Date getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
}

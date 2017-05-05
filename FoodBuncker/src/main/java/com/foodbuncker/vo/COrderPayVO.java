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
	
	
}

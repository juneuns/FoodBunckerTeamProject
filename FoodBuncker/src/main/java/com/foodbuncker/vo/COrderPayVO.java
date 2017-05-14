package com.foodbuncker.vo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

//vo alias : "corderVO"
public class COrderPayVO {
	public int tno;
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

	public int[] aPrice;
	public String[] amName;
	public int amno;
	public String name;
	public int ea;
	public String aprice;
	public Date otime;
	public Date ptime;
	public Date stime;
	public int age;
	public String gen;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}

	public int getAmno() {
		return amno;
	}

	public void setAmno(int amno) {
		this.amno = amno;
	}

	public int[] getaPrice() {
		return aPrice;
	}

	public void setaPrice(int[] aPrice) {
		this.aPrice = aPrice;
	}

	public String[] getAmName() {
		return amName;
	}

	public void setAmName(String[] amName) {
		this.amName = amName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public String getAprice() {
		return aprice;
	}

	public void setAprice(String aprice) {
		this.aprice = aprice;
	}

	public int[] getBprice() {
		return aPrice;
	}

	public void setBprice(int[] bprice) {
		this.aPrice = bprice;
	}

	public String[] getBmName() {
		return amName;
	}

	public void setBmName(String[] bmName) {
		this.amName = bmName;
	}

	public void setOrderTime(LocalDateTime orderTime) {
		this.orderTime = orderTime;
	}

	public void setPayTime(LocalDateTime payTime) {
		this.payTime = payTime;
	}

	public void setServTime(LocalDateTime servTime) {
		this.servTime = servTime;
	}

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
		this.servTime = LocalDateTime.ofInstant(servDate.toInstant(), ZoneId.systemDefault());
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

	public Date getOtime() {
		return otime;
	}

	public void setOtime(Date otime) {
		this.otime = otime;
	}

	public Date getPtime() {
		return ptime;
	}

	public void setPtime(Date ptime) {
		this.ptime = ptime;
	}

	public Date getStime() {
		return stime;
	}

	public void setStime(Date stime) {
		this.stime = stime;
	}

	public String getShowdate() {
		SimpleDateFormat form = new SimpleDateFormat("dd일 hh:MM");
		return form.format(otime);
	}

}

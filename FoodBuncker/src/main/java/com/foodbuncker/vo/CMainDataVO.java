package com.foodbuncker.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class CMainDataVO {
	//vo alias : "cmenuVO"
	String pname;
	int pno;
	int tno;
	String tname;
	String reviewBody;
	LocalDate reviewTime;
	int rno;
	float ratio;
	String weekname;
	String gender;
	int age;
	String mname;
	int salesum;
	String sdate;
	String syear;
	int totalsum;
	int s2015;
	int s2016;
	int s2017;
	int shour;
	int rain;
	int temp;
	String smonth;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getReviewBody() {
		return reviewBody;
	}
	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}
	public LocalDate getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(Date reviewTime) {
		this.reviewTime = LocalDate.from(LocalDateTime.ofInstant(reviewTime.toInstant(), ZoneId.systemDefault()));
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public float getRatio() {
		return ratio;
	}
	public void setRatio(float ratio) {
		this.ratio = ratio;
	}
	public String getWeekname() {
		return weekname;
	}
	public void setWeekname(String weekname) {
		this.weekname = weekname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getSalesum() {
		return salesum;
	}
	public void setSalesum(int salesum) {
		this.salesum = salesum;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public int getTotalsum() {
		return totalsum;
	}
	public void setTotalsum(int totalsum) {
		this.totalsum = totalsum;
	}
	public int getS2015() {
		return s2015;
	}
	public void setS2015(int s2015) {
		this.s2015 = s2015;
	}
	public int getS2016() {
		return s2016;
	}
	public void setS2016(int s2016) {
		this.s2016 = s2016;
	}
	public int getS2017() {
		return s2017;
	}
	public void setS2017(int s2017) {
		this.s2017 = s2017;
	}
	public int getRain() {
		return rain;
	}
	public void setRain(int rain) {
		this.rain = rain;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getShour() {
		return shour;
	}
	public void setShour(int shour) {
		this.shour = shour;
	}
	public String getSmonth() {
		return smonth;
	}
	public void setSmonth(String smonth) {
		this.smonth = smonth;
	}
	
}

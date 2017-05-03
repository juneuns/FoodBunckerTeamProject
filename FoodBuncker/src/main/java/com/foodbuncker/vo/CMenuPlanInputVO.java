package com.foodbuncker.vo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

//vo alias : "cmenuVO"
public class CMenuPlanInputVO {
	int no;
	int tno;
	int pno;
	String pname;
	public LocalDate pdate;
	
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
	public LocalDate getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = LocalDate.from(LocalDateTime.ofInstant(pdate.toInstant(), ZoneId.systemDefault()));
	}
	
}

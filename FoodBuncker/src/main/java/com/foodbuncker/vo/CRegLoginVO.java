package com.foodbuncker.vo;

import org.springframework.web.multipart.MultipartFile;

//vo alias : "cregVO"
public class CRegLoginVO {
	public int cnt;
	public int no;
	public String chef;
	public String name;
	public String phone;
	public String open;
	public String email;
	public String num;
	public String id;
	public String pw;
	public int imgno;
	public String sname;
	public String imgbody;
	public int tigrade;
	public int tabNo;
	public String isShow;
	
	public MultipartFile chefImg;
	public String chefImgName;
	public String chefComment;
	public MultipartFile truckImg;
	public String truckImgName;
	public String truckComment;
	public MultipartFile mmenuImg;
	public String mmenuImgName;
	public String mmenuName;
	public int mmenuPrice;
	public String mmenuComment;
	public String mmenugrade;
	public String keyword;
	public String keyword1;
	public String keyword2;
	public String keyword3;
	public String keyword4;
	public String keyword5;
	
	public String oldChefImg;
	public String oldTruckImg;
	public String oldMenuImg;
	
	public String oldMenuImg1;
	public String oldMenuImg2;
	public String oldMenuImg3;
	public String oldMenuImg4;
	public String oldMenuImg5;
	public String oldMenuImg6;
	
	

	public String getOldChefImg() {
		return oldChefImg;
	}
	public void setOldChefImg(String oldChefImg) {
		this.oldChefImg = oldChefImg;
	}
	public String getOldTruckImg() {
		return oldTruckImg;
	}
	public void setOldTruckImg(String oldTruckImg) {
		this.oldTruckImg = oldTruckImg;
	}
	public String getOldMenuImg() {
		return oldMenuImg;
	}
	public void setOldMenuImg(String oldMenuImg) {
		this.oldMenuImg = oldMenuImg;
	}
	public String getOldMenuImg1() {
		return oldMenuImg1;
	}
	public void setOldMenuImg1(String oldMenuImg1) {
		this.oldMenuImg1 = oldMenuImg1;
	}
	public String getOldMenuImg2() {
		return oldMenuImg2;
	}
	public void setOldMenuImg2(String oldMenuImg2) {
		this.oldMenuImg2 = oldMenuImg2;
	}
	public String getOldMenuImg3() {
		return oldMenuImg3;
	}
	public void setOldMenuImg3(String oldMenuImg3) {
		this.oldMenuImg3 = oldMenuImg3;
	}
	public String getOldMenuImg4() {
		return oldMenuImg4;
	}
	public void setOldMenuImg4(String oldMenuImg4) {
		this.oldMenuImg4 = oldMenuImg4;
	}
	public String getOldMenuImg5() {
		return oldMenuImg5;
	}
	public void setOldMenuImg5(String oldMenuImg5) {
		this.oldMenuImg5 = oldMenuImg5;
	}
	public String getOldMenuImg6() {
		return oldMenuImg6;
	}
	public void setOldMenuImg6(String oldMenuImg6) {
		this.oldMenuImg6 = oldMenuImg6;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getKeyword1() {
		return keyword1;
	}
	public void setKeyword1(String keyword1) {
		this.keyword1 = keyword1;
	}
	public String getKeyword2() {
		return keyword2;
	}
	public void setKeyword2(String keyword2) {
		this.keyword2 = keyword2;
	}
	public String getKeyword3() {
		return keyword3;
	}
	public void setKeyword3(String keyword3) {
		this.keyword3 = keyword3;
	}
	public String getKeyword4() {
		return keyword4;
	}
	public void setKeyword4(String keyword4) {
		this.keyword4 = keyword4;
	}
	public String getKeyword5() {
		return keyword5;
	}
	public void setKeyword5(String keyword5) {
		this.keyword5 = keyword5;
	}
	public MultipartFile getMmenuImg() {
		return mmenuImg;
	}
	public String getChefImgName() {
		return chefImgName;
	}
	public void setChefImgName(String chefImgName) {
		this.chefImgName = chefImgName;
	}
	public String getTruckImgName() {
		return truckImgName;
	}
	public void setTruckImgName(String truckImgName) {
		this.truckImgName = truckImgName;
	}
	public String getMmenuImgName() {
		return mmenuImgName;
	}
	public void setMmenuImgName(String mmenuImgName) {
		this.mmenuImgName = mmenuImgName;
	}
	public String getMmenugrade() {
		return mmenugrade;
	}
	public void setMmenugrade(String mmenugrade) {
		this.mmenugrade = mmenugrade;
	}
	public void setMmenuImg(MultipartFile mmenuImg) {
		this.mmenuImg = mmenuImg;
	}
	public MultipartFile getChefImg() {
		return chefImg;
	}
	public void setChefImg(MultipartFile chefImg) {
		this.chefImg = chefImg;
	}
	public String getChefComment() {
		return chefComment;
	}
	public void setChefComment(String chefComment) {
		this.chefComment = chefComment;
	}
	public MultipartFile getTruckImg() {
		return truckImg;
	}
	public void setTruckImg(MultipartFile truckImg) {
		this.truckImg = truckImg;
	}
	public String getTruckComment() {
		return truckComment;
	}
	public void setTruckComment(String truckComment) {
		this.truckComment = truckComment;
	}
	public String getMmenuName() {
		return mmenuName;
	}
	public void setMmenuName(String mmenuName) {
		this.mmenuName = mmenuName;
	}
	public int getMmenuPrice() {
		return mmenuPrice;
	}
	public void setMmenuPrice(int mmenuPrice) {
		this.mmenuPrice = mmenuPrice;
	}
	public String getMmenuComment() {
		return mmenuComment;
	}
	public void setMmenuComment(String mmenuComment) {
		this.mmenuComment = mmenuComment;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getImgno() {
		return imgno;
	}
	public void setImgno(int imgno) {
		this.imgno = imgno;
	}
	public int getTabNo() {
		return tabNo;
	}
	public void setTabNo(int tabNo) {
		this.tabNo = tabNo;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getImgbody() {
		return imgbody;
	}
	public void setImgbody(String imgbody) {
		this.imgbody = imgbody;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getTigrade() {
		return tigrade;
	}
	public void setTigrade(int tigrade) {
		this.tigrade = tigrade;
	}
	
	
}

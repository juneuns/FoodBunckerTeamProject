package com.foodbuncker.vo;

import java.io.File;
import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

//vo alias : "cregVO"
public class CRegLoginVO {
	public int cnt;
	public int no;
	public int tino;
	public int mNo;
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
	public String isShow;   // truckInfo table의 경우 N, S,T,R,Y 로 구분한다.
	
	public MultipartFile chefImg;
	public String chefImgName;
	public String chefComment;
	public MultipartFile truckImg;
	public String truckImgName;
	public String truckComment;
	public MultipartFile mmenuImg;
	public String mmenuImgName;
	public String truckThumb;
	public String chefThumb;
	public String thumbName;
	public String mmenuName;
	public int mmenuPrice;
	public String strPrice;
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

	public String mImgName;
	public MultipartFile subMImg;
	public String subMImage;
	public String thumbSMImg;
	public String oldSubMImg;
	
	public ArrayList list;
	public ArrayList list1;
	public ArrayList list2;
	

	public ArrayList getList1() {
		return list1;
	}
	public void setList1(ArrayList list1) {
		this.list1 = list1;
	}
	public ArrayList getList2() {
		return list2;
	}
	public void setList2(ArrayList list2) {
		this.list2 = list2;
	}
	public int getTino() {
		return tino;
	}
	public void setTino(int tino) {
		this.tino = tino;
	}
	public String getmImgName() {
		return mImgName;
	}
	public void setmImgName(String mImgName) {
		this.mImgName = mImgName;
	}
	public ArrayList getList() {
		return list;
	}
	public void setList(ArrayList list) {
		this.list = list;
	}
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getStrPrice() {
		return strPrice;
	}
	public void setStrPrice(String strPrice) {
		this.strPrice = strPrice;
	}
	public MultipartFile getSubMImg() {
		return subMImg;
	}
	public void setSubMImg(MultipartFile subMImg) {
		this.subMImg = subMImg;
	}
	public String getSubMImage() {
		return subMImage;
	}
	public void setSubMImage(String subMImage) {
		this.subMImage = subMImage;
	}
	public String getThumbSMImg() {
		return thumbSMImg;
	}
	public void setThumbSMImg(String thumbSMImg) {
		this.thumbSMImg = thumbSMImg;
	}
	public String getOldSubMImg() {
		return oldSubMImg;
	}
	public void setOldSubMImg(String oldSubMImg) {
		this.oldSubMImg = oldSubMImg;
	}
	public String getTruckThumb() {
		return truckThumb;
	}
	public void setTruckThumb(String truckThumb) {
		this.truckThumb = truckThumb;
	}
	public String getChefThumb() {
		return chefThumb;
	}
	public void setChefThumb(String chefThumb) {
		this.chefThumb = chefThumb;
	}
	public String getThumbName() {
		return thumbName;
	}
	public void setThumbName(String thumbName) {
		this.thumbName = thumbName;
	}
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

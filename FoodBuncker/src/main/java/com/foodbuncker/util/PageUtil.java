package com.foodbuncker.util;

/*
 * 	이 클래스는 페이지 이동 기능에 필요한 정보를 계산하기 위해서
 * 	만드는 유틸리티 클래스이다.
 */
public class PageUtil {
	//	변수 선언
	//	알려주어야 할 요소
	public		int		nowPage;		//	현재 보고있는 페이지
	public		int		totalCount;		//	총 게시물의 개수
	//	개발자가 선택할 수 있는 요소
	public		int		pageRow;		//	한 페이지당 나올 게시물의 갯수
	public		int		pageGroup;	//	한 화면당 페이지 이동 기능 갯수
	//	계산에 의해서 만들어지는 요소
	public		int		startPage;		//	그 화면에 나타날 페이지 이동의 시작 페이지
	public		int		endPage;		//	그 화면에 나타날 페이지 이동의 마지막 페이지
	
	//	반드시 필요한 요소는 아니지만 중간 계산에 필요한 요소
	//	가끔은 화면에 출력에도 필요한 요소
	public		int		totalPage;		//	총 페이지 수	
	
	//	이제 정보를 받아보자.
	//	정보는 필수로 2가지를 알아야 한다.
	//	이 정보는 이 클래스를 new 시킬때 알아내자.
	public PageUtil(int nowPage, int totalCount) {
		this(nowPage, totalCount, 10, 5);
	}
	//	위의 2가지 정보 말고도 2가지 정보를 여러분이 결정해야 한다.
	//	이 정보도 필요하면 변경할 수 있도록 하자.
	//	4가지 정보를 동시에 알려주는 생성자 함수를 또 만들자.
	public PageUtil(int nowPage, int totalCount, int pageRow, int pageGroup) {
		this.nowPage = nowPage;
		this.totalCount = totalCount;
		this.pageRow = pageRow;
		this.pageGroup = pageGroup;
		
		//	계산하자.
		calcPage();
		calcStart();
		calcEnd();
	}
	
	//	1.	총 페이지 수를 계산하자.
	public void calcPage() {
		//	총페이지 수는 총 데이터 개수(totalCount)를 
		//	한 화면에 표시할 게시물의 개수(pageRow)로 나누면 된다.
		//	단, 경우에 따라서는 한페이지가 증가될 수 있다.
		totalPage = (totalCount % pageRow == 0) ? (totalCount / pageRow) : (totalCount / pageRow + 1);
	}
	//	2.	시작 페이지 수를 계산하자.
	public void calcStart() {
		//	페이지 이동 기능에 나타날 페이지는 개발자가 어떻게 만드는가에 따라서
		//	달라진다.
		//	고전 방식
		//				현재 페이지와 관계없이
		///				1~10, 11~20, 21~30까지 고정시켜서 보여주는 방식
		//		예>		[이전][1][2][3][4][5][다음]
		//	계산 방식(원리)
		//		1)	보고있는 페이지가 몇번째 그룹인지를 계산한다.
		//			[1][2][3][4][5]				0
		//			[6][7][8][9][10]				1
		//			[11][12][13][14][15]		2
		//			[16][17][18][19][20]		3
		int	tempGroup = (nowPage - 1) / pageGroup;
		//	예>		한 화면당 5개의 페이지를 보여주고 싶다.(pageGroup = 5)
		//			현재 페이지		3		(3 - 1) / 5		0	
		//								6		(6 - 1) / 5		1
		//								15		(15 - 1) / 5	2	
		//		2)	그 그룹의 시작 페이지를 계산한다.
		//			예>		0그룹		1
		//					1그룹		6
		//					2그룹		11
		//					3그룹		16
		startPage = tempGroup * pageGroup + 1;
		//		예>			0 * 5 + 1		1
		//					1 * 5 + 1		6
		//					2 * 5 + 1		11		
		
		//	요사이 트랜드
		//				현재 페이지를 가운데 놓는 방식
		//				현재 페이지가 3페이지 이면
		//				[1][2][3][4][5]
		//				현재 페이지가 5페이지 이면
		//				[3][4][5][6][7]
		//				페이지를 현재 페이지와 연동시키는 방식
		
		//		힌트
		//			현재 보고있는 페이지에서 보여줄 페이지 개수의 절반만큼 빼면된다.
		//			문제		[1]인 경우에는 (즉, 절반을 뺀 결과가 0이하가 되는 경우)
		//						그 앞쪽에 이동 가능한 페이지가 없다.
		//						이때는 강제로 1페이지로 강제 지정해야 한다.
	}
	//	3.	종료 페이지 수를 계산하자.
	public void calcEnd() {
		//	종료 페이지는 시작 페이지 + 화면에 보여줄 페이지 수 - 1
		//	예>		1 + 5 - 1 		5
		//			6 + 5 - 1		10
		//	문제
		//		만약 계산된 종료페이지가 전체 페이지 보다 크다면
		//		이동 불가능한 페이지가 계산된다.
		//		예>			전체 총 페이지		7이면
		//						8, 9, 10페이지는 이동 불가능한 페이지가 된다.
		//		이 문제를 해결해야 한다.
		
		endPage = startPage + pageGroup - 1;
		if(endPage > totalPage) {
			endPage = totalPage;
		}
	}
	//		${nowPage}	방식으로 사용하면 된다.
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageRow() {
		return pageRow;
	}
	public void setPageRow(int pageRow) {
		this.pageRow = pageRow;
	}
	public int getPageGroup() {
		return pageGroup;
	}
	public void setPageGroup(int pageGroup) {
		this.pageGroup = pageGroup;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	//	이 클래스가 생산한 정보는 JSTL 방식으로 뷰에서 사용해야 한다.
	//	JSTL은 변수를 이용하는 것이 아니고 get 함수를 이용하는 방식이므로
	//	고로 정보를 사용할 수 있도록 get 함수를 만들자.
}

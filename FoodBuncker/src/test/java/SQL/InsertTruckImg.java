package SQL;

import java.sql.Statement;

public class InsertTruckImg {

	public InsertTruckImg() {
		String[] insertTruckImg = {
				/*	일련번호
					트럭NO
					이미지저장화일명
					이미지설명
					사진종류
					활성여부
				*/
				// 트럭이미지
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 1, 'truck01_t_01.jpg', '노란색의 아담한 크기의 귀여운 트럭입니다. 메뉴를 보시면 아시겠지만 고급 한식당 못지 않아요. 많이 찾아주세요.', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_t_01.jpg', '상단 오픈형 트럭을 개조하여 완벽한 조리환경을 구성했습니다.', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 3, 'truck03_t_01.jpg', '한쪽 면을 크게 오픈해서 조리하는 모습을 가까이서 보실 수 있어요. 아담한 크기입니다.', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 4, 'truck04_t_01.jpg', '여러분들의 시선에 맞춰 높이를 낮춘 특별 개조한 트럭입니다.', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 5, 'truck05_t_01.jpg', '중간 크기 탑차의 옆면을 통째로 열 수 있게 개조하고 중국음식점 분위기에 맞게 빨간색으로 도장 하였습니다.', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 6, 'truck06_t_01.jpg', '삼면을 전부 열 수 있는 구조로 화덕의 열기를 어디서도 느끼실 수 있습니다.', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 7, 'truck07_t_01.jpg', '작은 트럭을 개조하여 어디든지 갈 수 있습니다. 쉐프 혼자만의 공간으로 아늑합니다. 자주 찾아주세요.', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 8, 'truck08_t_01.jpg', '컨테이너를 개조하여 측면을 열어 새로운 공간을 찾아내었습니다.', 1, 'Y')", 
				//  쉐프이미지
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 1, 'truck01_c_01.jpg', '컵밥을 같이 먹으며 사랑을 키워 결혼한 부부쉐프입니다. 그 누구보다도 컵밥을 많이 먹어 보았습니다. 우리는 둘이니까 다른 쉐프보다는 두 배 맛있습니다.', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_c_01.jpg', '젊은 DJ의 감각으로 스테이크 고유의 맛을 연구했습니다. 미국의 요리법과 한국만의 재료를 이용한 한국인에 맞는 맛을 여러분께 선보입니다.', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 3, 'truck03_c_01.jpg', '현란한 손짓으로 뜨거운 호떡을 주무르는 철갑 손을 가진 쉐프를 보실 수 있습니다. ', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 4, 'truck04_c_01.jpg', '태국에 여행을 갔다가 태국음식에 빠져서 2년 동안 태국에 머물며 오로지 요리 연구만 했습니다.그 맛을 보여 드리고 싶습니다.', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 5, 'truck05_c_01.jpg', '중국요리의 한국화를 위해 중국 전역을 돌아다니며 재료를 직접 경험해보고 수백가지의 요리를 연구했습니다. 여러분께 맛의 진수를 느끼시게 해드리겠습니다.', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 6, 'truck06_c_01.jpg', '기존의 피자 체인점의 특별하지 않은 맛이 싫어 새로운 맛으로 승부를 보기위해 독립, 직접 피자를 만들고 있습니다.', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 7, 'truck07_c_01.jpg', '버거만을 연구하였습니다.미국 전통의 버거와 한국인의 입맛을 고려하여 항상 연구하고 시도하고 있습니다.', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 8, 'truck08_c_01.jpg', '태국 전통의 볶음요리와 살치살 스테이크의 전문 쉐프의 손길을 느낄 수 있습니다.', 2, 'Y')", 
				// 메인메뉴 이미지
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 1, 'truck01_o_01.jpg', 'LA식 갈비와 볶은 김치와의 만남. 상상하기 어려운 맛이지만 한 번 맛보신 분들은 그 강렬한 맛을 잊지 못하고 다시 찾아 오시더군요.', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_o_01.jpg', '쉐프가 직접 고른 1++등급의 한우 살치살을 고열의 철판에 짧은 시간에 구워내어 육즙의 손실을 최소화시킨 고급스러운 맛', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 3, 'truck03_o_01.jpg', '마가린에 구운 원조 남포동식 호떡,볶은 씨앗이 고소하게 씹힙니다.', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 4, 'truck04_o_01.jpg', '한국식 고소한 육수에 태국에서 직수입한 면과 숙주를 넣어 약간 쌉살하고 식감이 뛰어납니다.', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 5, 'truck05_o_01.jpg', '부드러운 고기와 약간 매콤한 소스가 섞여 최고의 맛을 보여 드립니다. ', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 6, 'truck06_o_01.jpg', '화덕 피자의 바삭하고 쫄깃한 식감을 느낄 수 있으며 신선한 토핑으로 재료 각각의 맛을 느낄 수 있습니다.', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 7, 'truck07_o_01.jpg', '소스의 강한 맛을 줄여 소고기 고유의 맛을 살리고 신선한 야채를 느낄 수 있는 최고급 버거', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 8, 'truck08_o_01.jpg', '최고급의 한우 살치살을 철판에 구워 부드러운 맛을 느낄 수 있습니다.', 3, 'Y')",
				
				//일반이미지
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_t_02.jpg', '2016/4/20 대학로에서', 4, 'Y')",
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_t_03.jpg', '2016/4/20 대학로에서', 4, 'Y')",
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_t_04.jpg', '2016/4/20 대학로에서', 4, 'Y')",
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_t_05.jpg', '2016/4/20 대학로에서', 4, 'Y')",
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 3, 'truck03_t_02.jpg', '2016/8/10 보라매공원', 4, 'Y')",
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 3, 'truck03_t_03.jpg', '2016/8/10 보라매공원', 4, 'Y')",
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 4, 'truck03_t_04.jpg', '2016/8/10 보라매공원', 4, 'Y')",
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck04_t_02.jpg', '2017/3/29 잠실', 4, 'Y')",
		};

		MyJDBC db = null;
		Statement stmt = null;
		try{
			db = new MyJDBC();
			stmt = db.getSTMT();
			
			for(int i = 0 ; i < insertTruckImg.length ; i++){
				stmt.execute(insertTruckImg[i]);
			}
			System.out.println("******* 트럭 사진 테이블 입력 완료 **********");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				db.close(stmt);
				db.close(db.con);
			}
			catch(Exception ef){
				ef.printStackTrace();
			}
		}
	}

}

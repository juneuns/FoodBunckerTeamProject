package SQL;

import java.sql.Statement;

public class InsertMenu {

	public InsertMenu() {
		String[] insertM ={
				/*
				 * 1 : 쉐프컵밥
				 * 2 : cicago moons
				 * 3 : 남포동 씨앗호떡
				 * 4 : 타이푸드
				 * 5 : 청년반점
				 * 6 : 이태리 화덕 피자
				 * 7 : 섬버거
				 * 8 : 그릴 타이
				 */
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 1, '매운갈비', 4500,'LA식 갈비에 매콤한 맛을 더한 컵밥', 'truck01_m_01.jpg', 'M','#비프스테이크#볶음밥#비빕밥#비밥#소고기#컵밥', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 1, '새우덮밥', 4500,'싱싱한 새우를 살짝 데쳐 야채와 함께먹는 다이어트 식단', 'truck01_m_02.jpg', 'S','#새우#볶음밥#야채#다이어트#컵밥', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 1, '제육덮밥', 4500,'묵은지와 제육의 조합, 너무 맛있어요', 'truck01_m_03.jpg', 'S','#제육#볶음밥#비빕밥#김치#컵밥', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 1, '김치덮밥', 4500,'어머니의 손맛이 그리워지는 맛', 'truck01_m_04.jpg', 'S','#김치#볶음밥#비빕밥#엄마#컵밥', 'Y')",

				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 2, '찹스테이크', 13500,'1++등급 한우의 안심을 사용한 부드러운 맛', 'truck02_m_01.jpg', 'M','#비프스테이크#시카고#스테이크#소고기', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 2, '시카고립', 12500,'1++등급 한우의 등심을 사용하여 소고기의 참맛을 느낄 수 있습니다.', 'truck02_m_02.jpg', 'S','#등심#한우#스테이크#소고기#시카고', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 2, '시카고살치스테이크', 15500,'1++등급 한우의 살치살을 이용한 요리', 'truck02_m_03.jpg', 'S','#살치살#스테이크#시카고#소고기', 'Y')",

				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 3, '씨앗호떡', 3500,'견과류가 풍부한 명물 호떡', 'truck03_m_01.jpg', 'M','#견과류#땅콩#호두#호떡#씨앗#남포동', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 3, '옛날호떡', 3000,'옛날식으로 만든 평범하지만 잊지 못하는 맛', 'truck03_m_02.jpg', 'S','#예날#호떡#남포동', 'Y')",

				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 4, '타이피자', 8000,'부드롭고 쫄깃한 타이 곡식을 사용한 도우와 그 안에 딸기쨈을 넣은 요리', 'truck04_m_01.jpg', 'M','#타이#태국#피자#딸기', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 4, '타이누들', 5000,'다진 돼지고기와 각종야채를 넣어 기름에 튀겨 담백한 타이 요리', 'truck04_m_02.jpg', 'S','#돼지고기#야채#타이#태국#튀김#새콤달콤', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 4, '연어 훈제', 6500,'훈제 연어와 새콤달콤한 소스, 야채와의 환상적인 조합', 'truck04_m_03.jpg', 'S','#연어#달콤#태국#타이#새콤', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 4, '스테이크 누들', 8000,'타이 누들에 부드러운 안심이 곁들어진 한국식 요리', 'truck04_m_04.jpg', 'S','#연어#달콤#태국#타이#새콤', 'Y')",
				
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 5, '동파육', 8000,'정통 중국식으로 만든 동파육, 참맛을 느끼실 수 있습니다.', 'truck05_m_01.jpg', 'M','#동파육#중국요리#중국', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 5, '크림새우', 7000,'중국의 칠리새우에서 소스를 크림으로 바꾼 담백한 새우요리', 'truck05_m_02.jpg', 'S','#새우#크림#담백한', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 5, '청년자장면', 4000,'야채를 따로 볶아 각각 야채 고유의 맛을 느끼실 수 있습니다.', 'truck05_m_03.jpg', 'S','#자장면#야채#중국요리', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 5, '청년짬뽕', 5000,'돼지고기를 큼직하게 썰어 넣어 또다른 맛의 한국식 짬뽕', 'truck05_m_04.jpg', 'S','#짬뽕#얼큰#중국요리#돼지고기', 'Y')",
				
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '베이컨 피자', 9000,'베이컨과 방울토마토를 올린 기본적인 피자', 'truck06_m_01.jpg', 'M','#피자#화덕#화덕피자#베이컨', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '씬 피자', 7000,'도우를 얇게 하여 바삭함을 가지고 있는 피자', 'truck06_m_02.jpg', 'S','#피자#화덕#화덕피자#씬', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '마늘 피자', 8000,'구운 마늘을 올려 느끼함을 없앤 어른신을 위한 피자', 'truck06_m_03.jpg', 'S','#피자#화덕#화덕피자#마늘', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '이탈리안 피자', 8000,'장통 이탈리안 식으로 화덕에서 구운 피자', 'truck06_m_04.jpg', 'S','#피자#화덕#화덕피자#이탈리아', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '고구마 피자', 8000,'곱게 갈은 고구마를 듬뿍 올려 달콤한  피자', 'truck06_m_05.jpg', 'S','#피자#화덕#화덕피자#고구마', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '감자 피자', 8000,'얇게 썬 감자를 올려 감자를 좋아하시는 분을 위한 피자', 'truck06_m_06.jpg', 'S','#피자#화덕#화덕피자#감자', 'Y')",
				
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 7, '섬버거', 10000,'수제 와퍼, 빵, 데친 야채를 넣은 최고의 수제버거', 'truck07_m_01.jpg', 'M','#햄버거#와퍼#섬버거#수제', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 7, '미니버거', 6000,'크기를 줄여 칼로리가 적은 다이어트 버거', 'truck07_m_02.jpg', 'S','#햄버거#와퍼#섬버거#수제#다이어트', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 7, '토마토피자', 8000,'싱싱한 토마토를 갈아 소고기 와퍼와 조화를 이룬 버거', 'truck07_m_03.jpg', 'S','#햄버거#와퍼#섬버거#수제#토마토', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 7, '빅버거', 13000,'소고기 와퍼와 불고기 와퍼를 함께 넣은 정말 큰 버거', 'truck07_m_04.jpg', 'S','#햄버거#와퍼#섬버거#수제#빅버거', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 7, '한우 버거', 13000,'1++등급 한우 살치살 100%로 만든 고급 버거', 'truck07_m_04.jpg', 'S','#햄버거#와퍼#섬버거#수제#소고기', 'Y')",
				
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 8, '타이누들', 8000,'정통 타이 국수', 'truck08_m_01.jpg', 'M','#타이#누들#태국', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 8, '타이스테이크', 12000,'태국식 소고기 스테이크', 'truck08_m_02.jpg', 'S','#타이#태국#스테이크', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 8, '타이볶음', 4000,'야채와 각종 해산물을 함께 볶은 타이 전통 요리', 'truck08_m_03.jpg', 'S','#타이#태국#야채', 'Y')"
				
		};
		
		MyJDBC db = null;
		Statement stmt = null;
		try{
			db = new MyJDBC();
			stmt = db.getSTMT();
			
			for(int i = 0 ; i < insertM.length ; i++){
				stmt.execute(insertM[i]);
			}
			System.out.println("******* 트럭 메뉴 테이블 입력 완료 **********");
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

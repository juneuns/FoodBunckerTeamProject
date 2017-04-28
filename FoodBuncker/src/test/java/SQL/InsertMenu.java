package SQL;

import java.sql.Statement;

public class InsertMenu {

	public InsertMenu() {
		String[] insertM ={
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 1, '비밥', 4500,'비프 컵밥', 'truck01_mm_01.jpg', 'M','#비프스테이크#볶음밥#비빕밥#비밥#소고기#컵밥', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 1, '핫밥', 4500,'매운 제육 컵밥', 'truck01_m_01.jpg', 'S','#제육볶음#볶음밥#비빕밥#비밥#매운#컵밥', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 1, '꼬꼬밥', 4500,'치킨 컵밥', 'truck01_m_02.jpg', 'S','#치킨#볶음밥#비빕밥#비밥#컵밥', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 1, '누들밥', 4500,'잡채 컵밥', 'truck01_m_03.jpg', 'S','#잡채#볶음밥#비빕밥#비밥#컵밥', 'Y')",

				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 2, '시카고스테이크', 13500,'시카고스테이크', 'truck02_mm_01.jpg', 'M','#비프스테이크#시카고#스테이크#소고기', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 2, '시카고립', 12500,'갈비 스테이크???', 'truck02_m_01.jpg', 'S','#갈비#립#스테이크#소고기#시카고', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 2, '시카고살치스테이크', 15500,'살치살 스테이크', 'truck0_m_02.jpg', 'S','#살치살#스테이크#시카고#소고기', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 2, '시카고안심스테이크', 18000,'안심 스테이크', 'truck02_m_03.jpg', 'S','#안심#스테이크#시카고#소고기', 'Y')",

				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 3, '씨앗호떡', 3500,'견과류가 풍부한 명물 호떡', 'truck03_mm_01.jpg', 'M','#견과류#땅콩#호두#호떡#씨앗#남포동', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 3, '타코야끼', 4500,'문어향이 풍부한 타코야끼', 'truck03_m_01.jpg', 'S','#문어#타코야끼#일식#호떡#남포동', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 3, '호떡', 3500,'언제 먹어도 맛있는 호떡', 'truck03_m_02.jpg', 'S','#호떡#남포동#땅콩', 'Y')",

				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 4, '타이세트', 8000,'부드롭고 쫄깃한 쌀국수면 바삭바삭한 타이스프링롤의 환상적인 만남', 'truck04_mm_01.jpg', 'M','#타이#태국#쌀국수#새우#스프링롤', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 4, '타이스프링롤', 4000,'다진 돼지고기와 각종야채를 넣어 기름에 튀겨 새콤달콤한 소스에 찍어 먹는 바삭한 애피타이저', 'truck04_m_02.jpg', 'S','#돼지고기#야채#타이#태국#튀김#새콤달콤', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 4, '새우 팟타이', 6500,'새우, 숙주를 넣고 볶은 태국의 대표적 쌀국수 볶음요리', 'truck04_m_02.jpg', 'S','#새우#숙주#태국#타이#쌀국수#볶음요리', 'Y')",
				
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 5, '카페 에스프레소', 2000,'이탈리아 정통 에스프레소', 'truck05_mm_01.jpg', 'M','#이탈리아#커피#에스프레소#attibassi#원두', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 5, '카페 아메리카노', 2000,'커피 향이 풍부한 아메리카노', 'truck05_m_01.jpg', 'S','#이탈리아#커피#아메리카노#attibassi#원두', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 5, '카페 라떼', 3000,'누구나 좋아하는 카페 라떼', 'truck05_m_02.jpg', 'S','#이탈리아#커피#카페라떼#attibassi#원두', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 5, '카라멜 마끼아또', 3500,'카라멜향이 첨가된 마끼아또', 'truck05_m_03.jpg', 'S','#이탈리아#커피#카라멜#마끼아또#attibassi#원두', 'Y')",
				
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '로보 버거', 4000,'로보 직화구이 정통 햄버거', 'truck06_mm_01.jpg', 'M','#버거#햄버거#로보#직화구이', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '로보 새우 버거', 4000,'새우의 맛을 제대로 느낄 수 있는 새우버거', 'truck06_m_02.jpg', 'S','#버거#햄버거#로보#직화구이#새우', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '로보 치킨 버거', 4000,'겉은 바삭 속은 치킨 로보 치킨 버거', 'truck06_m_03.jpg', 'S','#버거#햄버거#로보#직화구이#치킨', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 6, '로보 핫도그', 5000,'수제 햄과 싱싱한 야채가 어우러진 로보 핫도그', 'truck06_m_04.jpg', 'S','#버거#햄버거#로보#직화구이#핫도그#수제햄', 'Y')",
				
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 7, '마르가리따', 10000,'이탈리아 정통 피자 마르가리따', 'truck07_mm_01.jpg', 'M','#이탈리아#파자#마르가리따#치즈', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 7, '치즈피자', 14000,'치즈향이 풍부한 치즈피자', 'truck07_m_01.jpg', 'S','#이탈리아#파자#마르가리따#치즈#치즈피자#모짜렐라', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 7, '불고기피자', 14000,'달콤한 파인애플과 불고기가 첨가된 불고기 피자', 'truck07_m_02.jpg', 'S','#이탈리아#파자#불고기#파인애플#치즈#불고기피자', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 7, '쏘핫치킨', 13000,'매콤한 소스와 치킨의 만남 쏘핫치킨', 'truck07_m_03.jpg', 'S','#이탈리아#파자#쏘핫#치즈#매콤#치킨', 'Y')",
				
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 8, '야끼소바', 10000,'정통 일본식 야끼소바', 'truck08_mm_01.jpg', 'M','#일본#일식#야끼소바#면#야채', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 8, '타코야끼', 4000,'특재 소스와 문어맛이 풍부한 타코야끼', 'truck08_m_01.jpg', 'S','#일본#일식#문어#타코야끼', 'Y')",
				"INSERT INTO Menu VALUES((SELECT NVL(MAX(M_No), 0) + 1 FROM Menu), 8, '새우튀김', 4000,'바삭한 튀김옷과 새우가 어울어진 환상의 새우튀김', 'truck08_m_02.jpg', 'S','#일식#새우#튀김#바삭', 'Y')"
				
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

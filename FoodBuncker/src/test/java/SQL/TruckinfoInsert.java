package SQL;

import java.sql.Statement;

public class TruckinfoInsert {

	public TruckinfoInsert() {
		
		/*
			일련번호
			사업주이름
			트럭명
			휴대폰번호
			개업일
			이메일주소
			사업자번호
			아이디
			패스워드
			키워드
			트럭설명
			활성여부
		 */
		String[] insertTruck = {
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '최명수', '컵밥', '010-2764-8976', '2017-03-25', 'cupbop@foodtruck.com', '135-76-901', 'chef01', '1111', '#컵밥#비밥#핫밥#꼬꼬밥#누들밥#비프#매운#제육#살치킨#잡채', '퓨전요리를 푸드트럭에서 맛보세요!', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '김남길', 'CHICAGO MOONS', '010-3578-2468', '2017-01-05', 'chicago@foodtruck.com', '145-25-678','chef02', '1111', '#DJ#스테이크#소고기#시카고#chicago#살치살', '최고의 요리사가 제공하는 스테이크를 맛보세요!', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '박선생', '남포동 씨앗 호떡', '010-5432-9876', '2017-02-17', 'nampo@foodtruck.com', '125-75-234','chef03', '1111', '#부산#남포동#호떡#일식#문어#타코야끼#씨앗', '각정 견과류가 주는 영양 만점 씨앗 호떡', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '이지우', '타이푸드', '010-2473-9987', '2017-03-24', 'taifood@foodtruck.com', '153-25-234','chef04', '1111', '#타이#새우#팟타이#타이팟타이#타이셋트#태국음식', '다채로운 미각의 향연', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '정다운', 'PTurn House', '010-1234-1234', '2017-04-12', 'pturn@foodtruck.com', '114-46-123','chef05', '1111', '#coffee#커피#에스프레소#italiano#attibasi#원두#정통이탈리안', '피턴하우스는 이탈리아 정통 Attibasi 원두를 사용합니다.', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '로버트장', 'The Lobos Truck', '010-8974-1757', '2017-01-27', 'lobos@foodtruck.com', '109-78-675','chef06', '1111', '#햄버거#새우버거#함박스테이크#빅버거#셀러드#불고기#치킨버거#치킨', '직접 제작한 최고의 소스로 찾아갑니다.', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '최사장', 'Simply Pissa', '010-1789-3456', '2017-02-25', 'pissa@foodtruck.com', '190-90-999','chef07', '1111', '#피자#마르가리따#정통이탈리안#모짜렐라', '정통 이탈리안 피자를 맛보세요!', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '윤대표', '아빠의 부엌', '010-5555-5555', '2017-04-17', 'daddystruck@foodtruck.com', '134-56-789','chef08', '1111', '#놀라운#아빠의부엌#푸드트럭#일식전문#일식#타코야끼#야끼소바#서강대#축제때#dad#kitchen', '정통 일식 요리사가 당신의 곁으로 찾아갑니다.', 'Y')"
		};
		

		
		MyJDBC db = null;
		Statement stmt = null;
		try{
			db = new MyJDBC();
			stmt = db.getSTMT();
			
			for(int i = 0 ; i < insertTruck.length ; i++){
				stmt.execute(insertTruck[i]);
			}
			System.out.println("******* 트럭 정보 테이블 입력 완료 **********");
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

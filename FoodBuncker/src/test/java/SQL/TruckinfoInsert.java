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
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '최명수', '쉐프  컵밥', '010-2764-8976', '2016-01-01', 'cupbop@foodtruck.com', '135-76-901', 'chef01', '1111', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '김남길', 'CHICAGO MOONS', '010-3578-2468', '2016-01-01', 'chicago@foodtruck.com', '145-25-678','chef02', '1111','Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '박선생', '남포동 씨앗 호떡', '010-5432-9876', '2016-01-01', 'nampo@foodtruck.com', '125-75-234','chef03', '1111','Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '이지우', '타이푸드', '010-2473-9987', '2015-01-01', 'taifood@foodtruck.com', '153-25-234','chef04', '1111', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '정다운', '청년반점', '010-1234-1234', '2015-01-01', 'pturn@foodtruck.com', '114-46-123','chef05', '1111','Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '로버트장', '이태리 화덕피자', '010-8974-1757', '2015-01-01', 'lobos@foodtruck.com', '109-78-675','chef06', '1111', 'Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '이송이', '섬버거', '010-1789-3456', '2015-01-01', 'pissa@foodtruck.com', '190-90-999','chef07', '1111','Y')",
				"INSERT INTO TRUCKINFO VALUES((SELECT NVL(MAX(T_No), 0) + 1 FROM TruckInfo), '윤대표', '그릴 타이', '010-5555-5555', '2015-01-01', 'daddystruck@foodtruck.com', '134-56-789','chef08', '1111', 'Y')"
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

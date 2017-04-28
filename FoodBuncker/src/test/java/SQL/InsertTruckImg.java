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
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 1, 'truck01_t_01.jpg', '컵밥 푸드트럭 이미지', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_t_01.jpg', 'CHICAGO MOONS 푸드트럭 이미지', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 3, 'truck03_t_01.jpg', '남포동 씨앗 호떡 푸드트럭 이미지', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 4, 'truck04_t_01.jpg', '타이푸드 푸드트럭 이미지', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 5, 'truck05_t_01.jpg', 'PTurn House 푸드트럭 이미지', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 6, 'truck06_t_01.jpg', 'The Lobos Truck 푸드트럭 이미지', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 7, 'truck07_t_01.jpg', 'Simply Pissa 푸드트럭 이미지', 1, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 8, 'truck08_t_01.jpg', '아빠의 부엌 푸드트럭 이미지', 1, 'Y')", 
				//  쉐프이미지
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 1, 'truck01_c_01.jpg', '컵밥 쉐프 이미지', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_c_01.jpg', 'CHICAGO MOONS 쉐프 이미지', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 3, 'truck03_c_01.jpg', '남포동 씨앗 호떡 쉐프 이미지', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 4, 'truck04_c_01.jpg', '타이푸드 쉐프 이미지', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 5, 'truck05_c_01.jpg', 'PTurn House 쉐프 이미지', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 6, 'truck06_c_01.jpg', 'The Lobos Truck 쉐프 이미지', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 7, 'truck07_c_01.jpg', 'Simply Pissa 쉐프 이미지', 2, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 8, 'truck08_c_01.jpg', '아빠의 부엌 쉐프 이미지', 2, 'Y')", 
				// 일반 이미지
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 1, 'truck01_o_01.jpg', '컵밥 일반 이미지', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 2, 'truck02_o_01.jpg', 'CHICAGO MOONS 일반 이미지', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 3, 'truck03_o_01.jpg', '남포동 씨앗 호떡 일반 이미지', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 4, 'truck04_o_01.jpg', '타이푸드 일반 이미지', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 5, 'truck05_o_01.jpg', 'PTurn House 일반 이미지', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 6, 'truck06_o_01.jpg', 'The Lobos Truck 일반 이미지', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 7, 'truck07_o_01.jpg', 'Simply Pissa 일반 이미지', 3, 'Y')", 
				"INSERT INTO TRUCKIMAGE VALUES((SELECT NVL(MAX(TI_No), 0) + 1 FROM TruckImage), 8, 'truck08_o_01.jpg', '아빠의 부엌 일반 이미지', 3, 'Y')"
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

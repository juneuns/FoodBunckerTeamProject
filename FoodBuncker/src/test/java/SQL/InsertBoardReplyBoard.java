package SQL;

import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class InsertBoardReplyBoard {
	ArrayList<String> list = new ArrayList<>();
	String sql;
	MyJDBC db = null;
	Statement stmt = null;
	/*-board-
	 * no,
	 * t_no,
	 * body,
	 * date,
	 * isshow
	 * 
	 * -replyboard-
	 * no,
	 * b_no,
	 * date,
	 * isshow
	 */
	
	public InsertBoardReplyBoard(){
		String[] review = {
			"생긴지는 조금 됐는데 가봐야지 하면서 이제서야 갔네요.",
			"가족끼리 또는 친구, 연인이랑 함께 가셔서 드셔보시는 것도 좋을 것 같아요!",
			"주문하고 얼마 지나지 않아 음식이 나왔습니다~",
			"너무 많있습니다. 강추합니다.",
			"이쁜 액자도 센스있게 걸려있어요",
			"약간 아쉬운 것은 양이 적다는 겁니다. 그 외에는 모두 만족합니다.",
			"한입 먹어보고 나서야 알게 됬습니다. 지금까지 맛보지 못한 새로운 맛, 절대 후회하지 않습니다.",
			"매운거 좋아하고 잘 드시는 분에게는 강추, 하지만 아니신 분에게는 비추",
			"제 생일날 친구들과 함께 모여 갔습니다. 간단하지만 고급 레스토랑에서 먹는 것과 거의 같아서 분위기 한 번 냈습니다.",
			"생소해서 가 볼 생각을 안했었지만 어제는 좀 볼륨있는 음식이 생각나서 첫방문을 해보았네요. 너무 좋았어요.",
			"실제로 정성이 소담스레 담겨있다. 식재료도 좋은 편이고. 비주얼도 좋고.그래서 줄서서 먹는 걸지도 모르지.",
			"안 어울릴 것 같은데 은근히 어울리고 많으면 느끼하거나 질릴지도 모르는데 약간 아쉬울 정도로 양이 적어 정말 딱 적당합니다.",
			"먹으면 든든하고 따뜻한 그런 맛...",
			"오픈형 주방이라 깔끔한지, 어떻게 요리하는지 꽤 보이더라구요.",
			"이러니 저러니 해도 아직 인기가 여전하네요. 방문하신 분들의 평은 극과 극으로 갈리지만 저는 좋아하는 쪽에 속합니다.",
			"비록 사람이 많아 줄도 서야하고 시장통 같지만 딱 입으로 먹어보는 순간, 오로지 음식에 집중하게 되더군요. 너무 맛있습니다.",
			"다른 곳에서 먹어본 기억이 있지만 아삭아삭 씹는 맛이랑 소스가 다르게 느껴졌습니다.",
			"짧은 점심시간에 딱 적당한 메뉴들로 채워져 있어 자주 사용합니다. 오늘도 너무 맛있게 잘 먹었습니다.",
			"한참 주변 구경하다가 배에서 꼬르륵...가장 맛있어 보이는 이 곳을 찾았습니다. 맛은 그럭저럭, 배는 빵빵해지네요.",
			"은근히 계속 땡기네. 매일 오지는 않을텐데, 내가 찾아봐야 하나.쉐프님, 자주 오세요.",
			"대한민국 국민들 입맛에 맞춘 퓨전 음식입니다. ",
			"맵고 짜고 자극적인 맛에 길들여져 있다가 여기서 먹어보고 재료 자체의 맛이 얼마나 좋은지 알게 됬습니다. 양념,소스는 거들 뿐, 진정한 맛은 재료에셔...",
			"이른 저녁을 해결하였는데 값은 조금 비쌌지만 맛과 양이 정말 좋고 많아서 만족스러운 저녁이었습니다.",
			"식기전에 뜨거울 때 먹어야 제 맛을 느낄 수 있습니다.",
			"쉐프님 너무 멋있어요.멋있는 쉐프님도 보고 맛있는 요리도 먹고 너무 좋습니다."
		};
		String[] reply = {
			"너무나 감사합니다. 또 찾아주세요.",
			"앞으로도 계속 연구하여 새로운 맛을 보여드리겠습니다. 감사합니다.",
			"항상 맛에 대한 욕심을 부리며 노력하겠습니다.",
			"앞으로 자주 찾아뵙겠습니다. 감사합니다.",
			"아직 부족합니다. 계속적으로 지켜봐 주세요."
		};
		/* review 25개
		 * reply 5개
		 */
		for(int i = 1; i < 9 ; i++){
			LocalDate date = LocalDate.of(2015, 1, 1);
			for(int j = 0 ; j < 875 ; j++){
				int reviewNum = (int)(Math.random()*5);
				for(int k = 0 ; k < reviewNum ; k++){
					int reviewNo = (int)(Math.random()*25);
					int isReply = (int)(Math.random()*10);
					int replyNo = (int)(Math.random()*5);
					sql = "insert into board values((SELECT NVL(MAX(b_No), 0) + 1 FROM board),"+i+",'"+review[reviewNo]+"',to_date('"+date+"','YYYY-MM-DD'),'Y')";
					list.add(sql);
					if(isReply > 3){
						sql = "insert into replyboard values((SELECT NVL(MAX(rb_No), 0) + 1 FROM replyboard),(SELECT NVL(MAX(b_No), 0) FROM board),'"+reply[replyNo]+"',to_date('"+date+"','YYYY-MM-DD'),'Y')";
						list.add(sql);
					}
				}
				date = date.plusDays(1);
			}
		}
		
		try{
			db = new MyJDBC();
			stmt = db.getSTMT();
			
			list.stream().forEach(n->{
				try {
					stmt.execute(n);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});
			System.out.println("******* board, replyboard 입력 완료 **********");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
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

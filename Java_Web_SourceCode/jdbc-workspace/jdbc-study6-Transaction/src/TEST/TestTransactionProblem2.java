package TEST;

import java.sql.SQLException;

import model.CardDAO;

public class TestTransactionProblem2 {
	public static void main(String[] args) {
		try {
			CardDAO dao = new CardDAO();
			// gui에서 정보를 입력받아 전송할때 point type 데이터 누락 
			// 이 경우 card는 db에 등록되고 point는 실행중, error가 발생되어
			// db에 저장되지 않는다 - > 데이터 무결성 위배 
			dao.registerCardAndPoint("java","아이유",null,0);
			System.out.println("카드 발급 완료되어 택배발송");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

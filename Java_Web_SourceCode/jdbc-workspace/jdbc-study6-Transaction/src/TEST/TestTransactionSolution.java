package TEST;

import java.sql.SQLException;

import model.CardDAO2;

public class TestTransactionSolution {
	public static void main(String[] args) {
		try {
			CardDAO2 dao = new CardDAO2();
			// gui에서 정보를 입력받아 전송할때 point type 데이터 누락 
			// 이 경우 card는 db에 등록되고 point는 실행중, error가 발생되어
			// db에 저장되지 않는다 - > 데이터 무결성 위배 
			// 기존 DAO를 DAO2 에서는 트랜잭션 처리를 통해 
			// 문제 발생시 작업취소(ROLLBACK) 되게 하고 
			// 모든 작업이 정상적으로 수행 되었을때 DB에 반영 (COMMIT) 
			// 되도록 처리해서 데이터 무결성을 보장하게 한다. 
			dao.registerCardAndPoint("java","신현"
					+ "수","cgv",100);
			System.out.println("카드 발급 완료되어 택배발송");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

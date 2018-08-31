package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountVO;

public class TestAccountDAO2 {
	public static void main(String[] args) {

		try {
			AccountDAO dao = new AccountDAO();
			AccountVO vo = new AccountVO();
			try {
				dao.deposit(5, 1000); // 계좌번호가 틀렸을 때
				dao.deposit(1, 0); // 0원 이상 입금
				dao.deposit(1, 1000000); // 100만원원 입금 완료

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

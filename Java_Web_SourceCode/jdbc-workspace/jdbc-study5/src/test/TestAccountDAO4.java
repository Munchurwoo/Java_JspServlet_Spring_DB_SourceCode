package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountVO;

public class TestAccountDAO4 {
	public static void main(String[] args) {
		
		try {
			AccountDAO dao = new  AccountDAO();
			AccountVO vo = new AccountVO();
			try {
				dao.withdraw(7,123,20000); // 계좌 번호가 다름  
				dao.withdraw(1,123,20000); // 비밀번호 틀렸음 
				dao.withdraw(1,1234,20000); // 출금 완료 
				
				dao.openAccount("문철우", "1234", 1000);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}

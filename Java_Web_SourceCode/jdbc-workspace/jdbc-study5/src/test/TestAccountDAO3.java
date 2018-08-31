package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountVO;

public class TestAccountDAO3 {
	public static void main(String[] args) {
		
		try {
			AccountDAO dao = new  AccountDAO();
			AccountVO vo = new AccountVO();
			try {
				dao.checkBalance(1,1235); // 비밀번호 틀렸을 때 
				dao.checkBalance(2,1235); // 계좌가 존재 하지 않을 때
				dao.checkBalance(1,1234); // 완성되면 출력 
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}

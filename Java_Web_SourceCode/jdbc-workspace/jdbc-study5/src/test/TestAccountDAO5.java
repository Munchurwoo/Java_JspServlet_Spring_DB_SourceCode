package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountVO;

public class TestAccountDAO5 {
	public static void main(String[] args) {
		
		try {
			AccountDAO dao = new  AccountDAO();
			AccountVO vo = new AccountVO();
			try {
				
				dao.transfer(18,2,123,5000); // 계좌번호 잘못 입력   
				dao.transfer(1,2,1234,100000000);// 잔액이 부족하여 이체 불가 
				dao.transfer(2,1,1234,5000); // 이체 완료   
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}

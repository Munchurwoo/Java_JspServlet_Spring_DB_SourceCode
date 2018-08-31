package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.NotMatchedPasswordException;
import model.AccountNotFoundException;
import model.InsufficientBalanceException;
import model.NoMoneyException;
//step5 계좌이체 테스트 
public class TestUnit5 {
	public static void main(String[] args) {		
			try {
				AccountDAO dao = new AccountDAO();
				dao.transfer("1","1234","2",180);
				System.out.println("이체 완료");			
			} catch (ClassNotFoundException e) {				
				e.printStackTrace();
			} catch (NoMoneyException e) {
				System.out.println(e.getMessage());
			} catch (SQLException e) {				
				e.printStackTrace();
			} catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			} catch (NotMatchedPasswordException e) {
				System.out.println(e.getMessage());
			}				
		
	}
}

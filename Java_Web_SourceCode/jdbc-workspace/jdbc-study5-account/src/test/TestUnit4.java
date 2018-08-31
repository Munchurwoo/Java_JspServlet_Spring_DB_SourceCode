package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountNotFoundException;
import model.NotMatchedPasswordException;
import model.InsufficientBalanceException;
import model.NoMoneyException;
//step4 출금 테스트 
public class TestUnit4 {
	public static void main(String[] args) {		
		try {
			AccountDAO dao = new AccountDAO();
			dao.withdraw("1","1234", 20);
			System.out.println("정상출금처리");				
		}catch (NoMoneyException e) {			
			System.out.println(e.getMessage());	
		}catch (NotMatchedPasswordException e) {				
			System.out.println(e.getMessage());		
		}catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());	
		}catch (SQLException e) {		
			e.printStackTrace();
		}catch (ClassNotFoundException e) {			
			e.printStackTrace();	
		} catch (AccountNotFoundException e) {
			e.printStackTrace();
		} 
	}
}

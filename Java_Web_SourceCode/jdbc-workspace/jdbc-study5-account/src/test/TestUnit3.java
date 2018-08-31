package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountNotFoundException;
import model.NoMoneyException;
//step3 입금 테스트 
public class TestUnit3 {
	public static void main(String[] args) {		
		try {
			AccountDAO dao = new AccountDAO();
			dao.deposit("1", 200);
			System.out.println("정상입금처리");
		}catch (AccountNotFoundException e) {				
			System.out.println(e.getMessage());			
		}catch (NoMoneyException e) {			
			System.out.println(e.getMessage());	
		}catch (SQLException e) {		
			e.printStackTrace();
		}catch (ClassNotFoundException e) {			
			e.printStackTrace();	
		}
	}
}

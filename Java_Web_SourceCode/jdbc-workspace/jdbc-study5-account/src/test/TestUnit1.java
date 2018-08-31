package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountVO;
import model.CreateAccountException;
// step1. 계좌 개설 단위 테스트 
public class TestUnit1 {
	public static void main(String[] args) {
		try {
			AccountDAO dao=new AccountDAO();			
			//개설할 계좌 정보
			AccountVO vo=new AccountVO("박보검","4321",1000);			
			try{
			dao.createAccount(vo);
			System.out.println("계좌 개설 성공");
			}catch(CreateAccountException se){
				System.out.println(se.getMessage());
			}			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
}














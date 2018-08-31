package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountVO;
import model.CreateAccountException;
// step1. ���� ���� ���� �׽�Ʈ 
public class TestUnit1 {
	public static void main(String[] args) {
		try {
			AccountDAO dao=new AccountDAO();			
			//������ ���� ����
			AccountVO vo=new AccountVO("�ں���","4321",1000);			
			try{
			dao.createAccount(vo);
			System.out.println("���� ���� ����");
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














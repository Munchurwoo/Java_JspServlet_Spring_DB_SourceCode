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
				dao.withdraw(7,123,20000); // ���� ��ȣ�� �ٸ�  
				dao.withdraw(1,123,20000); // ��й�ȣ Ʋ���� 
				dao.withdraw(1,1234,20000); // ��� �Ϸ� 
				
				dao.openAccount("��ö��", "1234", 1000);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}

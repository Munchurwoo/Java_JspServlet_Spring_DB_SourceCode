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
				dao.checkBalance(1,1235); // ��й�ȣ Ʋ���� �� 
				dao.checkBalance(2,1235); // ���°� ���� ���� ���� ��
				dao.checkBalance(1,1234); // �ϼ��Ǹ� ��� 
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}

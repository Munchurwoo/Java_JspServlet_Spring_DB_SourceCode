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
				
				dao.transfer(18,2,123,5000); // ���¹�ȣ �߸� �Է�   
				dao.transfer(1,2,1234,100000000);// �ܾ��� �����Ͽ� ��ü �Ұ� 
				dao.transfer(2,1,1234,5000); // ��ü �Ϸ�   
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}

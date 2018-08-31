package test;

import java.sql.SQLException;

import model.AccountDAO;
import model.AccountVO;

public class TestAccountDAO2 {
	public static void main(String[] args) {

		try {
			AccountDAO dao = new AccountDAO();
			AccountVO vo = new AccountVO();
			try {
				dao.deposit(5, 1000); // ���¹�ȣ�� Ʋ���� ��
				dao.deposit(1, 0); // 0�� �̻� �Ա�
				dao.deposit(1, 1000000); // 100������ �Ա� �Ϸ�

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

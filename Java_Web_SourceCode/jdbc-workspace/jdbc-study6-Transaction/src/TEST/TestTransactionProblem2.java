package TEST;

import java.sql.SQLException;

import model.CardDAO;

public class TestTransactionProblem2 {
	public static void main(String[] args) {
		try {
			CardDAO dao = new CardDAO();
			// gui���� ������ �Է¹޾� �����Ҷ� point type ������ ���� 
			// �� ��� card�� db�� ��ϵǰ� point�� ������, error�� �߻��Ǿ�
			// db�� ������� �ʴ´� - > ������ ���Ἲ ���� 
			dao.registerCardAndPoint("java","������",null,0);
			System.out.println("ī�� �߱� �Ϸ�Ǿ� �ù�߼�");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

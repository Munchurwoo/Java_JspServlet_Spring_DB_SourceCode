package TEST;

import java.sql.SQLException;

import model.CardDAO2;

public class TestTransactionSolution {
	public static void main(String[] args) {
		try {
			CardDAO2 dao = new CardDAO2();
			// gui���� ������ �Է¹޾� �����Ҷ� point type ������ ���� 
			// �� ��� card�� db�� ��ϵǰ� point�� ������, error�� �߻��Ǿ�
			// db�� ������� �ʴ´� - > ������ ���Ἲ ���� 
			// ���� DAO�� DAO2 ������ Ʈ����� ó���� ���� 
			// ���� �߻��� �۾����(ROLLBACK) �ǰ� �ϰ� 
			// ��� �۾��� ���������� ���� �Ǿ����� DB�� �ݿ� (COMMIT) 
			// �ǵ��� ó���ؼ� ������ ���Ἲ�� �����ϰ� �Ѵ�. 
			dao.registerCardAndPoint("java","����"
					+ "��","cgv",100);
			System.out.println("ī�� �߱� �Ϸ�Ǿ� �ù�߼�");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

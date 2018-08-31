package step2;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;

/*
 * id (primary key)�� ȸ�������� �˻��ϴ� ����� �׽�Ʈ 
 */
public class TestFindMemberById {
	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			String id ="java";
			MemberVO member =dao.findMemberById(id);
			System.out.println(member.getId()+" "+ member.getPassword()+" "+member.getName()+" "+member.getAddress());// �����ϸ� ȸ������ ������, ���� x�� null
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

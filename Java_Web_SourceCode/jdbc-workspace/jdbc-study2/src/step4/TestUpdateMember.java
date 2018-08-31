package step4;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;

public class TestUpdateMember {
	public static void main(String[] args) {
		try {
			MemberVO vo = new MemberVO("spring", "4321", "���μ�", "����");
			MemberDAO dao = new MemberDAO();			
			System.out.println("���� �� :"+dao.findMemberById(vo.getId()));
			//id �� ��ġ�ϴ� ȸ���� password, name, address �� ������Ʈ 
			dao.updataMember(vo);
			System.out.println("���� �� :"+dao.findMemberById(vo.getId()));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

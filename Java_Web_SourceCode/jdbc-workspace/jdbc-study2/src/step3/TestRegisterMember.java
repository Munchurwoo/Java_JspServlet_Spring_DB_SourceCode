package step3;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;

/*
 * member table�� ȸ�������� �����ϴ� ����  
 */
public class TestRegisterMember {
	public static void main(String[] args) {	
		try {
			MemberDAO dao = new MemberDAO();
			MemberVO vo = new MemberVO("spring","abcd","������","�λ�");
			if(dao.findMemberById(vo.getId())==null) {
				dao.registerMember(vo);
				System.out.println(vo.getName()+"�� ȸ����� �Ǿ����ϴ�. ");
			}else {
				System.out.println("���̵� �ߺ� �Ǿ� ȸ����� �Ұ� ");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

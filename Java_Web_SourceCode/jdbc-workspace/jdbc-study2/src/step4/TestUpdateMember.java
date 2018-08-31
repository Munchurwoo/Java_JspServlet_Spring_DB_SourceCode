package step4;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;

public class TestUpdateMember {
	public static void main(String[] args) {
		try {
			MemberVO vo = new MemberVO("spring", "4321", "강민성", "성남");
			MemberDAO dao = new MemberDAO();			
			System.out.println("수정 전 :"+dao.findMemberById(vo.getId()));
			//id 와 일치하는 회원의 password, name, address 를 업데이트 
			dao.updataMember(vo);
			System.out.println("수정 후 :"+dao.findMemberById(vo.getId()));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

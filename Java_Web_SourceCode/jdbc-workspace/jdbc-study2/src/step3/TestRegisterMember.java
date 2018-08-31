package step3;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;

/*
 * member table에 회원정보를 저장하는 예제  
 */
public class TestRegisterMember {
	public static void main(String[] args) {	
		try {
			MemberDAO dao = new MemberDAO();
			MemberVO vo = new MemberVO("spring","abcd","강동원","부산");
			if(dao.findMemberById(vo.getId())==null) {
				dao.registerMember(vo);
				System.out.println(vo.getName()+"님 회원등록 되었습니다. ");
			}else {
				System.out.println("아이디가 중복 되어 회원등록 불가 ");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

package step2;

import java.sql.SQLException;

import model.MemberDAO;
import model.MemberVO;

/*
 * id (primary key)로 회원정보를 검색하는 기능을 테스트 
 */
public class TestFindMemberById {
	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			String id ="java";
			MemberVO member =dao.findMemberById(id);
			System.out.println(member.getId()+" "+ member.getPassword()+" "+member.getName()+" "+member.getAddress());// 존재하면 회원정보 나오고, 존재 x면 null
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

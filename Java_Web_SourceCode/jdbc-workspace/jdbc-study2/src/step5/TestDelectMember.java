package step5;

import java.sql.SQLException;

import model.MemberDAO;

public class TestDelectMember {
	public static void main(String[] args) {
		
	MemberDAO dao;
	try {
		dao = new MemberDAO();
		String id = "spring";
		System.out.println("삭제전 : "+dao.findMemberById(id));
		dao.deleteMemberById(id);
		System.out.println("삭제후 : "+dao.findMemberById(id));
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}	
}

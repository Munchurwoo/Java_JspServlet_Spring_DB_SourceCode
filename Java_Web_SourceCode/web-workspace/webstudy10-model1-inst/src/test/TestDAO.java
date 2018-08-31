package test;

import model.MemberDAO;

public class TestDAO {
	public static void main(String[] args) {
		try {
			//Singleton 패턴이 적용되었으므로 객체 생성 할 수 없다 
			//MemberDAO dao=new MemberDAO();
			MemberDAO dao=MemberDAO.getInstance();
			//System.out.println(dao.getMemberTotalCount());
			System.out.println(dao.findMemberById("java"));
			System.out.println(dao.findMemberById("test"));
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
}







package step1;

import java.sql.SQLException;
import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;

public class TestSelectMember {
	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			ArrayList<MemberVO> list = dao.getAllMemberList();
			for(int i =0;i< list.size();i++)
				System.out.println(list.get(i).getId()+" "+list.get(i).getPassword()+" "+
						list.get(i).getAddress()+" "+list.get(i).getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

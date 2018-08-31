package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import model.MemberDAO;

public class TestGroupBy2 {
	public static void main(String[] args) {
		try {
			MemberDAO dao = new MemberDAO();
			ArrayList<HashMap<String,String>> list= 
					dao.getMemberCountAndAddressList();
			for(HashMap<String,String> map : list) {
				System.out.println(map.get("address")+ " "+map.get("memberCount")+"Έν");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestGroupBy2 {
	public static void main(String[] args) {
		try {
			MemberDAO dao=new MemberDAO();
			ArrayList<HashMap<String,String>> list
			=dao.getMemberCountAndAddressList();
			for(HashMap<String,String> map:list) {
				System.out.println(map.get("address")+" "
			+map.get("memberCount")+"Έν");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}







package org.kosta.model;

public class MockDAO {
	
	public String findUserInfo(String id) {
		String userInfo=null;
		System.out.println(id);
		
		if(id!=null&&id.equals("java"))
			userInfo="아이유 판교 ";
		return userInfo;
	}
}

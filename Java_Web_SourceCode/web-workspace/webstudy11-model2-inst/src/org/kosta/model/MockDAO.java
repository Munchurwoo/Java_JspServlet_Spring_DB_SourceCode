package org.kosta.model;
// 테스트를 위한 가짜 DAO 
// Singleton Design Pattern을 적용해 본다 
public class MockDAO {
	private static MockDAO instance=new MockDAO();
	private MockDAO() {}
	public static MockDAO getInstance() {
		return instance;
	}
	public String findInfoById(String id) {
		// db 연동을 가정 
		if(id.equals("java"))
			return "아이유 판교";
		return null;
	}
	public void insertInfo(String info) {
		System.out.println("database에 "+info+" 정보를 insert 한다");
	}
}















package test.singleton;
// Singleton Design Pattern 연습 
class CompanyDAO{
	// class loading 시점에 단 한번 생성 
	private static CompanyDAO instance=new CompanyDAO();
	//외부에서 생성할 수 없게 private 생성자로 정의 
	private CompanyDAO() {
		System.out.println("CompanyDAO 객체 생성");
	}
	//외부에서 현 객체를 사용할 수 있도록 static 메서드를 정의
	public static CompanyDAO getInstance() {
		return instance;
	}
	public String findInfo() {
		return "회사 정보";
	}
}
public class TestSingletonDesignPattern {
	public static void main(String[] args) {
		//error : private 생성자이므로 외부에서 생성 불가 
		/*CompanyDAO dao=new CompanyDAO();
		System.out.println(dao.findInfo());*/
		//CompanyDAO 객체의 주소값(레퍼런스)를 반환받는다
		CompanyDAO dao=CompanyDAO.getInstance();
		System.out.println(dao.findInfo());
		CompanyDAO dao2=CompanyDAO.getInstance();
		System.out.println(dao2.findInfo());
		CompanyDAO dao3=CompanyDAO.getInstance();
		System.out.println(dao3.findInfo());
	}
}











package step7;
// 생성자 오버로딩의 예 
class Member{
	Member(){}
	//Constructor Overloading 
	//다양한 매개변수를 정의해서 
	//다양한 데이터로 객체 생성할 수 있도록 한다 
	Member(String id){}
	Member(String id,String password){}
}
public class TestConstructorOverloading {
	public static void main(String[] args) {
		new Member();
		new Member("javaking");
		new Member("javaking","abcd");
	}
}








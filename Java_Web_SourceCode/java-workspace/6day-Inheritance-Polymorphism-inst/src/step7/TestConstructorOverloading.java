package step7;
// ������ �����ε��� �� 
class Member{
	Member(){}
	//Constructor Overloading 
	//�پ��� �Ű������� �����ؼ� 
	//�پ��� �����ͷ� ��ü ������ �� �ֵ��� �Ѵ� 
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








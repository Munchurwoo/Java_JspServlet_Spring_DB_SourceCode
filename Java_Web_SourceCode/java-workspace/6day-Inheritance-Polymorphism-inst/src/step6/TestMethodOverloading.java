package step6;
//�޼��� �����ε� �׽�Ʈ ���� 
class Person{
	public void eat() {
		System.out.println("�Դ�");
	}
	//�޼��� �����ε� : ������ �޼�������� 
	// �پ��� �Ű������� �޼��带 ���� 
	public void eat(int count) {
		System.out.println(count+"�κ� �Դ�");
	}	
	public void eat(String menu,int count) {//method overloading
		System.out.println(menu+" "+count+"�κ� �Դ�");
	}
}
public class TestMethodOverloading {
	public static void main(String[] args) {
		Person p=new Person();
		p.eat();
		p.eat(3);
		p.eat("«��", 2);
		// �޼��� �����ε��� �Ǿ ����ϴ� �������� �ϳ��� �޼���� 
		// �����ϸ� �پ��� �����͸� �����ؼ� ó���� �� �ִ� 
		// �� �޼��� �����ε��� ����� ���Ǽ��� ���� ���α׷��� ����̴�. 
	}
}













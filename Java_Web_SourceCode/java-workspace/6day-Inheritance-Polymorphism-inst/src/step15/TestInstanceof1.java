package step15;
class Employee{}
class Manager extends Employee{}
class Engineer extends Employee{}
// instanceof ������ �׽�Ʈ : ��ü�� Ÿ���� ��
public class TestInstanceof1 {
	public static void main(String[] args) {
		Employee e1=new Manager();
		System.out.println(e1 instanceof Manager);//true
		System.out.println(e1 instanceof Engineer);//false 
		System.out.println(e1 instanceof Employee);//is a �����̹Ƿ� true 
	}
}








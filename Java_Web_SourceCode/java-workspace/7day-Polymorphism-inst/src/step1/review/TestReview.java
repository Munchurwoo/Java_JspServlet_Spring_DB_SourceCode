package step1.review;

class Animal{// extends Object 
	// Animal(){super();}
	public void sleep() {
		System.out.println("�ڴ�");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	// �޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� �����θ� ������ 
	public void eat() { 
		System.out.println("������ �Դ�");
	}
	public void study() {
		System.out.println("�����ϴ�");
	}
}
public class TestReview {
	public static void main(String[] args) {
		//�Ϲ����� ������� ��ü ���� 
		//Person p=new Person();
		//�������� �׽�Ʈ�ϱ� ���� �θ� Ÿ���� ������ �ڽ� ��ü�� ���� 
		Animal a=new Person();
		//�ֻ��� Ŭ���� Object�κ��� ��ӹ޾����Ƿ� ��밡�� 
		System.out.println(a.toString());
		a.sleep();//Animal �κ��� ��ӹ޾����Ƿ� ��밡�� 
		a.eat();// �޼��� �������̵� �����Ƿ� ��밡�� 
		//a.study(); // Animal Ÿ���� ������ ���������Ƿ� ���� ���� �Ұ� 
		// Object casting �ؼ� �����ϸ� �ȴ� 
		((Person)a).study();
		AnimalService service=new AnimalService();
		service.pass(new Person());		
	}
}
class AnimalService{
	public void pass(Animal a) {
		System.out.println(a.toString());//���
		a.sleep();//���
		a.eat();//�������̵� 
		if(a instanceof Person) {// instanceof : is a �����̸� true 
			((Person) a).study();//Person�� ������ ����̹Ƿ� ��ü ĳ���� 
		}
	}
}













package step15;

class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
	public void sleep() {
		System.out.println("�ڴ�");
	}
}
class Person extends Animal{
	//�޼��� �������̵� 
	public void eat() {
		System.out.println("����� ������ �Դ�");
	}
	public void study() {
		System.out.println("����� �����ϴ�");
	}
}

public class TestObjectCasting {
	public static void main(String[] args) {
		//�θ� Ÿ���� ������ �ڽİ�ü�� ���� 
		Animal a=new Person();
		a.sleep();//��ӹ��� �θ� �޼����̹Ƿ� ȣ�� ���� 
		a.eat();//�������̵��� �޼����̹Ƿ� ȣ�Ⱑ�� 
		//a.study(); //compile error
		// ��ó�� Person �� ������ ���(�޼���)�� ������ �� ����
		// a �� �θ� Ÿ�� Animal �����̱� �����̴�. 
		// �����ؼ� ȣ���ϱ� ���ؼ��� a ������ Ÿ���� �����ؾ� �Ѵ� 
		// Object casting�� �ʿ� 
		((Person) a).study();		
	}
}










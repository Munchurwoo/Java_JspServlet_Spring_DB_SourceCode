package step8;
//�޼��� �������̵� �׽�Ʈ ���� 
class Animal{
	public void eat() {
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	//�޼��� �������̵� : �ڽſ� �°� �����θ� ������ 
	@Override //������̼� : �ǹ��ִ� �ּ� 
	// �������̵� ������ üũ�ϴ� ������̼� 
	public  void eat() {
		//���� �θ� �޼��带 ȣ���ؼ� ����ϰ� �ʹٸ� 
		//super keyword �� �̿��ϸ� �ȴ� 
		super.eat();
		System.out.println("����� ������ �Դ�");
	}
}
class Dog extends Animal{}
public class TestOverriding {
		public static void main(String[] args) {
			Dog dog=new Dog();
			dog.eat(); //��ӹ��� �θ� eat() �� ���� 
			Person person=new Person();
			person.eat();// �������̵��� �ڽ��� eat() �� ����ȴ� 
		}
}











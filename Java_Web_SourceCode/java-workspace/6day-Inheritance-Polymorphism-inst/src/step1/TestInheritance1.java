package step1;
class Animal{
	//private access modifier �� �ٸ� Ŭ�������� ���� �Ұ� 
	//�� �ڽ�Ŭ������ �ٸ� Ŭ�����̹Ƿ� ���� ���� �Ұ��ϴ� 
	//���� ������ �ְ��� �Ѵٸ� getter, setter�� �����Ѵ� 
	private int age=1; //instance variable 
	public void eat() {// method 
		System.out.println("�Դ�");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
//extends : �θ� Ŭ���� Animal�� ����Ѵ� 
//              �θ� Ŭ������ Ȯ���ؼ� �ڽ� Ŭ������ �����Ѵ� 
class Person extends Animal{
	public void study() {
		System.out.println("�����ϴ�");
	}
}
public class TestInheritance1 {
	public static void main(String[] args) {
		Person p=new Person(); // �ڽ� ��ü�� ���� 
		p.study();// �ڽ��� �޼����̹Ƿ� ȣ�Ⱑ�� 
		//��ӹ޾����� �θ� �ν��Ͻ� ������ ���������ڰ� private �̹Ƿ�
		//���� ������ �Ұ��ϰ� getter / setter �� ���� ���� ������ �Ѵ� 
		//System.out.println(p.age);
		System.out.println(p.getAge());
		p.eat();//��ӹ޾����Ƿ� ��밡�� 
	}
}












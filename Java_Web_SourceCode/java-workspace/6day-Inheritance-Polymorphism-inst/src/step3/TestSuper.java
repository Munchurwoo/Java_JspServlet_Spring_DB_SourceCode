package step3;
// super keyword �� ����� Ȯ���ϴ� ���� 
// super() : �������� ù ������ο� ��ġ�ϰ� 
//				  �θ� �����ڸ� ȣ���Ͽ� �θ� ��ü�� �����Ѵ� 
class Animal{ // �θ� Ŭ���� 
	Animal(){
		System.out.println("�θ� Ŭ���� Animal ������ ���� �� Animal��ü ����");
	}
}
class Person extends Animal{
	Person(){ //super();//���� super() �� ������� ������ �����Ϸ��� �ڵ�����
		System.out.println("�ڽ� Ŭ���� Person ������ ���� �� Person ��ü ����");
		//super(); // compile error .. super() �� �ݵ�� ������ ù���ο� ��ġ�ؾ�
		//�Ѵ� 
	}
}
public class TestSuper {
	public static void main(String[] args) {
		new Person(); // �ڽ� ��ü�� �����غ��� 
	}
}










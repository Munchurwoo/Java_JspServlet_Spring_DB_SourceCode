package step5;
/* abstract class : �߻� Ŭ���� 
 *  abstract�� ����� Ŭ������ ���� ��üȭ ��  �� ���� 
 *  abstract�� ����Ǵ� Ŭ������ �ڽ� Ŭ�����鿡�� ����� �����ְ�
 *  �������� ���� �������� ������ ���� ���̴�. 
 */
abstract class Parent{
	int money=10;
	Parent(){
		System.out.println("Parent ��ü ����");
	}
	/*
	 *  abstract method : �߻� �޼��� 
	 *  �ڽ� Ŭ������ ��ӹ޾Ƽ� ��ü�� ���Ǳ� ���ؼ��� 
	 *  �ݵ�� �߻�޼��带 �����ؾ� �Ѵ� 
	 *  �� abstract method�� �ڽ�Ŭ�������� �޼��� ������ �����ϴ� �� 
	 *  ������ �ִ� 
	 */
	public abstract void study();
}
class Child extends Parent{
	Child(){ //super(); �ڵ� ���� 
		System.out.println("Child ��ü ����");
	}
	public void study() {
		System.out.println("�ڽ��� ������ �����ϴ�");
	}
}
public class TestAbstract {
	public static void main(String[] args) {
    // abstract class �� ��ü ������ �� ���� 
	//	Parent p=new Parent();
	// �ڽİ�ü ������ �θ� abstract class ��ü��
	// �����ȴ� 	
		new Child();
	}
}









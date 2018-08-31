package step5;

interface Flyer{
	String NAME="";//�ν��Ͻ� ������ ���� �Ұ��ϰ� 
	// ���� ���� �����ϸ� static final modifier�� �ڵ����� ���� 
	//����� ����ȴ�. 
	public void fly(); // abstract �� ������� �ʾƵ� �ڵ����� ���� 
	// public void test() {}; // interface �� �����ΰ� �ִ� �޼��带 ���� x 
}
class Animal{}
class Bird extends Animal implements Flyer{
	//���� �������̽��� ������ �߻� �޼��带 �����ؾ� �Ѵ�. 
	@Override
	public void fly() {
		System.out.println("���� ����.");
	}}
class Airplane implements Flyer{
	public void fly() {
		System.out.println("����Ⱑ ����.");
	}
}
public class TestInterface1 {
	public static void main(String[] args) {
		// new Flyer(); // interface�� ��ü ������ �� �� ����. 
		Flyer f1 = new Bird();
		f1.fly();
		// ���� �������̽� Ÿ���� ������ ���� ��ü ���� ���� 
		Flyer f2 = new Airplane();
		// ���� �������̽� Ÿ���� �迭�� ���� ��ü ��ҷ� ���� ���� 

		Flyer[] fa= {new Bird(),new Airplane()};
		for(int i=0;i<fa.length;i++) {
			fa[i].fly();
		}
	}
}

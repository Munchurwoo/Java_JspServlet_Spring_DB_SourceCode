package step16;
class Animal{
	public void play() {}
}
class Person extends Animal{
	public void play() {
		System.out.println("����� ����Ʈ�ϸ� ���");
	}
	public void ticketing() {
		System.out.println("����� Ƽ���� �����ϴ�");
	}
}
class Monkey extends Animal{
	public void play() {
		System.out.println("�����̰� ����Ÿ�� ���");
	}
}
class ZooService{
	// �������� �Ʒ� �ּ��� ���� �������� enter �޼��带 �����غ��� 
	public void enter(Animal a) {
		// Person Ÿ���� ��ü���� ���ؼ� ticketing�� ȣ���ؾ� �Ѵ� 
		if(a instanceof Person) {
			// Person �ڽ� Ÿ���� �������� ����̹Ƿ� object casting�� �ʿ�! 
			// a �� Animal �θ� Ÿ���̹Ƿ�
			((Person) a).ticketing();
		}
		a.play();
	}
}
public class TestInstanceof2 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
     	service.enter(new Person());
		service.enter(new Monkey());		
		/*		����� Ƽ���� �����ϴ� 
		 *     ����� ����Ʈ�ϸ� ��� 
		 *     �����̰� ����Ÿ�� ��� 
		 */
	}
}






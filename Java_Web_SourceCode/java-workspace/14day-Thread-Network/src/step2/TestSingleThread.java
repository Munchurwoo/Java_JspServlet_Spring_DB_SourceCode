package step2;
/*
 * ���� ������ ȯ�濡���� �׽�Ʈ 
 * �Ʒ� �ڵ� ����� �ƹ��� ������ ����.
 */
class Toilt{
	private boolean seat; // �ν��Ͻ������̹Ƿ� �⺻ �ʱ�ȭ false
	public void use(String user) throws InterruptedException {
		if(seat==false) {
			System.out.println(user+"�� ����");
			Thread.sleep(10);
			seat=true;
			System.out.println(user+"�� �����");
			Thread.sleep(1000);
			System.out.println(user+"�� ����");
			seat=false;
		}else {
			System.out.println(user+"�� ȭ��� ������̹Ƿ� ���� ���մϴ�.");
		}
	}
}
public class TestSingleThread {
	public static void main(String[] args) {
		Toilt t= new Toilt();
		try {
			t.use("������");
			t.use("�ֿ��");
			t.use("������");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
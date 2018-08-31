package step4;
/* Multi Thread ȯ�濡�� �����ڿ� ��뿡 ���õ� ���� 
 * ��Ƽ ������ ȯ�濡���� 
 * ���� �ڿ��� ���Ͽ� ���� �����尡 �����ؼ� ����� �� �����Ƿ� 
 * ���� �ڿ��� �����Ͽ� �����͸� �����ϴ� ������ ���ؼ���
 * synchronized ����ȭ ó���� �Ͽ� 
 * �� �κи� ���� ������ ȯ���� ����� ���� �߻��� ������ ó���ؾ� �Ѵ�.
 * 
 *  �Ʒ��� �����ڿ� ���� �ڵ� ������ ����ȭó��(synchronized)�Ͽ� 
 *  thread - safe �� ��Ƽ �������� ������ �ڵ�� ó���� ���� 
 */
class Toilt implements Runnable{
	private boolean seat; // �ν��Ͻ������̹Ƿ� �⺻ �ʱ�ȭ false
	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�ټ��� �����尡 �����ڿ��� �����Ͽ� �����͸� �����ϴ�
	//�ڵ� ������ ����ȭ ó���Ͽ� thread-safe �ϰ� �����. 
	public synchronized void use(String user) throws InterruptedException {
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
public class TestMutiThreadSolution {
	public static void main(String[] args) {
		// �����ڿ� ( ���������� )
		Toilt toilet = new Toilt();
		Thread t1 = new Thread(toilet,"������");
		Thread t2 = new Thread(toilet,"�ֿ��");
		Thread t3 = new Thread(toilet,"������");
		t1.start();
		t2.start();
		t3.start();
		
	}
}

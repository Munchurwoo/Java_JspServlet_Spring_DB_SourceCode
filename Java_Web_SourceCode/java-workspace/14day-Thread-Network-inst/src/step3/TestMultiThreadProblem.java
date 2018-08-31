package step3;
/*	Multi Thread ȯ�濡�� �����ڿ� ��뿡 ���õ� ���� 
 *  ��Ƽ ������ ȯ�濡���� 
 *  ���� �ڿ��� ���Ͽ� ���� �����尡 �����ؼ� 
 *  ����� �� �����Ƿ� 
 *  ���� �ڿ��� �����Ͽ� �����͸� �����ϴ� ������ ���ؼ���
 *  synchronized ����ȭ ó���� �Ͽ� 
 *  �� �κи� ���� ������ ȯ���� ����� ���� �߻��� 
 *  ������ ó���ؾ� �Ѵ� 
 */
class Toilet implements Runnable{
	private boolean seat;//�ν��Ͻ������̹Ƿ� �⺻�ʱ�ȭ false 
	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}	
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
			System.out.println(user+"�� ȭ��� ������̹Ƿ� ������մϴ�");
		}
	}
}
public class TestMultiThreadProblem {
	public static void main(String[] args) {
		//�����ڿ� (����������)
		Toilet toilet=new Toilet();
		Thread t1=new Thread(toilet,"������");
		Thread t2=new Thread(toilet,"�ֿ��");
		Thread t3=new Thread(toilet,"������");
		t1.start();
		t2.start();
		t3.start();
	}
}










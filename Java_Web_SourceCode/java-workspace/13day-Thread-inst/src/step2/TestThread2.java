package step2;
/* step1 �� ���� ������(main thread) ȯ��� 
 * step2 �� ��Ƽ ������ ȯ���� ���̸� ��������
 * ���� Ȯ���غ��� 
 */
class Worker extends Thread{
	@Override
	public void run() {
		work();
	}
	public void work() {
		for(int i=0;i<10;i++)
		System.out.println("���ϴ�");
	}
}
public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("**main thread ����**");
		Worker worker=new Worker();
		Thread thread=new Thread(worker);
		//�����带 ���డ�ɻ��·� ������
		thread.start();
		System.out.println("**main thread ����**");
	}
}








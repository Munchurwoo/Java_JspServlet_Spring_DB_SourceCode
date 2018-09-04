package step6;
/*
 * Thread priority(�켱����) �׽�Ʈ ����
 * 
 */
class Worker implements Runnable{

	@Override
	public void run() {
		String threadName =Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(long  i=0;i<900000000L;i++)
			try {
				Thread.sleep(1000);
				System.out.println(threadName+"�����尡 ����Ϸ�! �켱���� : "+priority);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
public class TestThread6 {
	public static void main(String[] args) {
		System.out.println("���� ������ ���� ");
		/*Thread t1 = new Thread(new Worker(),"1��° �ϲ�");
		t1.start();*/
		// Thread 20�� ���� start() ��Ű�� 9�� ������� �켱������ 10���� �Ҵ� 
		Worker w = new Worker();
		for(int i =0; i<20;i++) {
			Thread t = new Thread(w,i+"��° �ϲ�");
			if(i==9) {
				t.setPriority(Thread.MAX_PRIORITY);//���� ���� 10���� �Ҵ� 
			}
			t.start();
			System.out.println(i+"��° �ϲ� ������ start");
		}
		System.out.println("���� ������ ���� ");
	}
}
package step5;
/*	������ ������ �ϴ� �ټ��� �����带 ������ ���� 
 * 
 *  ���� ������ �����ϹǷ� �ϳ��� Ŭ�������� 
 *  �ټ��� �����带 ������ �����Ű�� ���� 
 *  
 *  �ϳ��� Ŭ����, �ϳ��� ��ü(�ν��Ͻ�)���� 
 *  �ټ��� �����带 ������ ���� 
 */
class ServerWorker implements Runnable{
	private String companyName;
	public ServerWorker(String companyName) {
		this.companyName=companyName;
	}
	public void service() throws InterruptedException {
		String name=Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(companyName+" "+name+" �ݼ��ͼ���"+i);
			System.out.println("������ �켱����:"+Thread.currentThread().getPriority());
			Thread.sleep(1000);
		}
	}
	@Override
	public void run() {
		try {
			service();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class TestThread5 {
	public static void main(String[] args) {
		ServerWorker serverWorker=new ServerWorker("KT");
		// ServerWorker ��ü �ϳ��� �ټ��� ������ ���� 
		Thread t1=new Thread(serverWorker,"���������");
		Thread t2=new Thread(serverWorker,"�ֿ�����");
		Thread t3=new Thread(serverWorker,"���������");
		t1.start(); t2.start(); t3.start();
		System.out.println("**main thread ����**");
	}
}











package step1;
/*	Daemon Thread : ��׶��忡�� ����Ǵ� ������ 
 * 						�ڽ��� �����Ų �����尡 ����Ǹ� 
 * 						�ڽŵ� ����Ǵ� ������ 
 * 
 */
class BackupWorker implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				backup();
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}//while
	}//run
	public void backup() {
		System.out.println("**�޸��� ���� �۾� ������ ���**");
	}
}
class NotePad implements Runnable{
	@Override
	public void run() {
		//���� �۾� ���۽����� ��������� �����ؼ� start ��Ų�� 
		BackupWorker worker=new BackupWorker();
		Thread backupThread=new Thread(worker);
		// ��������带 daemon ������� �����Ѵ� 
		backupThread.setDaemon(true);
		backupThread.start();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("���� �۾�"+i);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}//for
		//���彺���� ���� ���� ����� �ϰ� �ʹٸ� ���������
		//ȣ���ϸ� �ȴ� 
		new BackupWorker().backup();
		System.out.println("�޸��� ���� �۾� ����");
	}//run	
}//class
public class TestDaemonThread {
	public static void main(String[] args) {
		Thread wordThread=new Thread(new NotePad());
		wordThread.start();
		System.out.println("main thread ����");
	}
}















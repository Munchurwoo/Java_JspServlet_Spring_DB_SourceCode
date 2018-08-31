package step1;
/*
 * Daemon Thread : ��׶��忡�� ����Ǵ� ������ 
 * 				  �ڽ��� �����Ų �����尡 ����Ǹ� �ڽŵ� ����Ǵ� ������. 
 */
class BackupWorker implements Runnable {

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
				backup();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//���彺���� ���� ���� ����� �ϰ� �ʹٸ� ��������� ȣ���ϸ� �ȴ�. 
	
	public void backup() {
		
		System.out.println("**�޸��� ���� �۾� ������ ���**");
	}
}

class NotePad implements Runnable {

	@Override
	public void run() {
		Thread backupThread = new Thread(new BackupWorker());
		//��� �����带 daemon ������� �����Ѵ�. 
		backupThread.setDaemon(true);
		backupThread.start();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("�����۾� " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		new BackupWorker().backup();
		System.out.println("���� �۾� ����");
	}

}

public class TestDaemonThread {
	public static void main(String[] args) {
		Thread wordThread = new Thread(new NotePad());
		wordThread.start();
		System.out.println("main thread ����");
	}
}

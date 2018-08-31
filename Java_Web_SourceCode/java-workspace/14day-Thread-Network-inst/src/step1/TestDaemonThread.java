package step1;
/*	Daemon Thread : 백그라운드에서 실행되는 스레드 
 * 						자신을 실행시킨 스레드가 종료되면 
 * 						자신도 종료되는 스레드 
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
		System.out.println("**메모장 워드 작업 정보를 백업**");
	}
}
class NotePad implements Runnable{
	@Override
	public void run() {
		//워드 작업 시작시점에 백업스레드 생성해서 start 시킨다 
		BackupWorker worker=new BackupWorker();
		Thread backupThread=new Thread(worker);
		// 백업스레드를 daemon 스레드로 설정한다 
		backupThread.setDaemon(true);
		backupThread.start();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("워드 작업"+i);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}//for
		//워드스레드 종료 직전 백업을 하고 싶다면 명시적으로
		//호출하면 된다 
		new BackupWorker().backup();
		System.out.println("메모장 워드 작업 종료");
	}//run	
}//class
public class TestDaemonThread {
	public static void main(String[] args) {
		Thread wordThread=new Thread(new NotePad());
		wordThread.start();
		System.out.println("main thread 종료");
	}
}















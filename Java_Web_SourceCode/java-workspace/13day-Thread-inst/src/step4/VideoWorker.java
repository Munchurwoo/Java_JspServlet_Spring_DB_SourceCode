package step4;

public class VideoWorker implements Runnable{
	public void work() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("���󼭺� ������"+i);
			Thread.sleep(1000);
		}
	}
	@Override
	public void run() {
		try {
			work();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}

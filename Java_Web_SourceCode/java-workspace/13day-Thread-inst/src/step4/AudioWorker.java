package step4;

public class AudioWorker implements Runnable{
	public void work() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("음향서비스 스레드"+i);
			Thread.sleep(1200);
		}
	}
	@Override
	public void run() {
		try {
			work();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package step4;

public class AudioWorker implements Runnable{
	public void work() throws InterruptedException {
		for(int i =0;i<10;i++) {
			System.out.println("���⼭�� ������");
			Thread.sleep(1200);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub 
		try {
			work();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

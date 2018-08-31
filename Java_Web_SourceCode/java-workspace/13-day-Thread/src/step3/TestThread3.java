package step3;

/*
 * 채팅 클라이언트 프로그램에서는 
 * 친구들에게 메세지를 출력하는 스레드와 
 * 친구들에게 메서드를 입력받는 스레드가 동시에 
 * 서비스되어야 한다. 
 * 채팅클라이언트 프로세스 내의 세부적 실행다위인 
 * 스레드가 2개가 필요하다. 
 * 메인 쓰레드 : 출력을 담당 
 * InputWorker Thead : 입력을 당담 
 */
class InputWorker implements Runnable {
	public void inputMessage() throws InterruptedException {
		for(int i =0;i<10;i++) {
			System.out.println("친구들의 메세지를 입력받는 Input Thread");
			Thread.sleep(500); // 0.5초간 쓰레드 실행 중단 후 재게 
			
			
		}
	}
	@Override
	public void run() {
		try {
			this.inputMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class TestThread3 {
	public void outputMessage() {
		for(int i=0;i<10;i++) {
			System.out.println("친구들에게 메세지를 출력하는 Output main thread");
		}
	}

	public static void main(String[] args) {
		System.out.println("**main thread 시작** ");
		Thread inputThread = new Thread(new InputWorker());
		inputThread.start();
		new TestThread3().outputMessage();
		System.out.println("**main thread 종료** ");
	}
}

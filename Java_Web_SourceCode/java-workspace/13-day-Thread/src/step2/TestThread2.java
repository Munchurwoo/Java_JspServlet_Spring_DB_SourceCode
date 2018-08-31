package step2;
/*
 * step1 의 단일 쓰레드(main thread) 환경과 
 * step2 의 멀티 쓰레드 환경의 차이를 실행결과를 통해 확인해본다. 
 */
class Worker extends Thread{
	@Override
	public void run() {
		work();
	}
	public void work() {
		for(int i = 0; i<10;i++) {
			System.err.println("일하다");
		}
	}
}
public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("쓰레드 시작");
		Worker worker = new Worker();
		Thread thread = new Thread(worker);
		//쓰레드를 실행 가능 상태로 보낸다.
		thread.start();
		System.out.println("쓰레드 종료");
	}
}

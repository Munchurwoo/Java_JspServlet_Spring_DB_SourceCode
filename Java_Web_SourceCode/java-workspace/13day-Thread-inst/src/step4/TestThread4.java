package step4;
/* 멀티 스레드 구현 연습 
 * Video Thread 
 * Audio Thread 
 * Main Thread 
 */
public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("**main thread시작**");
		new Thread(new VideoWorker()).start();
		new Thread(new AudioWorker()).start();
		System.out.println("**main thread종료**");
	}
}









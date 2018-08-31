package step4;
/*
 * 멀티 스레드 구현 연습 
 *  Video Tthread 
 *  Audio Thread 
 *  Main Thread 
 */
public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("main thread 시작");
		new Thread(new VidioWorker()).start();
		new Thread(new AudioWorker()).start();
		System.out.println("main thread 종료");
	}
}

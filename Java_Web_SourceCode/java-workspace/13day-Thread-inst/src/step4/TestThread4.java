package step4;
/* ��Ƽ ������ ���� ���� 
 * Video Thread 
 * Audio Thread 
 * Main Thread 
 */
public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("**main thread����**");
		new Thread(new VideoWorker()).start();
		new Thread(new AudioWorker()).start();
		System.out.println("**main thread����**");
	}
}









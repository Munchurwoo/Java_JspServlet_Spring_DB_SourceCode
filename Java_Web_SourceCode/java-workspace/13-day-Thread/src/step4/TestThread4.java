package step4;
/*
 * ��Ƽ ������ ���� ���� 
 *  Video Tthread 
 *  Audio Thread 
 *  Main Thread 
 */
public class TestThread4 {
	public static void main(String[] args) {
		System.out.println("main thread ����");
		new Thread(new VidioWorker()).start();
		new Thread(new AudioWorker()).start();
		System.out.println("main thread ����");
	}
}

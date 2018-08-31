package step2;
/* step1 의 단일 스레드(main thread) 환경과 
 * step2 의 멀티 스레드 환경의 차이를 실행결과를
 * 통해 확인해본다 
 */
class Worker extends Thread{
	@Override
	public void run() {
		work();
	}
	public void work() {
		for(int i=0;i<10;i++)
		System.out.println("일하다");
	}
}
public class TestThread2 {
	public static void main(String[] args) {
		System.out.println("**main thread 시작**");
		Worker worker=new Worker();
		Thread thread=new Thread(worker);
		//스레드를 실행가능상태로 보낸다
		thread.start();
		System.out.println("**main thread 종료**");
	}
}








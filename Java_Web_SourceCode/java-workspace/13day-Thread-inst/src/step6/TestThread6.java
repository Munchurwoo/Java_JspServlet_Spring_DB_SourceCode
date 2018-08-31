package step6;
/*	Thread priority(우선순위) 테스트 예제 
 * 
 */
class Worker implements Runnable{
	@Override
	public void run() {
		String threadName=Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		for(long i=0;i<9000000000L;i++){			
		}
		System.out.println(threadName
				+"스레드 실행완료! 우선순위:"+priority);
	}	
}
public class TestThread6 {
	public static void main(String[] args) {
		System.out.println("**main thread 시작**");
		/*Thread t1=new Thread(new Worker(),"1번째 일꾼");
		t1.start();*/
		// Thread 20개 생성 start() 시키되
		// 9번스레드는 우선순위 10으로 할당 
		Worker w=new Worker();
		for(int i=0;i<20;i++) {
			Thread t=new Thread(w,i+"번째 일꾼");
			if(i==9) {
				t.setPriority(Thread.MAX_PRIORITY);//가장 높은 10으로 할당
			}
			t.start();
			System.out.println(i+"번째 일꾼스레드 start");
		}
		System.out.println("**main thread 종료**");
	}
}










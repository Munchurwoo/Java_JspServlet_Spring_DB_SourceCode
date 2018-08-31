package step4;
/* Multi Thread 환경에서 공유자원 사용에 관련된 예제 
 * 멀티 스레딩 환경에서는 
 * 공유 자원에 대하여 여러 스레드가 접근해서 사용할 수 있으므로 
 * 공유 자원에 접근하여 데이터를 변경하는 영역에 대해서는
 * synchronized 동기화 처리를 하여 
 * 그 부분만 단일 스레드 환경을 만들어 문제 발생이 없도록 처리해야 한다.
 * 
 *  아래는 공유자원 접근 코드 영역에 동기화처리(synchronized)하여 
 *  thread - safe 즉 멀티 스레딩시 안전한 코드로 처리한 예제 
 */
class Toilt implements Runnable{
	private boolean seat; // 인스턴스변수이므로 기본 초기화 false
	@Override
	public void run() {
		try {
			use(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//다수의 스레드가 공유자원에 접근하여 데이터를 변경하는
	//코드 영역에 동기화 처리하여 thread-safe 하게 만든다. 
	public synchronized void use(String user) throws InterruptedException {
		if(seat==false) {
			System.out.println(user+"님 입장");
			Thread.sleep(10);
			seat=true;
			System.out.println(user+"님 사용중");
			Thread.sleep(1000);
			System.out.println(user+"님 나옴");
			seat=false;
		}else {
			System.out.println(user+"님 화장실 사용중이므로 입장 못합니다.");
		}
	}
}
public class TestMutiThreadSolution {
	public static void main(String[] args) {
		// 공유자원 ( 공유데이터 )
		Toilt toilet = new Toilt();
		Thread t1 = new Thread(toilet,"신현수");
		Thread t2 = new Thread(toilet,"최요셉");
		Thread t3 = new Thread(toilet,"문준위");
		t1.start();
		t2.start();
		t3.start();
		
	}
}

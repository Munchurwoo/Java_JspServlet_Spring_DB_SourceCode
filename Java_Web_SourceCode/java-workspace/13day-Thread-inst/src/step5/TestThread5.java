package step5;
/*	동일한 업무를 하는 다수의 스레드를 생성해 실행 
 * 
 *  서비스 내용이 동일하므로 하나의 클래스에서 
 *  다수의 스레드를 생성해 실행시키는 예제 
 *  
 *  하나의 클래스, 하나의 객체(인스턴스)에서 
 *  다수의 스레드를 생성해 실행 
 */
class ServerWorker implements Runnable{
	private String companyName;
	public ServerWorker(String companyName) {
		this.companyName=companyName;
	}
	public void service() throws InterruptedException {
		String name=Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			System.out.println(companyName+" "+name+" 콜센터서비스"+i);
			System.out.println("스레드 우선순위:"+Thread.currentThread().getPriority());
			Thread.sleep(1000);
		}
	}
	@Override
	public void run() {
		try {
			service();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class TestThread5 {
	public static void main(String[] args) {
		ServerWorker serverWorker=new ServerWorker("KT");
		// ServerWorker 객체 하나로 다수의 스레드 생성 
		Thread t1=new Thread(serverWorker,"신현수사원");
		Thread t2=new Thread(serverWorker,"최요셉사원");
		Thread t3=new Thread(serverWorker,"문준위사원");
		t1.start(); t2.start(); t3.start();
		System.out.println("**main thread 종료**");
	}
}











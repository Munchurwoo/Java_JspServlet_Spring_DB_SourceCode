package step1;
class Worker{
	public void work() {
		for(int i = 0; i<10;i++) {
			System.err.println("일하다");
		}
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		System.out.println("쓰레드 시작");
		new Worker().work();
		System.out.println("쓰레드 종료");
	}
}

package step1;
class Worker{
	public void work() {
		for(int i=0;i<10;i++)
		System.out.println("���ϴ�");
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		System.out.println("**main thread ����**");
		new Worker().work();
		System.out.println("**main thread ����**");
	}
}

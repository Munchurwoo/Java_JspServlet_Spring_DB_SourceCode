package step1;
class Worker{
	public void work() {
		for(int i = 0; i<10;i++) {
			System.err.println("���ϴ�");
		}
	}
}
public class TestThread1 {
	public static void main(String[] args) {
		System.out.println("������ ����");
		new Worker().work();
		System.out.println("������ ����");
	}
}

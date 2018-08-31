package step3;

/*  ä�� Ŭ���̾�Ʈ ���α׷������� 
 *  ģ���鿡�� �޼����� ����ϴ� �������
 *  ģ������ �޼����� �Է¹޴� �����尡 
 *  ���ÿ� ���񽺵Ǿ�� �Ѵ� 
 *  ä��Ŭ���̾�Ʈ ���μ��� ���� ������ ���������
 *  ������� 2���� �ʿ��ϴ� 
 *  ���ν����� : ����� ��� 
 *  InputWorker Thread : �Է��� ��� 
 */
class InputWorker implements Runnable {
	public void inputMessage() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println(
					"ģ������ �޼����� �Է¹޴� Input Thread");
			Thread.sleep(500);//0.5�ʰ� ������ ���� �ߴ� �� �簳 
		}
	}
	@Override
	public void run() {
		try {
			this.inputMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class TestThread3 {
	public void outputMessage() {
		for(int i=0;i<10;i++)
			System.out.println(
					"ģ���鿡�� �޼��� ����ϴ� Output main thread");
	}
	public static void main(String[] args) {
		System.out.println("**main thread ����**");
		Thread inputThread=new Thread(new InputWorker());
		inputThread.start();//InputWorker thread�� ���డ�ɻ��·� ������
		new TestThread3().outputMessage();
		System.out.println("**main thread ����**");
	}
}













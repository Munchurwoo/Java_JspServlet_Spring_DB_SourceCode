package step7;
class a{
	 
}
public class TestThreadEx implements CommonInfo{
	public static void main(String[] args) {
		//1�� �������� 30�� ���� ���� 
		MakeFileWorker makeWorker=new MakeFileWorker(1000,30);
		//7�� �������� 5�� ���� �̵� 
		MoveFileWorker moveWorker = new MoveFileWorker(7000,5);
		//������ �����带 �����ؼ� start �� ��Ų��. 
		Thread t1 = new Thread(makeWorker);
		Thread t2 = new Thread(moveWorker);
		t1.start(); t2.start();
		
		System.out.println("������ ����");
	}
}

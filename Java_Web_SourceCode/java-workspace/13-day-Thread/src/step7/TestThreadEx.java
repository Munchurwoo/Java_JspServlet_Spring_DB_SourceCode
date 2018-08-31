package step7;
class a{
	 
}
public class TestThreadEx implements CommonInfo{
	public static void main(String[] args) {
		//1초 간격으로 30개 파일 생성 
		MakeFileWorker makeWorker=new MakeFileWorker(1000,30);
		//7초 간격으로 5번 파일 이동 
		MoveFileWorker moveWorker = new MoveFileWorker(7000,5);
		//각각의 스레드를 생성해서 start 를 시킨다. 
		Thread t1 = new Thread(makeWorker);
		Thread t2 = new Thread(moveWorker);
		t1.start(); t2.start();
		
		System.out.println("쓰레드 종료");
	}
}

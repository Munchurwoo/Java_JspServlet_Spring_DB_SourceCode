package step7;

/*
 *  MAKE_PATH 에 파일을 지속적으로 생성하고 
 *  동시에 
 *  MOVIE_PATH 와 MUSIC_PATH 에 확장자별로 분류하여 이동시키는
 *  프로그램 
 *  Main Thread를 제외하고 필요한 스레드는 
 *  파일을 생성하는 스레드와 
 *  파일을 분류하여 이동시키는 스레드가 필요하다 
 */
public class TestThreadEx {
	public static void main(String[] args) {
		MakeFileWorker makeWorker=new MakeFileWorker(1000,30);
		MoveFileWorker moveWorker=new MoveFileWorker(7000,5);
		Thread makeThread=new Thread(makeWorker);
		makeThread.start();
		Thread moveThread=new Thread(moveWorker);
		moveThread.start();
		System.out.println("makeThread와 moveThread start 완료!");
	}
}











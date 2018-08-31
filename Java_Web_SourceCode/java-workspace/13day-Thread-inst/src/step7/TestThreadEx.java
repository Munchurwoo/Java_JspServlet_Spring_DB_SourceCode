package step7;

/*
 *  MAKE_PATH �� ������ ���������� �����ϰ� 
 *  ���ÿ� 
 *  MOVIE_PATH �� MUSIC_PATH �� Ȯ���ں��� �з��Ͽ� �̵���Ű��
 *  ���α׷� 
 *  Main Thread�� �����ϰ� �ʿ��� ������� 
 *  ������ �����ϴ� ������� 
 *  ������ �з��Ͽ� �̵���Ű�� �����尡 �ʿ��ϴ� 
 */
public class TestThreadEx {
	public static void main(String[] args) {
		MakeFileWorker makeWorker=new MakeFileWorker(1000,30);
		MoveFileWorker moveWorker=new MoveFileWorker(7000,5);
		Thread makeThread=new Thread(makeWorker);
		makeThread.start();
		Thread moveThread=new Thread(moveWorker);
		moveThread.start();
		System.out.println("makeThread�� moveThread start �Ϸ�!");
	}
}











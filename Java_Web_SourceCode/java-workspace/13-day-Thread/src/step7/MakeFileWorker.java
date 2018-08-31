package step7;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/*
 * 1�� ����(prtiof) ���� 30���� ������ MAKE_PATH ���丮�� �����Ѵ�. 
 * Ȯ���ڴ� avi or mp3 �� �������� �Ҵ��ؼ� �����. 
 * Random class �� nextBoolean()
 * true -> avi false -> mp3
 * ex) 0.mp3, 1.avi
 */
public class MakeFileWorker implements Runnable {

	private int preiod;
	private int count;

	public MakeFileWorker(int preiod, int count) {
		this.preiod = preiod;
		this.count = count;
	}

	public void work() throws IOException, InterruptedException {
		Random r = new Random();
		File file = new File(CommonInfo.MAKE_PATH);
		System.out.println(r.nextBoolean());
		for (int i = 0; i < count; i++) {
			
			if (r.nextBoolean() == true) {
				new File(CommonInfo.MAKE_PATH + File.separator + i + ".avi").createNewFile();
				Thread.sleep(preiod);
			} else {

				new File(CommonInfo.MAKE_PATH + File.separator + i + ".mp3").createNewFile();
				Thread.sleep(preiod);
			}
			
		}
		
	}

	@Override
	public void run() {
		try {
			
			work();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

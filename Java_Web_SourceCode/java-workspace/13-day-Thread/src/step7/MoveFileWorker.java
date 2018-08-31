package step7;

import java.io.File;

/*
 * 7�� ����(period)���� 5�� (count) �̵���Ų��.
 * MAKE_PATH ���丮 Ȯ���ؼ�  
 * Ȯ���ں��� mp3 �� MUSIC_PATH�� �̵� 
 * avi�� MOVIE_PATH �� �̵���Ų��. 
 */
public class MoveFileWorker implements Runnable {
	private int period;
	private int count;
	
	public MoveFileWorker(int period, int count) {
		super();
		this.period = period;
		this.count = count;
	}
	public void work() throws InterruptedException {
		Thread.sleep(period);
		File orgFile = new File(CommonInfo.MAKE_PATH);
		File [] orgDir=orgFile.listFiles();
		System.out.println(orgDir[0]);
		for(int i=0;i<30;i++) {
			System.out.println(orgDir[i].getName().endsWith("avi"));
			if(orgDir[i].isFile()&&orgDir[i].getName().endsWith(".avi")==true) {
				orgDir[i].renameTo(
						new File(CommonInfo.MOVIE_PATH+File.separator+orgDir[i].getName()));
			}else {
				orgDir[i].renameTo(
						new File(CommonInfo.MUSIC_PATH+File.separator+orgDir[i].getName()));
	
			}
		}
		//orgFile.renameTo(new File(CommonInfo.MOVIE_PATH));
		
		
		
	}
	
	@Override
	public void run() {
		try {
			work();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

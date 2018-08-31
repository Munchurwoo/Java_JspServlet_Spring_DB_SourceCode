package step7;

import java.io.File;

/*
 * 7초 간격(period)으로 5번 (count) 이동시킨다.
 * MAKE_PATH 디렉토리 확인해서  
 * 확장자별로 mp3 는 MUSIC_PATH로 이동 
 * avi는 MOVIE_PATH 로 이동시킨다. 
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

package step7;

import java.io.File;

/*	7초 간격으로 5번 이동시킨다
 *  확장자별로 지정된 디렉토리로 이동해야 한다 
 */
public class MoveFileWorker implements Runnable{
	private int period;
	private int count;
	public MoveFileWorker(int period, int count) {
		super();
		this.period = period;
		this.count = count;
	}
	/*  period 간격으로 sleep 실행 후 재개하면서 ( 7초 간격 실행 ) 
	 *  디렉토리내 파일을 확장자별로 특정 디렉토리에 이동시키는 역할 
	 *  1. 저장 디렉토리에서 파일 목록 정보를 반환받는다   
	 *  2. 확장별로 지정한 디렉토리로 파일을 이동한다 
	 *  	
	 */
	public void run(){
		new File(CommonInfo.MOVIE_PATH).mkdirs();
		new File(CommonInfo.MUSIC_PATH).mkdirs();
		for(int i=0;i<count;i++){
			try {
				Thread.sleep(period);
				moveFileList();
				System.out.println("Move 스레드가 파일 이동");
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	// 디렉토리에 존재하는 파일들을 분류해 이동시키는 메서드 
	public void moveFileList(){
		File[] list=new File(CommonInfo.MAKE_PATH).listFiles();
		for(int i=0;i<list.length;i++){		
			File dest=null;
			if(list[i].isFile()){
				if(list[i].getName().endsWith(".mp3")){
					dest=new File(
							CommonInfo.MUSIC_PATH+File.separator+list[i].getName());
				}else if(list[i].getName().endsWith(".avi")){
					dest=new File(
							CommonInfo.MOVIE_PATH+File.separator+list[i].getName());
				}	
				list[i].renameTo(dest);
			}
		}
	}
}

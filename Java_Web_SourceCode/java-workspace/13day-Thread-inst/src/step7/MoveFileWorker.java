package step7;

import java.io.File;

/*	7�� �������� 5�� �̵���Ų��
 *  Ȯ���ں��� ������ ���丮�� �̵��ؾ� �Ѵ� 
 */
public class MoveFileWorker implements Runnable{
	private int period;
	private int count;
	public MoveFileWorker(int period, int count) {
		super();
		this.period = period;
		this.count = count;
	}
	/*  period �������� sleep ���� �� �簳�ϸ鼭 ( 7�� ���� ���� ) 
	 *  ���丮�� ������ Ȯ���ں��� Ư�� ���丮�� �̵���Ű�� ���� 
	 *  1. ���� ���丮���� ���� ��� ������ ��ȯ�޴´�   
	 *  2. Ȯ�庰�� ������ ���丮�� ������ �̵��Ѵ� 
	 *  	
	 */
	public void run(){
		new File(CommonInfo.MOVIE_PATH).mkdirs();
		new File(CommonInfo.MUSIC_PATH).mkdirs();
		for(int i=0;i<count;i++){
			try {
				Thread.sleep(period);
				moveFileList();
				System.out.println("Move �����尡 ���� �̵�");
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
	// ���丮�� �����ϴ� ���ϵ��� �з��� �̵���Ű�� �޼��� 
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

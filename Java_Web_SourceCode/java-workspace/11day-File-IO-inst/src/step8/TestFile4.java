package step8;

import java.io.IOException;

public class TestFile4 {
	public static void main(String[] args) {
		FileCreateService service=new FileCreateService();
		String path
		="C:\\java-kosta\\test\\media\\movie\\������Ʈ����.mp4";
		//try catch 
		try {
			service.createDirAndFile(path);
			System.out.println(path+" ���� ����");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}





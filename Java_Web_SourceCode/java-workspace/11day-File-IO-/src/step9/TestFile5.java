package step9;

import java.io.IOException;

public class TestFile5 {
	public static void main(String[] args) {
		String dir = "C:\\java-kosta\\test\\media\\music";
		String songInfo = "Dance The Night Away.mp3,Dejavu.mp3,�ѵζѵ�.mp3,������Ÿ.avi,�ϱؼ�.mp3";
		MultiFileService service = new MultiFileService();
		//try catch 
		try {
			service.createDirAndMultiFile(dir, songInfo);
			System.out.println("���丮 �� �뷡���ϵ� ���� ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

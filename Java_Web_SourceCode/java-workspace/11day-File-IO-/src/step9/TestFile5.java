package step9;

import java.io.IOException;

public class TestFile5 {
	public static void main(String[] args) {
		String dir = "C:\\java-kosta\\test\\media\\music";
		String songInfo = "Dance The Night Away.mp3,Dejavu.mp3,뚜두뚜두.mp3,라디오스타.avi,북극성.mp3";
		MultiFileService service = new MultiFileService();
		//try catch 
		try {
			service.createDirAndMultiFile(dir, songInfo);
			System.out.println("디렉토리 및 노래파일들 생성 ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

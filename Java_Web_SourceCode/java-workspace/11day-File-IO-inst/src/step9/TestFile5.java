package step9;

import java.io.IOException;

public class TestFile5 {
	public static void main(String[] args) {
		String dir="C:\\java-kosta\\test\\media\\music";
		String songInfo=
	"Dance The Night Away.mp3,Dejavu.mp3,堆滴堆滴.mp3,合必己.mp3";
		MultiFileService service=new MultiFileService();
		//try catch 
		try {
			service.createDirAndMultiFile(dir,songInfo);
			System.out.println("叼泛配府 棺 畴贰颇老甸 积己");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}








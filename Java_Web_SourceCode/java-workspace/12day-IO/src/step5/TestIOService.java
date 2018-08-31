package step5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestIOService {
	public static void main(String[] args) {
		String orgDir="C:\\java-kosta\\test\\orgdir";
		String destDir="C:\\java-kosta\\test\\destdir";
		
		MultiFileService service = new MultiFileService();
		//try
		try {
			service.executeCopyAndPasteDir(orgDir, destDir);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("디렉토리내 파일 복사 붙여넣기 완료");
		//catch
		
		
	}
}

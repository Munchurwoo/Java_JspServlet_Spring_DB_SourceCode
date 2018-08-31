package step6;

import java.io.IOException;

public class TestImageService {
/*
 * ByteStream 계열 (input, outputStream) 의 스트림을
 * 이용해서 이미지를 복사 붙여넣기 (입, 출력) 하는 예제 
 */
	public static void main(String[] args) {
		ImageService service = new ImageService();
		String orgPath="C:\\java-kosta\\test\\아이유.jpg";
		String destPath="C:\\java-kosta\\test\\cp\\복사본-아이유.jpg";
		try {
			service.copyAndPasteImage(orgPath,destPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

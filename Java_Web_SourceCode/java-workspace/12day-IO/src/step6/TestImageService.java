package step6;

import java.io.IOException;

public class TestImageService {
/*
 * ByteStream �迭 (input, outputStream) �� ��Ʈ����
 * �̿��ؼ� �̹����� ���� �ٿ��ֱ� (��, ���) �ϴ� ���� 
 */
	public static void main(String[] args) {
		ImageService service = new ImageService();
		String orgPath="C:\\java-kosta\\test\\������.jpg";
		String destPath="C:\\java-kosta\\test\\cp\\���纻-������.jpg";
		try {
			service.copyAndPasteImage(orgPath,destPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

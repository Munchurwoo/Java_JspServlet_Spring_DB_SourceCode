package step4;

import java.io.IOException;

public class TestIOService4 {
	public static void main(String[] args) {
		String orgPath ="C:\\java-kosta\\test\\menu\\order.txt";
		String destPath = "C:\\java-kosta\\test\\cp\\���纻-order.txt";
		copyAndPasteFileService sevice = new copyAndPasteFileService();
		//try
		try {
			sevice.execute(orgPath,destPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �ٿ��ֱ� �Ϸ�");
	}
}

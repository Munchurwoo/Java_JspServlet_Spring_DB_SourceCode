package step1;

import java.io.IOException;

public class TestIO1 {
	public static void main(String[] args) {
		IOService service = new IOService();
		String filePath="C:\\java-kosta\\test\\iotest.txt";
		try {
			service.writeFile(filePath,"æ»≥Á«œººø‰");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

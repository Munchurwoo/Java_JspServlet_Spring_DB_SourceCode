package step7;

import java.io.File;

public class TestFile3 {
	public static void main(String[] args) {
		String path = "C:\\Program Files\\Java\\jdk1.8.0_171\\README.html";
		System.out.println(new File(path).exists());
		FileService service = new FileService();
		service.printDirs(path);
		//path ���� ���ϰ� ������ ��ġ�� �ִ� ���丮���� ��� ��� 
	}
}

package step7;

import java.io.File;

public class TestFile3 {
	public static void main(String[] args) {
		String path = "C:\\Program Files\\Java\\jdk1.8.0_171\\README.html";
		System.out.println(new File(path).exists());
		FileService service = new FileService();
		service.printDirs(path);
		//path 상의 파일과 동일한 위치에 있는 디렉토리명을 모두 출력 
	}
}

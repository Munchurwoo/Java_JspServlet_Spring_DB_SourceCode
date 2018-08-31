package step7;

import java.io.File;

public class FileService {

	public void printDirs(String path) {
		// TODO Auto-generated method stub
		File orgFile = new File(path);
		File dir = orgFile.getParentFile();// 파일을 보유한 상위디렉토리 변환
		File f[] = dir.listFiles();// 디렉토리가 보유한 파일 및 디렉토리 목록
		for (int i = 0; i < f.length; i++) {
			if (f[i].isDirectory())
				System.out.println(f[i].getName());
		}
	}
}

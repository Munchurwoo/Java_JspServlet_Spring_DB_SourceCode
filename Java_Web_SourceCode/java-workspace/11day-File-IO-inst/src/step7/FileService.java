package step7;

import java.io.File;

public class FileService {
	public void printDirs(String path) {
		File orgFile=new File(path);
		File dir=orgFile.getParentFile(); // 파일을 보유한 상위 디렉토리 반환 
		File f[]=dir.listFiles();//디렉토리가 보유한 파일 및 디렉토리 목록 
		for(int i=0;i<f.length;i++) {
			if(f[i].isDirectory()) {
			System.out.println(f[i].getName());
			}//if
		}//for
	}//method
}//class










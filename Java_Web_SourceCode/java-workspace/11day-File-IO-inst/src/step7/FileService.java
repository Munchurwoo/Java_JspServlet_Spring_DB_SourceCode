package step7;

import java.io.File;

public class FileService {
	public void printDirs(String path) {
		File orgFile=new File(path);
		File dir=orgFile.getParentFile(); // ������ ������ ���� ���丮 ��ȯ 
		File f[]=dir.listFiles();//���丮�� ������ ���� �� ���丮 ��� 
		for(int i=0;i<f.length;i++) {
			if(f[i].isDirectory()) {
			System.out.println(f[i].getName());
			}//if
		}//for
	}//method
}//class










package step9;

import java.io.File;
import java.io.IOException;

public class MultiFileService {
	public void createDirAndMultiFile(String dir, String songInfo)
			throws IOException {
		new File(dir).mkdirs();//���丮 ���� 
		String songs[]=songInfo.split(",");//���ڿ��� , �����ڸ� �̿��� �迭�� ��ȯ 
		for(int i=0;i<songs.length;i++) {
			new File(dir+File.separator+songs[i]).createNewFile();
		}//for
	}//method
}









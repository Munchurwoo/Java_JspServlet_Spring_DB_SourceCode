package step9;

import java.io.File;
import java.io.IOException;

public class MultiFileService {
	public void createDirAndMultiFile(String dir, String songInfo)
			throws IOException {
		new File(dir).mkdirs();//디렉토리 생성 
		String songs[]=songInfo.split(",");//문자열을 , 구분자를 이용해 배열로 반환 
		for(int i=0;i<songs.length;i++) {
			new File(dir+File.separator+songs[i]).createNewFile();
		}//for
	}//method
}









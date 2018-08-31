package step8;

import java.io.File;
import java.io.IOException;

public class FileCreateService {
	public void createDirAndFile(String path) throws IOException {
		File file=new File(path);
		//디렉토리를 생성하기 위해 상위 디렉토리 정보를 얻는다
		File dir=file.getParentFile();
		//디렉토리를 생성한다 
		dir.mkdirs();
		//파일을 생성한다 
		file.createNewFile();
	}
}









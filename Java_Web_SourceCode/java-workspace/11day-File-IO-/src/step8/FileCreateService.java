package step8;

import java.io.File;
import java.io.IOException;

public class FileCreateService {

	public void createDirAndFile(String path) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File(path);
		//String parent = dir.getParent();
		//System.out.println(parent);
		File parentFile = dir.getParentFile();
		System.out.println(parentFile);
		parentFile.mkdirs();
		dir.createNewFile();
		
	}

}

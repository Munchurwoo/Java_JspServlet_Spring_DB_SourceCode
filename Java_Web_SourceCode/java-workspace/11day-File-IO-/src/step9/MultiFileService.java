package step9;

import java.io.File;
import java.io.IOException;

public class MultiFileService {
	
	public void createDirAndMultiFile(String dir, String songInfo) throws IOException {
		// TODO Auto-generated method stub
		//File dir1 = new File(dir);
//		File parentFile = dir1.getParentFile();
//		System.out.println(parentFile);
		//dir1.mkdir();
		new File(dir).mkdirs();
		String songs[] = songInfo.split(",");
		for(int i =0; i<songs.length;i++) {
			new File(dir+File.separator+songs[i]).createNewFile();
		}
		
	}

}

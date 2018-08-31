package step11;

import java.io.File;

import javax.swing.JPopupMenu.Separator;

public class MoveFileService {

	public void moveAll(String orgPath, String destPath, String ext) {
		// TODO Auto-generated method stub
		new File(destPath).mkdir();
		File dir = new File(orgPath);
		File list[] = dir.listFiles();
		System.out.println(dir.list()+"list");
		System.out.println(dir.listFiles()+"fileslist");
		System.out.println(list[0]+"zz");																																																																																																																																																																																																																																																																																																																																																																																																												
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile() && list[i].getName().endsWith(ext)) {

				list[i].renameTo(new File(destPath + File.separator +list[i].getName()));

			}
		}

	}

}

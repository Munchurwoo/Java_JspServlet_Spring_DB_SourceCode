package step5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiFileService {
	/*
	 * orgDir ���丮 ���� �ִ� ���ϵ��� �����ؼ� destDir ���丮�� �ٿ��ֱ��ϴ� ���
	 */
	public void executeCopyAndPasteDir(String orgDir, String destDir) throws IOException {
		new File(destDir).mkdirs();
		File list[] = new File(orgDir).listFiles();
		System.out.println(list[1]);
		System.out.println(list[1].getName());
		for (int i = 0; i < list.length; i++) {
			executeCopyAndPasteFile(list[i].getPath(), destDir + File.separator + list[i].getName());
		} // for
	}// method

	public void executeCopyAndPasteFile(String orgPath, String destPath) throws IOException {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader(orgPath));
			pw = new PrintWriter(new FileWriter(destPath));
			String line = br.readLine();
			while (line != null) {
				pw.println(line);
				line = br.readLine();
			}
		} finally {
			if (pw != null)
				pw.close();
			if (br != null)
				br.close();
		}
	}
}
package step4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class copyAndPasteFileService {

	public void execute(String orgPath, String destPath) throws IOException {
		// TODO Auto-generated method stub
		File dir = new File(destPath);
		System.out.println(dir.getParentFile());

		if (dir.isDirectory() == false)
			dir.getParentFile().mkdir();
		if (dir.isFile() == false)
			dir.createNewFile();

		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader(orgPath));
			pw = new PrintWriter(new FileWriter(destPath));
			String line = br.readLine();
			while (line != null) {
				pw.println(line);
				line = br.readLine();
				System.out.println(line);
			}
		} finally {
			if (br != null)
				br.close();
			if (pw != null)
				pw.close();
		}
	}
}

package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOService {
	/*
	 * filePath�� �ش��ϴ� ���� �����ǰ� message ������ ��ϵȴ�.
	 */
	public void writeFile(String filePath, String string) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(filePath),true);
			pw.println(string);
//			pw.close(); .
		} finally {
			// ���ۿ� �ִ� ������ ���( flush ) �ǰ� ��Ʈ���� �ݴ´�
			if (pw != null) {
				pw.close();
			}
		}
	}
}

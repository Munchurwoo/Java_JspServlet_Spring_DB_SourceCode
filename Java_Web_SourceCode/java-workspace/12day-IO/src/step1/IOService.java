package step1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOService {
	/*
	 * filePath에 해당하는 파일 생성되고 message 정보가 기록된다.
	 */
	public void writeFile(String filePath, String string) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(filePath),true);
			pw.println(string);
//			pw.close(); .
		} finally {
			// 버퍼에 있는 정보가 출력( flush ) 되고 스트림을 닫는다
			if (pw != null) {
				pw.close();
			}
		}
	}
}

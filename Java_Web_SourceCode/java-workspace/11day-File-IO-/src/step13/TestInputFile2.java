package step13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInputFile2 {
	public static void main(String[] args) {
		String path = "C:\\java-kosta\\test\\output.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			// 문자열이 존재할 때까지 출력하도록 코딩
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();

		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

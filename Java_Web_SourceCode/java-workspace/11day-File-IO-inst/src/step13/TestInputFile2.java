package step13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInputFile2 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\output.txt";	
		try {
			BufferedReader br=new BufferedReader(new FileReader(path));
			// 문자열이 존재할 때까지 모두 출력하도록 코딩~
			String line=br.readLine();//한 라인을 입력받는다
			while(line!=null) {//null 이 아닐때까지 반복한다 
				System.out.println(line);
				line=br.readLine();//다음 라인을 읽는다 
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}









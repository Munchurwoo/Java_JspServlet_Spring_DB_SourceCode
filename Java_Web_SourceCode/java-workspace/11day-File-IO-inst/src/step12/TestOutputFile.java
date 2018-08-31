package step12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* IO 입출력 스트림 테스트 
 * File 생성 후 
 * 정보를 출력하여 저장하는 예제 
 */
public class TestOutputFile {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\output.txt";
		try {
			// FileWriter 는 파일이 없으면 새로 생성 
			FileWriter fw=new FileWriter(path,true);//true : append 정보 추가
			System.out.println("파일이 없으면 새로 파일 생성");
			PrintWriter pw=new PrintWriter(fw);
			pw.println("덥다 더워~");//파일에 문자열을 출력 
			pw.close();
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
}








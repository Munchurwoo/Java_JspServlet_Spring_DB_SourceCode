package step3;

import java.io.FileNotFoundException;
import java.io.FileReader;

class MemoService{
	/*	 fileName 에 해당하는 파일이 존재하지 않으면 
	 *  FileReader 의 생성자는 FileNotFoundException을 발생시키고
	 *  호출한 아래 코드로 해당 Exception을 던진다 
	 *  이 때 try catch(예외처리) 또는 throws로 예외를 처리하지 않고
	 *  자신(readMemo) 을 호출한 곳으로 Exception 을 던져 
	 *  예외 처리를 위임한다  
	 *  
	 */
	public void readMemo(String fileName) throws FileNotFoundException {
		FileReader f=new FileReader(fileName);
		System.out.println(fileName+" 파일 읽기 작업");	
		System.out.println(1);
	}
}
public class TestThrows1 {
	public static void main(String[] args)  {
		String path="C:\\java-kosta\\a2.txt";
		 path="C:\\java-kosta\\a.txt";
		MemoService service=new MemoService();
		try {
			service.readMemo(path);
			System.out.println("메모 읽기 작업 후   후속작업");
			System.out.println(2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(3);
		}finally {
			System.out.println(4);
		}
		System.out.println("프로그램 정상수행");
		System.out.println(5);
	}
}







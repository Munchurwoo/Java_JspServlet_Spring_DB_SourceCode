package step4;

import java.util.Scanner;

//java.util.Scanner class를 이용해 콘솔에서 데이터 입력받는 예제 
public class TestScanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);//System.in : 콘솔에 연결해서 입력
		while(true) {
		System.out.println("메세지를 입력하세요!");
		String message=s.nextLine();
		if(message.equals("그만"))
			break;
		System.out.println("입력한 메세지:"+message);	
		}
		s.close();
	}
}








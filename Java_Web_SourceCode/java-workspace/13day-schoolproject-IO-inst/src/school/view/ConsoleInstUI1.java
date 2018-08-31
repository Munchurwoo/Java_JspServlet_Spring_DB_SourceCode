package school.view;

import java.util.Scanner;

public class ConsoleInstUI1 {
	//private SchoolService service=new SchoolService();
	private Scanner scanner=new Scanner(System.in);
	public void execute() {
		System.out.println("*******학사관리프로그램을 시작합니다******");
		System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
		String menu=scanner.nextLine();//사용자로부터 메뉴번호를 입력받는다
		switch(menu) {
		case "5":
			System.out.println("*******학사관리프로그램을 종료합니다******");
			break;
		}//switch		
	}//execute method
}//class














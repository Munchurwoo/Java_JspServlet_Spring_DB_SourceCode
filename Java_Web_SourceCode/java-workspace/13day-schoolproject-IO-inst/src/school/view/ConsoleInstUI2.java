package school.view;

import java.util.Scanner;

public class ConsoleInstUI2 {
	//private SchoolService service = new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() {
		System.out.println("*******학사관리프로그램을 시작합니다******");
		//제어문 label --> 아래 5 종료시 break만 명시하면 해당 switch문만
		//벗어나므로 아래 while문 전체를 벗어나야 프로그램이 종료되므로
		//레이블을 이용한다 
		exit: 
		while (true) {
			System.out.println("1. 추가 2. 삭제 3. 검색 4. 전체회원보기 5.종료");
			String menu = scanner.nextLine();// 사용자로부터 메뉴번호를 입력받는다
			switch (menu) {
			case "1":
				System.out.println("구성원 추가작업");
				break;
			case "2":
				System.out.println("구성원 삭제작업");
				break;
			case "3":
				System.out.println("구성원 검색작업");
				break;
			case "4":
				System.out.println("구성원 리스트 출력작업");
				break;
			case "5":
				System.out.println("*******학사관리프로그램을 종료합니다******");
				break exit;//while문을 벗어나도록 레이블을 사용한다 
			default: // 1~5 아닌 값은 default에서 처리
				System.out.println("잘못된 입력값입니다!");
			}// switch
		} // while
	}// execute method
}// class

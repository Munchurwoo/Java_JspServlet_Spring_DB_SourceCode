package step1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuIOService {
	private String savePath;

	// savePath 파일이 저장된 디렉토리가 없으면 새로 생성
	public MenuIOService(String savePath) {
		this.savePath = savePath;
		File dir = new File(savePath).getParentFile();
		if (dir.isDirectory() == false) {
			dir.mkdirs();
		}
	}

	/*
	 * 콘솔 기반 메뉴 주문할 수 있도록 구현한다. 실행 예
	 * 
	 * 메뉴를 입력하세요 쌀국수 (사용자입력) 쌀국수 주문 메뉴를 입력하세요 곱창(사용자 입력) 곱창 주문 주문완료(사용자 입력) 주문을
	 * 완료했습니다.
	 * 
	 * savePath 파일에 저장되어 있어야 한다. 쌀국수, 곱창
	 */
	public void orderMenu(String savePath) throws IOException {
		PrintWriter pw = null;
		boolean i = true;
		Scanner scan = null;

		while (i) {
			try {
				scan = new Scanner(System.in);
				pw = new PrintWriter(new FileWriter(savePath, true), true);
				System.out.println("메뉴를 입력하세요.");
				String a = scan.nextLine();
				if (a.equals("주문완료")) {
					System.out.println("주문이 완료 됬습니다.");
					break;
				}
				System.out.println(a + "를 주문하셨습니다.");
				pw.println(a);
			} finally {
				if (pw != null) {
					pw.close();
				}
				if (pw != null) {
					scan.close();
				}
			}
		}

	}
}

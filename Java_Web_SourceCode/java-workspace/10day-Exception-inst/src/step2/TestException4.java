package step2;

import java.util.Scanner;

public class TestException4 {
	public static void main(String[] args) {
		System.out.println("출금액을 숫자로 입력하세요!");
		Scanner s=new Scanner(System.in);
		String info=s.nextLine();
		int money=0;
		try {
			//아래 코드 실행시 Exception 발생하면 즉시 catch로 이동된다 
			money=Integer.parseInt(info);	
			//아래 코드는 정상 실행시에만 동작된다 
			System.out.println("출금완료 출금액은 "+money*2);
			System.out.println("출금작업종료");
		}catch (NumberFormatException e) {
			System.out.println("고객님 출금액은 숫자로 입력하세요");
		}
		System.out.println("시스템 종료");
		s.close();
	}
}









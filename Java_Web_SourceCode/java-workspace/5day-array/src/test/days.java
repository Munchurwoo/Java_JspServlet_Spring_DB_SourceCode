package test;

import java.util.Scanner;

public class days {
	
	public static void calendar (double day) {
		double DateOfAttendance =0;
		DateOfAttendance = day*0.8;
		System.out.println("필수 출석 일수 : "+DateOfAttendance);
		System.out.println("결석 가능 횟수 : "+(day-DateOfAttendance));
	}
	public static void main(String[] args) {
		System.out.println("80프로 출석일수 분석 프로그램");
		System.out.println("일수를 입력하세요. ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		calendar(input);
	}
}

package test;

import java.util.Scanner;

public class days {
	
	public static void calendar (double day) {
		double DateOfAttendance =0;
		DateOfAttendance = day*0.8;
		System.out.println("�ʼ� �⼮ �ϼ� : "+DateOfAttendance);
		System.out.println("�Ἦ ���� Ƚ�� : "+(day-DateOfAttendance));
	}
	public static void main(String[] args) {
		System.out.println("80���� �⼮�ϼ� �м� ���α׷�");
		System.out.println("�ϼ��� �Է��ϼ���. ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		calendar(input);
	}
}

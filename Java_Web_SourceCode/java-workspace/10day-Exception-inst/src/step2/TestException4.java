package step2;

import java.util.Scanner;

public class TestException4 {
	public static void main(String[] args) {
		System.out.println("��ݾ��� ���ڷ� �Է��ϼ���!");
		Scanner s=new Scanner(System.in);
		String info=s.nextLine();
		int money=0;
		try {
			//�Ʒ� �ڵ� ����� Exception �߻��ϸ� ��� catch�� �̵��ȴ� 
			money=Integer.parseInt(info);	
			//�Ʒ� �ڵ�� ���� ����ÿ��� ���۵ȴ� 
			System.out.println("��ݿϷ� ��ݾ��� "+money*2);
			System.out.println("����۾�����");
		}catch (NumberFormatException e) {
			System.out.println("���� ��ݾ��� ���ڷ� �Է��ϼ���");
		}
		System.out.println("�ý��� ����");
		s.close();
	}
}









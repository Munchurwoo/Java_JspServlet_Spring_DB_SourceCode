package step4;

import java.util.Scanner;

//java.util.Scanner class�� �̿��� �ֿܼ��� ������ �Է¹޴� ���� 
public class TestScanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);//System.in : �ֿܼ� �����ؼ� �Է�
		while(true) {
		System.out.println("�޼����� �Է��ϼ���!");
		String message=s.nextLine();
		if(message.equals("�׸�"))
			break;
		System.out.println("�Է��� �޼���:"+message);	
		}
		s.close();
	}
}








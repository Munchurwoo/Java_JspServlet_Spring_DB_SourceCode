package school.view;

import java.util.Scanner;

public class ConsoleInstUI1 {
	//private SchoolService service=new SchoolService();
	private Scanner scanner=new Scanner(System.in);
	public void execute() {
		System.out.println("*******�л�������α׷��� �����մϴ�******");
		System.out.println("1. �߰� 2. ���� 3. �˻� 4. ��üȸ������ 5.����");
		String menu=scanner.nextLine();//����ڷκ��� �޴���ȣ�� �Է¹޴´�
		switch(menu) {
		case "5":
			System.out.println("*******�л�������α׷��� �����մϴ�******");
			break;
		}//switch		
	}//execute method
}//class














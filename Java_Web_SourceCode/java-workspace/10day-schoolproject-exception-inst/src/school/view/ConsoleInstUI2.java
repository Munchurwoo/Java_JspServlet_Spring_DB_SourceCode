package school.view;

import java.util.Scanner;

public class ConsoleInstUI2 {
	//private SchoolService service = new SchoolService();
	private Scanner scanner = new Scanner(System.in);

	public void execute() {
		System.out.println("*******�л�������α׷��� �����մϴ�******");
		//��� label --> �Ʒ� 5 ����� break�� ����ϸ� �ش� switch����
		//����Ƿ� �Ʒ� while�� ��ü�� ����� ���α׷��� ����ǹǷ�
		//���̺��� �̿��Ѵ� 
		exit: 
		while (true) {
			System.out.println("1. �߰� 2. ���� 3. �˻� 4. ��üȸ������ 5.����");
			String menu = scanner.nextLine();// ����ڷκ��� �޴���ȣ�� �Է¹޴´�
			switch (menu) {
			case "1":
				System.out.println("������ �߰��۾�");
				break;
			case "2":
				System.out.println("������ �����۾�");
				break;
			case "3":
				System.out.println("������ �˻��۾�");
				break;
			case "4":
				System.out.println("������ ����Ʈ ����۾�");
				break;
			case "5":
				System.out.println("*******�л�������α׷��� �����մϴ�******");
				break exit;//while���� ������� ���̺��� ����Ѵ� 
			default: // 1~5 �ƴ� ���� default���� ó��
				System.out.println("�߸��� �Է°��Դϴ�!");
			}// switch
		} // while
	}// execute method
}// class

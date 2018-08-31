package step1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuIOService {
	private String savePath;

	// savePath ������ ����� ���丮�� ������ ���� ����
	public MenuIOService(String savePath) {
		this.savePath = savePath;
		File dir = new File(savePath).getParentFile();
		if (dir.isDirectory() == false) {
			dir.mkdirs();
		}
	}

	/*
	 * �ܼ� ��� �޴� �ֹ��� �� �ֵ��� �����Ѵ�. ���� ��
	 * 
	 * �޴��� �Է��ϼ��� �ұ��� (������Է�) �ұ��� �ֹ� �޴��� �Է��ϼ��� ��â(����� �Է�) ��â �ֹ� �ֹ��Ϸ�(����� �Է�) �ֹ���
	 * �Ϸ��߽��ϴ�.
	 * 
	 * savePath ���Ͽ� ����Ǿ� �־�� �Ѵ�. �ұ���, ��â
	 */
	public void orderMenu(String savePath) throws IOException {
		PrintWriter pw = null;
		boolean i = true;
		Scanner scan = null;

		while (i) {
			try {
				scan = new Scanner(System.in);
				pw = new PrintWriter(new FileWriter(savePath, true), true);
				System.out.println("�޴��� �Է��ϼ���.");
				String a = scan.nextLine();
				if (a.equals("�ֹ��Ϸ�")) {
					System.out.println("�ֹ��� �Ϸ� ����ϴ�.");
					break;
				}
				System.out.println(a + "�� �ֹ��ϼ̽��ϴ�.");
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

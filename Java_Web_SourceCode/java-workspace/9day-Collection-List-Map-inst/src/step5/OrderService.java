package step5;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
	public void orderMenu() {
		Scanner s = new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("**���ɸ޴��� �Է��ϼ���**");
		while (true) {
			String menu = s.nextLine();
			if (menu.equals("�ֹ��Ϸ�"))
				break;
			list.add(menu);
			System.out.println(menu + " �ֹ��ϼ̽��ϴ�");
		}
		System.out.println("**�ֹ�����Ʈ**");
		for(int i=0;i<list.size();i++)
			System.out.println(i+1+"."+list.get(i));
		s.close();
	}
}








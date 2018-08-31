package step5;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
	public void orderMenu() {
		Scanner s = new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("**점심메뉴를 입력하세요**");
		while (true) {
			String menu = s.nextLine();
			if (menu.equals("주문완료"))
				break;
			list.add(menu);
			System.out.println(menu + " 주문하셨습니다");
		}
		System.out.println("**주문리스트**");
		for(int i=0;i<list.size();i++)
			System.out.println(i+1+"."+list.get(i));
		s.close();
	}
}








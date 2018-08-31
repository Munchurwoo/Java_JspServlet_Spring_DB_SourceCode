package loop.test;

import java.util.ArrayList;

public class TestLoop {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("������");
		list.add("Ȳ����");
		list.add("���̸�");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String s : list)
			System.out.println(s);
		System.out.println("***************");
		String items[] = { "������7", "¥���", "�Ƹ޸�ī��" };
		for (String i : items)
			System.out.println(i);
		System.out.println("***************");
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("������",26));
		personList.add(new Person("������",38));
		for(Person p:personList)
			System.out.println(p.getName());
	}
}

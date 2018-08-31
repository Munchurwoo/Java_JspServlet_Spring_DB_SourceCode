package loop.test;

import java.util.ArrayList;

public class TestLoop {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("심지영");
		list.add("황성진");
		list.add("서미리");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String s : list)
			System.out.println(s);
		System.out.println("***************");
		String items[] = { "아이폰7", "짜장면", "아메리카노" };
		for (String i : items)
			System.out.println(i);
		System.out.println("***************");
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("아이유",26));
		personList.add(new Person("강동원",38));
		for(Person p:personList)
			System.out.println(p.getName());
	}
}

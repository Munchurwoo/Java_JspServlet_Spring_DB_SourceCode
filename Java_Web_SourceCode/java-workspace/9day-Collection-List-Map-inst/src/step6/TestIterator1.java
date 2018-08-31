package step6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestIterator1 {
	public static void main(String[] args) {
		// Iterator 인터페이스를 활용하는 예제 
		ArrayList<String> list=new ArrayList<String>();
		list.add("문준위"); list.add("허도형"); list.add("이성열");
		System.out.println("**for문을 이용해 요소를 열거**");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println("**Iterator를 이용해 요소를 열거**");
		//Iterator : 반복자 , 자료구조체의 요소들을 반복해서 열거하기 위한
		// 표준화된 방법을 정의한 인터페이스 
		Iterator<String> it=list.iterator();
		while(it.hasNext())//다음 요소가 존재하면 true 
			System.out.println(it.next());
		System.out.println("***************************");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("이성렬"); set.add("문준위"); set.add("허도형");
		Iterator<String> it2=set.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
	}
}










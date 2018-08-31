package step8;

import java.util.Set;
import java.util.TreeSet;

public class TestSet2 {
	public static void main(String[] args) {
		/*
		 * set 계열  : 요소의 중복을 허용하지 않는다. 
		 * LinkedHashSet : 추가한 순서대로 저장된다. 
		 * TreeSet : 정렬 기능이 내장되어 있다. 
		 */
		Set<Integer> set = new TreeSet<Integer>();
		System.out.println(set.isEmpty()); //비어 있나? 
		set.add(5);
		set.add(3);
		set.add(1);
		set.add(3); //요소가 중복되어 추가 안된다. 
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set.isEmpty());
		
	}
}

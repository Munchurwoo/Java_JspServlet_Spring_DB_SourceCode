package step8;

import java.util.Set;
import java.util.TreeSet;

public class TestSet2 {
	public static void main(String[] args) {
		/*
		 * set �迭  : ����� �ߺ��� ������� �ʴ´�. 
		 * LinkedHashSet : �߰��� ������� ����ȴ�. 
		 * TreeSet : ���� ����� ����Ǿ� �ִ�. 
		 */
		Set<Integer> set = new TreeSet<Integer>();
		System.out.println(set.isEmpty()); //��� �ֳ�? 
		set.add(5);
		set.add(3);
		set.add(1);
		set.add(3); //��Ұ� �ߺ��Ǿ� �߰� �ȵȴ�. 
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set.isEmpty());
		
	}
}

package step6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestIterator1 {
	public static void main(String[] args) {
		// Iterator �������̽��� Ȱ���ϴ� ���� 
		ArrayList<String> list=new ArrayList<String>();
		list.add("������"); list.add("�㵵��"); list.add("�̼���");
		System.out.println("**for���� �̿��� ��Ҹ� ����**");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println("**Iterator�� �̿��� ��Ҹ� ����**");
		//Iterator : �ݺ��� , �ڷᱸ��ü�� ��ҵ��� �ݺ��ؼ� �����ϱ� ����
		// ǥ��ȭ�� ����� ������ �������̽� 
		Iterator<String> it=list.iterator();
		while(it.hasNext())//���� ��Ұ� �����ϸ� true 
			System.out.println(it.next());
		System.out.println("***************************");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("�̼���"); set.add("������"); set.add("�㵵��");
		Iterator<String> it2=set.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
	}
}










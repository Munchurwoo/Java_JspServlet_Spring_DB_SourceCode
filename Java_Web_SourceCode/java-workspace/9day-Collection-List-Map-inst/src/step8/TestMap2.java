package step8;

import java.util.Iterator;
import java.util.LinkedHashMap;

import step2.Friend;

public class TestMap2 {
	public static void main(String[] args) {
		LinkedHashMap<String, Friend> map
							=new LinkedHashMap<String,Friend>();
		map.put("a", new Friend("�輺��","�̱�",28));
		map.put("b", new Friend("�ֿ��","����",24));
		System.out.println(map.get("b"));
		// ���� map value ��ҵ��� address �� ��� ��� 
	/*	Collection<Friend> c=map.values();
		Iterator<Friend> it=c.iterator();*/
		Iterator<Friend> it=map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next().getAddress());
		map.put("c",new Friend("Ȳ����","�Ⱦ�",28));
		// map �� key �鸸 ���� 
		/*Set<String> set=map.keySet();
		Iterator<String> it2=set.iterator();*/
		Iterator<String> it2=map.keySet().iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
	}
}










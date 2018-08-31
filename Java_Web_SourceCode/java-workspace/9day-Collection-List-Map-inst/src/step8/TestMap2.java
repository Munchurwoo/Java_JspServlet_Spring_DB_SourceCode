package step8;

import java.util.Iterator;
import java.util.LinkedHashMap;

import step2.Friend;

public class TestMap2 {
	public static void main(String[] args) {
		LinkedHashMap<String, Friend> map
							=new LinkedHashMap<String,Friend>();
		map.put("a", new Friend("김성민","미금",28));
		map.put("b", new Friend("최요셉","수원",24));
		System.out.println(map.get("b"));
		// 현재 map value 요소들의 address 만 모두 출력 
	/*	Collection<Friend> c=map.values();
		Iterator<Friend> it=c.iterator();*/
		Iterator<Friend> it=map.values().iterator();
		while(it.hasNext())
			System.out.println(it.next().getAddress());
		map.put("c",new Friend("황성진","안양",28));
		// map 의 key 들만 나열 
		/*Set<String> set=map.keySet();
		Iterator<String> it2=set.iterator();*/
		Iterator<String> it2=map.keySet().iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
	}
}










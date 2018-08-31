package step8;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap1 {
	public static void main(String[] args) {
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("a", "최요셉");//key와 value로 저장 
		map.put("b", "김성민");
		System.out.println(map.get("a"));
		System.out.println(map.get("c"));//없으면 null
		System.out.println(map.size());
		map.put("b", "아이유");//key는 유일해야 한다. 이 경우 value가 update
		System.out.println(map);
		System.out.println(map.containsKey("b"));//key가 존재하면 true 
		map.remove("b");
		System.out.println(map);
	}
}









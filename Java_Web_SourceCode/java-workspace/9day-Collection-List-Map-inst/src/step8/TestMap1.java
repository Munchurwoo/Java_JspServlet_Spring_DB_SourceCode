package step8;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap1 {
	public static void main(String[] args) {
		Map<String,String> map=new LinkedHashMap<String,String>();
		map.put("a", "�ֿ��");//key�� value�� ���� 
		map.put("b", "�輺��");
		System.out.println(map.get("a"));
		System.out.println(map.get("c"));//������ null
		System.out.println(map.size());
		map.put("b", "������");//key�� �����ؾ� �Ѵ�. �� ��� value�� update
		System.out.println(map);
		System.out.println(map.containsKey("b"));//key�� �����ϸ� true 
		map.remove("b");
		System.out.println(map);
	}
}









package step7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

class ItemService{
	public Collection<String> requestInfo(String type) {
		Collection<String> c=null;
		if(type.equals("종류")) {
			c=new LinkedHashSet<String>();
			c.add("아우디"); c.add("소나타");
		}else if(type.equals("목록")) {
			c=new ArrayList<String>();
			c.add("갤럭시9"); c.add("G7"); c.add("아이폰8");
		}
		return c;
	}
}
public class TestIterator2 {
	public static void main(String[] args) {
		ItemService service=new ItemService();
		String type="종류";
		type="목록";
		Collection<String> c=service.requestInfo(type);
		// LinkedHashSet 구조체이든 , ArrayList 구조체이든 관계없이
		// 표준화된 방법으로 요소들을 반복 열거할 수 있다 
		Iterator<String> it=c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}







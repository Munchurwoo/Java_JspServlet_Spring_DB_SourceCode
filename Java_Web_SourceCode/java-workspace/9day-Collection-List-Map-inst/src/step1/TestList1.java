package step1;

import java.util.ArrayList;
import java.util.List;

public class TestList1 {
	public static void main(String[] args) {
		/*List list=new ArrayList();
		list.add("아이유");
		list.add("허도형");
		list.add("아이유");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(1));
		//String class의 메서드를 이용해 이름이 몇자인지 확인 
		String name="문준위공익";
		System.out.println(name.length());
		// list 의 2번째 요소의 문자열 길이를 출력하고자 한다 
		String str=(String)list.get(1);//Object 타입이므로 캐스팅이 필요하다
		System.out.println(str.length());
		list.add(false);*/// 다른 성질의 데이터가 저장될 수도 있다 
		// 아래처럼 요소의 타입을 Generic 으로 지정하면 
		// 객체 캐스팅 절차도 감소하고 데이터의 종류도 제한할 수 있다 
		List<String> nameList=new ArrayList<String>();
		nameList.add("아이유");
		nameList.add("허도형");
		nameList.add("아이유");
		//별도의 캐스팅 없이 바로 String class의 메서드 사용가능 
		System.out.println(nameList.get(1).length());
		for(int i=0;i<nameList.size();i++)
			System.out.println(nameList.get(i));		
		nameList.set(2, "서미리");//해당 인덱스의 정보를 수정 
		System.out.println(nameList.get(2));
		nameList.remove(0); // 첫번째 요소를 삭제 
		System.out.println(nameList);
		System.out.println(nameList.contains("이성열"));
		System.out.println(nameList.contains("허도형"));
		nameList.clear();
		System.out.println(nameList);
	}
}

























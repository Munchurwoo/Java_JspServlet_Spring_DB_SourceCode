package step8;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Set Interface 를 implements 하는 클래스를 사용하는 예제 
 */
public class TestSet {
	public static void main(String[] args) {
		// <String> : Generic 요소의 타입을 명시 -> 데이터 안정성 
		Set<String> set1 = new LinkedHashSet<String>();
		set1.add("아이유");
		set1.add("박보검");
		set1.add("아이유"); // 중복되므로 add 되지 않는다. Set 계열은 중복 x 
		System.out.println(set1.size());
		set1.add("설현");
		//추가한 순서대로 저장된다. LinkedHashSet 의 특징 
		System.out.println(set1.toString());
		System.out.println(set1); // 내부적으로 toString() 호출하므로 위와 결과 같다. 
	}
}

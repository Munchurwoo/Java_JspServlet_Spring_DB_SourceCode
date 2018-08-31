package step1;
/*
 * java 문자열 클래스 String 과 StringBuilder 를 빅해서 이해하는 예제 
 */
public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String str = "아이유 ";
		String str2 = "아이유 ";
		
		// 위와 같이 String을 생성하면 아이유 문자열을 heap 영역내의 
		// 문자열 상수 영역에 하나의 문자열로 저장되고 
		// 여러 변수에서 참조하는 방식으로 운용된다. 
		// 동일한 문자열을 반복적으로 사용될 때 메모리에 효율적인 방식 
		System.out.println(str2.concat("공주님")); // String 이므로 새로 생성
		System.out.println(str2); // 기존 문자열 변경 안됨 
		// StringBuilder 방식으로 문자열을 만들어보자 
		StringBuilder sb = new StringBuilder("신현수");
		System.out.println(sb);
		// sb 문자열 뒤에 반장님 추가 
		System.out.println(sb.append(" 반장님"));
		System.out.println(sb);
	}
}

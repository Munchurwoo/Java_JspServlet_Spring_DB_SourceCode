package step2;

public class TestStringBuilder {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("아이유");
//		System.out.println(sb.append("가수"));
//		System.out.println(sb); // 문자열 자체가 변경 
//		System.out.println(sb.length());
//		System.out.println(sb.charAt(1)); // 인덱스에 해당하는 문자열 반환 
//		System.out.println(sb.indexOf("유")); // 문자열에 해당하는 인덱스 반환 
//		System.out.println(sb.indexOf("빵")); // 문자열에 해당하는 인덱스가 없으며 -1 반환 
//		String name = "아이유가수";
//		//String name 과 StringBuilder sb 와 비교 
//		//StringBuilder를 String 으로 변경해서 비교해야 한다. 
//		System.out.println(name.equals(sb.toString()));
//		StringBuilder sb1 = new StringBuilder("신현수");
//		StringBuilder sb2 = new StringBuilder("신현수");
//		System.out.println(sb1==sb2);// sb1 sb2 는 다른 객체기 때문에 false 반환 
//		//StringBUILDER 는 String 처럼 equals 메서드가 오버라이딩 되어 있지 않다 
//		// Object 의 equals 메서드는 주소값 비교이므로 false 
//		
//		System.out.println(sb1.equals(sb2)); 
//		//String class 는 equals 메서드를 오버라이딩하여 실제 문자열을 비교하도록 구현했으므로 
//		System.out.println(sb1.toString().equals(sb2.toString()));
		StringBuilder sb3 = new StringBuilder("뻐이");
		sb3.append("장가가니");
		System.out.println(sb3.reverse());
	}
	
}

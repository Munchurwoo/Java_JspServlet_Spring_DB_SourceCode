package test6;
/*
 * 문자열 비교시에는 == 연산자로 하지 않고 
 * 반드시 equals(str) : boolean 메서드를 사용해서 실제 문자열을 비교한다.
 */
public class TestStringEquals {
	public static void main(String[] args) {
		String str1="아이유";
		String str2="아이유";
		System.out.println(str1==str1);
		String str3=new String("아이유");
		System.out.println(str1==str3);
		StringBuilder sb = new StringBuilder("아이유");
		System.out.println(str1.equals(sb.toString()));
	}
}

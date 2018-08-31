package step1;
/* java 문자열 클래스 String 과 StringBuilder 를 비교해서 이해하는 예제
 * 
 */
public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String str="아이유";
		System.out.println(str);
		String str2="아이유";
		//위와 같이 String을 생성하면 아이유 문자열을 heap 영역내의
		//문자열 상수 영역에 하나의 문자열로 저장되고 
		//여러 변수에서 참조하는 방식으로 운용된다 
		//동일한 문자열을 반복적으로 사용될 때 메모리에 효율적인 방식 
		//str2 문자열 뒤에 특정 문자열을 추가한다
		System.out.println(str2.concat("공주님"));// String이므로 새로 생성 
		System.out.println(str2);//기존 문자열 변경안됨 ( 불변 ) 
		// StringBuilder 방식으로 문자열을 생성해 본다 
		StringBuilder sb=new StringBuilder("신현수");
		System.out.println(sb);
		//sb 문자열 뒤에 반장님 이라고 문자열을 추가해 본다 
		System.out.println(sb.append("반장님"));//StringBuilder이므로 기존문자열 변경
		System.out.println(sb);//자체가 변경되므로 신현수반장님 출력 
	}
}










package step1;

public class TestStatic4 {
	public static void main(String[] args) {
		String s1 = "2";
		String s2="8";
		System.out.println(s1+s2);
		//정수형으로 변환하기 위해 java.lang.Integer 클래스의 
		//static method 인 parseInt() 를 활용한다.
		
		int i = Integer.parseInt(s1);//static 이므로 객체 생성없이 클래스명.맴버 
		int j = Integer.parseInt(s2);//static 이므로 객체 생성없이 클래스명.맴버 
		System.out.println(i+j);
	}
}

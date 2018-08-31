package step8;

import step7.RegDate;

//실행결과를 예상하는 예제 
//참조변수의 주소값 재할당시 어떤 정보가 출력되느냐 
public class TestReferenceVariable {
	public static void main(String[] args) {
		RegDate date1 = new RegDate(2019,1,2);
		RegDate date2 = new RegDate(2020, 7, 11);
		date1=date2;
		System.out.println(date1.getYear());
		System.out.println(date1.getMonth());
		System.out.println(date1.getDay());
	}
}

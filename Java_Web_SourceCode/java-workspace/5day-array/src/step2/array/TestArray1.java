package step2.array;
/*
 * Primitive Data Type 의 data를 저장하는 배열 
 */
public class TestArray1 {
	public static void main(String[] args) {
		// 1. 배열 선언 
		int age[]; // 
		// 2. 배열 생성 
		age=new int[3]; // heap 영역에 배열 객체 생성 
		System.out.println(age[0]); // 정수형이므로 0으로 초기화 되어 있다. 
		//배열 요소에 정보를 할당 
		age[0]=26;
		age[1]=30;
		age[2]=18;
		System.out.println(age.length);
		System.out.println("***for문을 이용해서 모든 요소의 나이를 출력 ***");
		for(int i =0;i<age.length;i++) {
			System.out.println(age[i]);
		}
 	}
}	

package step2;

import java.util.ArrayList;

public class TestException3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("최지선");
		list.add("이정빈");
		try {
		//아래 코드가 실행되면 NumberFormatException 이 발생되는 데 
		//별도의 	NumberFormatException 을 처리하는 catch 구문이 없으므로
		//	catch(Exception e) {} 이 실행된다 
//		System.out.println(Integer.parseInt("일"));
		System.out.println(list.get(2));		
		//하나의 try 블럭에 대한 catch 는 여러개 정의 가능 
		// 구체적인 예외(자식) -> 추상적 예외 (부모) 순으로 명시해야
		}catch (IndexOutOfBoundsException ie) {
			System.out.println("리스트 요소 범위를 초과했음~");
		}catch(Exception e) {
			e.printStackTrace();//Exception 메세지와 경로 출력 
		}
		System.out.println("프로그램 정상 실행");
	}
}








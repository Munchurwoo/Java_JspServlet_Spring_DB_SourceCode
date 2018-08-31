package step1;

class Car{
	// instance variable : heap 영역에 저장되고 객체 생성시 매번 초기화 
	// 객체별로 별도의 공간에 저장 
	int count;
	// static variable ( or class variable ) : class area 영역에 저장되고 
	// 객체 생성과 무관하게 별도의 공간에 저장 ( 하나의 공간에 저장 ) 
	
	static int sCount;
	Car(){
		count++;
		sCount++;
	}
}

public class TestStatic5 {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.count);
		System.out.println(Car.sCount);
		
		Car c2 = new Car();
		System.out.println(c2.count);
		System.out.println(Car.sCount);
		
		Car c3 = new Car();
		System.out.println(c3.count);
		System.out.println(Car.sCount);
	}
}

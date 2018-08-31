package step2;
// Test class 를 보고 이에 대응되는 클래스와 메서드를 정의해보는 예제 

public class TestCar {

	public static void main(String[] args) {
		Car c = new Car();
		c.go(); //자동차가 가다. 출력 
		c.run("소나타",100); 
		// 소나타가 100키로로 달리다 로 출력된다. 
		System.out.println(c.getInfo("소나타","검정"));
		//모델: 소나타 색상: 검정 
	}
}

package step16;
class Animal{
	public void play() {}
}
class Person extends Animal{
	public void play() {
		System.out.println("사람이 데이트하며 놀다");
	}
	public void ticketing() {
		System.out.println("사람이 티켓을 구매하다");
	}
}
class Monkey extends Animal{
	public void play() {
		System.out.println("원숭이가 나무타며 놀다");
	}
}
class ZooService{
	// 실행결과가 아래 주석과 같이 나오도록 enter 메서드를 구현해본다 
	public void enter(Animal a) {
		// Person 타입의 객체인지 비교해서 ticketing을 호출해야 한다 
		if(a instanceof Person) {
			// Person 자식 타입의 독자적인 멤버이므로 object casting이 필요! 
			// a 는 Animal 부모 타입이므로
			((Person) a).ticketing();
		}
		a.play();
	}
}
public class TestInstanceof2 {
	public static void main(String[] args) {
		ZooService service=new ZooService();
     	service.enter(new Person());
		service.enter(new Monkey());		
		/*		사람이 티켓을 구매하다 
		 *     사람이 데이트하며 놀다 
		 *     원숭이가 나무타며 놀다 
		 */
	}
}






package step14;
class AnimalService{
	/*public void accept(Person p) {
		p.eat();
	}
	public void accept(Dog d) {
		d.eat();
	}*/
	// 위와 같이 개별적으로 메서드를 만드는 것이 아니라 
	// 다형성이 지원되므로 아래와 같이 하나의 메서드에서 처리 할 수 있다 
	public void accept(Animal a) {
		a.eat();
	}
}
public class TestPolymorphism2 {
	public static void main(String[] args) {
		AnimalService service=new AnimalService();
		service.accept(new Person());
		service.accept(new Dog());
	//	service.accept(new Car()); // Animal 의 자식이 아니므로 error 
	}
}





package step14;
class AnimalService{
	/*public void accept(Person p) {
		p.eat();
	}
	public void accept(Dog d) {
		d.eat();
	}*/
	// ���� ���� ���������� �޼��带 ����� ���� �ƴ϶� 
	// �������� �����ǹǷ� �Ʒ��� ���� �ϳ��� �޼��忡�� ó�� �� �� �ִ� 
	public void accept(Animal a) {
		a.eat();
	}
}
public class TestPolymorphism2 {
	public static void main(String[] args) {
		AnimalService service=new AnimalService();
		service.accept(new Person());
		service.accept(new Dog());
	//	service.accept(new Car()); // Animal �� �ڽ��� �ƴϹǷ� error 
	}
}





package step2;
class Car{}
class Animal{}
class Person extends Animal{}
class Dog extends Animal{}
public class TestPolymorphismArray {
	public static void main(String[] args) {
		Car[] carArray=new Car[3];
		carArray[0]=new Car();
		carArray[1]=new Car();
		//carArray[2]=new Dog();// Car 타입의 배열이므로 Dog 객체를 요소로
		//담을 수 없다 compile error 
		Animal [] ani=new Animal[3];
		ani[0]=new Animal();
		ani[1]=new Dog();//다형성 적용되므로 자식객체를 요소로 담을 수 있다 
		ani[2]=new Person(); // 자식객체이므로 가능하다 
	}
}










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
		//carArray[2]=new Dog();// Car Ÿ���� �迭�̹Ƿ� Dog ��ü�� ��ҷ�
		//���� �� ���� compile error 
		Animal [] ani=new Animal[3];
		ani[0]=new Animal();
		ani[1]=new Dog();//������ ����ǹǷ� �ڽİ�ü�� ��ҷ� ���� �� �ִ� 
		ani[2]=new Person(); // �ڽİ�ü�̹Ƿ� �����ϴ� 
	}
}










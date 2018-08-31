package step1;

class Car{
	// instance variable : heap ������ ����ǰ� ��ü ������ �Ź� �ʱ�ȭ 
	// ��ü���� ������ ������ ���� 
	int count;
	// static variable ( or class variable ) : class area ������ ����ǰ� 
	// ��ü ������ �����ϰ� ������ ������ ���� ( �ϳ��� ������ ���� ) 
	
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

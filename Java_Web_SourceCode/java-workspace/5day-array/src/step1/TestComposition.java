package step1;
/*
 * consist of, composition relation
 * : ���� aggregation ���� �� ����� ���� 
 *	�����ֱ�(life cycle)�� �Բ� �Ѵ�.  
 * �ڵ����� ������ ������ �ִ�. 
 */
public class TestComposition {
	public static void main(String[] args) {
		Car car = new Car("�ҳ�Ÿ");
		System.out.println(car.getModel());//�ҳ�Ÿ
		System.out.println(car.getEngine().getType());//L4
		System.out.println(car.getEngine().getDisplacement());//2000
		
	}
}

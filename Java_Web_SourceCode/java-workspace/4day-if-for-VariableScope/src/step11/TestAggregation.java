package step11;
/*
 * object relation 
 * aggregation ( has a )
 * ����� ����Ʈ���� �����Ͽ� ����Ѵ�.
 */
public class TestAggregation {
	public static void main(String[] args) {
		Person p =new Person("���¸�",new SmartPhone("�ַ���9","�Ｚ"));;
		System.out.println(p.getName());//���¸�
		System.out.println(p.getSmartPhone().getModel());//�ַ���9
		System.out.println(p.getSmartPhone().getMaker());//�Ｚ
	}
}

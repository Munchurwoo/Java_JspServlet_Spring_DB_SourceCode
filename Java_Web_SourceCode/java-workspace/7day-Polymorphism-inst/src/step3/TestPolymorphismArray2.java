package step3;

public class TestPolymorphismArray2 {
	public static void main(String[] args) {
		Animal a[]= {new Tiger(),new Monkey(),new Person()};
		ZooService service=new ZooService();
		service.enter(a);
		/*		ȣ���̰� ����ϸ� ���
		 *     �����̰� ����Ÿ�� ���
		 *     ����� Ƽ���� �����ϴ�
		 *     ����� ����Ʈ�ϸ� ��� 
		 */
	}
}

package step11;
class Company {//extends Object
	private String name="�Ｚ";
	private String address="�Ǳ�";
	//�θ� Ŭ���� Object�� toString() �� �������̵��Ͽ� 
	//��ü�� �ּҰ� ��ȯ�ϴ� �� ��� �Ӽ� ������ ��ȯ�ϵ��� ������ 
	public String toString() {
		return "name:"+name+" address:"+address;
	}
}
public class TestObject2 {
	public static void main(String[] args) {
		Company c=new Company();
		System.out.println(c.toString());
		// ��ü�� ���������� �ּҰ��� �����ϸ� println() �޼��� ������
		// toString() �� ȣ���ϹǷ� ���� �ڵ�� ���� ����� ��µȴ� 
		System.out.println(c);
	}
}









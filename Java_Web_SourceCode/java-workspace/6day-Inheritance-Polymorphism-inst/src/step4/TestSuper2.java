package step4;
class Parent{
	private int money;
	Parent(int money){
		this.money=money;
	}
	public int getMoney() {
		return money;
	}
}
class Child extends Parent{
	//���� �����ڸ� ������� ������ �Ʒ��� ���� 
	//�����Ͻÿ� �ڵ����� ���Եȴ�
	//�� �� super() �� ���ڰ��� �������� ���� �⺻ �θ�
	//�����ڸ� ȣ���Ѵ�. �θ� Ŭ���� Parent �� �����ڴ�
	//�Ű������� ���ǵǾ� �����Ƿ� compile error�� ���� 
	//Child(){super();}
	// �� ��� �����ڸ� ���� �����ϰ� super() �� �Ű�������
	// �´� ���ڰ��� �Ҵ��ϸ� �ȴ� 
	Child(){
		super(1);
	}
}
public class TestSuper2 {

}

















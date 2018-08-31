package step8;

/*
 * Variable Scope ���� ���� , �ν��Ͻ� ������ ���������� ���̸� Ȯ���ϴ� ���� 
 */
class VariableScopeEx{
	int i; // instance variable
	public void test1(int i ) { // local variable
		System.out.println(i);
		System.out.println(this.i);
	}
	public void test2() {
		//int i ;
		// System.out.println(i); //local variable i �� �ʱ�ȭ���� �ʾƼ� error
		int j =0; // �̿� ���� ����� �ʱ�ȭ�� �ʿ� 
		System.out.println(j);
	}
	public void test3(int money){
		int result = 0; 
		int bonus=20; // local variable�� ����� {���࿵��} �������� ��� 
		if(money>0) {
			result=100;
		}
		System.out.println(result);
		System.out.println(bonus);
	}
}
public class TestVariableScope {
	public static void main(String[] args) {
		VariableScopeEx ex = new VariableScopeEx();
		ex.test1(2);
		ex.test3(5);
	}
}

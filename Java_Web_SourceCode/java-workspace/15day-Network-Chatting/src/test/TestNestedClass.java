package test;
/*
 * Nested class : ��ø Ŭ���� 
 * Ŭ���� ���ο� Ŭ������ ���� 
 * Outer �ܺ� Ŭ������ private member ���� �Ǵ� �޼��忡 �ٷ� ���� �����ϴ�. 
 */
class Outer{
	private int moeny = 100;
	//Nested Class ( Inner class )
	class Inner{
		public void innerTest() {
			//Outer class �� private ������ �ٷ� ���� ���� 
			System.out.println(moeny);
		}
	}
}
public class TestNestedClass {

}

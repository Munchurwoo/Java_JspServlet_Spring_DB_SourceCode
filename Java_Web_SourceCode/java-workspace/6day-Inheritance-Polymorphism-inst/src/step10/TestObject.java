package step10;
//�θ� Ŭ������ ��õǾ� ���� ���� Ŭ������ �ڵ����� extends Object �� ���� 
class A{  // extends Object 
	A(){super();}
}
class B extends A{
	B(){super();}
}
class C extends B{
	C(){super(); }
}
public class TestObject {
	public static void main(String[] args) {
		// A class �� Object class�� ��ӹް� �ִ� 
		new C(); //Object-> A -> B - > C  ������ ��ü ���� 
		
	}
}









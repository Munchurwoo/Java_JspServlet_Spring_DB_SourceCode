package step3;
abstract class A {
	public abstract void a();
	
}
abstract class B extends A{
	public abstract void B();

}
class C extends B{

	@Override
	public void B() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	// 이 떄 구현해야 하는 메서드는?
}
public class TestAbstract2 {

}

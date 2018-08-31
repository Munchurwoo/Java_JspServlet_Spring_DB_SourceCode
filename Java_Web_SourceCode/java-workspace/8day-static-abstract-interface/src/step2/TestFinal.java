package step2;
class FinalEx{
	//final 이 명시되어 있으므로 상수(재할당 불가) 
	final int MAX_PRICE=100;
	void test() {
		//MAX_PRICE=200;
	}
	//final 메서드는 자식 클래스에서 오버라이딩 불가 
	final void test2() {
		
	}
}
class SubFinalEx extends FinalEx{
	//void test2() {}
}
public final  class TestFinal {

}
// final 클래스는 상속 받을 수 없다. 
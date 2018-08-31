package step8;

/*
 * Variable Scope 변수 범위 , 인스턴스 변수와 지역변수의 차이를 확인하는 예제 
 */
class VariableScopeEx{
	int i; // instance variable
	public void test1(int i ) { // local variable
		System.out.println(i);
		System.out.println(this.i);
	}
	public void test2() {
		//int i ;
		// System.out.println(i); //local variable i 가 초기화되지 않아서 error
		int j =0; // 이와 같이 명시적 초기화가 필요 
		System.out.println(j);
	}
	public void test3(int money){
		int result = 0; 
		int bonus=20; // local variable은 선언된 {실행영역} 내에서만 사용 
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

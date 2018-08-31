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
	//만약 생성자를 명시하지 않으면 아래와 같이 
	//컴파일시에 자동으로 삽입된다
	//이 때 super() 는 인자값이 존재하지 않은 기본 부모
	//생성자를 호출한다. 부모 클래스 Parent 의 생성자는
	//매개변수가 정의되어 있으므로 compile error가 난다 
	//Child(){super();}
	// 이 경우 생성자를 직접 정의하고 super() 의 매개변수에
	// 맞는 인자값을 할당하면 된다 
	Child(){
		super(1);
	}
}
public class TestSuper2 {

}

















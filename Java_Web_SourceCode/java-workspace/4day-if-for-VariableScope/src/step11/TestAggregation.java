package step11;
/*
 * object relation 
 * aggregation ( has a )
 * 사람이 스마트폰을 소유하여 사용한다.
 */
public class TestAggregation {
	public static void main(String[] args) {
		Person p =new Person("김태리",new SmartPhone("겔럭시9","삼성"));;
		System.out.println(p.getName());//김태리
		System.out.println(p.getSmartPhone().getModel());//겔럭시9
		System.out.println(p.getSmartPhone().getMaker());//삼성
	}
}

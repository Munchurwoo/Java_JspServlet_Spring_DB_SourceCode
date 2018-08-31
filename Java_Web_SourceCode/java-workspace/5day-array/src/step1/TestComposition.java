package step1;
/*
 * consist of, composition relation
 * : 기존 aggregation 보다 더 긴밀한 관계 
 *	생명주기(life cycle)을 함께 한다.  
 * 자동차는 엔진을 가지고 있다. 
 */
public class TestComposition {
	public static void main(String[] args) {
		Car car = new Car("소나타");
		System.out.println(car.getModel());//소나타
		System.out.println(car.getEngine().getType());//L4
		System.out.println(car.getEngine().getDisplacement());//2000
		
	}
}

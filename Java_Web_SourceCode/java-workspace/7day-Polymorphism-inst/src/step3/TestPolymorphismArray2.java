package step3;

public class TestPolymorphismArray2 {
	public static void main(String[] args) {
		Animal a[]= {new Tiger(),new Monkey(),new Person()};
		ZooService service=new ZooService();
		service.enter(a);
		/*		호랑이가 사냥하며 놀다
		 *     원숭이가 나무타며 놀다
		 *     사람이 티켓을 구매하다
		 *     사람이 데이트하며 놀다 
		 */
	}
}

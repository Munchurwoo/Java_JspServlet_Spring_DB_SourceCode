package step3;

public class ZooService {
	public void enter(Animal[] a) {
			for(int i=0;i<a.length;i++) {
				if(a[i] instanceof Person) {//Person 타입의 객체이면 
					// Object casting 해서 ticketing() 을 호출한다 
					((Person)a[i]).ticketing();
				}
				a[i].play();
			}//for
	}//method
}//class

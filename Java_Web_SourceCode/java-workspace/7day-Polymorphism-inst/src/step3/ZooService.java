package step3;

public class ZooService {
	public void enter(Animal[] a) {
			for(int i=0;i<a.length;i++) {
				if(a[i] instanceof Person) {//Person Ÿ���� ��ü�̸� 
					// Object casting �ؼ� ticketing() �� ȣ���Ѵ� 
					((Person)a[i]).ticketing();
				}
				a[i].play();
			}//for
	}//method
}//class

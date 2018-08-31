package step17;

public class CompanyService {
	/*
	 * 부모 클래스인 Employee 타입으로 매개변수를 선언하면 
	 * 하나의 메서드에서 자식 객체들을 모두 처리할 수 있다  
	 */
	public void calculateAnnualSalary(Employee e) {
		//System.out.println(e.getName()+" "+e.getSalary()*12);
		// Engineer 는 bonus 가 존재하므로 연봉 계산시 반영해야 함 
		int money=e.getSalary();
		if(e instanceof Engineer) {//instanceof 연산자로 Engineer 객체를 비교하여
			// 보너스를 추가한다. 이 때 getBonus() 메서드는 Engineer 객체의 독자적 멤버이므로
			// Object casting 절차를 거쳐야 호출이 가능하다 
			money+=((Engineer) e).getBonus();
		}
		System.out.println(e.getName()+" "+money*12);
	}
}







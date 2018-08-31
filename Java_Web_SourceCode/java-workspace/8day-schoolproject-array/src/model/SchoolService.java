package model;

public class SchoolService {
	private Person[] list;
	private int count;
	public SchoolService(int length) {
		list=new Person[length];
	}
	/*
	 *  배열 요소 중 매개변수로 전달받은 tel 과 일치하는 tel의 구성원 
	 *  인덱스를 반환하는 메서드 
	 *  : addPerson(), findPersonByTel(), updatePerson()
	 *  deletePerson() 에서 모두 재사용할 수 있다. 
	 *  tel 에 해당하는 요소가 배열에 존재하지 않으면 -1 을 반환한다. 
	 */
	public int findIndexByTel(String tel) {
		int index = -1; 
		return index;
	}
	// 배열 요소로 추가, 동일한 tel 이 있으면 추가시키지 않는다. 
	// 011 tel 중복되어 추가할 수 없습니다. 
	public void addPerson(Person p) {
		
	}
	public void printAll() {}
	public Person findPersonByTel(String tel) {
		return null; 
	}
	//011 tel 구성원이 존재하지 않아 수정할 수 없습니다. 
	public void updatePerson(Person p ) {	}
	// 011 tel 구성원이 존재하지 않아 삭제할 수 없습니다. 
	public void deletePerson(String tel) {}
}

package model;

public class SchoolService {
	private Person[] list;
	private int count;
	public SchoolService(int length) {
		list=new Person[length];
	}
	/*
	 *  �迭 ��� �� �Ű������� ���޹��� tel �� ��ġ�ϴ� tel�� ������ 
	 *  �ε����� ��ȯ�ϴ� �޼��� 
	 *  : addPerson(), findPersonByTel(), updatePerson()
	 *  deletePerson() ���� ��� ������ �� �ִ�. 
	 *  tel �� �ش��ϴ� ��Ұ� �迭�� �������� ������ -1 �� ��ȯ�Ѵ�. 
	 */
	public int findIndexByTel(String tel) {
		int index = -1; 
		return index;
	}
	// �迭 ��ҷ� �߰�, ������ tel �� ������ �߰���Ű�� �ʴ´�. 
	// 011 tel �ߺ��Ǿ� �߰��� �� �����ϴ�. 
	public void addPerson(Person p) {
		
	}
	public void printAll() {}
	public Person findPersonByTel(String tel) {
		return null; 
	}
	//011 tel �������� �������� �ʾ� ������ �� �����ϴ�. 
	public void updatePerson(Person p ) {	}
	// 011 tel �������� �������� �ʾ� ������ �� �����ϴ�. 
	public void deletePerson(String tel) {}
}

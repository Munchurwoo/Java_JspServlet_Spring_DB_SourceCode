package step5.test;

import review.step2.Person;

public class TestReferenceDataType {
	public static void main(String[] args) {
		int i = 1; // int �� ������ primitive data type 
		Person p ; // reference data type 
		p= new Person(); // ��ü �����ؼ� p�� ������Ų��. 
		// p �� �������� ( reference variable )
		System.out.println(p);
	}
}

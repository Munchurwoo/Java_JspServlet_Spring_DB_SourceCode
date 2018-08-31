package step5;

import step4.Person;

public class PersonService {
	private Person[] p;
	
	private int max = Integer.MIN_VALUE;
	private int min = Integer.MAX_VALUE;


	public void printMaxAge(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].getAge() > max) {
				max = p[i].getAge();
			}
		}
		System.out.println(max);
	}

	public Person getPersonByMinAge(Person[] p1) {
		Person person =null;
		/*
		 * int minAge=Integer.MAX_VALUE;
		Person person=null;
		for(int i=0;i<p.length;i++) {
			if(p[i].getAge()<minAge) {
				minAge=p[i].getAge();
				person=p[i];
			}//if
		}//for
		return person;
		 */
		for (int i = 0; i < p1.length; i++) {
			if (min > p1[i].getAge()) {
				min = p1[i].getAge();
				person = p1[i];
			}
		}
		return person ;
	}
}

package step5;

import step4.Person;

public class TestRefArray3 {
	public static void main(String[] args) {
		Person p[] = { new Person("박보검", 22), new Person("아이유", 26), 
				new Person("손흥민", 24),new Person("이효리",40) };
		PersonService service = new PersonService();
		//p 배열 요소중 age중 가장 높은 age를 출력하는 메서드를 호출 
		service.printMaxAge(p);
		
		/*
		 *  아래 메서드를 호출하면 p배열 요소중 가장 작은 나이의 요소 객체를 반환해준다. 
		 */
		Person person=service.getPersonByMinAge(p);
		// 박보검 22가 출력된다. 
		System.out.println(person.getName()+" " + person.getAge());
		
	}
}

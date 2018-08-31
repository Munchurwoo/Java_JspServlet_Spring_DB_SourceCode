package step4;

public class TestRefArray2 {
	public static void main(String[] args) {

		Person p[] = { new Person("박보검", 22), new Person("아이유", 26), new Person("손흥민", 24) };
		// p 배열 요소 중 나이가 25세 이하인 요소의 name과 age를 출력한다.
		for (int i = 0; i < p.length; i++) {
			if (p[i].getAge() <= 25) {
				System.out.println(p[i].getAge() + " " + p[i].getName());
			}
		}
		System.out.println("****************");
		// 배열 요소의 age에 10월 더하기 
		for (int i = 0; i < p.length; i++) {
			System.out.println((p[i].getAge()+10) + " " + p[i].getName());
		}
		
		for (int i = 0; i < p.length; i++) {
			p[i].setAge(p[i].getAge()+10);
			System.out.println(p[i].getAge() + " " + p[i].getName());
		}
		
	}
}
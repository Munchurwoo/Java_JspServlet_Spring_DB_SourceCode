package review;

public class TestAggregation {
	public static void main(String[] args) {
		
		Student s = new Student("아이유",new Book("역사의역사","유시민"));
		System.out.println(s.getName());//아이유
		System.out.println(s.getBook());//Book 객체 주소값 출력 
		System.out.println(s.getBook().getTitle());//역사의 역사
		System.out.println(s.getBook().getWriter());//유시민
		
	}
}

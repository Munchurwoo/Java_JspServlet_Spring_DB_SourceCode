package step3;
/*	  throws 와 throw keyword 를 이용한 예제 
 *   throws : 메서드 선언부 마지막에 명시하고
 *   해당 메서드 실행시 발생되는 예외를 
 *   호출한 곳으로 던질 수 있다는 의미의 키워드 
 *   throw : 특정 조건이 충족될 경우 예외를 
 *   			  발생시킨다 
 * 
 */
class Person{
	private int age;
	// throws 를 명시해서 예외 발생시 호출한 곳으로 전달 
	public void setAge(int age) throws InvalidAgeException {
		if(age>0)
			this.age=age;
		else //잘못된 나이이므로 AgeException 발생
			throw new InvalidAgeException(age+" 나이 정보가 아니잖아");
	}
	public int getAge() {
		return age;
	}	
}
public class TestThrows2 {
	public static void main(String[] args) {
		Person p=new Person();
		try {
			p.setAge(-1);
			System.out.println("나이:"+p.getAge());
		} catch (InvalidAgeException e) {			
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}










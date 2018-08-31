package step9;
class Person{
	private String name; 
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}

class Example{
	
	public void test1(Person p) {
		p=new Person("아이유",26);
	}
	public void test2(Person p) {
		p.setName("손흥민");
	}
}

/*
 * 아래 코드의 실행 결과를 예상해본다. ( stack, heap 메모리를 그려보자 )
 */
public class TestVariableScope2 {
	public static void main(String[] args) {
		Example e = new Example();
		Person p = new Person("김태리",29);
		e.test1(p);
		System.out.println(p.getName()+""+p.getAge());
		e.test2(p);
		System.out.println(p.getName()+""+p.getAge());
	}
	
}

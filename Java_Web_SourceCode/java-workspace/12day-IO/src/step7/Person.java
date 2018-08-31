package step7;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 *  객체 직렬화시 부여되는 클래스 버전이다. 
	 */
	private static final long serialVersionUID = 6842612366654336616L;
	private String name;
	private int age;
	
	public Person(String name, int i) {
		super();
		this.name = name;
		this.age = i;
	}

	public Person(String string) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void test() {}
}

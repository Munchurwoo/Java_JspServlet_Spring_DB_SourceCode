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
		p=new Person("������",26);
	}
	public void test2(Person p) {
		p.setName("�����");
	}
}

/*
 * �Ʒ� �ڵ��� ���� ����� �����غ���. ( stack, heap �޸𸮸� �׷����� )
 */
public class TestVariableScope2 {
	public static void main(String[] args) {
		Example e = new Example();
		Person p = new Person("���¸�",29);
		e.test1(p);
		System.out.println(p.getName()+""+p.getAge());
		e.test2(p);
		System.out.println(p.getName()+""+p.getAge());
	}
	
}

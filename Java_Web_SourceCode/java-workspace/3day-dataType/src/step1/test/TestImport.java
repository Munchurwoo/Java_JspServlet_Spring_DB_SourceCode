package step1.test;

import java.util.Date;

import javax.xml.crypto.Data;

import review.step2.Person;
import step1.model.Student;

public class TestImport {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.study();
		Person p = new Person();
		p.setName("������");
		System.out.println(p.getName());
		//jdk ���� �����ϴ� class�� import �Ͽ� ����غ���. 
		Date d = new Date();
		System.out.println(d.toString());
	}
}

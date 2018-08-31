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
		p.setName("아이유");
		System.out.println(p.getName());
		//jdk 에서 제공하는 class를 import 하여 사용해본다. 
		Date d = new Date();
		System.out.println(d.toString());
	}
}

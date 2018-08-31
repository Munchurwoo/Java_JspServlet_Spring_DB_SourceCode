package school.test;

import school.exception.DuplicateTelException;
import school.exception.PersonNotFoundException;
import school.model.Employee;
import school.model.Person;
import school.model.SchoolService;
import school.model.Student;
import school.model.Teacher;

//SchoolService �� Exception ���� �׽�Ʈ 
public class TestUnit {
	  public static void main(String[] args) {
	    SchoolService service = new SchoolService();
	    try {
	     service.addPerson(new Student("011", "����", "�Ǳ�", "14"));
	    } catch (DuplicateTelException e) {
	     System.out.println(e.getMessage());
	    }
	    try {
	     service.addPerson(new Teacher("016", "����", "����", "����"));
	    } catch (DuplicateTelException e) {
	     System.out.println(e.getMessage());
	    }
	    try {
	     service.addPerson(new Employee("017", "������", "�Ǳ�", "�ѹ�"));
	    } catch (DuplicateTelException e) {
	     System.out.println(e.getMessage());
	    }
	    try {
	     service.addPerson(new Teacher("016", "����", "�Ǳ�", "����"));
	    } catch (DuplicateTelException e) {
	     System.out.println(e.getMessage());
	    }
	    service.printAll(); 
	    System.out.println("****************step1:add �Ϸ�****************");
	    try {
	     Person rp = service.findPersonByTel("017");
	     System.out.println(rp);
	    } catch (PersonNotFoundException e) {
	     System.out.println(e.getMessage());
	    }
	    try {
	     Person rp = service.findPersonByTel("010");
	     System.out.println(rp);
	    } catch (PersonNotFoundException e) {
	     System.out.println(e.getMessage());
	    }
	    System.out.println("****************step2:find �Ϸ�****************");  
	    try {
	     service.deletePersonByTel("016");
	     System.out.println("���� ok");
	    } catch (PersonNotFoundException e) {
	     System.out.println(e.getMessage());
	    }
	    try {
	     service.deletePersonByTel("010");
	     System.out.println("���� ok");
	    } catch (PersonNotFoundException e) {
	     System.out.println(e.getMessage());
	    }
	    service.printAll();  
	    System.out.println("****************step3:delete �Ϸ�****************"); 
	    }
	}
	/**********************************************

	016 tel�� �����Ͽ� �߰��Ұ�!
	tel=011, name=����, address=�Ǳ� stuId=14
	tel=016, name=����, address=���� subject=����
	tel=017, name=������, address=�Ǳ� dept=�ѹ�
	****************step1:add �Ϸ�****************
	tel=017, name=������, address=�Ǳ� dept=�ѹ�
	010 tel�� �������� �ʾ� ��ȸ�� �� �����ϴ�.!
	****************step2:find �Ϸ�****************
	���� ok
	010 tel�� �������� �ʾ� ������ �� �����ϴ�.!
	tel=011, name=����, address=�Ǳ� stuId=14
	tel=017, name=������, address=�Ǳ� dept=�ѹ�
	****************step3:delete �Ϸ�****************/
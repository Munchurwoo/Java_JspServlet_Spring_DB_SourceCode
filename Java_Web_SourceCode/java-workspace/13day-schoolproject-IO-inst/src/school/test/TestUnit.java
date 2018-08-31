package school.test;

import school.exception.DuplicateTelException;
import school.exception.PersonNotFoundException;
import school.model.Employee;
import school.model.Person;
import school.model.SchoolService;
import school.model.Student;
import school.model.Teacher;

//SchoolService 의 Exception 적용 테스트 
public class TestUnit {
	  public static void main(String[] args) {
	    SchoolService service = new SchoolService();
	    try {
	     service.addPerson(new Student("011", "공유", "판교", "14"));
	    } catch (DuplicateTelException e) {
	     System.out.println(e.getMessage());
	    }
	    try {
	     service.addPerson(new Teacher("016", "광유", "강남", "국어"));
	    } catch (DuplicateTelException e) {
	     System.out.println(e.getMessage());
	    }
	    try {
	     service.addPerson(new Employee("017", "아이유", "판교", "총무"));
	    } catch (DuplicateTelException e) {
	     System.out.println(e.getMessage());
	    }
	    try {
	     service.addPerson(new Teacher("016", "설현", "판교", "수학"));
	    } catch (DuplicateTelException e) {
	     System.out.println(e.getMessage());
	    }
	    service.printAll(); 
	    System.out.println("****************step1:add 완료****************");
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
	    System.out.println("****************step2:find 완료****************");  
	    try {
	     service.deletePersonByTel("016");
	     System.out.println("삭제 ok");
	    } catch (PersonNotFoundException e) {
	     System.out.println(e.getMessage());
	    }
	    try {
	     service.deletePersonByTel("010");
	     System.out.println("삭제 ok");
	    } catch (PersonNotFoundException e) {
	     System.out.println(e.getMessage());
	    }
	    service.printAll();  
	    System.out.println("****************step3:delete 완료****************"); 
	    }
	}
	/**********************************************

	016 tel이 존재하여 추가불가!
	tel=011, name=공유, address=판교 stuId=14
	tel=016, name=광유, address=강남 subject=국어
	tel=017, name=아이유, address=판교 dept=총무
	****************step1:add 완료****************
	tel=017, name=아이유, address=판교 dept=총무
	010 tel이 존재하지 않아 조회할 수 없습니다.!
	****************step2:find 완료****************
	삭제 ok
	010 tel이 존재하지 않아 삭제할 수 없습니다.!
	tel=011, name=공유, address=판교 stuId=14
	tel=017, name=아이유, address=판교 dept=총무
	****************step3:delete 완료****************/
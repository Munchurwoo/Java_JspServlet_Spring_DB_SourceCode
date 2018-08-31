package test;

import model.Employee;
import model.SchoolService;
import model.Student;
import model.Teacher;

/**
 * SchoolService의 서비스를 테스트하는 클래스
 * 
 * @author KOSTA16
 *
 */
public class TestSchool {
	public static void main(String[] args) {
		int length = 10;// 총 정원수 10명으로 할당
		SchoolService service = new SchoolService(length);
		service.addPerson(new Student("0101231234", "아이유", "화성", "17"));
		service.addPerson(new Teacher("0101231235", "이효리", "수지", "자바"));
		service.addPerson(new Student("0101231236", "이상순", "수원", "16"));
		service.addPerson(new Employee("0101231237", "공유", "이천", "재무부"));
		service.addPerson(new Student("0101231238", "강동원", "잠실", "18"));
		service.addPerson(new Teacher("0101231239", "설현", "사당", "수학"));
		// 아래 라인은 테스트용 코드
		// service.addPerson(new Person("070","트럼프","워싱턴"));

		// 중복테스트 및 정원 초과 테스트
	//	service.addPerson(new Student("0101231238", "아이유", "잠실", "18"));
		System.out.println("***학교 구성원 등록 완료***");
		service.printAll();// 6명 출력
	/*	System.out.println("***전체 구성원 출력 완료***");
		String tel = "0101231238";
		Person p = service.findPersonByTel(tel);
		System.out.println("검색결과:" + p);
		// tel에 해당하는 구성원이 있으면 출력하고 없으면 null이 출력됨
		System.out.println("***검색완료***");
		System.out.println("수정 전 정보:" + service.findPersonByTel("0101231237"));
		service.updatePerson(new Employee("0101231237", "박보검", "세종", "국방부"));
		System.out.println("수정 후 정보:" + service.findPersonByTel("0101231237"));
		System.out.println("**수정 테스트 완료**");
		System.out.println("**삭제 전 명단**");
		service.printAll();// 6명 출력
		service.deletePerson("0101231239");
		System.out.println("**삭제 후 명단**");
		service.printAll();// 5명 출력
*/	}
}
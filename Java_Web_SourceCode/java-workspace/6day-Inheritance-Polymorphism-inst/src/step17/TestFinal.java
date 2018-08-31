package step17;

public class TestFinal {
	public static void main(String[] args) {
		CompanyService service=new CompanyService();
		service.calculateAnnualSalary(new Employee("아이유",200));
		/*		아이유 2400  
		 */
		service.calculateAnnualSalary(new Manager("김태리",300,"영업"));
		/*   김태리 3600
		 */
		service.calculateAnnualSalary(new Engineer("손흥민",400,"자바",100));
		/*  손흥민 6000	
		 */
	}
}










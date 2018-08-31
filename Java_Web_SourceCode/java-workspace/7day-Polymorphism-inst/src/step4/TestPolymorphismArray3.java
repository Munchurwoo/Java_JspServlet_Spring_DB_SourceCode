package step4;

public class TestPolymorphismArray3 {
	public static void main(String[] args) {
		Employee e[]=
			{new Employee("아이유",200),new Engineer("박보검",300,100)};
		HRService service=new HRService();
		int totalCost=service.getAnnualTotalCost(e);
		// 전체 사원 1년간 지급될 총비용 ( 월급+[보너스] ) * 12 
		System.out.println("총비용:"+totalCost);//7200
	}
}






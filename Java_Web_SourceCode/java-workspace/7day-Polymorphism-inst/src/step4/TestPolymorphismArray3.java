package step4;

public class TestPolymorphismArray3 {
	public static void main(String[] args) {
		Employee e[]=
			{new Employee("������",200),new Engineer("�ں���",300,100)};
		HRService service=new HRService();
		int totalCost=service.getAnnualTotalCost(e);
		// ��ü ��� 1�Ⱓ ���޵� �Ѻ�� ( ����+[���ʽ�] ) * 12 
		System.out.println("�Ѻ��:"+totalCost);//7200
	}
}






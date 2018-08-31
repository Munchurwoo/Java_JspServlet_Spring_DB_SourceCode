package step17;

public class CompanyService {
	/*
	 * �θ� Ŭ������ Employee Ÿ������ �Ű������� �����ϸ� 
	 * �ϳ��� �޼��忡�� �ڽ� ��ü���� ��� ó���� �� �ִ�  
	 */
	public void calculateAnnualSalary(Employee e) {
		//System.out.println(e.getName()+" "+e.getSalary()*12);
		// Engineer �� bonus �� �����ϹǷ� ���� ���� �ݿ��ؾ� �� 
		int money=e.getSalary();
		if(e instanceof Engineer) {//instanceof �����ڷ� Engineer ��ü�� ���Ͽ�
			// ���ʽ��� �߰��Ѵ�. �� �� getBonus() �޼���� Engineer ��ü�� ������ ����̹Ƿ�
			// Object casting ������ ���ľ� ȣ���� �����ϴ� 
			money+=((Engineer) e).getBonus();
		}
		System.out.println(e.getName()+" "+money*12);
	}
}







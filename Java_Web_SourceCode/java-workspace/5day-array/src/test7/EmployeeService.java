package test7;

public class EmployeeService {
	
	public void printEmployeeInfoByAddress(Employee[] e, String address) {
		for(int i=0;i<e.length;i++) {
			if(e[i].getAddress().equals(address)) {
				System.out.println(e[i].getName()+" "+e[i].getAddress()+" "+ e[i].getSalary());
			}
		}
	}

	public void printEmployeeInfoByAddressAndSalary(Employee[] e, String address, int salary) {
		System.out.println("address �� ��ġ�ϰ� salary �̻��� �޴� ����� ��� ");
		for(int i=0;i<e.length;i++) {
			if(e[i].getAddress().equals(address)&&e[i].getSalary()>=500) {
				System.out.println(e[i].getName()+" "+e[i].getAddress()+" "+ e[i].getSalary());
			}
		}
	}

}

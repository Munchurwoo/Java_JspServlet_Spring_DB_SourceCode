package step4;

public class HRService {
	public int getAnnualTotalCost(Employee[] e) {
		int money=0;
		for(int i=0;i<e.length;i++) {
			money+=e[i].getSalary();
			if(e[i] instanceof Engineer) {
				money+=((Engineer)e[i]).getBonus();
			}
		}
		return money*12;
	}

}





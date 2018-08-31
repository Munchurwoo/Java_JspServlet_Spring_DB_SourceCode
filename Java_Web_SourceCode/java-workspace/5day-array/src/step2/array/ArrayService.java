package step2.array;

public class ArrayService {
	
	private int[] bonus;
	private int sum  = 0;
	
	public ArrayService() {
		this.bonus = bonus;
	}


	public int getAvgBonus(int[] bonus) {
		for(int i =0;i<bonus.length;i++) {
			sum+= bonus[i];
		}
		return sum/bonus.length;
	}

}

package step4;

public class Engineer extends Employee{
	private int bonus;
	public Engineer(String name,int salary,int bonus) {
		super(name,salary);
		this.bonus=bonus;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}

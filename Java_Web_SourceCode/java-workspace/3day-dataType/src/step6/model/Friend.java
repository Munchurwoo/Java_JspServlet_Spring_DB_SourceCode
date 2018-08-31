package step6.model;

public class Friend {
	private String name = "¼ÕÈï¹Î";
	private int age = 1;
	private int money; 
	private String address;
	
	
	public Friend (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public int getMoney() {
		return money;
	}

	public String getAddress() {
		return address;
	}
	
}

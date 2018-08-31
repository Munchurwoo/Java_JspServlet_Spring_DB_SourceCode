package step9;

import java.io.Serializable;

public class Car implements Serializable{
	private String model;
	private int price;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Car(String string, int i) {
	}

}

package model;
/**
 * DTO : Data Transfer Object
 * @author kosta-inst
 *
 */
public class CarDTO{
	private String model;
	private int price;
	public CarDTO(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
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
	@Override
	public String toString() {
		return "CarDTO [model=" + model + ", price=" + price + "]";
	}
	
}













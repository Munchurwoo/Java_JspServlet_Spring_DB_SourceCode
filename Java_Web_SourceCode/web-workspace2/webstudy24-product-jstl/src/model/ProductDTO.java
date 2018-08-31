package model;
/* DTO : Data Transfer Object 
 * VO : Value Object 
 * DAO : Data Access Object 
 */
public class ProductDTO {
	private String pno;
	private String name;
	private String maker;
	private int price;
	private String regDate;
	public ProductDTO() {
		super();	
	}
	public ProductDTO(String name, String maker, int price) {
		super();
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	public ProductDTO(String pno, String name, String maker, int price, String regDate) {
		super();
		this.pno = pno;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.regDate = regDate;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "ProductDTO [pno=" + pno + ", name=" + name + ", maker=" + maker + ", price=" + price + ", regDate="
				+ regDate + "]";
	}
	
}










package org.kosta.springmvc10.model.vo;

public class ProductVO {
	//column 명은 product_no 로 다르지만 
	//camelCase에 의해 자동 매핑된다. 
	
	private String productNo;
	private String name;
	private String maker;
	private String price;
	public ProductVO() {
		super();
		
	}
	public ProductVO(String productNo, String name, String maker, String price) {
		super();
		this.productNo = productNo;
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductVO [productNo=" + productNo + ", name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
}

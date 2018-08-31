package org.kosta.model;



public class ItemDTO {
	private String itemNo;
	private String name;
	private String maker;
	private int price;
	private String detail;
	
	public ItemDTO(String itemNo, String name, String maker) {
		super();
		this.itemNo = itemNo;
		this.name = name;
		this.maker = maker;
	}
	public ItemDTO(String name, String maker, int price, String detail) {
		super();		
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.detail = detail;
	}
	public ItemDTO(String itemNo, String name, String maker, int price, String detail) {
		super();
		this.itemNo = itemNo;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.detail = detail;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
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

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "ItemDTO [itemNo=" + itemNo + ", name=" + name + ", maker=" + maker + ", price=" + price + ", detail="
				+ detail + "]";
	}
	
}

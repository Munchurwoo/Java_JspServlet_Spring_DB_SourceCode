package model;

public class ProductVO {
	private String pno;
	private String name;
	private String maker;
	private String picture;
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductVO(String name, String maker, String picture) {
		super();
		this.name = name;
		this.maker = maker;
		this.picture = picture;
	}
	public ProductVO(String pno, String name, String maker, String picture) {
		super();
		this.pno = pno;
		this.name = name;
		this.maker = maker;
		this.picture = picture;
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "ProductVO [pno=" + pno + ", name=" + name + ", maker=" + maker + ", picture=" + picture + "]";
	}
	
	
}

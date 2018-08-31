package org.kosta.model;

/* VO : Value Object  
 */
public class MemberDTO {
	private String id;
	private String password;
	private String name;
	private String address;
	private CartBean cart;
	public MemberDTO() {
		super();	
	}
	public MemberDTO(String id, String password, String name, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	/**
	 * MemberVO 당 Cart가 없거나 아니면 하나만 존재하도록 처리
	 * @return
	 */
	public CartBean getCart(){
		if(cart==null){
			cart=new CartBean();
		}
		return cart;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + "]";
	}
	
}

package org.kosta.model;
/* DTO : Data Transfer Object 
 * VO : Value Object 
 * DAO : Data Access Object 
 */
public class MemberDTO {
	private String id  ;
	private String password ;
	private String name ;
	private String address ;
	private String birthday ;
	private String regdate ;
	public MemberDTO(String id, String password, String name, String address, String birthday, String regdate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.birthday = birthday;
		this.regdate = regdate;
	}
	public MemberDTO() {
		// TODO Auto-generated constructor stub
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address
				+ ", birthday=" + birthday + ", regdate=" + regdate + "]";
	}
	
	
}










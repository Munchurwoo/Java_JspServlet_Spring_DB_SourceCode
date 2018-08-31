package step10;

import java.io.Serializable;

public class Member  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3285608665002622970L;
	private String id;
	//password는 직렬화 대상에서 제외시킨다. 
	private transient String password;
	private String name;
	private String address;
	
	public Member(String id, String password, String name, String address) {	
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
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
	
	
}

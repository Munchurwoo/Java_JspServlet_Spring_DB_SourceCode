package model;

public class Department {
	private int deptNo;
	private String dname;
	private String location;
	public Department(int deptNo, String dname, String location) {
		super();
		this.deptNo = deptNo;
		this.dname = dname;
		this.location = location;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

	
}

package model;

public class Department {
	private String deptNo;
	private String dname;
	private String location;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String deptNo, String dname, String location) {
		super();
		this.deptNo = deptNo;
		this.dname = dname;
		this.location = location;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
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
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", dname=" + dname + ", location=" + location + "]";
	}
	
}

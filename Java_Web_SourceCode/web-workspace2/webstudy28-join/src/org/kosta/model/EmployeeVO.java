package org.kosta.model;

public class EmployeeVO {
	private String empno;
	private String ename;
	private int sal;
	private DepartmentVO departmentVO;
	public EmployeeVO() {
		super();
	}
	public EmployeeVO(String empno, String ename, int sal, DepartmentVO departmentVO) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.departmentVO = departmentVO;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public DepartmentVO getDepartmentVO() {
		return departmentVO;
	}
	public void setDepartmentVO(DepartmentVO departmentVO) {
		this.departmentVO = departmentVO;
	}
	@Override
	public String toString() {
		return "EmployeeVO [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", departmentVO=" + departmentVO
				+ "]";
	}
	
}

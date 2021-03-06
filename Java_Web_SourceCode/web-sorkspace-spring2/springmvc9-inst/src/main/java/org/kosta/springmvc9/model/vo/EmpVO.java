package org.kosta.springmvc9.model.vo;

public class EmpVO {
	private String empNo;
	private String ename;
	private String job;
	private String deptNo;
	public EmpVO() {
		super();
	}
	public EmpVO(String empNo, String ename, String job, String deptNo) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.job = job;
		this.deptNo = deptNo;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "EmpVO [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", deptNo=" + deptNo + "]";
	}
	
}

package org.kosta.springmvc9.model.vo;

public class EmpVO {
	private int empNo;
	private String ename;
	private String job;
	private int deptNo;
	public EmpVO(int empNo, String ename, String job, int deptNo) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.job = job;
		this.deptNo = deptNo;
	}
	public EmpVO() {
		super();
		
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
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
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public String toString() {
		return "EmpVO [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", deptNo=" + deptNo + "]";
	}


}

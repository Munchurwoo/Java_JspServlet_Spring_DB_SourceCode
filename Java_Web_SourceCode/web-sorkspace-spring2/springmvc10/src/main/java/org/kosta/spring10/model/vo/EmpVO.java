package org.kosta.spring10.model.vo;

public class EmpVO {
	private String empNo;
	private String ename;
	private String job;
	private DeptVO deptVO;
	@Override
	public String toString() {
		return "EmpVO [empNo=" + empNo + ", ename=" + ename + ", job=" + job + ", deptVO=" + deptVO + "]";
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
	public EmpVO() {
		super();
		
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public DeptVO getDeptVO() {
		return deptVO;
	}
	public void setDeptVO(DeptVO deptVO) {
		this.deptVO = deptVO;
	}
	public EmpVO(String empNo, String ename, String job, DeptVO deptVO) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.job = job;
		this.deptVO = deptVO;
	}
}

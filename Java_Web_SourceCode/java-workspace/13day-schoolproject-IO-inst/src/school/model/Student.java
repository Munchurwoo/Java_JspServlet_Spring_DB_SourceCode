package school.model;

public class Student extends Person {
	private static final long serialVersionUID = 1L;
	private String stdNo;
	public Student(String tel, String name, String address, String stdNo) {
		super(tel, name, address);
		this.stdNo = stdNo;
	}
	public String getStdNo() {
		return stdNo;
	}
	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}
	@Override
	public String toString() {
		return super.toString()+" stdNo=" + stdNo;
	}	
}









package step2;

public class Car {
	public String model;
	public String color;
	
	public void go() {
		System.out.println("�ڵ����� ����.");
	}
	public void  run(String s, int i) {
		System.out.println(s+"��"+i+"km�� �޸���.");
	}
	public  String getInfo(String a, String b) {
		return "��:"+a+" ����:"+b;
	}
}

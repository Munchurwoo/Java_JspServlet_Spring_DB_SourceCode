package step2;

public class Car {
	public String model;
	public String color;
	
	public void go() {
		System.out.println("자동차가 가다.");
	}
	public void  run(String s, int i) {
		System.out.println(s+"가"+i+"km로 달리다.");
	}
	public  String getInfo(String a, String b) {
		return "모델:"+a+" 색상:"+b;
	}
}

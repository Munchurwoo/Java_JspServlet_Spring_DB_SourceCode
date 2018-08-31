package step2.array;

import javax.swing.plaf.SliderUI;

public class TestArray2 {
	public static void main(String[] args) {
		int salary[] = new int[4];
		salary[0]=200;
		salary[1]=400;
		salary[2]=300;
		salary[3]=600;
		
		int sum=0;
		for(int i = 0;i<salary.length;i++) {
			sum+=salary[i];
		}
		System.out.println("¿ù±ÞÀÇ ÃÑÇÕ :"+sum);
	}
}

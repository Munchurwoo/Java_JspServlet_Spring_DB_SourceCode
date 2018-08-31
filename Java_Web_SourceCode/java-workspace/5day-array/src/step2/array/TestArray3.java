package step2.array;

public class TestArray3 {
	public static void main(String[] args) {
		//배열 선언, 생성, 할당을 동시에 
		int bonus[] = {200,600,400};
		ArrayService service = new ArrayService();
		int avgBonus=service.getAvgBonus(bonus);
		System.out.println("보너스 평균 :"+avgBonus);
	}
}

package step2.array;

public class TestArray3 {
	public static void main(String[] args) {
		//�迭 ����, ����, �Ҵ��� ���ÿ� 
		int bonus[] = {200,600,400};
		ArrayService service = new ArrayService();
		int avgBonus=service.getAvgBonus(bonus);
		System.out.println("���ʽ� ��� :"+avgBonus);
	}
}

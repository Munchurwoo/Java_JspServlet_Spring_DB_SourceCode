package step6;

public class TestInterface3 {
	public static void main(String[] args) {
		Flyer fa[] = {new Bird(), new Airplane()};
		FlyerService service = new FlyerService();
		service.execute(fa);
		/*
		 * ���� ����.
		 * ����Ⱑ ����.
		 */
		
	}
}

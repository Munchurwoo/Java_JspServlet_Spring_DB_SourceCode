package step7;

public class TestInterface4 {
	public static void main(String[] args) {
		Player[] p = new Player[3];
		p[0]=new GomPlayer();
		p[1]=new AISongPlayer();
		p[2]=new CDPlayer();
		PlayerService service = new PlayerService();
		service.executeAll(p);
		// ����, �˼�, �õ�, ����ϴ�. 
		// �õ� �÷��̾ cd�� �ִ�.
	}
}

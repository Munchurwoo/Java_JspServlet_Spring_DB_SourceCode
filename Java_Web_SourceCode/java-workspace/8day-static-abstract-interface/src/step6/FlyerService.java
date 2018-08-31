package step6;

public class FlyerService {

	public void execute(Flyer[] fa) {
		for(int i=0;i<fa.length;i++) {
			fa[i].fly();
		}
	}

}

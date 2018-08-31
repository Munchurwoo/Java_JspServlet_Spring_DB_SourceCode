package step7;

public class PlayerService {

	public void executeAll(Player[] p) {
		for(int i=0;i<p.length;i++) {
			if(p[i] instanceof CDPlayer) {
				((CDPlayer)p[i]).insertCd();
			}
			p[i].play();
		}
		
	}

	

}

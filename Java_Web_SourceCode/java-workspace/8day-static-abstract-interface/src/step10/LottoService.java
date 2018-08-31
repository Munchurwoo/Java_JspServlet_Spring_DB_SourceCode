package step10;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoService {
	

	public TreeSet<Integer> createLottoNumSet() {
		
		Set<Integer> set= new TreeSet<Integer>(); 
		Random r = new Random();
		
		for(int i=0; set.size()<6;i++) {
			
			int num = r.nextInt((45)+1);
			set.add(num);
			
		}
		return (TreeSet<Integer>) set;
	}
}

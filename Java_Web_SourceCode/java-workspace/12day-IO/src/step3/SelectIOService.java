package step3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SelectIOService {
	private String filePath;

	public SelectIOService(String filePath) {
		this.filePath = filePath;
	}

	public ArrayList<String> getMenuList() throws IOException {
		BufferedReader br = null;
		ArrayList<String> li = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader(filePath));
			String line = br.readLine();
			while ( line!= null) {
				li.add(line);
				line=br.readLine();
			}
		} finally {
			if(br!=null)
				br.close();
		}
		return li;
	}
}

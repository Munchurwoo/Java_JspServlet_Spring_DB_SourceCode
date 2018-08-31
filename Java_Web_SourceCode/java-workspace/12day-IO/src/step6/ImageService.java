package step6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {

	public void copyAndPasteImage(String orgPath, String destPath) throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis=new BufferedInputStream(new FileInputStream(orgPath));
			bos=new BufferedOutputStream(new FileOutputStream(destPath));
			int data=bis.read();
			System.out.println(data);
			while(data!=-1) {
				bos.write(data);
				data=bis.read();
				System.out.println(data);
			}
		}finally {
			if(bos!=null)
				bos.close();
			if(bis!=null)
				bis.close();
		}
	}
}

package step10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerialListService{

	public void saveList(String path, ArrayList<Member> list) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos =null;
		try {
			oos= new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(list);
		}finally {
			if(oos!=null)
				oos.close();
		}
	}

	public ArrayList<Member> localList(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		ArrayList<Member> member=null;
		try {
			ois=new ObjectInputStream(new FileInputStream(path));
			member =(ArrayList<Member>)ois.readObject();
			
		}finally {
			if(ois!=null)
				ois.close();
		}
		return member;
	}

}

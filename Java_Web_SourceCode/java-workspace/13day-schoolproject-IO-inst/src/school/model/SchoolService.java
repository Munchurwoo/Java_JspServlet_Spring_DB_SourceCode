package school.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import school.exception.DuplicateTelException;
import school.exception.PersonNotFoundException;

public class SchoolService {
	//private ArrayList<Person> list=new ArrayList<Person>();
	private ArrayList<Person> list;
	private String filePath="C:\\java-kosta\\school\\personlist.obj";
	/* 1. ����� ������ ���������� �� Ȯ��
	 * 	    1.1 �������� ������ list�� �����ؼ� �Ҵ��Ѵ� 
	 *      1.2 �����ϸ� ������ȭ�Ͽ� list�� �Ҵ��Ѵ� 
	 */
	@SuppressWarnings("unchecked")
	public void loadList() throws IOException, ClassNotFoundException {
		File file=new File(filePath);
		file.getParentFile().mkdirs();
		if(file.isFile()) {
			ObjectInputStream ois=null;
			try {
				ois=new ObjectInputStream(new FileInputStream(file));
				list=(ArrayList<Person>)ois.readObject();
			}finally {
				if(ois!=null)
					ois.close();
			}
		}else {
			this.list=new ArrayList<Person>();
		}
	}
	//���Ͽ� �б� ������ ������ ����ȭ�Ͽ� �����ϴ� �޼��� 
	public void saveList() throws IOException {
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(
					new FileOutputStream(filePath));
			oos.writeObject(list);
		}finally {
			if(oos!=null)
				oos.close();
		}
	}
	
	
	/*
	 *  tel �� �ش��ϴ� list ���(������)�� �ε����� ��ȯ�ϴ� �޼��� 
	 *  ���� tel �� �ش��ϴ� ��Ұ� ���� ��� -1 �� ��ȯ 
	 *  �߰�,�˻�,���� �޼����� 
	 *  ���� ����� ������ �޼��忡�� ó���غ��� 
	 */
	public int findIndexByTel(String tel){
		int index=-1;
		for(int i=0;i<list.size();i++){
			if(tel.equals(list.get(i).getTel())){
				index=i;
				break;
			}
		}	
		return index;
	}
	public void addPerson(Person p) throws DuplicateTelException{
		if(findIndexByTel(p.getTel())!=-1)
			throw new DuplicateTelException(p.getTel()
					+" Tel �� �ߺ��Ǿ� ����� �� �����ϴ�!");
		list.add(p);
	}
	public void printAll(){
		Iterator<Person> it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public Person findPersonByTel(String tel) throws PersonNotFoundException{
		int index=findIndexByTel(tel);
		if(index==-1)
			throw new PersonNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ �����ϴ�");
		return list.get(index);
	}
	public void deletePersonByTel(String tel) throws PersonNotFoundException{
		int index=findIndexByTel(tel);
		if(index==-1)
			throw new PersonNotFoundException(tel+" tel�� �ش��ϴ� ������ ������ ��� ������ �� �����ϴ�");
		list.remove(index);
	}
}









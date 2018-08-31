package school.model;

import java.util.ArrayList;
import java.util.Iterator;

import school.exception.DuplicateTelException;
import school.exception.PersonNotFoundException;

public class SchoolService {
	private ArrayList<Person> list=new ArrayList<Person>();
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









package school.model;

import java.util.ArrayList;
import java.util.Iterator;

import school.exception.DuplicateTelException;
import school.exception.PersonNotFoundException;

public class SchoolService {
	private ArrayList<Person> list=new ArrayList<Person>();
	/*
	 *  tel 에 해당하는 list 요소(구성원)의 인덱스를 반환하는 메서드 
	 *  만약 tel 에 해당하는 요소가 없을 경우 -1 을 반환 
	 *  추가,검색,삭제 메서드의 
	 *  공통 기능을 별도의 메서드에서 처리해본다 
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
					+" Tel 이 중복되어 등록할 수 없습니다!");
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
			throw new PersonNotFoundException(tel+" tel에 해당하는 구성원 정보가 없습니다");
		return list.get(index);
	}
	public void deletePersonByTel(String tel) throws PersonNotFoundException{
		int index=findIndexByTel(tel);
		if(index==-1)
			throw new PersonNotFoundException(tel+" tel에 해당하는 구성원 정보가 없어서 삭제할 수 없습니다");
		list.remove(index);
	}
}









package kosta.model;

public class PersonService {
	public void registerPerson(){
		System.out.println("registerPerson");
	}
	public void insertId(String id){
		System.out.println("insertId:"+id);
	}
	public String getNick(){
		return "이윤희";
	}
}

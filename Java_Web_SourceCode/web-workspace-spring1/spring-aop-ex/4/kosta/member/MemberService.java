package kosta.member;

public class MemberService {
	public void findMember(){
		
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("find member");
		
	}
	public void findAllMember(){
		try {
			Thread.sleep(1800);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("findAllMember");
	}
	public void deleteMember(String id) throws MemberNotFoundException{
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		if(id==null)
			throw new MemberNotFoundException("member not found!!!");
		System.out.println("deleteMember");
	}
}










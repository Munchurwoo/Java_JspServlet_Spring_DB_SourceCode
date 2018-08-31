package step2;

import java.util.ArrayList;

public class TestList2 {
	public static void main(String[] args) {
		/*ArrayList list=new ArrayList();
		list.add(new Friend("서미리", "모란", 26));
		//리스트 첫번째 요소의 address 를 리턴받아 출력 
		Friend f=(Friend)list.get(0);//Generic 이 적용되지 않아 캐스팅 
		System.out.println(f.getAddress());*/
		//Generic 을 적용해서 리스트를 생성한다 
		ArrayList<Friend> list=new ArrayList<Friend>();
		list.add(new Friend("서미리", "모란", 26));
		System.out.println(list.get(0).getAddress());//모란 
		list.add(new Friend("이성열", "수원", 28));
		list.add(new Friend("허도형", "미금", 26));
		System.out.println("***27세 이하 친구의 name과 age를 출력***");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAge()<=27) {
				System.out.println(list.get(i).getName()+" "+list.get(i).getAge());
			}//if
		}//for
		String address="수원";
		System.out.println("**수원에 사는 친구의 이름 출력**");
		for(int i=0;i<list.size();i++) {
			if(address.equals(list.get(i).getAddress())) {
				System.out.println(list.get(i).getName());
			}
		}
	}
}










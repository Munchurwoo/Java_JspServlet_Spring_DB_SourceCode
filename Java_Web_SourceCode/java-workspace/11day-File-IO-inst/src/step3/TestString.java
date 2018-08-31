package step3;

public class TestString {
	public static void main(String[] args) {
		String name="이성열";
		System.out.println(name.concat("선생님"));//새로 생성 
		System.out.println(name);//불변 속성이므로 이성열이 그대로 출력 
		System.out.println(name.indexOf("성"));//1
		System.out.println(name.indexOf("밥"));//-1
		System.out.println(name.startsWith("이"));//이 문자열로 시작하면 true
		System.out.println(name.startsWith("성"));
		// 열 문자열로 끝나면 true 
		System.out.println(name.endsWith("열"));
		String fileName="점심메뉴.txt";
		//확장자가 .txt 이면 true 
		System.out.println(fileName.endsWith(".txt"));
		String name2="javaking";
		//대문자로 변경 
		System.out.println(name2.toUpperCase());
		System.out.println(name2.substring(3));//index 3부터 문자열 추출
		String name3="신현수반장님";
		//현수반장 문자열만 추출해서 출력 
		System.out.println(name3.substring(1,5));//1부터 5앞까지 
		String friends="장소정,윤준상,문철우,이동규";
		String names[]=friends.split(",");//,구분자를 기준으로 문자열 배열 반환
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]);
	}
}








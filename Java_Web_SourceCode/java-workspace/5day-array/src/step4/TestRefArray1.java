package step4;
//reference data type 의 data를 저장하는 배열 

import review.Book;

public class TestRefArray1 {
	public static void main(String[] args) {
		Book book[];
		book = new Book[3];
		System.out.println(book[0]);//null 
		// 3. 배열 요소 할당 
		book[0]=new Book("역사의 역사","유시민");
		book[1]=new Book("총균쇠","다이아몬드");
		book[2]=new Book("자바의정석","남궁성");
		System.out.println(book[0].getTitle());
		System.out.println("********");
		//FOR 문을 이용하여 배열요소의 WRITER를 모두 출력하세요. 
		for(int i =0 ; i<book.length;i++) {
			System.out.println(book[i].getWriter());
		}
		System.out.println("--------------");
		//배열 선언 생성 할당을 동시에 
		Book bo[] = {new Book("역사의역사","유시민"),new Book("총균쇠","다이아몬드")};
		System.out.println(bo[1].getTitle());
	}
}

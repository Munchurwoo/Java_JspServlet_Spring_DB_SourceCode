package step4;
//reference data type �� data�� �����ϴ� �迭 

import review.Book;

public class TestRefArray1 {
	public static void main(String[] args) {
		Book book[];
		book = new Book[3];
		System.out.println(book[0]);//null 
		// 3. �迭 ��� �Ҵ� 
		book[0]=new Book("������ ����","���ù�");
		book[1]=new Book("�ѱռ�","���̾Ƹ��");
		book[2]=new Book("�ڹ�������","���ü�");
		System.out.println(book[0].getTitle());
		System.out.println("********");
		//FOR ���� �̿��Ͽ� �迭����� WRITER�� ��� ����ϼ���. 
		for(int i =0 ; i<book.length;i++) {
			System.out.println(book[i].getWriter());
		}
		System.out.println("--------------");
		//�迭 ���� ���� �Ҵ��� ���ÿ� 
		Book bo[] = {new Book("�����ǿ���","���ù�"),new Book("�ѱռ�","���̾Ƹ��")};
		System.out.println(bo[1].getTitle());
	}
}

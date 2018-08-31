package review;

public class Student {
	private String name;
	private Book book;
	
	public Student(String name, Book book) {
		this.name=name;
		this.book=book;
	}

	public String getName() {
		return name;
	}

	public Book getBook() {
		return book;
	}

}

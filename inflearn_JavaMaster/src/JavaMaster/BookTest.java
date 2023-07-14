package JavaMaster;


class Book extends Object{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title + ", "+ author;
	}
	
	
}

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("Harry Potter", "Joe");
		System.out.println(book.toString());
		
		String str = new String("test");
		System.out.println(str);
		
		Integer integer = new Integer(100);
		System.out.println(integer);
	}
}

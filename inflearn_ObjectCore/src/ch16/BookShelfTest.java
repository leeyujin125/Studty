package ch16;

public class BookShelfTest {
	public static void main(String[] args) {
		
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("1111");
		bookQueue.enQueue("2222");
		bookQueue.enQueue("3333");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}
}

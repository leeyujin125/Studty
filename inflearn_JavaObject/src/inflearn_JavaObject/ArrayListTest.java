package inflearn_JavaObject;

import java.util.ArrayList;

import ch18.Book;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("태백산맥1", "조정례"));
		list.add(new Book("태백산맥2", "조정례"));
		list.add(new Book("태백산맥3", "조정례"));
		list.add(new Book("태백산맥4", "조정례"));
		list.add(new Book("태백산맥5", "조정례"));
		
		for(int i=0; i<list.size(); i++) {
			list.get(i).showBookInfo();
		}
	}
}

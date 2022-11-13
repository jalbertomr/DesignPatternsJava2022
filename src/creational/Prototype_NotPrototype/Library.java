package creational.Prototype_NotPrototype;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String name;
	List<Book> books = new ArrayList<>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() {
		for (int i = 1; i <= 5; i++ ) {
			Book book = new Book();
			book.setISBN( String.valueOf(i));
			book.setName( "Book " + i);
			getBooks().add( book);
		}
	}
	
	@Override
	public String toString() {
		return "Library " + "name " + "[name=" + name + ", books=" + books + "]";
	}
	
	
}

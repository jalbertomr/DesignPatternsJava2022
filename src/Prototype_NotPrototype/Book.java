package Prototype_NotPrototype;

public class Book {
	private String ISBN;
	private String name;
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", name=" + name + "]";
	}
}

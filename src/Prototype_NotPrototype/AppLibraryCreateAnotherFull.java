package Prototype_NotPrototype;

public class AppLibraryCreateAnotherFull {

	public static void main(String[] args) {
		
		Library libraryA = new Library();
		libraryA.setName("Alejandria");
		libraryA.loadData();
		System.out.println( libraryA);

		Library libraryB = new Library();
		libraryB.setName("Vaticano");
		libraryB.loadData();
		System.out.println( libraryB);
	}

}

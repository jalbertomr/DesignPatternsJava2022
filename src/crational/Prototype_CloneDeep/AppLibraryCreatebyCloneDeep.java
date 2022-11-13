package crational.Prototype_CloneDeep;

public class AppLibraryCreatebyCloneDeep {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		LibraryClonableDeep libraryA = new LibraryClonableDeep();
		libraryA.setName("Alejandria");
		libraryA.loadData();
		System.out.println( libraryA);
//Library Alejandria [name=Alejandria, books=[Book [ISBN=1, name=Book 1], Book [ISBN=2, name=Book 2], Book [ISBN=3, name=Book 3], Book [ISBN=4, name=Book 4], Book [ISBN=5, name=Book 5]]]

		LibraryClonableDeep contentNOTDependOfLibraryA = (LibraryClonableDeep) libraryA.clone();
		contentNOTDependOfLibraryA.setName("contentNOTDependOfLibraryA");
		System.out.println( contentNOTDependOfLibraryA);
//Library contentNOTDependOfLibraryA [name=ContentDependOfLibraryA, books=[Book [ISBN=1, name=Book 1], Book [ISBN=2, name=Book 2], Book [ISBN=3, name=Book 3], Book [ISBN=4, name=Book 4], Book [ISBN=5, name=Book 5]]]		
		
		libraryA.getBooks().remove(0);
		System.out.println( libraryA);
//Library Alejandria [name=Alejandria, books=[Book [ISBN=2, name=Book 2], Book [ISBN=3, name=Book 3], Book [ISBN=4, name=Book 4], Book [ISBN=5, name=Book 5]]]		
		System.out.println( contentNOTDependOfLibraryA);
//Library contentNOTDependOfLibraryA [name=ContentDependOfLibraryA, books=[Book [ISBN=2, name=Book 2], Book [ISBN=3, name=Book 3], Book [ISBN=4, name=Book 4], Book [ISBN=5, name=Book 5]]]		
	}
}

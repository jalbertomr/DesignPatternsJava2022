package Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton iamUnique_v1 = Singleton.getInstance();
		Singleton iamUnique_v2 = Singleton.getInstance();
		
		iamUnique_v2.setUniqueValue("I Told you, I am Unique!!");
		System.out.println( iamUnique_v1);
	}

}

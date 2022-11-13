package creational.Builder;

public class Main {
	
	public static void main(String args[]) {
		
		// Without Builder Pattern
		//Phone phone = new Phone("Android", "SnapDragon 888", 6.5, 4800, 20);

		// With Builder Pattern
		Phone phone = new PhoneBuilder().setOs("Android").setProcessor("SnapDragon").build();
		//result Phone [os=Android, processor=SnapDragon, screenSize=0.0, battery=0, camera=0]
		
		Phone phone2 = new PhoneBuilder().setOs("Android").setScreenSize(7).setCamera(24).build();
		// result Phone [os=Android, processor=SnapDragon, screenSize=0.0, battery=0, camera=0]
				
		System.out.println( phone);
		System.out.println( phone2);
	}
}

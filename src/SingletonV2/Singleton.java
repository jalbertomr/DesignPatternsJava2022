package SingletonV2;

public class Singleton {
	private static Singleton singleton;
	private String uniqueValue;
	
	public Singleton() {
    }
	
	public synchronized static Singleton getInstance() {
		if ( singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
	
}

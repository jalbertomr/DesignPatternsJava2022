package Singleton;

public class Singleton {
	private static Singleton singleton;
	private String uniqueValue;
	
	public Singleton() {
	}
	
    public static Singleton getInstance() {
    	if (singleton == null) {
    		singleton = new Singleton();
    	}
		return singleton;
    }

	public String getUniqueValue() {
		return uniqueValue;
	}

	public void setUniqueValue(String uniqueValue) {
		this.uniqueValue = uniqueValue;
	}

    
}

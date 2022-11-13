package creational.SingletonV2;

public class Main {

	public static void main(String[] args) {
		
		Thread thread = new Thread( new Runnable() {
			@Override
			public void run() {
				Singleton iamUnique_v1 = Singleton.getInstance();
				System.out.println( iamUnique_v1.hashCode());
			}
		});

		Thread thread2 = new Thread( new Runnable() {
			@Override
			public void run() {
				Singleton iamUnique_v2 = Singleton.getInstance();
				System.out.println( iamUnique_v2.hashCode());
			}
		});
		
		thread.start();;
		thread2.start();

	}

}

package creational.Factory_byInterface;

public class EmailNotification implements INotification {

	@Override
	public void notifyUser() {
		System.out.println("Created Email and sending it to user.");	
	}

}

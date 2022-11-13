package creational.Factory_byInterface;

public class PushNotification implements INotification {

	@Override
	public void notifyUser() {
	   System.out.println("Created Push and sending it to user.");
	}

}

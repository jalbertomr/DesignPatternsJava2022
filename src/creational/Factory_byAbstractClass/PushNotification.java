package creational.Factory_byAbstractClass;

public class PushNotification extends Notification{

	public PushNotification() { 
		setChannel("Push");
	}
	
	@Override
	public void notifyUser() {
		System.out.println("Created " + getChannel() + " and sending it to user.");
	}

}

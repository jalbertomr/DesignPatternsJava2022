package Factory_byAbstractClass;

public class SMSNotification extends Notification {

	public SMSNotification() {}
	
	@Override
	public void notifyUser() {
		System.out.println("Created SMS and sending it to user.");
	}
}

package Factory_byInterface;

public class SMSNotification implements INotification {

	@Override
	public void notifyUser() {
		System.out.println("Created SMS and sending it to user.");
	}

}

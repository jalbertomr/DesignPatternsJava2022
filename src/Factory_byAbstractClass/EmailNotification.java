package Factory_byAbstractClass;

public class EmailNotification extends Notification {
	
	public EmailNotification() { 
		setChannel("Email");
	}
	
	@Override
	public void notifyUser() {
		System.out.println("Created " + getChannel() + " and sending it to user.");
	}
}

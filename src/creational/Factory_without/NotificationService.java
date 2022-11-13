package creational.Factory_without;

public class NotificationService {
	public static void main(String[] args) {
		
		SMSNotification smsNotification = new SMSNotification();
		smsNotification.notifyUser();
		
		EmailNotification emailNotification = new EmailNotification();
		emailNotification.notifyUser();
		
		PushNotification pushNotification = new PushNotification();
		pushNotification.notifyUser();
	}
}


package creational.Factory_byInterface;

public class NotificationService {

	public static void main(String[] args) {
		//NotificationFactory notificationFactory = new NotificationFactory();
		INotification notification = NotificationFactory.createNotification("SMS");
		notification.notifyUser();
	}

}

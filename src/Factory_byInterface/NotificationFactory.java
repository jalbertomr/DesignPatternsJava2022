package Factory_byInterface;



public class NotificationFactory {
	
	public static INotification createNotification( String channel) {
		if ( channel == null || channel.isEmpty())
			return null;
		switch( channel) {
		case "SMS": 
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("canal desconocido: " + channel);
		}
	
	}
}

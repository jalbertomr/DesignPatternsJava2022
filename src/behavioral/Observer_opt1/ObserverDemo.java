package behavioral.Observer_opt1;

public class ObserverDemo {

	public static void main(String[] args) {
		System.out.println("Enter text: ");
		EventSource eventSource = new EventSource();
		
		eventSource.addObserver( event->{ System.out.println("Observer1 Received response: " + event);});
		eventSource.addObserver( event->{ System.out.println("Observer2 Received response: " + event);});
		eventSource.scanSystemIn();
	}

}

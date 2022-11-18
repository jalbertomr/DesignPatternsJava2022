package behavioral.Observer_opt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventSource {
	
	public interface Observer {
		void update(String event);
	}
	
	private final List<Observer> observers = new ArrayList<>();
	
	private void nofityObservers( String event) {
		observers.forEach( observer -> observer.update( event));
	}
	
	public void addObserver( Observer observer) {
		observers.add(observer);
	}
	
	public void scanSystemIn() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			nofityObservers(line);
		}
	}
}

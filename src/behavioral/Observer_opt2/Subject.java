package behavioral.Observer_opt2;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private final List<IObserver> observers = new ArrayList<>();

	public void nofityObservers(String event) {
		observers.forEach(observer -> observer.update(event));
	}

	public void addObserver(IObserver observer) {
		observers.add(observer);
	}
}

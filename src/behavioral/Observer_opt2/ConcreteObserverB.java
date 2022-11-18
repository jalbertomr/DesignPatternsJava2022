package behavioral.Observer_opt2;

public class ConcreteObserverB implements IObserver {

	@Override
	public void update(String message) {
		   System.out.println("ObserverB Received response: " + message);
	}

}

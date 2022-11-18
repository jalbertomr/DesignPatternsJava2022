package behavioral.Observer_opt2;

public class ConcreteObserverA implements IObserver {

	@Override
	public void update(String message) {
	   System.out.println("ObserverA Received response: " + message);
	}

}

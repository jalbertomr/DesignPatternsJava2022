package behavioral.Observer_opt2;

import java.util.Scanner;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		subject.addObserver( new ConcreteObserverA());
		subject.addObserver( new ConcreteObserverB());

		System.out.println("Enter message to observers: ");
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			subject.nofityObservers("mensaje a observers: " + line);
		}
	}
}

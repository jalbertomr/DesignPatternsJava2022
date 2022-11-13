package behavioral.DelegatorV2;

public class ConcreteDelegatee_CanonPrinter implements IDelegatee_Printer {

	@Override
	public void print(String message) {
		System.out.println("Canon Printer: " +  message);
	}

}

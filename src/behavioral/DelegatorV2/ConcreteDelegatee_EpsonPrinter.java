package behavioral.DelegatorV2;

public class ConcreteDelegatee_EpsonPrinter implements IDelegatee_Printer {

	@Override
	public void print(String message) {
		System.out.println("Epson Printer: " +  message);
	}

}

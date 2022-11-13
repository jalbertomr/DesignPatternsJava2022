package behavioral.DelegatorV2;

public class ConcreteDelegatee_HpPrinter implements IDelegatee_Printer{

	@Override
	public void print(String message) {
		System.out.println("Hp Printer: " +  message);
	}

}

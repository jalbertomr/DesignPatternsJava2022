package behavioral.DelegatorV2;

public class Delegator_PrintController implements IDelegatee_Printer{
	
	private final IDelegatee_Printer printer;
	
	public Delegator_PrintController(IDelegatee_Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void print(String message) {
		System.out.println(message);
	}
}

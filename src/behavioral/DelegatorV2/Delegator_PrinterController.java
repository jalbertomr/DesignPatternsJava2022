package behavioral.DelegatorV2;

public class Delegator_PrinterController implements IDelegatee_Printer{
	
	private final IDelegatee_Printer printer;
	
	public Delegator_PrinterController(IDelegatee_Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void print(String message) {
		printer.print(message);
	}
}

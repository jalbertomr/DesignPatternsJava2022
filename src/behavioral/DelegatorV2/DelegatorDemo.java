package behavioral.DelegatorV2;

public class DelegatorDemo {

	public static final String MESSAGE_TO_PRINT = "Delegator Demo Pattern";
	
	public static void main(String[] args) {
	   ConcreteDelegatee_CanonPrinter canonPrinterController = new Delegator_PrintController( new ConcreteDelegatee_CanonPrinter());	
		
		
	}

}

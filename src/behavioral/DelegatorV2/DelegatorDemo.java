package behavioral.DelegatorV2;

public class DelegatorDemo {

	public static final String MESSAGE_TO_PRINT = "Delegator Demo Pattern";
	
	public static void main(String[] args) {
	   Delegator_PrinterController canonPrinterController = new Delegator_PrinterController( new ConcreteDelegatee_CanonPrinter());	
	   Delegator_PrinterController epsonPrinterController = new Delegator_PrinterController( new ConcreteDelegatee_EpsonPrinter());
	   Delegator_PrinterController hpPrinterController = new Delegator_PrinterController( new ConcreteDelegatee_HpPrinter());
	   
	   canonPrinterController.print(MESSAGE_TO_PRINT);
	   epsonPrinterController.print(MESSAGE_TO_PRINT);
	   hpPrinterController.print(MESSAGE_TO_PRINT);
		
	}

}

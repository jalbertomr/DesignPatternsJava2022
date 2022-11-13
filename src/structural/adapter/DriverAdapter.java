package structural.adapter;

public class DriverAdapter extends TaxiDriver implements IDriver {

	private Person person;
	
	public DriverAdapter(Person person) {
		this.person = person;
		this.adaptData();
	}

	private void adaptData() {
		this.setPersonId( person.getPersonId());
		this.setLicenseNo( Integer.valueOf( person.getLicenseNo()));
		String[] personBankAccount = person.getBankAccount().split(",");
		
		BankAccount driverBankAccount = new BankAccount();
		
		driverBankAccount.setAccountNo( personBankAccount[0]);
		driverBankAccount.setBankName( personBankAccount[1]);
		driverBankAccount.setClabe( personBankAccount[2]);
		driverBankAccount.setCityName( personBankAccount[3]);
		this.setBankAccount( driverBankAccount);
	}
	
	
}

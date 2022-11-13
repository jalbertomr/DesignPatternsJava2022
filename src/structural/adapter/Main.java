package structural.adapter;

public class Main {

	public static void main(String[] args) {

		Person person = new Person();
		person.setPersonId("ABRA1234567");
		person.setLicenseNo("9877643");
		person.setBankAccount("30982341,BBVA,CVE23455,CDMX");

		IDriver driver = new DriverAdapter(person);
		
		System.out.println("PersonId: " + driver.getPersonId());
		System.out.println("License No: " + driver.getLicenseNo());
		System.out.println("Bank Name: " + driver.getBankAccount().getBankName());
	}
}

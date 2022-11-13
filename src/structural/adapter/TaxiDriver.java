package structural.adapter;

public class TaxiDriver implements IDriver {
	private String personId;
	private Integer licenseNo;
	private BankAccount bankAccount;
	
	@Override
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	@Override
	public Integer getLicenseNo() {
		return licenseNo;
	}
	
	public void setLicenseNo(Integer licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	@Override
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	

}

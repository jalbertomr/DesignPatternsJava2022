package structural.adapter;

public class Person {
	private String personId;
	private String licenseNo;
	private String bankAccount;
	
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", licenseNo=" + licenseNo + ", bankAccount=" + bankAccount + "]";
	}
	
}

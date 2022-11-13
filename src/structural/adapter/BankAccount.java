package structural.adapter;

public class BankAccount {
	private String accountNo;
	private String bankName;
	private String clabe;
	private String cityName;

	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", bankName=" + bankName + ", clabe=" + clabe + ", cityName="
				+ cityName + "]";
	}

}

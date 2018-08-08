package accountmanagement;


public class Account {
	
	private String firstName;
	private String lastName;
	private String accountNumber;
	
	
	Account(String firstname, String surname, String accountNumber) {
		this.setFirstName(firstname);
		this.setLastName(surname);
		this.setAccountNumber(accountNumber);
	}

	public String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	private void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountDetails() {
		return firstName + " " + lastName + " " + accountNumber;
	}
	
}

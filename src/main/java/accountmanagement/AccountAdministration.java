package accountmanagement;

import java.util.HashMap;
import java.util.Map;


public class AccountAdministration {
	
	public Map<Integer, Account> bankAccounts;

	private int counter = 0;
	
	public AccountAdministration(){
		bankAccounts = new HashMap<Integer, Account>();
	}

	
	public Account retrieveAccount(int hashvalue) {
		return bankAccounts.get(hashvalue);
	}
	
	
	public void addAccount(String firstname, String surname, String accountNumber) {
		
		this.bankAccounts.put(counter, new Account(firstname, surname, accountNumber));
		counter++;
	}

	public long searchForUsername(String firstname) {
		return bankAccounts.values().stream().filter(bankAccounts -> bankAccounts.getFirstName().equals(firstname)).count();
	}

}

package accountmanagement;

import java.util.HashMap;
import java.util.Map;


public class AccountAdministration {
	
	public Map<String, Account> bankAccounts;

	
	public AccountAdministration(){
		bankAccounts = new HashMap<>();
	}

	
	public Account retrieveAccount(String name) {
		return bankAccounts.get(name);
		
	}
	
	public void addAccount(String firstname, String surname, String accountNumber) {
		this.bankAccounts.put(firstname, new Account(firstname, surname, accountNumber));
	}
	
}

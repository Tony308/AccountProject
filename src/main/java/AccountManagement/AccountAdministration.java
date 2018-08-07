package AccountManagement;

import java.util.HashMap;
import java.util.Map;


public class AccountAdministration {
	
	public Map<String, Account> bankAccounts;

	
	AccountAdministration(){
		bankAccounts = new HashMap<String, Account>();
	}

	
	public Account retrieveAccount(String name) {
		return bankAccounts.get(name);
		
	}
	
	public void addAccount(String firstname, String surname, String accountNumber) {
		this.bankAccounts.put(firstname, new Account(firstname, surname, accountNumber));
	}
	
}

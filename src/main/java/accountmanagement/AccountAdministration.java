package accountmanagement;

import java.util.HashMap;
import java.util.Map;


public class AccountAdministration {
	
	public Map<Integer, Account> bankAccounts;

	private int counter = 0;
	private int nameCounter = 0;
	
	public AccountAdministration(){
		bankAccounts = new HashMap<Integer, Account>();
	}

	
	public Account retrieveAccount(String name) {
		return bankAccounts.get(name);
		
	}
	
	public void addAccount(String firstname, String surname, String accountNumber) {
		
		this.bankAccounts.put(counter, new Account(firstname, surname, accountNumber));
		counter++;
	}


	public int searchForUsername(String firstname) {
		for (int x = 0; x < bankAccounts.size(); x++) {
			if (bankAccounts.get(x).getFirstName().equals(firstname)) {
				nameCounter++;
			}
		}
		return nameCounter;
	}


	
}

package accounttestsuite;

import org.junit.Test;

import accountmanagement.*;

import static org.junit.Assert.*;

public class AccountAdminTestSuite {

	
	@Test
	public void testAccountAdministration() {
		AccountAdministration main = new AccountAdministration();
		main.addAccount("Zak", "Mohammend", "2018");
		main.addAccount("Tony", "Huang", "1985");
		assertEquals("Tony", main.retrieveAccount("Tony").getFirstName());
		assertEquals("Huang", main.retrieveAccount("Tony").getLastName());
		assertEquals("2018", main.retrieveAccount("Tony").getAccountNumber());
		
	}
	
	
}

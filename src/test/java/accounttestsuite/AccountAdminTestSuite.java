package accounttestsuite;

import org.junit.Test;

import accountmanagement.*;

import static org.junit.Assert.*;

import org.junit.Before;

public class AccountAdminTestSuite {

	AccountAdministration main;
	
	@Before
	public void setup() {
		
		main = new AccountAdministration();
		main.addAccount("Zak", "Mohammed", "2018");
		main.addAccount("Tony", "Huang", "1985");
	}
	
	@Test
	public void testAccountAdministration() {
		
		assertEquals("Tony", main.retrieveAccount(1).getFirstName());
		assertEquals("Huang", main.retrieveAccount(1).getLastName());
		assertEquals("1985", main.retrieveAccount(1).getAccountNumber());
		
		assertEquals("Zak", main.retrieveAccount(0).getFirstName());
		assertEquals("Mohammed", main.retrieveAccount(0).getLastName());
		assertEquals("2018", main.retrieveAccount(0).getAccountNumber());
		
	}
	
	@Test
	public void testGetDetails() {
		
		assertEquals("Zak Mohammed 2018", main.retrieveAccount(0).getAccountDetails());
	}
	
}

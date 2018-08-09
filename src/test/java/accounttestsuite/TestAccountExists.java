package accounttestsuite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import accountmanagement.AccountAdministration;

public class TestAccountExists {
	private AccountAdministration main;
	@Before
	public void setup() {
		main = new AccountAdministration();
		main.addAccount("Zak", "Mohammend", "2018");
		main.addAccount("Tony", "Huang", "1985");
		main.addAccount("Tony", "Montana", "1983");
		main.addAccount("John", "Gorden", "1");
		main.addAccount("John", "Smith", "2");
		main.addAccount("John", "Mecree", "3");
	}
	
	@Test
	public void userSearchCountJohn() {
		assertEquals(3, main.searchForUsername("John"));
	}
	
	@Test
	public void searchCountTony() {
		assertEquals(2, main.searchForUsername("Tony"));
	}
	
	
}


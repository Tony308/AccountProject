package AccountManagement;

public class Main {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		AccountAdministration main = new AccountAdministration();

		main.addAccount("Zak", "Mohammend", "2018");
		main.addAccount("Tony", "Huang", "1985");
		
		System.out.println(main.retrieveAccount("Tony").getAccountDetails());
		
		System.out.println(main.retrieveAccount("Zak").getAccountDetails());
		
	}
		
	
}

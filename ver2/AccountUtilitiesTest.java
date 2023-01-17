package ver2;

public class AccountUtilitiesTest {

	public static void main(String[] args) {
		testGetLargestBalance();
		testGetLargestAccounts();
	}
	
	public static void testGetLargestBalance() {
		System.out.println("testGetLargestBalance(accounts)");
		
		// Create an array of accounts
		Account[] accounts = new Account[3];
		Account a1 = new Account("Mia", 1000.0);
		Account a2 = new Account(3000.0);
		Account a3 = new Account("Zeke", 200.0);
		accounts[0] = a1;
		accounts[1] = a2;
		accounts[2] = a3;

		// Create AccountUtilities
		AccountUtilities util = new AccountUtilities();
	    
		// Test the method
		double maxBalance = util.getLargestBalance(accounts);

		System.out.println("largest balance should be $3000, maxBalance=$" + maxBalance);
	}

	public static void testGetLargestAccounts() {
		System.out.println("\ntestGetLargestAccounts(accounts1, accounts2)");
		
		// Create an array of accounts
		Account[] accounts1 = new Account[3];
		Account a1 = new Account("Mia", 1000.0);
		Account a2 = new Account(3000.0);
		Account a3 = new Account("Zeke", 200.0);
		accounts1[0] = a1;
		accounts1[1] = a2;
		accounts1[2] = a3;

		// Create another array of accounts
		Account[] accounts2 = new Account[3];
		Account a4 = new Account("Pike", 2000.0);
		Account a5 = new Account("Ann", 500.0);
		Account a6 = new Account("Ivy", 500.0);
		accounts2[0] = a4;
		accounts2[1] = a5;
		accounts2[2] = a6;

		// Create AccountUtilities
		AccountUtilities util = new AccountUtilities();
	    
		// Test the method
		Account[] largest = util.getLargestAccounts(accounts1,accounts2);

		System.out.println("Should be: Pike, Unknown, Ivy");
		System.out.println("Actual results:");
		for(int i=0; i<largest.length; i++) {
			System.out.println(largest[i]);
		}
	}

}

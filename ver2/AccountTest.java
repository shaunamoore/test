package ver2;

public class AccountTest {
	public static void main(String[] args) {
		// Execute test methods
		testAccountCreation();
		testToString();
		testDeposit();
		testMultipleDeposits();		
		testDepositWithNegativeAmount();
		testWithdraw();
		testMultipleDepositsAndWithdrawals();		
		testWithdrawWithNegativeAmount();
		testAccountCreationWithNameAndBalance();
		testAccountCreationWithBalanceOnly();
		testMergeAccount_Successful();
		testMergeAccount_Unsuccessful();
	}
	
	/*
	 * Test methods 
	 */
	private static void testAccountCreation() {
		System.out.println("-->testAccountCreation()");
		Account a1 = new Account(1000.0);
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());
	}

	private static void testToString() {
		System.out.println("-->testToString()");
		Account a1 = new Account(1000.0);
		System.out.println("toString()=" + a1);
	}

	private static void testDeposit() {
		System.out.println("-->testDeposit()");
		Account a1 = new Account(1000.0);
		a1.deposit(500.0);
		System.out.println("balance should be $1500, balance=$" + a1.getBalance());
	}

	private static void testDepositWithNegativeAmount() {
		System.out.println("-->testDepositWithNegativeAmount()");
		Account a1 = new Account(1000.0);
		a1.deposit(-500.0);
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());
	}

	private static void testMultipleDeposits() {
		System.out.println("-->testMultipleDeposits()");
		Account a1 = new Account(1000.0);
		a1.deposit(500.0);
		a1.deposit(300.0);
		System.out.println("balance should be $1800, balance=$" + a1.getBalance());
	}

	private static void testWithdraw() {
		System.out.println("-->testWithdraw()");
		Account a1 = new Account(1000.0);
		a1.withdraw(600.0);
		System.out.println("balance should be $400, balance=$" + a1.getBalance());
	}

	private static void testWithdrawWithNegativeAmount() {
		System.out.println("-->testWithdrawWithNegativeAmount()");
		Account a1 = new Account(1000.0);
		a1.withdraw(-500.0);
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());
	}

	private static void testMultipleDepositsAndWithdrawals() {
		System.out.println("-->testMultipleDepositsAndWithdrawals()");
		Account a1 = new Account(1000.0);
		a1.deposit(500.0);
		a1.withdraw(200.0);
		a1.deposit(400.0);
		a1.withdraw(1000.0);
		System.out.println("balance should be $700, balance=$" + a1.getBalance());
	}
	private static void testAccountCreationWithNameAndBalance() {
		System.out.println("-->testAccountCreationWithNameAndBalance()");
		Account a1 = new Account("Ceasar", 1000.0);
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());
		System.out.println("name should be 'Ceasar', name=" + a1.getName());
	}

	private static void testAccountCreationWithBalanceOnly() {
		System.out.println("-->testAccountCreationWithBalanceOnly()");
		Account a1 = new Account(1000.0);
		System.out.println("balance should be $1000, balance=$" + a1.getBalance());
		System.out.println("name should be 'Unknown', name=" + a1.getName());
	}
	private static void testMergeAccount_Successful() {
		System.out.println("-->testMergeAccount_Successful()");
		Account a1 = new Account("Shay", 1000.0);
		Account a2 = new Account("Shay", 500.0);
		a1.mergeAccount(a2);
		System.out.println("balance for a1 should be $1500, balance=$" + a1.getBalance());
	}

	private static void testMergeAccount_Unsuccessful() {
		System.out.println("-->testMergeAccount_Unsuccessful()");
		Account a1 = new Account("Shay", 1000.0);
		Account a2 = new Account("Wren", 500.0);
		a1.mergeAccount(a2);
		System.out.println("balance for a1 should be $1000, balance=$" + a1.getBalance());
	}

}

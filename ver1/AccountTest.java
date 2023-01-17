package ver1;

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
}

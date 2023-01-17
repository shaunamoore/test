package ver2;

public class Account {
	// Instance variable, only available inside this class.
	//New comment for balance
	private double balance;
	private String name;
	
	// Constructor
	public Account(double balance) {
		this("Unknown", balance);
}

	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}


	// A "getter" method that simply returns the balance.
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
// A method that increases the balance by amount
public void deposit(double amount) {
	if(amount>0) {
		balance += amount;
	}
}

//Decreases the balance by amount
public void withdraw(double amount) {
	if(amount>0) {
		balance -= amount;
	}
}
public void mergeAccount(Account a) {
	if(this.getName().equals(a.getName())) {
		this.balance += a.getBalance();
	}
}

@Override
public String toString() {
	String msg = "name=" + name + ", balance=$" + balance;
	return msg;
}


	
	// Informal test code
	public static void main(String[] args) {
		Account a1 = new Account(1000.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.withdraw(200.0);
		System.out.println("Balance=$" + a1.getBalance());
		System.out.println(a1.toString());
		System.out.println(a1);
	}
}

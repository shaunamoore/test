package ver2;

public class AccountUtilities {

	public AccountUtilities() {}
	
	public double getLargestBalance (Account[] accounts) {
		double maxBal = Double.MIN_VALUE;
		
		for(int i=0; i<accounts.length; i++) {
			double currentBal = accounts[i].getBalance();
			if(currentBal>maxBal) {
				maxBal = currentBal;
			}
		}
		return maxBal;
	}
	
	public Account[] getLargestAccounts (Account[] accounts1, Account[] accounts2) {
		Account[] biggest = new Account[accounts1.length];
		for(int i=0; i<accounts1.length; i++) {
			Account a1 = accounts1[i];
			Account a2 = accounts2[i];
			if(a1.getBalance()>a2.getBalance()) {
				biggest[i] = a1;
			}
			else {
				biggest[i] = a2;
			}
		}
		return biggest;
	}
}


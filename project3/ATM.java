package codsoft;

public class ATM {
	private BankAccount account;

	public ATM(BankAccount account) {
		this.account=account;
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.print("amount must be positive");
		}
		else if(amount>account.getbalance()) {
			System.out.print("Insufficient balance");
			
		}
		else {
			account.withdraw(amount);
			System.out.print("Successfully withdrawn"+amount);
			
		}
	}
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.print("Amount must be positive");
		}
		else{
			account.deposit(amount);
			System.out.print("Account has been credited:"+amount);
			
		}

} public void checkbalance() {
	System.out.print("Your balance is:"+account.getbalance());
}
	}

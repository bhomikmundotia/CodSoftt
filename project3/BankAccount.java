package codsoft;

public class BankAccount {
	private double balance;

	public BankAccount(double initialbalance) {
		this.balance=initialbalance;
		// TODO Auto-generated constructor stub
	}
	public double getbalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		balance-=amount;
	}
	
	
	

}

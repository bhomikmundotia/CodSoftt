package codsoft;
import java.util.*;

public class ATMInterface {

	public static void main(String args[]) {
		BankAccount account=new BankAccount(500.0);
		ATM atm=new ATM(account);
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("\nATM Menu");
		System.out.println("1.Check balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("Choose an option");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			atm.checkbalance();
			break;
		
	      case 2:
              System.out.print("Enter deposit amount: ");
              double depositAmount = sc.nextDouble();
              atm.deposit(depositAmount);
              break;
          case 3:
              System.out.print("Enter withdrawal amount: ");
              double withdrawAmount = sc.nextDouble();
              atm.withdraw(withdrawAmount);
              break;
          case 4:
              System.out.println("Thank you for using the ATM. Goodbye!");
              sc.close();
              return;
              
          default:
              System.out.println("Invalid option. Please try again.");
      }
  }
}
}
              
              
                 
		
		
		
	
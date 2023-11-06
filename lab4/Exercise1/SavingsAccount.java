package mylab.lab4.Exercise1;

public class SavingsAccount extends Account {
	
	public final int minBal = 500;

	public SavingsAccount(double balance, Person accHolder) {
		super(accHolder, balance);
		
	}
	@Override
	public void withdraw(double amount) {
		
		if (getBalance()- amount >= minBal) {
			
			setBalance(getBalance()-amount);
			
			System.out.println("Available Balance in Savings Account after INR "+amount+" withdrwal is: "+getBalance());
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
}

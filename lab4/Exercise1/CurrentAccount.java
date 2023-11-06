package mylab.lab4.Exercise1;

public class CurrentAccount extends Account{
	
	private double overDraft;

	public CurrentAccount(Person accHolder, double balance, double overDraft) {
		super(accHolder, balance);
		this.overDraft = overDraft;
		
	}
	@Override
	public void withdraw(double amount) {
		
		if (getBalance()-amount>overDraft) {
			
			setBalance(getBalance()-amount);
			
			System.out.println("Available balance in current account after INR "+amount+" withdrawl is: "+getBalance());
		}
		else {
			System.out.println("Overdraft limit reached. try again after 24 hrs ");
		}
	}
	
	

}

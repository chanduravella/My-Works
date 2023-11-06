package mylab.lab4.Exercise1;

public class Exercise1 {
	
	public static void main(String args[]) {
		
		
		Person smith = new Person("Smith");
		Person kathy = new Person("Kathy");
		
		Account smithAccount = new Account(smith,2000);
		Account kathyAccount = new Account(kathy,3000);
		SavingsAccount smithSavings = new SavingsAccount(2000,smith);
		CurrentAccount kathyCurrent = new CurrentAccount(kathy,2000,1000);
		
		smithAccount.deposit(2000);
		System.out.println("Available balance: "+smithAccount.displayBalance());
		System.out.println();
		kathyAccount.withdraw(2000);
		System.out.println("Available balance: "+kathyAccount.displayBalance());
		
		System.out.println();
		smithSavings.withdraw(200);
		smithSavings.displayBalance();
		System.out.println();
		kathyCurrent.withdraw(1000);
		kathyCurrent.displayBalance();
		
		
	}

}

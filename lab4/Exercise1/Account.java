package mylab.lab4.Exercise1;

import java.util.Random;

public class Account {
	
	private long accNum;
	private double balance;
	private Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public Account(Person accHolder, double balance) {
		
		this.balance = balance;
		this.accHolder = accHolder;
		this.accNum = generateAccNum();
	}
	public long generateAccNum() {
		
		Random rand = new Random();
		long accNum = rand.nextLong(1000);
		return accNum;
	}
	
	public void deposit(double amount) {
		
		if (amount >0) {
			System.out.println("Account holder:"+accHolder.getName());
			System.out.println("Account Number: "+accNum);
			System.out.println("Current balance: INR "+balance);
			balance = balance+amount;
			System.out.println("Deposit Succesfull");
			
		}
		else {
			System.out.println("Amount must be above zero");
		}
	}
	public void withdraw(double amount) {
		
		if (balance > amount) {
			
			System.out.println("Account holder: "+accHolder.getName());
			System.out.println("Account Number: "+accNum);
			System.out.println("Current balance: INR "+balance);
			balance -=amount;
			System.out.println("Withdrawl Succesfull");
			
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	public double displayBalance() {
		
		return balance;
	} 
	

}

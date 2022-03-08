package com.mars.bank;

public class CheckingAccount extends Account {

	public CheckingAccount() {
		super();
		
	}

	public CheckingAccount(String fullName, int accNumber, double balance) {
		super(fullName, accNumber, balance);
		
	}

	@Override
	public double showBalance() {
		return balance;
	}

	public double Deposit(double amount) {
		balance += amount;
		return balance;
	}; 

	public double WithDraw(double amount) {
		if (balance > amount) {
			balance -= amount;
		}
		else 
			System.out.println("Insufficient Balance");
		return balance;
	}; 

	

	

}

package com.mars.bank;

public class SavingAccount extends Account {
	
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(String fullName, int accNumber, double balance) {
		super(fullName, accNumber, balance);
		// TODO Auto-generated constructor stub
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

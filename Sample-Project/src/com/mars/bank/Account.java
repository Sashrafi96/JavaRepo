package com.mars.bank;

public abstract class Account {

	private String fullName;
	private int accNumber;
	protected double balance;
	public Account() {
		this.fullName = "";
		this.accNumber = 0;
		this.balance = 0.0;
	}


	public Account(String fullName, int accNumber, double balance) {
		this.fullName = fullName;
		this.accNumber = accNumber;
		this.balance = balance;
	}


	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract double showBalance();

	public abstract double Deposit(double amount);
	public abstract double WithDraw(double amount);
	
//	public double Deposit(double amount) {
//		balance += amount;
//		return balance;
//	}; 
//
//	public double WithDraw(double amount) {
//		if (balance > amount) {
//			balance -= amount;
//		}
//		else 
//			System.out.println("Insufficient Balance");
//		return balance;
//	}; 

	
}

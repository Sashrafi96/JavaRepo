package com.mars.bankApplication;

public class AccountImpl  implements Account{
	private int accountNo;
	private String fullName;
	private double balance;
	
	public AccountImpl() {
		this.accountNo = 0;
		this.fullName = " ";
		this.balance = 0.00;
	}
	public AccountImpl(int accountNo, String fullName, double balance) {
		this.accountNo = accountNo;
		this.fullName = fullName;
		this.balance = balance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public double showBalance() {
			return balance;
		}
	

	@Override
	public double Deposit(double amount) {
		balance += amount;
		return balance;
	}

	@Override
	public double WithDraw(double amount) {
		if (balance > amount) {
			balance -= amount;
		}
		else 
			System.out.println("Insufficient Balance");
		return balance;
	}


}

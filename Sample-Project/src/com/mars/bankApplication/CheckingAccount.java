package com.mars.bankApplication;

public class CheckingAccount extends AccountImpl{

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(int accountNo, String fullName, double balance) {
		super(accountNo, fullName, balance);
	}
}

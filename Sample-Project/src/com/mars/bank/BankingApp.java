package com.mars.bank;

import java.util.Scanner;

public class BankingApp {
	static Scanner sc = new Scanner(System.in);
	static Account sa = new SavingAccount();
	static Account ca = new CheckingAccount();

	public static void main(String[] args) {
		
		System.out.println("WELCOME!!");
		mainMenu();
		
	}
	
	static void mainMenu() {
		while(true) {
			System.out.println("What type of account do you want to open?");
			System.out.println("================");
			System.out.println("   1. Saving    ");
			System.out.println("   2. Checking  ");
			System.out.println("   3. Exit      ");
			System.out.println("================");
			int ch = sc.nextInt();
			switch (ch){
			case 1:
				System.out.println("Enter your Name:");
				sa.setFullName(sc.next()); 
				sc.nextLine();
				System.out.println("Enter your Account number:"); //
				sa.setAccNumber(sc.nextInt()); 
				System.out.println("Enter your Balance:");
				sa.setBalance(sc.nextDouble());
				System.out.println("Congrats! Your saving account is open with a balance of "+sa.showBalance());
				SavingTransactionMenu();
				break;
			case 2:
				System.out.println("Enter your Name:");
				ca.setFullName(sc.next());
				sc.nextLine();
				System.out.println("Enter your Account number:");
				ca.setAccNumber(sc.nextInt());
				System.out.println("Enter your Balance:");
				ca.setBalance(sc.nextDouble());
				System.out.println("Congrats! Your checking account is open with a balance of "+ca.showBalance());
				checkingTransactionMenu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Please select your choice range 1-3 only");
			}
		}
	}

	static void SavingTransactionMenu() {
		while(true) {
			System.out.println("What would you like to do?");
			System.out.println("=======================");
			System.out.println("      1. Deposit       ");
			System.out.println("      2. Withdrawal    ");
			System.out.println("      3. Exit          ");
			System.out.println("=======================");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the Amount :");
				double damt = sc.nextDouble();
				sa.Deposit(damt);
				System.out.println("Name : "+ sa.getFullName()+"\n"+
						"Account No.: "+ sa.getAccNumber()+"\n"+
						"Balance: "+sa.showBalance());
				break;
			case 2:
				System.out.println("Enter the Amount :");
				double wamt = sc.nextDouble();
				sa.WithDraw(wamt);
				System.out.println("Name : "+ sa.getFullName()+"\n"+
						"Account No.: "+ sa.getAccNumber()+"\n"+
						"Balance: "+sa.showBalance());
				break;
			case 3:
				//System.exit(0);
				mainMenu();
				break;
			default:
				System.out.println("Please select your choice range 1-3 only");
			}
		}
	}

	static void checkingTransactionMenu() {
		while(true) {
			System.out.println("What would you like to do?");
			System.out.println("=======================");
			System.out.println("      1. Deposit       ");
			System.out.println("      2. Withdrawal    ");
			System.out.println("      3. Exit          ");
			System.out.println("=======================");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the Amount :");
				double damt = sc.nextDouble();
				ca.Deposit(damt);
				System.out.println("Name : "+ ca.getFullName()+"\n"+
						"Account No.: "+ ca.getAccNumber()+"\n"+
						"Balance: "+ca.showBalance());
				break;
			case 2:
				System.out.println("Enter the Amount :");
				double wamt = sc.nextDouble();
				ca.WithDraw(wamt);
				System.out.println("Name : "+ ca.getFullName()+"\n"+
						"Account No.: "+ ca.getAccNumber()+"\n"+
						"Balance: "+ca.showBalance());
				break;
			case 3:
				//System.exit(0);
				mainMenu();
				break;
			default:
				System.out.println("Please select your choice range 1-3 only");
			}
		}
	}


}

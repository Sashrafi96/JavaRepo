package com.pms.main;

import java.util.Scanner;

import com.pms.menu.ProductDetails;

public class ProductManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.println("|   PRODUCT MANAGEMENT SYSTEM  |");
		System.out.println("--------------------------------");
		System.out.println("|      1. ADMIN                |");
		System.out.println("|      2. CUSTOMER             |");
		System.out.println("|      3. EXIT                 |");
		System.out.println("--------------------------------");
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			ProductDetails.AdminMainMenu();
			break;
		case 2:
			ProductDetails.CustomerMainMenu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Please enter your choice between 1 - 3 ?");
			break;
		}
	}

}

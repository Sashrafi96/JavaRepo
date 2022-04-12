package com.pms.menu;

import java.util.List;
import java.util.Scanner;

import com.pms.dao.ProductDAOImpl;
import com.pms.model.Product;

public class ProductDetails {

	static Scanner sc = new Scanner(System.in);
	static ProductDAOImpl productDAO = new ProductDAOImpl();

	public static void AdminMainMenu() {

		System.out.println("----------------------------------");
		System.out.println("         ADMIN MAIN MENU          ");
		System.out.println("----------------------------------");
		System.out.println("|   1. ADD PRODUCT               |");
		System.out.println("|   2. VIEW PRODUCT              |");
		System.out.println("|   3. VIEW ALL PRODUCT          |");
		System.out.println("|   4. UPDATE                    |");
		System.out.println("|   5. DELETE PRODUCT            |");
		System.out.println("|   6. BACK                      |");
		System.out.println("----------------------------------");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			productDAO.addProduct();
			AdminMainMenu();
			break;
		case 2:
			System.out.println("Enter Your Search Product Id?");
			Product product = productDAO.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------------");
			System.out.println(product);
			AdminMainMenu();
			break;
		case 3:
			List<Product> products = productDAO.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------------");
			for (Product p : products) {
				System.out.println(p);
			}
			AdminMainMenu();
			break;
		case 4:
			System.out.println("Enter which product do you want to update?");
			productDAO.updateProduct(sc.nextInt());
			AdminMainMenu();
			break;
		case 5:
			System.out.println("Enter which product do you want to delete?");
			productDAO.deleteProduct(sc.nextInt());
			AdminMainMenu();
			break;
		case 6:
			productDAO.back();
			break;
		default : 
			System.out.println("Please enter your choice between 1 - 6");
			break;
		}
	}
	
	
	public static void CustomerMainMenu() {

		System.out.println("----------------------------------");
		System.out.println("         CUSTOMER MAIN MENU          ");
		System.out.println("----------------------------------");
		System.out.println("|   1. VIEW PRODUCT              |");
		System.out.println("|   2. VIEW ALL PRODUCT          |");
		System.out.println("|   3. BILL                      |");
		System.out.println("|   4. BACK                      |");
		System.out.println("----------------------------------");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter Your Search Product Id?");
			Product product = productDAO.viewProduct(sc.nextInt());
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------------");
			System.out.println(product);
			CustomerMainMenu();
			break;
		case 2:
			List<Product> products = productDAO.viewAllProducts();
			System.out.println("PID" + "\t" + "PNAME" + "\t" + "QTY" + "\t" + "PRICE");
			System.out.println("----------------------------------------");
			for (Product p : products) {
				System.out.println(p);
			}
			CustomerMainMenu();
			break;
		case 3:
			productDAO.bill();
			CustomerMainMenu();
			break;
		case 4:
			productDAO.back();
			break;
		default : 
			System.out.println("Please enter your choice between 1 - 6");
			break;
		}
	}
}

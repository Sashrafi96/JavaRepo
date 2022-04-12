package com.pms.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.main.ProductManagementSystem;
import com.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {

	public static List<Product> products = new ArrayList<Product>();
	public static List<Product> tempList = new ArrayList<Product>();
	Scanner sc = new Scanner(System.in);
	Product product = null;
	int n = 1;

	@Override
	public void addProduct() {
		while (n == 1) {
			product = new Product();
			System.out.println("Enter Product Id?");
			product.setPid(sc.nextInt());
			System.out.println("Enter Product Name :");
			product.setPname(sc.next());
			System.out.println("Enter Product Qty :");
			product.setQty(sc.nextInt());
			System.out.println("Enter Product price :");
			product.setPrice(sc.nextDouble());
			products.add(product);
			System.out.println("Do you want to ADD more products press 1 else any number?");
			n = sc.nextInt();
		}
		System.out.println("Products added successfully...");
		n=1;
	}

	@Override
	public Product viewProduct(int productId) {
		Product p = new Product();
		for (Product p1 : products) {
			if (p1.getPid() == productId) {
				p = p1;
				break;
			}
		}
		return p;
	}

	@Override
	public List<Product> viewAllProducts() {
		return products;
	}

	@Override
	public void updateProduct(int productId) {
		tempList = new ArrayList<Product>();
		for (Product p2 : products) {
			if (p2.getPid() == productId) {
				System.out.println("Enter your choice:1.Name 2.Qty 3.Price");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Updated Product Name?");
					p2.setPname(sc.next());
					break;
				case 2:
					System.out.println("Enter Updated Product Qty ?");
					p2.setQty(sc.nextInt());
					break;
				case 3:
					System.out.println("Enter Updated Product Price ?");
					p2.setPrice(sc.nextDouble());
					break;
				default: System.out.println("Please Enter from 1 to 3");
						break;
				}
				tempList.add(p2);
			}else {
				tempList.add(p2);
			}
		}
		products = new ArrayList<Product>();
		for(Product p3:tempList) {
			products.add(p3);
		}
		System.out.println("Successfully product Updated...");
	}

	@Override
	public void deleteProduct(int productId) {
		tempList = new ArrayList<Product>();
		for (Product p4 : products) {
			if (p4.getPid() == productId) {
				
			}else {
				tempList.add(p4);
			}
		}
		products = new ArrayList<Product>();
		for(Product p5:tempList) {
			products.add(p5);
		}
		System.out.println("Successfully product Deleted...");

	}

	@Override
	public void bill() {
		tempList = new ArrayList<Product>();
		Product selectedProduct = new Product();
		for(Product p6:products) {
			System.out.println(p6);
		}
		
		System.out.println("Which Product you want to buy?");
		selectedProduct.setPid(sc.nextInt());
		System.out.println("How much qty do you want?");
		selectedProduct.setQty(sc.nextInt());
		
		for(Product p7:products) {
			if(p7.getPid() == selectedProduct.getPid()) {
				System.out.println("------------------------------------");
				System.out.println("                BILL                ");
				System.out.println("------------------------------------");
				System.out.println("PRODUCT ID   :"+p7.getPid());
				System.out.println("PRODUCT NAME :"+p7.getPname());
				System.out.println("PRODUCT QTY  :"+selectedProduct.getQty());
				System.out.println("PRODUCT PRICE:"+p7.getPrice());
				System.out.println("-------------------------------------");
				System.out.println(" TOTAL AMOUNT :"+(p7.getPrice()*selectedProduct.getQty()));
				System.out.println("-------------------------------------");
				p7.setQty(p7.getQty()-selectedProduct.getQty());
				tempList.add(p7);
			}else {
				tempList.add(p7);
			}
		}
		products = new ArrayList<Product>();
		for(Product p8:tempList) {
			products.add(p8);
		}
		System.out.println("Thank you. Visit again...");
	}

	@Override
	public void back() {
		ProductManagementSystem.main(null);

	}

}

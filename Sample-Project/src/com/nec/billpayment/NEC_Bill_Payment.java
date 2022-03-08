package com.nec.billpayment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NEC_Bill_Payment {

	public static List<Consumer> Consumers = new ArrayList<Consumer>();

	// Method to display Electric Bill
	public static void displayBill(List<Consumer> consumers) {

		for(Consumer value:consumers) {
			System.out.println(value.getConsumerNo()+", "+value.getConsumerName()+", "+value.getConsumedUnit()+
					", Total Bill:"+String.format("%.2f",calculateBill(Integer.parseInt(value.getConsumedUnit()))));
		}

	}

	//Method to calculate Bill
	public static double calculateBill(int units) {
		double total=0.0;
		double flatRate =50.0;
		// Calculate Bill
		if (units <= 200)
			total = flatRate;
		else if (units >= 201 && units <= 500)
			total = flatRate + (units-200)*1.25;
		else if (units >= 501 && units <= 1000) 
			total = flatRate + (300*1.25) + (units-500)*1;
		else 
			total = flatRate + (300*1.25)+(500*1)+(units-1000)*.75;
		return total;
	}

	// Main Method
	public static void main(String[] args) {
		int n=1;
		String consumerDetails;
		while(n==1) {
			Scanner sc = new Scanner(System.in);
			Consumer consumer = new Consumer();
			String[] cd = new String[3];
			System.out.println("Enter Consumers DSetails(Consumer Number, Name, Units Used):");
			consumerDetails = sc.nextLine();
			cd = consumerDetails.split(",");
			for(String s:cd)
				System.out.println(s);
			consumer.setConsumerNo(cd[0].trim());
			consumer.setConsumerName(cd[1].trim());
			consumer.setConsumedUnit(cd[2].trim());
			Consumers.add(consumer); 
			System.out.println(Consumers);
			System.out.println("Do you want to ADD more press 1 else any number?");
			n = sc.nextInt();
		}
		//		System.out.println("Enter Number of Bills to be generated:");
		//		int numberofBills=sc.nextInt();
		displayBill(Consumers);
	}
}





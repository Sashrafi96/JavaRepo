package com.mars.returnship;

import java.util.Scanner;

public class SumOf4Digits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter four digit number:");
		int number = sc.nextInt();
		int sum = 0;
		int digit=0;
		int count=0;
		int num=number;
		// Finding no of digits present in the  entered number
		while(num!=0) {
			num = num/10;
			count++;
		}
		if (count == 4) {
			// Finding sum of four digits
			while(number!=0) {
				digit=number%10;
				sum= sum+digit;
				number=(number-digit)/10;
			}
			System.out.println("Sum of four digits:"+sum);
		} else
			System.out.println("Please enter 4 digit numbers only");
	}

}

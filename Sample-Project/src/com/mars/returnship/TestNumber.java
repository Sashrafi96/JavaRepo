package com.mars.returnship;

import java.util.Scanner;

class CustomException extends Exception{
	public CustomException (String msg) {
		super(msg);
	}
}

public class TestNumber{

	public static void main(String[] args) throws CustomException {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int number;
		while(count <= 10) {
			System.out.println("Enter your number:");
			number = sc.nextInt();
			try {
				if (number < 0 ) {
					throw new CustomException("Negative numbers are not allowed");
				}else
				{
					System.out.println("Number is "+number);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
			count++;
		}
	}

}

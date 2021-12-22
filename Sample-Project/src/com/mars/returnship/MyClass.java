package com.mars.returnship;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc= new Scanner(System.in);
//		int num=sc.nextInt();
//		for(int i=1;i<=10;i++) {
//			System.out.println(num+"*"+i+"="+num*i);
//		}
		System.out.println("Enter Number:");
		final int LUCKY_NUMBER=8;
		int count=1;
		while(true) {
			int num=sc.nextInt();
			if (num == LUCKY_NUMBER) {
				System.out.println("You found in "+count+" attempts");
				break;
			} else {
				System.out.println("Enter number again");
			}
			count++;
		}
	}
	}



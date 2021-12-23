package com.mars.returnship;

import java.util.Scanner;

public class AnagramStrings {

	public static  String sortString(String str) {
		// Converting string into an array for computation
		char arr[] = str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[j] < arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		// Converting array into String
		String sortedStr=String.valueOf(arr);
		return sortedStr;
	}

	public static void main(String[] args) {
		boolean status;
		Scanner sc = new Scanner(System.in);
		// Enter two strings
		System.out.println("Enter First String:");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String:");
		String str2 = sc.nextLine();
		sc.close();
		// removing all special characters
		str1=str1.replaceAll("[^a-zA-Z0-9]", "");
		str2=str2.replaceAll("[^a-zA-Z0-9]", "");
		if (str1.length() == str2.length()) {
			// converting String into lowercase
			str1=str1.toLowerCase();
			str2=str2.toLowerCase();
			// Sorting both Strings
			str1=sortString(str1);
			str2=sortString(str2);
			//Comparing both strings 
			if (str1.equals(str2)) {
				status = true;
			} else {
				status = false;
			}
		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("Strings are anagram");
		} else {
			System.out.println("Strings are not anagram");
		}

	}

}

package com.mars.returnship;

public class Array {

	public static void main(String[] args) {
		String[] stringArray= new String[10];
		for(int i=0; i<stringArray.length;i++) {
			stringArray[i]="string no. "+i;
		}

//		for(int i=0;i<stringArray.length;i++) {
//			System.out.println(stringArray[i]);
//		}
		
		for(String element:stringArray) {
			System.out.println(element);
		}
	}

}

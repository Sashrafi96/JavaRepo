package com.mars.returnship;

public class Arraydemo {

	public static void main(String[] args) {
		
		//int[] myArray=new int[10];
		
		//System.out.println("First element of array:"+myArray[1]);
//
//		for(int i=0; i<myArray.length;i++) {
//			myArray[i]=i*2;
//		}
		//System.out.println(myArray);// won't display any value

		// for displaying values
//		for(int j:myArray) {
//			System.out.println(j);
//		}
	/*********************************************/
//		int[][] twoDArray=new int[3][4];
//		System.out.println("Lengrh of Array:"+twoDArray.length);
//		for(int i=0;i<twoDArray.length;i++) {
//			for(int j=0;j<twoDArray[0].length;j++) {
//				twoDArray[i][j]=i+j;
//			}
//		}
//		
//		System.out.println("Dispalying two dimensional array:");
//		for(int i=0;i<twoDArray.length;i++) {
//			for(int j=0;j<twoDArray[0].length;j++) {
//				System.out.print(twoDArray[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		/***********************************************/
		///1
		///1 2
		///1 2 3
		/******************************************/
//		for (int i=1; i<=3;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		/**************************************************/
		//int[][] twoDArray=new int[3][4]; //
		// System.out.println("Lengrh of Array:"+twoDArray.length); 
		 int twoDArray[][] = {{1},{1,2},{1,2,3}}; 
		 for(int i=0;i<twoDArray.length;i++) { 
			 for(int j=0;j<twoDArray[i].length;j++) { 
		    System.out.print(twoDArray[i][j]+" "); 
		 } 
		 System.out.println(); 
		 } 
				
	}

}

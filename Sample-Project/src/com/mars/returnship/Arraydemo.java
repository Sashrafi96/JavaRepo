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

		/****************************************************/
		int[][] tDArray=new int[3][];
		System.out.println("Lengrh of Array:"+tDArray.length);

		tDArray[0] = new int[3];
		tDArray[1] = new int[4];
		tDArray[2] = new int[5];

		for(int i=0;i<tDArray.length;i++) {
			for(int j=0;j<tDArray[i].length;j++) {
				tDArray[i][j]=i+j;
			}
		}

		System.out.println("Dispalying two dimensional array:");
		for(int i=0;i<tDArray.length;i++) {
			for(int j=0;j<tDArray[i].length;j++) {
				System.out.print("+  "+tDArray[i][j]+" ");
			}
			System.out.println();
		}
		/***********************************************************/

		int[][] numbers=new int[3][];

		numbers[0] = new int[4];
		numbers[1]= new int[5];
		numbers[2]= new int[4];

		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				numbers[i][j]= i*4+j;
			}
		}

		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}
}



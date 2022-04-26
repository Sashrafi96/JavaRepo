package com.mars.returnship;

public class Tester {
	static int x=4;
	static int y=9;
	public Tester() {
		System.out.print(this.x);
		printVariables();
	}
	
	public static void printVariables() {
		System.out.print(x);
		System.out.print(y);
		
	}
	public static void main(String... args) {
		
		new Tester();

	}

}

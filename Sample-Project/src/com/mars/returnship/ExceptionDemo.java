package com.mars.returnship;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		try {
		//show();
        if (a>b) {
        	System.out.println("A is greater");
        } else {
        	throw new MyException("Lesser value");
        }
		}
		catch (ArithmeticException e) {
			System.out.println("Exception thrown from show()");
		}
		catch (Exception e) {
			System.out.println("Lesser value");
		}
		
	}

	private static void show() throws ArithmeticException{
		int a=5;
		int b=a/0;
		System.out.println("Value of b is: "+b);

	}
}

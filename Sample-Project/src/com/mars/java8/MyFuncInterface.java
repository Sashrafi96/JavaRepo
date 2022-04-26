package com.mars.java8;

@FunctionalInterface
public interface MyFuncInterface {
	// A functional interface should always contain only one 
	// abstract method
	//public void getValue();
	
//	public void getValue(int a,int b);
	
	public int getValue(int a);
}

package com.mars.java8;

import java.util.function.Function;

public class lambdaDemo {

	public static void main(String[] args) {
		//		MyFuncInterface method = ()-> System.out.println("Demostrating Lambda Expression");

		//		MyFuncInterface method = (a,b)-> System.out.println("Sum= "+(a+b));
		//		method.getValue(3,6);

//		MyFuncInterface method = (a)-> {return (5*a);};
//		int value=method.getValue(3);
//		System.out.println("value="+value);
		
		//BuiltIn Function --- returns value
		Function method = (a)-> {return (5*(int)a);};
		
		int value=(int)method.apply(3);
		System.out.println("value="+value);

	}

}

/* We have an interface but we are not implementing it in any classes
 * instead we use Lambda expression*/

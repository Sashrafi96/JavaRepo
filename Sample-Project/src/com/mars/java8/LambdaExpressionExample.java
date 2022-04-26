package com.mars.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//interface Drawable{
//	public void draw();
//}

@FunctionalInterface
interface Drawable{
	public void draw();
}

interface Sayable{  
	//public String say();  // with no parameters
	public String say(String s); // With one parameter
}  

public class LambdaExpressionExample {

	public static void main(String[] args) {

		int width=10;

		//		//Without Lambda
		//		Drawable d = new Drawable() {
		//			public void draw() {System.out.println("Drawing"+width);
		//			};
		//		};
		//		
		//		d.draw();

		// With lambda
		Drawable d = () -> System.out.println("Drawing "+width);
		d.draw();

		//Using Sayable Interface
		//Sayable s =()->{return "I have nothing to say";};
		//System.out.println(s.say());

		//Using Sayable Interface -- without return keyword
		//	Sayable s1 =()-> "I have nothing to say";
		//	System.out.println(s1.say());

		Sayable s2 = (name) -> "Hello "+name;
		System.out.println(s2.say("Sam"));
		
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        System.out.println("------------Iterating by Lambda Exp---------------");  
        gamesList.forEach(name -> System.out.println(name));  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.forEach(System.out::println);  

	}
}

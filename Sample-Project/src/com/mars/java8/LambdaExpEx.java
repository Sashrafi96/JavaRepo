package com.mars.java8;

public class LambdaExpEx {

	public static void main(String[] args) {
		int width = 20;
		DrawBoard s=()->{ 
			System.out.println("Displaying:"+width);
		};
		s.draw();

	}

}

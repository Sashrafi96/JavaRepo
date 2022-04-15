package com.mars.returnship;

public class stringPr {

	public static void main(String[] args) {
		String name = "Safia";
		String myName = "Safia";
		
		System.out.println("Comparing contents : "+(name.equals(myName)));
		System.out.println("Comparing References: "+ (name == myName));
		
		/************************************************/
		
		String fn = new String("Safia");
		String ln = new String("Safia");
		
		System.out.println("Comparing contents 11: "+(fn.equals(ln)));
		System.out.println("Comparing References11: "+ (fn == ln));
		
	}

}

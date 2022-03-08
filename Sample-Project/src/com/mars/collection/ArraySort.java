package com.mars.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		List<String> AL = new ArrayList<>();
		AL.add("abc");
		AL.add("pqr");
		AL.add("aaa");
		AL.add("xyz");
		System.out.println("Before Sorting");
		for(String s:AL)
			System.out.println(s);
		System.out.println("After Sorting");
		Collections.sort(AL);
		for(String s:AL)
			System.out.println(s);
		
		

	}

}

package com.mars.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6);

		List<Integer> square=num.stream().map(n->n*n).collect(Collectors.toList()); //Intermediate/Terminal

		System.out.println("Displaying numbers:");
			for(Integer i:square) {
				System.out.println(i);
			}
		num.stream().map(n->n*n).forEach(x->System.out.println(x));
		
		System.out.println("Method Reference");
		num.stream().map(n->n*n).forEach(System.out::println); //method reference

		System.out.println("Reduce");
		int sum = num.stream().map(n->n*n).reduce(0, (ans,i)->ans+i);
		System.out.println("Sum="+sum);
		
		List<String> names = Arrays.asList("Stream","Sigma","Reflect","java");
		List<String> nameWithS = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		for(String name:nameWithS) {
			System.out.println(name);
		}
	}
}

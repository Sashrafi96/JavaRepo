package com.mars.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6);

		List<Integer> square=num.stream().map(n->n*n).collect(Collectors.toList()); //Intermediate/Terminal
		List<Integer> sortedNumber=num.stream().sorted().collect(Collectors.toList()); //Intermediate/Terminal
		List<Integer> sortedsquaredNumber=num.stream().map(n->n*n).sorted().collect(Collectors.toList()); //Intermediate/Terminal

		System.out.println("Displaying numbers:");
		for(Integer i:square) {
			System.out.println(i);
		}

		System.out.println("Sorted Numbers: "+sortedNumber);
		
		System.out.println("Sorted Squared Numbers: "+sortedsquaredNumber);

		num.stream().map(n->n*n).forEach(x->System.out.println(x));// Foreach is consider as a consumer method since it is 
																//consuming the value and not returning anything

		System.out.println("Method Reference");
		num.stream().map(n->n*n).forEach(System.out::println); //method reference

		System.out.println("Reduce");
		int sum = num.stream().map(n->n*n).reduce(0, (ans,i)->ans+i);
		System.out.println("Sum="+sum);

		List<String> names = Arrays.asList("Stream","Sigma","Reflect","java");
		List<String> nameWithS = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());// Method is predicate because filter is returning boolean value
		for(String name:nameWithS) {
			System.out.println(name);
		};
		
		//Demonstrate different stream on string collections
		
		List<String> Names = Arrays.asList("Stream", "Sigma", "Reflect", "React", "Java","Sql");
		
		List<String> Names_UpperCase=Names.stream().map(s->s.toUpperCase()).collect(Collectors.toUnmodifiableList());
		List<String> Names_S=Names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList()); //Intermediate/Terminal
		List<String> Names_Sorted=Names.stream().sorted().collect(Collectors.toList()); //Intermediate/Terminal
		String Names_Concat=Names.stream().filter(s->s.startsWith("S")).reduce("",(ans,i)->ans+i);
		
		System.out.println(Names_UpperCase);
		System.out.println(Names_S);
		System.out.println(Names_Sorted);
		System.out.println(Names_Concat);
		
	}
}

//intermediate Operations : map, filter, sorted
//terminal operation: collect, forEach, reduce





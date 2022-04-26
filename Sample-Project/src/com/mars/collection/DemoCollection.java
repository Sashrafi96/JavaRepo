package com.mars.collection;

import java.util.HashSet;
import java.util.Set;

public class DemoCollection {

	public static void main(String[] args) {

		//		Set<Integer> values = new HashSet<>();
		//	
		//		values.add(2);
		//		values.add(6);
		//		values.add(8);
		//		values.add(3);
		//		values.add(2);
		//		
		//		for( int num : values) {
		//			System.out.println(num);
		//		}

		//		List<Integer> values = new ArrayList<>();
		//		
		//		values.add(2);
		//		values.add(6);
		//		values.add(8);
		//		values.add(3);
		//		values.add(2);
		//		
		//		for( int num : values) {
		//			System.out.println(num);
		//		}

		//		List<String> values = new ArrayList<>();
		//
		//		values.add("Safia");
		//		values.add("aaaa");
		//		values.add("bbbb");
		//		values.add("kkkkk");
		//		values.add("iiii");
		//
		//		for( String num : values) {
		//			System.out.println(num);
		//		}

		StudentCol st1 = new StudentCol("Safia",01,'A');
		StudentCol st2 = new StudentCol("John",02,'B');
		StudentCol st3 = new StudentCol("Maria",03,'B');
		StudentCol st4 = new StudentCol("Maria",03,'B');
		StudentCol st5 = new StudentCol("John1",02,'B');
		
//		List<StudentCol> stdList = new ArrayList<>();
//		
//		stdList.add(st1);
//		stdList.add(st2);
//		stdList.add(st3);
//		stdList.add(st4);
//		stdList.add(st5);
//		
//		for(StudentCol std : stdList) {
//			System.out.println(std.getName());
//		}
		
//		Map<String,StudentCol> stdMap = new HashMap<>();
//		
//		stdMap.put("1", st1);
//		stdMap.put("2", st2);
//		stdMap.put("3", st3);
//		stdMap.put("4", st4);
//		stdMap.put("5", st5);
//		
//		for(Map.Entry<String,StudentCol> entry : stdMap.entrySet()) {
//			String key = entry.getKey();
//			StudentCol std = entry.getValue();
//			System.out.println("Name : "+std.getName());
//			System.out.println("Grade: "+std.getGrade());
//		}
		
		Set<StudentCol> stdSet = new HashSet<>();
		stdSet.add(st1);
		stdSet.add(st2);
		stdSet.add(st3);
		stdSet.add(st4);
		stdSet.add(st5);
		
		for(StudentCol std: stdSet) {
			System.out.println(std.getName());
		}
		
		System.out.println(st3.equals(st4));
	
	}

}

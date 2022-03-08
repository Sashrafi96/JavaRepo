package com.mars.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student("Safia",01,'A');
		Student st2 = new Student("John",02,'B');
		Student st3 = new Student("Maria",03,'B');
		Student st4 = new Student("Maria",03,'B');
		Student st5 = new Student("John1",02,'B');

//		List<Student> students = new ArrayList<>();
//		students.add(st1);
//		students.add(st2);
//		students.add(st3);
//		students.add(st4);
//		students.add(st5);
//		
//		Collections.sort(students);
//		for(Student st:students) {
//			System.out.println(st);
//		}
		
		Set<Student> students = new HashSet();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		for(Student st:students) {
			System.out.println(st);
		}
		
//		Map<String,Student> students = new HashMap<>();
//		
//		students.put(st1.getName(), st1);
//		students.put(st2.getName(), st2);
//		students.put(st3.getName(), st3);
//		
//		for(Map.Entry<String,Student> entry:students.entrySet()) {
//			System.out.println("Key: "+entry.getKey()+" Grade: "+entry.getValue().getGrade());
//		}
	}

}

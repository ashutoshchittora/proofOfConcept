package com.LamdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Movie {
	
	void tickets();

	void newTicketCount(int i);

}

class Student {
	int rollNo;
	String name;
	int age;
	Float percentage;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
	
	public Student(int rollNo, String name, int age, Float percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	
}

// Bollywood inner class created - this will also be a part of .class file in the bin folder
class Bollywood implements Movie {
	
	public void tickets() {
		System.out.println("-- class Bollywood implements Movie with mehtod tickets() --- ");
	}

	public void newTicketCount(int count) {
		System.out.println("-- class Bollywood implements Movie with method newTicketCount()---  " + count);

	}

}

public class LamdaExpressionJava8 {

	public static void main(String[] args) {

		
		
		/*
		 * Type 1 : iterate list using Lambda 
		 */
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		list.forEach(i -> System.out.println(i));
		
		/*
		 * Type 2 : iterate  
		 */
		
		Movie movie;
		movie = new Bollywood();
		movie.tickets();
		movie.newTicketCount(5);

		/*
		 * Now if Bollywood is declared only once and its purpose is just to print
		 * tickets then we can avoide creating the class as below :
		 */

		Movie movieAnnonymous = new Movie() {
			
			public void tickets() {
				System.out.println("--- movieAnnonymous created and Interface instantiated with annoymous class and method tickets()---");
			}

			public void newTicketCount(int countNew) {
				System.out.println("--- movieAnnonymous created and Interface instantiated with annoymous class and method newTicketCount()--- "+countNew);				
				
			}
		};
		movieAnnonymous.tickets();
		movieAnnonymous.newTicketCount(10);

		
		// There is powerful way to write what we have written above using JAVA 8 Lambda Expression.
		
		/*Movie movieLamda;
		movieLamda = () -> 
		{
			
		};*/
	
		
		/*
		 * ---------------------------------------
		 * using list of students with Lambda
		 * ---------------------------------------
		 */
	System.out.println("----------------------------------");
	System.out.println("----------------------------------");
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(001, "Alia", 25, 65.6f));
		studentList.add(new Student(002, "Prik", 26, 75.6f));
		studentList.add(new Student(003, "Sush", 27, 85.6f));
		studentList.add(new Student(004, "Eliz", 28, 95.6f));
		
		studentList.forEach(stu -> System.out.println("Student name : "+ stu.name));
		//studentList.forEach(stu -> (stu.age==25)?"pass":"fail");
	/*	Map<String, Integer> result = studentList.stream()
				  .collect(toMap(Function.identity(), String::length));*/
		
		
		Map result1 = studentList.stream()
		        .sorted(Comparator.comparing(Student::getName).reversed())  // reverse order of alphabets
		        .collect(
		                Collectors.toMap(
		                		Student::getRollNo, Student::getName, // key = getRollNo, value = getName
		                        (oldValue, newValue) -> oldValue,       // if same key, take the old key
		                        LinkedHashMap::new                      // returns a LinkedHashMap, keep order
		                ));
		
		result1.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
	}

}

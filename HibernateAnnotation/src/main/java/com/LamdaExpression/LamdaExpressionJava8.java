package com.LamdaExpression;

interface Movie {
	
	void tickets();

	void newTicketCount(int i);

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
		
		Movie movieLamda;
		movieLamda = () -> 
		{
			
		};
	}

}

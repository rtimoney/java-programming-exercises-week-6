package week6Lecture2;

import java.util.Scanner;

public class Lecture1Part1RunTimeErrors {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner (System.in);
		
		System.out.println("Please enter an integer : ");
		int myInt = scanner.nextInt();
		System.out.println("You entered : "+myInt);
		
		
		double answer = myInt/0;
		System.out.println("This won't be written : " +answer);
	} // end of main method

} // end of class

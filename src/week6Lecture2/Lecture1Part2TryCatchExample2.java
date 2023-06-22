/*package week6Lecture2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture1Part2TryCatchExample2 {

	public static void main(String[] args) {

		int age = 0;
		// create a Scanner
		Scanner scanner = new Scanner(System.in);
		
		// get input from user
		try{
		    System.out.println("Please enter your age: ");
		    age = scanner.nextInt();
				System.out.printf("%d  ? That is quite old ", age);
				scanner.close();
		} catch(InputMismatchException ex) {
			System.out.println("I was expecting a whole number");
		}

	}

 }
*/

// now we are going to add a do while loop to the above to ensure that we get a correct answer

package week6Lecture2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecture1Part2TryCatchExample2 {

	public static void main(String[] args) {

		int age = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		boolean done = false;
		
		do {
		try{
		    System.out.println("Please enter your age: ");
		    age = scanner.nextInt();
				System.out.printf("%d? That is quite old ", age);
				// if the code gets to this point, we know the input has been correct 
				// so we can set done = true to jump out of the do while 
				done=true;
				// scanner.close();
		} catch(InputMismatchException ex) {
			System.out.println("I was expecting a whole number");
			// because the user had hit return, the return key remains waiting to be read and craets an infinite loop
			scanner.next();
		}
		// keep doing the contents of the do loop while done = false 
		} while (!done);
	}

}


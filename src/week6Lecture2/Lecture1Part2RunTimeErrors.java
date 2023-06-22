package week6Lecture2;

public class Lecture1Part2RunTimeErrors {

	public static void main(String[] args) {
	
		int myArray[] = {12,23,3,4};
		// try-catch block
		try {
		
		for (int i=0; i<6; i++) {
			System.out.println(myArray[i]);
		}// end of for 
		} // end of try block
		catch(Exception ex) {
			System.out.println("What are you doing??????");
			ex.printStackTrace();
		}// end of catch
		
		System.out.println("End of program.");
		
	} // end of main

}// end of class

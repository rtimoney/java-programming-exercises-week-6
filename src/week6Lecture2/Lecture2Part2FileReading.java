package week6Lecture2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Lecture2Part2FileReading {

	public static void main(String[] args) {
		
		// declare String 
		String line;
		// initialise String
		line ="default";
		
		int total = 0;
		
		
		
		
		try { // beginning of try block
			
			
			File firstFile = new File("NamesNew.txt");
			
			FileReader firstFileReader = new FileReader(firstFile);
			
			BufferedReader firstBufferedReader = new BufferedReader(firstFileReader);
			
			// initialised and declared outside try block 
			// String line;
			
			
			
			
			line = firstBufferedReader.readLine(); // attempt to read first line
			
			while(line != null) {
				int numChars;
				
				numChars =  line.length();
				total += numChars;
				
				System.out.println(line+" length of name: "+numChars);
				line = firstBufferedReader.readLine(); // read next line - this will be null if we reach the end 
			}
			
			
			
			
			firstFileReader.close();
			firstBufferedReader.close();
			
			
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println("File not found - did you mistype?");
		}// end of catch block
 catch (IOException e) {
			e.printStackTrace();
			System.out.println("General IO Exception");
		}
		catch (Exception e) {
			System.out.println("General Exception");
		}
		
		System.out.println(total);
		System.out.println("bye ");
		
	}

}

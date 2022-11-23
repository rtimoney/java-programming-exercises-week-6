package week6Lecture2;

public class Lecture2Part1Debugger {

	public static void main(String[] args) {
		
		
		int a, b, c;
		a = 5;
		b = 7;
		c = a + b;
		int[] values = new int[c];
		values[b] = a;

		 for (int i = 0; i < values.length; i++) {
 		System.out.printf("%02d | %d %n", i, values[i]);
		}

		 int d = sumIntArray(values) * 9;
		 System.out.println("total of array is: " + sumIntArray(values));
		 System.out.println(d);
		 
		 
		 System.out.println("ends");
	}
	
	public static int sumIntArray(int[] input) {
		int total = 0;
		for (int val : input) {
		total += val;
		}
		return total;
		}

}

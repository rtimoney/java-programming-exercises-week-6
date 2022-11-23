
public class Lecture2Part1Debugging {
	public static void main(String[] args) {
	
	int a, b, c;
	a = 5;
	b = 7;
	c = a + b;
	int[] values = new int[b];
	values[c] = a;

	 for (int i = 0; i <= values.length; i++) {
	System.out.printf("%02d | %d %n", i, values[i]);
	}

	 System.out.println("ends");

}
}
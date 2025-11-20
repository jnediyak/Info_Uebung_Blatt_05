package h2;

import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		int n = 5001099, digits = 1;
		int[] a = new int[9];

		digits = Integer.toString(n).length();
		char[] charArray = Integer.toString(n).toCharArray();

		for (int i = a.length - digits; i < a.length; i++) {
			 a[i] = Character.getNumericValue(charArray[i - a.length + digits]);
		}
		
		System.out.println(Arrays.toString(charArray));
		System.out.println(Arrays.toString(a));
		System.out.println(digits);
	}

}
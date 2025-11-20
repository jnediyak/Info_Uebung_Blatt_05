package h1;

import java.util.Arrays;

public class H1_main {

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 5, 6, 4, 8, 6, 2, 1 };

		int[] t = myArray.clone();

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = t[t.length - 1 - i];
		}
		System.out.println("Vorher: " + Arrays.toString(t));
		System.out.print("Nacher: " + Arrays.toString(myArray));
	}

}

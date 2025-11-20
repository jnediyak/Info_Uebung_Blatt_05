package p2;

import java.util.Arrays;

public class P2_main {

	public static void main(String[] args) {

		int[] numbers = { 1, -8000, 5 };
		int max, minIndex;

		max = numbers[0];
		minIndex = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
				minIndex = i;
			}
		}
		System.out.println("Max: " + max + ", minIndex: " + minIndex);
		System.out.println(Arrays.toString(numbers));
	}

}

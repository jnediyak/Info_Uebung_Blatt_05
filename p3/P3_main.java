package p3;


public class P3_main {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] org = new int[matrix.length][matrix[0].length];
		for(int i = 0; i < org.length; i++) {
			for(int j = 0; j < org[i].length; j++) {
				org[i][j] = matrix[i][j];
			}
		}
		
		int sum = 0;
		System.out.println("Matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				matrix[i][j]++;
			}
		}
		System.out.println("a)");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}

		System.out.println("b) Summe der ursprünglichen Matrix: " + sum);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = org[org.length - 1 - j][i];
			}
		}
		System.out.println("c)");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
	}

}

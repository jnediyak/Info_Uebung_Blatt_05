package h3;

public class H3_main {

	public static void main(String[] args) {

		int[][] einheiten = { { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		int input = 0;
		int rest = input;

		for (int i = 0; i < 15; i++) {
			while (einheiten[0][i] <= rest) {
				rest -= einheiten[0][i];
				einheiten[1][i] += 1;
			}
		}

		System.out.println("Input: " + input);
		System.out.println("Rest: " + rest);
		System.out.print("Wert:\t");
		for(int i = 0; i < einheiten[0].length; i++) {
			System.out.print(einheiten[0][i] + "\t");
		}
		System.out.println();
		System.out.print("Anzahl:\t");
		for(int i = 0; i < einheiten[1].length; i++) {
			System.out.print(einheiten[1][i] + "\t");
		}
	}
	
	

}

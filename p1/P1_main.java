package p1;

public class P1_main {

	public static void main(String[] args) {

		System.out.println("While-Schleife (Vorlage)");
		int y = 0;
		while (y <= 10) {
			y = y + 1;
			System.out.println(y);
		}
		
		System.out.println("for-Schleife:");
		for (int x = 1; x <= 11; x++) {
			System.out.println(x);
		}

		System.out.println("Do-While-Schleife:");
		int x = 0;
		do {
			x += 1;
			System.out.println(x);
		} while (x <= 10);

	}

}

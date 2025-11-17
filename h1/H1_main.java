package h1;

public class H1_main {

	public static void main(String[] args) {
		int[] myArray = { 7, 5, 4 };
		
		int[] t = myArray.clone();
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = t[t.length - 1 -i];
		}
		
		System.out.print("Array: ");
		for(int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + ", ");
		}
	}

}

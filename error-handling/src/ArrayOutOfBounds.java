import java.util.Random;
import java.util.Scanner;

public class ArrayOutOfBounds {

	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Invoke getArray method
		int[] randomNums = getArray();

		for (int item = 0; item<randomNums.length; item++) {
			System.out.println("Test " +item+": "+ randomNums[item]);
		}
		
		// Prompt the user to enter the index of the array
		System.out.print("Enter index of random number: ");
		try {
			// Display the corresponding element value
			System.out.println("The corresponding element value is " + randomNums[input.nextInt()]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
		
		
	}
	
	/** Returns an array with 100 randomly chosen integers */
	private static int[] getArray() {
		int[] array = new int[100];
		Random randomGen = new Random();
		for (int i=0; i< ra) {
			array[item] = randomGen.nextInt(100)+1;
		}
		return array;
	}

}

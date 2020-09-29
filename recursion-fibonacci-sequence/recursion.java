package recursion;

import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Enter string to reverse
		System.out.print("Enter string to reverse: ");
		String string = scan.nextLine();
		
		// print reversed string
		System.out.print("Reversed string: ");
		reverse(string);
		System.out.println("\n\n (end of reverse program)");
		
		// print fibonacci sequence of n numbers
		System.out.print("\nHow many numbers in your fibonacci sequence: ");
		int n = scan.nextInt();
		
		// set fib number array
		
		int[] fibArr = new int[n];
		int j = n;
		for (int i=0; i<n; i++) {
			fibArr[j-1] = fibNum(j);
			// System.out.println("n = "+j+" fibn = "+" "+fibNum(j));
			j = j-1;
		}
		
		// print fib numbers
		printFibNums(fibArr, n);
		System.out.println("\n\n (end of fibonacci program)");

	}
	

	// print first n fibonacci numbers
	// fib (number)
	//		intitialize integer array of (number) in length
	// 		recursive case:
	//			if fib(number is >= 3)
	//				return fib(number-1) + fib(number-2)
	//		base case:
	//			if fib(number is 1) or fib(number is 2)
	//				return 1
	
	// set fib number
	private static int fibNum(int n) {
		
		if ((n<=2)||(n==0)) {
			return 1; // base case
		} else { 
			return fibNum(n-1)+fibNum(n-2); // recursive case
		}
	}
	
	// get fib number
		private static void printFibNums(int[] fibArr, int n) {
			System.out.print("The first "+n+" fibonacci numbers are: ");
			for (int i=0; i<n; i++) {
				System.out.print(fibArr[i] + " ");
			}	
		}
	
	// reverse (string)
	// 		recursive call: 
	//			if string length > 1
	//				print end char of string + reverse(substring: start index-0 to index-string length-1)
	//		base case:
	//			if string length equals 0 or 2
	//				print string // string is empty

	private static void reverse(String string) {
		// base case
		if (string.length() == 0 || string.length() == 1) {
			System.out.print(string);
		} else { 
			// recursive case
			int endString = string.length()-1;
			char endChar = string.charAt(endString);
			System.out.print(endChar);
			reverse(string.substring(0, endString));
		}
		
	}

}

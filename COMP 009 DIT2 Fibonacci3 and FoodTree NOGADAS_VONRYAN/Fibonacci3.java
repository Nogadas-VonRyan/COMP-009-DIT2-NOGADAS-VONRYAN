package COMP009;

import java.util.Scanner;

public class Fibonacci3 extends NumberWords {// (^_^)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input how many Fibonacci numbers to print: ");
		int inputNumber = scan.nextInt();
		
		System.out.print("Press [1] to print in words and [2] to print in digits:  ");
		int printType = scan.nextInt();
		scan.close();
		
		System.out.println("======");
		int start = 0;
		for(int i=start; i<start+inputNumber; i++) {
			if(printType == 1) {
				System.out.print(convertToWord(fib(i)));
			}
			else if(printType == 2) {
				System.out.print(fib(i));
			}
			else {
				System.out.print("Invalid option.");
				break;
			}
			
			if(i != start+inputNumber-1) {
				System.out.print(", ");
			}
		}
	}
	
	public static int fib(int n) {
		if (n == 0) return 0;
	    if (n == 1) return 1;
		return fib(n-1) + fib(n-2);
	}
}

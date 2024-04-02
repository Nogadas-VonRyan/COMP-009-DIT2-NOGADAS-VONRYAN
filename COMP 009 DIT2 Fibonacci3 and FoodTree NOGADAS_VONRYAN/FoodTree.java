package COMP009;

import java.util.Scanner;

public class FoodTree extends Printer {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Printer printer = new Printer();
		System.out.println("Enter [1] for Tree format and Enter [2] for Bullet Point format: ");
		int input = scan.nextInt();
		if (input == 1) {
			printer.printTree();
		}
		else if (input == 2) {
			printer.printBullet();
		}
		else {
			System.out.println("Invalid input.");
		}
		scan.close();
	}
	
}

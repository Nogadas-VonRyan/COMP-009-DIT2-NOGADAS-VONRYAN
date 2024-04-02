package COMP009;

import java.util.Scanner;

public class FoodTree extends FoodPrinter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		FoodPrinter printer = new FoodPrinter();
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

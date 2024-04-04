package COMP009.POS;

import java.time.LocalDate;
import java.util.Scanner;
public class PointOfSale {
	public Scanner scan = new Scanner(System.in);
	public int products_count = 0;
	public int purchased_count = 0;
	public Product products[] = new Product[100];
	public Product purchased[] = new Product[100];
	
	public void addProduct(String name, double price) {
		products[products_count] = new Product(name,price,products_count+1);
		products_count++;
	}
	
	public void setUpProducts() {
		addProduct("Milo", 10);
		addProduct("Coca-Cola", 60);
		addProduct("Nike Shoes", 3000);
		addProduct("iPhone 13", 19999);
		addProduct("Samsung Galaxy S21", 16899);
		addProduct("Sony PlayStation 5", 25499);
		addProduct("MacBook Pro", 12499);
		addProduct("Adidas T-Shirt", 1225);
		addProduct("Lays Potato Chips", 40);
		addProduct("Dell Monitor", 3999);
		addProduct("Amazon Echo Dot", 4999);
		addProduct("Fitbit Charge 4", 3999);
		addProduct("Canon EOS Rebel T7", 47000);
		addProduct("Bose Noise Cancelling Headphones", 4000);
		addProduct("Nintendo Switch", 23299);
		addProduct("HP Printer", 12889);
		addProduct("Lenovo ThinkPad", 30000);
		addProduct("LG 4K TV", 14000);
		addProduct("GoPro Hero 9", 5999);
		addProduct("Xbox Series X", 29999);
		addProduct("Puma Sneakers", 9999);
		addProduct("Hershey's Chocolate Bar", 300);
		addProduct("JBL Flip 5 Speaker", 1199);
		addProduct("Under Armour Hoodie", 1149);
		addProduct("Fujifilm Instax Mini 11", 2999);
		addProduct("Google Pixel 6", 11699);
		addProduct("Toshiba External Hard Drive", 3379.99);
		addProduct("Timberland Boots", 2149.99);
		addProduct("Nutella Hazelnut Spread", 709);

	}
	
	public void displayProducts() {
		System.out.println("\n\n=================\nProducts List:");
		for(int i=0; i<products_count; i++) {
			System.out.println((i+1) + ". " + products[i].name + " - " + products[i].price);
		}
	}
	
	public void displayPurchased() {
		int total = 0;
		System.out.println("\n\n==================\nPurchased List:");
		for(int i=0; i<purchased_count; i++) {
			total += purchased[i].price;
			System.out.println((i+1) + ". " + purchased[i].name + " - " + purchased[i].price);
		}
		System.out.println("The total price is: " + total);
	}
	
	public Product addToPurchase(int input_id) {
		//TO DO: range validation
		purchased[purchased_count] = products[input_id - 1];
		purchased_count++;
		return products[input_id - 1];
	}
	
	public void purchaseProducts() {
		displayProducts();
		boolean isPurchasing = true;
		while(isPurchasing) {
			System.out.print("\nEnter product number to add purchase tab: ");
			int input_id = scan.nextInt();
			Product chosen_product = addToPurchase(input_id);
			System.out.println("Added " + chosen_product.name);
			System.out.print("\nDo you want to add another? [y/n] ");
			String input = scan.next();
			if(!input.equals("y")) {
				isPurchasing = false;
			}
		}
		displayPurchased();
		
		System.out.print("\nConfirm transaction? [y/n] ");
		String input = scan.next();
		if(!input.equals("y")) {
			 return;
		}
		
		displayReceipt();
	}
	
	public void displayReceipt(){
		int total = 0;
		System.out.println("\n\n======== Receipt =========");
		System.out.println("Point of Sale System");
		System.out.println("Location: PUP Taguig Branch");
		LocalDate currentDate = LocalDate.now();
		System.out.println("Date: " + currentDate);
		System.out.println("==========================\n");
		for(int i=0; i<purchased_count; i++) {
			total += purchased[i].price;
			System.out.println(purchased[i].name + " - ₱" + purchased[i].price);
		}
		System.out.println("\nTotal: ₱" + total);
		System.out.println("\n======== Receipt =========\n");
	}
	
	public void startSystem() {
		setUpProducts();
		boolean isSystemRunning = true;
		while(isSystemRunning) {
			System.out.print(
					"=======================\n" +
					"Welcome to Point of Sale System!\n" +
					"1. Display Products\n" +
					"2. Purchase Products\n" + 
					"3. Exit\n" + 
					"Your input: "
				);
				
			int input = scan.nextInt();
			switch(input) {
				case 1:
					displayProducts();
					break;
				case 2:
					purchaseProducts();
					break;
				case 3:
					exit();
				default:
					System.out.println("\nInvalid input");
			}
			System.out.print("\nDo you want to continue using this system? [y/n]: ");
			String continue_input = scan.next();
			if(!continue_input.equals("y")) {
				exit();
			}
		}
		scan.close();
		exit();
	}
	
	public void exit() {
		System.out.println("\nThank you for using this Point of Sale System.");
		System.exit(0);
	}
}

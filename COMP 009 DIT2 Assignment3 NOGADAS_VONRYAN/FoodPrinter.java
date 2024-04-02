package COMP009;

public class FoodPrinter {
	public void printTree() {
		System.out.print(
				"└── Consumable\n" +
			    "   └── Food\n" +
			    "       ├── Condiments\n" +
				"       │   ├── Soy Sauce\n" +
			    "       │   ├── Fish Sauce\n" +
			    "       │   └── Shrimp Sauce\n" +
			    "       ├── Dairy Product\n" +
			    "       │   ├── Butter\n" +
			    "       │   ├── Cheese\n" +
			    "       │   ├── Yoghurt Cream\n" +
			    "       │   └── Milk\n" +
			    "       ├── Fruit\n" +
			    "       │   ├── Beverage\n" +
			    "       │   │    └── Orange Juice\n" +
			    "       │   │    └── Shake\n" +
			    "       │   ├── Apple\n" +
			    "       │   ├── Banana\n" +
			    "       │   ├── Cocoa\n" +
			    "       │   ├── Pineapple\n" +
			    "       │   ├── Grapes\n" +
			    "       │   └── Rice\n" +
			    "       ├── Meat\n" +
			    "       │   ├── Poultry\n" +
			    "       │   │    └── Chicken\n" +
			    "       │   │    └── Egg\n" +
			    "       │   ├── Beef\n" +
			    "       │   ├── Fish\n" +
			    "       │   ├── Pork\n" +
			    "       │   └── Shrimp\n" +
			    "       └── Vegetable\n" +
			    "           ├── Carrots\n" +
			    "           ├── Green Bean\n" +
			    "           ├── Lettuce\n" +
			    "           ├── Spinach\n" +
			    "           └── Tomato\n"
		);
	}
	
	public void printBullet() {
		System.out.print(
				"─ Consumable\n" +
			    "   ─ Food\n" +
			    "       ─ Condiments\n" +
				"          ─ Soy Sauce\n" +
			    "          ─ Fish Sauce\n" +
			    "          ─ Shrimp Sauce\n" +
			    "       ─ Dairy Product\n" +
			    "          ─ Butter\n" +
			    "          ─ Cheese\n" +
			    "          ─ Yoghurt Cream\n" +
			    "          ─ Milk\n" +
			    "       ─ Fruit\n" +
			    "          ─ Beverage\n" +
			    "              ─ Orange Juice\n" +
			    "              ─ Shake\n" +
			    "          ─ Apple\n" +
			    "          ─ Banana\n" +
			    "          ─ Cocoa\n" +
			    "          ─ Pineapple\n" +
			    "          ─ Grapes\n" +
			    "          ─ Rice\n" +
			    "       ─ Meat\n" +
			    "          ─ Poultry\n" +
			    "              ─ Chicken\n" +
			    "              ─ Egg\n" +
			    "          ─ Beef\n" +
			    "          ─ Fish\n" +
			    "          ─ Pork\n" +
			    "          ─ Shrimp\n" +
			    "       ─ Vegetable\n" +
			    "           ─ Carrots\n" +
			    "           ─ Green Bean\n" +
			    "           ─ Lettuce\n" +
			    "           ─ Spinach\n" +
			    "           ─ Tomato\n"
		);
	}
}

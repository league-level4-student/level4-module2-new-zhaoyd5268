package _06_Console_Store;

import java.util.Scanner;

public class ConsoleStore {

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		Customer c = new Customer(50);
		String item = "";
		startshopping(sn, c, item);
	}

	public static void startshopping(Scanner sn, Customer c, String item) {

		boolean checkout = false;
		do {
			System.out.println("Welcome to the store. You can buy cheese($12), fruit($15), clothes(20),"
					+ " or toys($25). Which do you pick? Your current balance is " + c.money + ". After"
					+ " adding an item to cart, you can remove items.");
			item = sn.nextLine();
			item = item.equalsIgnoreCase("cheese") ? c.addToCart(item)
					: item.equalsIgnoreCase("fruit") ? c.addToCart(item)
							: item.equalsIgnoreCase("clothes") ? c.addToCart(item) : c.addToCart("toys");
			c.money = item.equalsIgnoreCase("cheese") ? c.money - 12
					: item.equalsIgnoreCase("fruit") ? c.money - 15
							: item.equalsIgnoreCase("clothes") ? c.money - 20 : c.money - 25;
			System.out.println("Your balance is " + c.money);
			System.out.println("Would you like to remove something? true/false");
			Boolean removeornot = sn.nextBoolean();
			if (removeornot == true) {
				System.out.println("Which item? Please state however you added them");
				String itemtoremove = sn.nextLine();
				c.removeItem(itemtoremove);
			}
		} while (checkout == false);
	}
}

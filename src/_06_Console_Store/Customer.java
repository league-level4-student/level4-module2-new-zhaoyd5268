package _06_Console_Store;

import java.util.ArrayList;

public class Customer {
	int money;
	ArrayList <String> cart = new ArrayList <String> ();
	public Customer(int money) {
	this.money = money;
	}
	

	public String addToCart(String product) {
		cart.add(product);
		return product;
	}
	
	public void removeItem(String itemtoremove) {
	cart.remove(itemtoremove);	
	}
	
	public void checkout(ArrayList <String> cart) {
		
	}
}

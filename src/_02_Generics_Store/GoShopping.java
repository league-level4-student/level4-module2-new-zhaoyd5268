package _02_Generics_Store;

public class GoShopping {
	// 1. Look through other classes to see how they all interact.
	//
	//    There is a generic Cart class that can hold different 
	//    types of objects.
	//
	//    Candy and Cereal are Food objects
	//    Clothing and Toy are NonFood objects.
	
	public static void main(String[] args) {
		// 2. Create a Cart object of type Candy
	//		Cart<Candy> c = new Cart<Candy> ();
		// 3. Create another Cart object of type Cereal
	//		Cart<Cereal> ce = new Cart<Cereal> ();
		// 4. Add a few items to EACH cart
	//		c.add(new Candy());
	//		c.add(new Candy());
	//		c.add(new Candy());
	//		ce.add(new Cereal());
	//		ce.add(new Cereal());
	//		ce.add(new Cereal());
		// 5. Call the showCart() method on EACH cart
	//	c.showCart();
	//	ce.showCart();
		
		// 6. Run the code
		
		// 7. Comment out the code you have so far
		
		// 8. Repeat steps 2-5 for a Clothing Cart and a Toy Cart
		Cart <Clothing> cl = new Cart <Clothing> ();
		Cart <Toy> t = new Cart <Toy> ();
		
		
		
		// Why are there errors?
		
		/*
		 * 		There are errors because the types Clothing and Toy are not foods, and therefore
		 * cannot be accepted into the cart because of the parameters of t.
		 */
		
		// 9. Modify the Cart class so that this code compiles
		// HINT: There are 3 lines of code to edit
				
		// 10. Run the code. Does it work?
		/* Yes */
	}
}

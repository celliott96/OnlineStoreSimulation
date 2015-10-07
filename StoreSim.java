package storeSimulation;

import java.util.Scanner;

/**
 * 
 * @author Clinton Elliott
 *
 */

public class StoreSim {

	public static void main(String[] args) throws IllegalArgumentException {
		Scanner scan = new Scanner(System.in);
		String item;
		int sizeOfCart = 1;
		String[] cart = new String[sizeOfCart];

		System.out
				.println("\nWelcome to CJ's Online Store!\n\n"
						+ "--------------------------------------------------------------------\n"
						+ "Items for sale:\n"
						+ "| Tennis equipment | Computers | Disc golf discs | Bicycles | Cars |\n"
						+ "--------------------------------------------------------------------\n"
						+ "Please enter the item or category you would like to view: ");
		item = scan.nextLine();
		item = item.toLowerCase();
		cart = addToCart(item, sizeOfCart);
		System.out.println(item.toUpperCase());

		scan.close();
	}

	public static String[] addToCart(String item, int cartSize) {
		String[] newCart = new String[cartSize];

		if (item.equals("tennis") || item.equals("tennis equipment")) {
			newCart[cartSize] = item; // might work to add item to end of cart
										// list
		} else
			throw new IllegalArgumentException();

		return newCart;
	}

	public static String getCart(String[] cart) {
		String stringCart = cart.toString();
		return stringCart;
	}

	public static String[] shoppingCart(String item, int cartSize) {
		String[] cart = new String[cartSize];
		return cart;
	}

}

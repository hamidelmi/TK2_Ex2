package server;

import java.util.ArrayList;

public class ProductManager {
	private ArrayList<Product> produts;

	public void addProduct(Product p) {
		produts.add(p);
	}

	public boolean decreaseAmout(Product p) {
		return false;
	}
}

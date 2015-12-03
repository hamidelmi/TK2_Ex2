package server;

import java.util.ArrayList;

public class ProductManager {
	private ArrayList<Product> produts;

	public ProductManager(){
		produts = new ArrayList<Product>();
	}

	public void addProduct(Product p) {
		produts.add(p);
	}
    
	public boolean decreaseAmout(Product p) {
		
		if (p.availableAmount ==0)
		{
			return false;
		}
		
		return true;
		
	}
}

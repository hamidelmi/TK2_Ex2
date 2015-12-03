package server;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	private ArrayList<Product> produts;

	public ArrayList<Product> getProducts() {
		return produts;
	}

	public void setProduts(ArrayList<Product> p) {
		this.produts = p;
	}

	public ProductManager() {
		produts = new ArrayList<Product>();
	}

	public void addProduct(Product p) {
		produts.add(p);
	}

	public boolean decreaseAmout(String pn) {
		for (Product p : produts)
			if (p.getName().equals(pn))
				return p.decreaseAmount();

		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Product p : produts) {
			sb.append(p.toString() + "|");
		}

		return sb.toString();
	}

	public List<Product> toList() {
		return this.produts;
	}

}

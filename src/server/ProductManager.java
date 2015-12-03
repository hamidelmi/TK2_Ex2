package server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductManager {
	private ArrayList<Product> produts;
	private HashMap<Integer, String> users;

	public ArrayList<Product> getProducts() {
		return produts;
	}

	public void setProduts(ArrayList<Product> p) {
		this.produts = p;
	}

	public ProductManager() {
		produts = new ArrayList<Product>();
		users = new HashMap<Integer, String>();
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
			sb.append(p.toString() + "&");
		}

		return sb.toString();
	}

	public List<Product> toList() {
		return this.produts;
	}

	public Integer addUser(String name) {
		Integer id = users.size();
		users.put(id, name);
		return id;
	}
}

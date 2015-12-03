package server;

public class Product {

	public Product(String name, Integer price, Integer availableAmount) {
		this.name = name;
		this.price = price;
		this.availableAmount = availableAmount;
	}

	private String name;

	public String getName() {
		return this.name;
	}

	private Integer price;

	public Integer getPrice() {
		return this.price;
	}

	public Integer availableAmount;

	public Integer getAvailableAmount() {
		return this.availableAmount;
	}

	@Override
	public String toString() {
		return this.name + ";" + this.price + ";" + this.availableAmount;
	}

	public boolean decreaseAmount() {
		if (availableAmount > 0) {
			availableAmount = availableAmount - 1;
			return true;
		} else
			return false;
	}
}
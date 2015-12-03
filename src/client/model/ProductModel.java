package client.model;

public class ProductModel {

	public ProductModel(String name, Integer price, Integer availableAmount) {
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

	private Integer availableAmount;

	public Integer getAvailableAmount() {
		return this.availableAmount;
	}

	private Integer orderNumber;

	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void increaseOrder() {
		availableAmount++;
	}
}
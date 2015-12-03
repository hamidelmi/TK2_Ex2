package client.model;

import java.util.ArrayList;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class ProductModel {

	public ProductModel(String name, Integer price, Integer availableAmount) {
		this.name = name;
		this.price = price;
		this.availableAmount = availableAmount;
		this.orderNumber = 0;
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
		orderNumber++;
	}

	public static ArrayList<ProductModel> getListFromServer(String url) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(url);

		WebResource listService = service.path("rest").path("shop")
				.path("list");
		String result = listService.accept(MediaType.TEXT_PLAIN)
				.get(ClientResponse.class).toString();

		result = listService.accept(MediaType.TEXT_PLAIN).get(String.class);

		String[] list = result.split("&");
		ArrayList<ProductModel> res = new ArrayList<ProductModel>();
		for (String item : list) {
			String[] prod = item.split(";");
			res.add(new ProductModel(prod[0], Integer.parseInt(prod[1]),
					Integer.parseInt(prod[2])));
		}
		return res;
	}

	public static Integer login(String url, String name) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(url);

		WebResource listService = service.path("rest").path("shop")
				.path("register").path(name);
		String result = listService.accept(MediaType.TEXT_PLAIN)
				.get(ClientResponse.class).toString();

		result = listService.accept(MediaType.TEXT_PLAIN).get(String.class);

		return Integer.parseInt(result);
	}
}
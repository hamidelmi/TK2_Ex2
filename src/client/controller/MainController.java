package client.controller;

import java.awt.Dialog.ModalityType;
import java.util.ArrayList;
import java.util.List;

import client.model.ProductModel;
import client.view.MainView;
import client.view.ProductsView;

public class MainController {

	private MainView mainView;
	private String username;
	private List<ProductModel> products;

	public MainController(String ipAddress) {
		products = new ArrayList<ProductModel>();
		mainView = new MainView(this);
		String title = "Login";

		username = mainView.showLoginDialog(title);

		products.add(new ProductModel("P1", 123, 1));
		products.add(new ProductModel("P2", 321, 2));
		products.add(new ProductModel("P3", 456, 3));
		
		mainView.showProductsDialog(username, products);
	}
}
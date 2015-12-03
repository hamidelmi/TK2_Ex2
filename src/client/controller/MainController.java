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
	private Integer userId;
	private List<ProductModel> products;

	public MainController(String url) {
		products = ProductModel.getListFromServer(url);
		mainView = new MainView(this);
		String title = "Login";

		username = mainView.showLoginDialog(title);
		userId = ProductModel.login(url, username);
		mainView.showProductsDialog(userId + "-" + username, products);
	}
}
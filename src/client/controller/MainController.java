package client.controller;

import java.awt.Dialog.ModalityType;

import client.view.MainView;
import client.view.ProductsView;

public class MainController {

	private MainView mainView;	
	private String username;

	public MainController(String ipAddress) {
		mainView = new MainView(this);
		String title = "Login";

		username = mainView.showLoginDialog(title);
		mainView.showProductsDialog(username);
		
	}
	
}
package client.controller;

import java.awt.Dialog.ModalityType;

import client.view.MainView;

public class MainController {

	private MainView mainView;

	public MainController(String ipAddress) {
		mainView = new MainView(this);
	}
}

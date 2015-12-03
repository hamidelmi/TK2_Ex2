package client.view;

import java.awt.Color;
import java.awt.Window;
import java.awt.Dialog.ModalityType;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import client.controller.MainController;


public class MainView extends JFrame {
	private MainController controller;
	private LoginView loginDialog;
	private ProductsView productsDialog;
	
	public MainView(MainController mc) {
		this.controller = mc;
		this.setTitle("Client");
		this.setBackground(Color.BLACK);
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
	}
	
	/**
	 * Shows a login dialog (modal) and asks for a name
	 * 
	 * @return player name
	 */
	public String showLoginDialog(String title) {
		Window win = SwingUtilities.getWindowAncestor(this);
		loginDialog = new LoginView(win, title,
				ModalityType.APPLICATION_MODAL);
		loginDialog.setVisible(true);

		return loginDialog.getUsername();
	}
	
	public void showProductsDialog(String title){
		Window win = SwingUtilities.getWindowAncestor(this);
		productsDialog = new ProductsView(win, title,
				ModalityType.APPLICATION_MODAL);
		productsDialog.setVisible(true);

//		return loginDialog.getUsername();
	}

}

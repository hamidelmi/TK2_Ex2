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
	public String showLoginDialog(String errorMessage) {
		Window win = SwingUtilities.getWindowAncestor(this);
		loginDialog = new LoginView(win, errorMessage,
				ModalityType.APPLICATION_MODAL);
		loginDialog.setVisible(true);

		return loginDialog.getUsername();
	}

}

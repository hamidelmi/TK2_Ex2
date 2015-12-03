package client;

import javax.swing.SwingUtilities;

import client.controller.MainController;

public class ClientLauncher {

	public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainController(args.length > 0 ? args[0]
						: "http://localhost:8080");
			}
		});
	}
}

package client.view;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import client.controller.MainController;
import client.model.ProductModel;

public class ProductsView extends JDialog {
	private ProductTableModel tableData = new ProductTableModel();

	JTable table = new JTable(tableData);

	public ProductsView(Window owner, String title,
			Dialog.ModalityType modalityType) {
		super(owner, title, modalityType);

		init();
	}

	private void init() {

		setLayout(new BorderLayout());
		add(new JScrollPane(table), BorderLayout.CENTER);

		tableData.addProduct(new ProductModel());
	}
}

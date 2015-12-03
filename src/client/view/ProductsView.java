package client.view;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.*;

import client.controller.MainController;
import client.model.ProductModel;

public class ProductsView extends JDialog {
	private ProductTableModel tableData;

	JTable table;

	public ProductsView(Window owner, String title,
			Dialog.ModalityType modalityType, List<ProductModel> products) {
		super(owner, title, modalityType);

		tableData = new ProductTableModel(products);

		init();
	}

	private void init() {

		setLayout(new BorderLayout());
		table = new JTable(tableData);

		Action order = new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				JTable table = (JTable) e.getSource();
				int modelRow = Integer.valueOf(e.getActionCommand());
				ProductTableModel a = ((ProductTableModel) table.getModel());
				a.addOrder(modelRow);
			}
		};

		ButtonColumn buttonColumn = new ButtonColumn(table, order, 4);
		add(new JScrollPane(table), BorderLayout.CENTER);
	}
	// public void setData(ProductTableModel tableData){
	//
	// }
}

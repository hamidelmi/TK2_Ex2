package client.view;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ProductsView extends JDialog {
	ProductTableModel tableData = new ProductTableModel();
	
	JTable table = new JTable(tableData);
	
	public ProductsView(){
		setLayout(new BorderLayout());
		add(new JScrollPane(table), BorderLayout.CENTER);
	}
}

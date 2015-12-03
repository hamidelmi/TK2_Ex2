package client.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import client.model.ProductModel;

public class ProductTableModel extends AbstractTableModel {
	List<ProductModel> products;

	public ProductTableModel() {
		products = new ArrayList<ProductModel>();
	}

	public void addProduct(ProductModel product) {
		products.add(product);
		fireTableDataChanged();
	}

	public int getRowCount() {
		return products.size();
	}

	public int getColumnCount() {
		return 3;
	}

	public Object getValueAt(int row, int column) {
		return products.get(row).toString();
	}
}

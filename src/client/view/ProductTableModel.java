package client.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import client.model.ProductModel;

public class ProductTableModel extends AbstractTableModel {
	List<ProductModel> products;

	public ProductTableModel(List<ProductModel> products) {
		this.products = products;
	}

	public void addProduct(ProductModel product) {
		products.add(product);
		fireTableDataChanged();
	}

	public int getRowCount() {
		return products.size();
	}

	public int getColumnCount() {
		return 5;
	}

	public Object getValueAt(int row, int column) {
		switch (column) {
		case 0:
			return products.get(row).getName();
		case 1:
			return products.get(row).getPrice();
		case 2:
			return products.get(row).getAvailableAmount();
		case 3:
			return products.get(row).getOrderNumber();
		case 4:
			return "order";
		}
		return products.get(row).toString();
	}

	public void addOrder(int rowIndex) {
		products.get(rowIndex).increaseOrder();
		fireTableDataChanged();
	}

}

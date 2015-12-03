package client.view;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import client.controller.MainController;
import client.model.ProductModel;

public class ProductsView extends JDialog {
	private ProductTableModel tableData;

	JTable table;
	JButton submit;

	public ProductsView(Window owner, String title,
			Dialog.ModalityType modalityType, List<ProductModel> products) {
		super(owner, title, modalityType);

		tableData = new ProductTableModel(products);

		init();
	}

	private void init() {
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

		submit = new JButton("Submit order");

		JPanel p1 = new JPanel(new BorderLayout());
		p1.add(table);

		JPanel p2 = new JPanel();
		p2.add(submit);

		JPanel p5 = new JPanel(new BorderLayout());
		p5.add(p2, BorderLayout.CENTER);

		setLayout(new BorderLayout());
		add(p1, BorderLayout.CENTER);
		add(p5, BorderLayout.SOUTH);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		submit.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"My Goodness, this is so concise");
				// self.dispose();
			}
		});
	}

}

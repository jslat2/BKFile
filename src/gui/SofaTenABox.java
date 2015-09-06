package gui;
import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import data.BkFile;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;

public class SofaTenABox extends JFrame{
	public BkFile bk = new BkFile();
	private JTable table;
	public SofaTenABox() {
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {
				loadTable();
			}
			public void windowLostFocus(WindowEvent arg0) {
				saveVars();
			}
		});
		setBounds(new Rectangle(0, 0, 600, 400));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel = new JLabel("<html><body>e\r\n a. List all other property, other than property transferred in the ordinary course of the business or financial affairs of\r\nthe debtor, transferred either absolutely or as security within two years immediately preceding the commencement of\r\nthis case. (Married debtors filing under chapter 12 or chapter 13 must include transfers by either or both spouses\r\nwhether or not a joint petition is filed, unless the spouses are separated and a joint petition is not filed.)</body></html>");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Payments");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				saveVars();
				String varNameOne = "STenAOne" + Integer.toString(table.getRowCount());		
				String varNameTwo = "STenATwo" + Integer.toString(table.getRowCount());
				String varNameThree = "STenAThree" + Integer.toString(table.getRowCount());
		
			
				bk.setVar(varNameOne, "");
				bk.setVar(varNameTwo, "");
				bk.setVar(varNameThree, "");

					
				loadTable();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Payments");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
				}


				else{
					saveVars();
					
					String varNameOne = "STenAOne" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "STenATwo" + Integer.toString(table.getSelectedRow());
					String varNameThree = "STenAThree" + Integer.toString(table.getSelectedRow());
	
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);
					bk.vars.remove(varNameThree);
	
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("STenAOne" + Integer.toString(i), bk.vars.get("STenAOne" + Integer.toString(i+1)));
							bk.setVar("STenATwo" + Integer.toString(i), bk.vars.get("STenATwo" + Integer.toString(i+1)));
							bk.setVar("STenAThree" + Integer.toString(i), bk.vars.get("STenAThree" + Integer.toString(i+1)));
			
	
						}
					}
					bk.vars.remove("STenAOne" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("STenATwo" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("STenAThree" + Integer.toString(table.getRowCount()-1));

	
				}
		
				loadTable();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 6, SpringLayout.EAST, btnNewButton);
		getContentPane().add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 243, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 574, SpringLayout.WEST, getContentPane());
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name and Address of Transferee and Relationship", "Date", "Property and Value Received"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(304);
		table.getColumnModel().getColumn(1).setPreferredWidth(107);
		table.getColumnModel().getColumn(2).setPreferredWidth(171);
		scrollPane.setViewportView(table);
	}
	
	public void saveVars(){
		
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("STenAOne"); i++){
			bk.vars.remove("STenAOne"+Integer.toString(i));
			bk.vars.remove("STenATwo"+Integer.toString(i));
			bk.vars.remove("STenAThree"+Integer.toString(i));

		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("STenAOne"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("STenATwo"+Integer.toString(i), (String)table.getValueAt(i, 1));
			bk.setVar("STenAThree"+Integer.toString(i), (String)table.getValueAt(i, 2));

		}


	}
	
	public void loadTable(){
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
	
		int newRowCount = checkNumVars("STenAOne");		
		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("STenAOne" + Integer.toString(i)), bk.getField("STenATwo" + Integer.toString(i)), bk.getField("STenAThree" + Integer.toString(i))});
		}
	}
	
	
	public int checkNumVars(String s){

		int counter = 0;
		String holder = s + Integer.toString(counter);

		for(int i = 0; i < 300; i++){
			if(bk.vars.containsKey(holder)){
				counter++;
				holder = s + Integer.toString(i+1);
			}
		}		
		return counter;	
	}
}
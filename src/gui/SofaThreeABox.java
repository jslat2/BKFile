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

public class SofaThreeABox extends JFrame{
	public BkFile bk = new BkFile();
	private JTable table;
	public SofaThreeABox() {
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
		
		JLabel lblNewLabel = new JLabel("<html><body>Individual or joint debtor(s) with primarily consumer debts: List all payments on loans, installment purchases of\r\ngoods or services, and other debts to any creditor made within 90 days immediately preceding the commencement of\r\nthis case unless the aggregate value of all property that constitutes or is affected by such transfer is less than $600.\r\nIndicate with an asterisk (*) any payments that were made to a creditor on account of a domestic support obligation or\r\nas part of an alternative repayment schedule under a plan by an approved nonprofit budgeting and credit counseling\r\nagency. (Married debtors filing under chapter 12 or chapter 13 must include payments by either or both spouses\r\nwhether or not a joint petition is filed, unless the spouses are separated and a joint petition is not filed.) </body></html>");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveVars();
				
				String varNameOne = "SThreeAOne" + Integer.toString(table.getRowCount());		
				String varNameTwo = "SThreeATwo" + Integer.toString(table.getRowCount());
				String varNameThree = "SThreeAThree" + Integer.toString(table.getRowCount());
				String varNameFour = "SThreeAFour" + Integer.toString(table.getRowCount());
			
				bk.setVar(varNameOne, "");
				bk.setVar(varNameTwo, "");
				bk.setVar(varNameThree, "");
				bk.setVar(varNameFour, "");
					
				loadTable();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Payment");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
				}


				else{
					saveVars();
					
					String varNameOne = "SThreeAOne" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "SThreeATwo" + Integer.toString(table.getSelectedRow());
					String varNameThree = "SThreeAThree" + Integer.toString(table.getSelectedRow());
					String varNameFour = "SThreeAFour" + Integer.toString(table.getSelectedRow());
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);
					bk.vars.remove(varNameThree);
					bk.vars.remove(varNameFour);
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("SThreeAOne" + Integer.toString(i), bk.vars.get("SThreeAOne" + Integer.toString(i+1)));
							bk.setVar("SThreeATwo" + Integer.toString(i), bk.vars.get("SThreeATwo" + Integer.toString(i+1)));
							bk.setVar("SThreeAThree" + Integer.toString(i), bk.vars.get("SThreeAThree" + Integer.toString(i+1)));
							bk.setVar("SThreeAFour" + Integer.toString(i), bk.vars.get("SThreeAFour" + Integer.toString(i+1)));
	
						}
					}
					bk.vars.remove("SThreeAOne" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SThreeATwo" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SThreeAThree" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SThreeAFour" + Integer.toString(table.getRowCount()-1));
	
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
				"Name and Address of Creditor", "Dates of Payment", "Amounts", "Amounts Owing"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	public void saveVars(){
		
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("SThreeAOne"); i++){
			bk.vars.remove("SThreeAOne"+Integer.toString(i));
			bk.vars.remove("SThreeATwo"+Integer.toString(i));
			bk.vars.remove("SThreeAThree"+Integer.toString(i));
			bk.vars.remove("SThreeAFour"+Integer.toString(i));
		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("SThreeAOne"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("SThreeATwo"+Integer.toString(i), (String)table.getValueAt(i, 1));
			bk.setVar("SThreeAThree"+Integer.toString(i), (String)table.getValueAt(i, 2));
			bk.setVar("SThreeAFour"+Integer.toString(i), (String)table.getValueAt(i, 3));
		}


	}
	
	public void loadTable(){
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
	
		int newRowCount = checkNumVars("SThreeAOne");		
		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("SThreeAOne" + Integer.toString(i)), bk.getField("SThreeATwo" + Integer.toString(i)), bk.getField("SThreeAThree" + Integer.toString(i)), bk.getField("SThreeAFour" + Integer.toString(i))});
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

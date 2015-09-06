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

public class SofaThreeBBox extends JFrame{
	public BkFile bk = new BkFile();
	private JTable table;
	public SofaThreeBBox() {
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
		
		JLabel lblNewLabel = new JLabel("<html><body>Debtor whose debts are not primarily consumer debts: List each payment or other transfer to any creditor made\r\nwithin 90 days immediately preceding the commencement of the case unless the aggregate value of all property that\r\nconstitutes or is affected by such transfer is less than $6,225*\r\n. If the debtor is an individual, indicate with an asterisk\r\n(*) any payments that were made to a creditor on account of a domestic support obligation or as part of an alternative\r\nrepayment schedule under a plan by an approved nonprofit budgeting and credit counseling agency. (Married debtors\r\nfiling under chapter 12 or chapter 13 must include payments and other transfers by either or both spouses whether or\r\nnot a joint petition is filed, unless the spouses are separated and a joint petition is not filed.)</body></html>");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveVars();
				
				String varNameOne = "SThreeBOne" + Integer.toString(table.getRowCount());		
				String varNameTwo = "SThreeBTwo" + Integer.toString(table.getRowCount());
				String varNameThree = "SThreeBThree" + Integer.toString(table.getRowCount());
				String varNameFour = "SThreeBFour" + Integer.toString(table.getRowCount());
			
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
					
					String varNameOne = "SThreeBOne" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "SThreeBTwo" + Integer.toString(table.getSelectedRow());
					String varNameThree = "SThreeBThree" + Integer.toString(table.getSelectedRow());
					String varNameFour = "SThreeBFour" + Integer.toString(table.getSelectedRow());
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);
					bk.vars.remove(varNameThree);
					bk.vars.remove(varNameFour);
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("SThreeBOne" + Integer.toString(i), bk.vars.get("SThreeBOne" + Integer.toString(i+1)));
							bk.setVar("SThreeBTwo" + Integer.toString(i), bk.vars.get("SThreeBTwo" + Integer.toString(i+1)));
							bk.setVar("SThreeBThree" + Integer.toString(i), bk.vars.get("SThreeBThree" + Integer.toString(i+1)));
							bk.setVar("SThreeBFour" + Integer.toString(i), bk.vars.get("SThreeBFour" + Integer.toString(i+1)));
	
						}
					}
					bk.vars.remove("SThreeBOne" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SThreeBTwo" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SThreeBThree" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SThreeBFour" + Integer.toString(table.getRowCount()-1));
	
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
		
		for(int i = 0; i < checkNumVars("SThreeBOne"); i++){
			bk.vars.remove("SThreeBOne"+Integer.toString(i));
			bk.vars.remove("SThreeBTwo"+Integer.toString(i));
			bk.vars.remove("SThreeBThree"+Integer.toString(i));
			bk.vars.remove("SThreeBFour"+Integer.toString(i));
		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("SThreeBOne"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("SThreeBTwo"+Integer.toString(i), (String)table.getValueAt(i, 1));
			bk.setVar("SThreeBThree"+Integer.toString(i), (String)table.getValueAt(i, 2));
			bk.setVar("SThreeBFour"+Integer.toString(i), (String)table.getValueAt(i, 3));
		}


	}
	
	public void loadTable(){
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
	
		int newRowCount = checkNumVars("SThreeBOne");		
		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("SThreeBOne" + Integer.toString(i)), bk.getField("SThreeBTwo" + Integer.toString(i)), bk.getField("SThreeBThree" + Integer.toString(i)), bk.getField("SThreeBFour" + Integer.toString(i))});
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

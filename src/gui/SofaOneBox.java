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

public class SofaOneBox extends JFrame{
	public BkFile bk = new BkFile();
	private JTable table;
	public SofaOneBox() {
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
		
		JLabel lblNewLabel = new JLabel("<html><body>State the gross amount of income the debtor has received from employment, trade, or profession, or from operation of\r\nthe debtor's business, including part-time activities either as an employee or in independent trade or business, from the\r\nbeginning of this calendar year to the date this case was commenced. State also the gross amounts received during the\r\ntwo years immediately preceding this calendar year. (A debtor that maintains, or has maintained, financial records on\r\nthe basis of a fiscal rather than a calendar year may report fiscal year income. Identify the beginning and ending dates\r\nof the debtor's fiscal year.) If a joint petition is filed, state income for each spouse separately. (Married debtors filing\r\nunder chapter 12 or chapter 13 must state income of both spouses whether or not a joint petition is filed, unless the\r\nspouses are separated and a joint petition is not filed.)</body></html>");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Income");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveVars();
		
				String varNameOne = "SOneOne" + Integer.toString(table.getRowCount());		
				String varNameTwo = "SOneTwo" + Integer.toString(table.getRowCount());


			
				bk.setVar(varNameOne, "");
				bk.setVar(varNameTwo, "");
		

					
				loadTable();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Income");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
				}


				else{
					saveVars();
					
					String varNameOne = "SOneOne" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "SOneTwo" + Integer.toString(table.getSelectedRow());

	
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);

	
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("SOneOne" + Integer.toString(i), bk.vars.get("SOneOne" + Integer.toString(i+1)));
							bk.setVar("SOneTwo" + Integer.toString(i), bk.vars.get("SOneTwo" + Integer.toString(i+1)));
	
			
	
						}
					}
					bk.vars.remove("SOneOne" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SOneTwo" + Integer.toString(table.getRowCount()-1));
	

	
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
				{null, null},
			},
			new String[] {
				"Amount", "Source"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	public void saveVars(){
		
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("SOneOne"); i++){
			bk.vars.remove("SOneOne"+Integer.toString(i));
			bk.vars.remove("SOneTwo"+Integer.toString(i));


		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("SOneOne"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("SOneTwo"+Integer.toString(i), (String)table.getValueAt(i, 1));


		}


	}
	
	public void loadTable(){
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}

		int newRowCount = checkNumVars("SOneOne");		

		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("SOneOne" + Integer.toString(i)), bk.getField("SOneTwo" + Integer.toString(i))});
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
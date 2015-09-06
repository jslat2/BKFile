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

public class SofaTwoBox extends JFrame{
	public BkFile bk = new BkFile();
	private JTable table;
	public SofaTwoBox() {
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
		
		JLabel lblNewLabel = new JLabel("<html><body>State the amount of income received by the debtor other than from employment, trade, profession, operation of the\r\ndebtor's business during the two years immediately preceding the commencement of this case. Give particulars. If a\r\njoint petition is filed, state income for each spouse separately. (Married debtors filing under chapter 12 or chapter 13\r\nmust state income for each spouse whether or not a joint petition is filed, unless the spouses are separated and a joint\r\npetition is not filed.)</body></html>");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Income");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveVars();
		
				String varNameOne = "STwoOne" + Integer.toString(table.getRowCount());		
				String varNameTwo = "STwoTwo" + Integer.toString(table.getRowCount());


			
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
					
					String varNameOne = "STwoOne" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "STwoTwo" + Integer.toString(table.getSelectedRow());

	
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);

	
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("STwoOne" + Integer.toString(i), bk.vars.get("STwoOne" + Integer.toString(i+1)));
							bk.setVar("STwoTwo" + Integer.toString(i), bk.vars.get("STwoTwo" + Integer.toString(i+1)));
	
			
	
						}
					}
					bk.vars.remove("STwoOne" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("STwoTwo" + Integer.toString(table.getRowCount()-1));
	

	
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
				"Amount", "Source"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	public void saveVars(){
		
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("STwoOne"); i++){
			bk.vars.remove("STwoOne"+Integer.toString(i));
			bk.vars.remove("STwoTwo"+Integer.toString(i));


		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("STwoOne"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("STwoTwo"+Integer.toString(i), (String)table.getValueAt(i, 1));


		}


	}
	
	public void loadTable(){
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}

		int newRowCount = checkNumVars("STwoOne");		

		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("STwoOne" + Integer.toString(i)), bk.getField("STwoTwo" + Integer.toString(i))});
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
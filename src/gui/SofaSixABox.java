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

public class SofaSixABox extends JFrame{
	public BkFile bk = new BkFile();
	private JTable table;
	public SofaSixABox() {
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
		
		JLabel lblNewLabel = new JLabel("<html><body>Describe any assignment of property for the benefit of creditors made within 120 days immediately preceding the\r\ncommencement of this case. (Married debtors filing under chapter 12 or chapter 13 must include any assignment by\r\neither or both spouses whether or not a joint petition is filed, unless the spouses are separated and a joint petition is not\r\nfiled.)</body></html>");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Assignment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveVars();
				
				String varNameOne = "SSixAOne" + Integer.toString(table.getRowCount());		
				String varNameTwo = "SSixATwo" + Integer.toString(table.getRowCount());
				String varNameThree = "SSixAThree" + Integer.toString(table.getRowCount());
		
			
				bk.setVar(varNameOne, "");
				bk.setVar(varNameTwo, "");
				bk.setVar(varNameThree, "");
		
				loadTable();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Assignment");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
				}


				else{
					saveVars();
					
					String varNameOne = "SSixAOne" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "SSixATwo" + Integer.toString(table.getSelectedRow());
					String varNameThree = "SSixAThree" + Integer.toString(table.getSelectedRow());
			
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);
					bk.vars.remove(varNameThree);
			
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("SSixAOne" + Integer.toString(i), bk.vars.get("SSixAOne" + Integer.toString(i+1)));
							bk.setVar("SSixATwo" + Integer.toString(i), bk.vars.get("SSixATwo" + Integer.toString(i+1)));
							bk.setVar("SSixAThree" + Integer.toString(i), bk.vars.get("SSixAThree" + Integer.toString(i+1)));
						
	
						}
					}
					bk.vars.remove("SSixAOne" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SSixATwo" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SSixAThree" + Integer.toString(table.getRowCount()-1));
				
	
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
				"Name and Address of Assignee", "Date of Assignment", "Terms of Agreement"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	public void saveVars(){
		
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("SSixAOne"); i++){
			bk.vars.remove("SSixAOne"+Integer.toString(i));
			bk.vars.remove("SSixATwo"+Integer.toString(i));
			bk.vars.remove("SSixAThree"+Integer.toString(i));
			
		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("SSixAOne"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("SSixATwo"+Integer.toString(i), (String)table.getValueAt(i, 1));
			bk.setVar("SSixAThree"+Integer.toString(i), (String)table.getValueAt(i, 2));
		
		}


	}
	
	public void loadTable(){
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
	
		int newRowCount = checkNumVars("SSixAOne");		
		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("SSixAOne" + Integer.toString(i)), bk.getField("SSixATwo" + Integer.toString(i)), bk.getField("SSixAThree" + Integer.toString(i))});
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

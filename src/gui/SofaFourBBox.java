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

public class SofaFourBBox extends JFrame{
	public BkFile bk = new BkFile();
	private JTable table;
	public SofaFourBBox() {
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
		
		JLabel lblNewLabel = new JLabel("<html><body>Describe all property that has been attached, garnished or seized under any legal or equitable process within one\r\nyear immediately preceding the commencement of this case. (Married debtors filing under chapter 12 or chapter 13\r\nmust include information concerning property of either or both spouses whether or not a joint petition is filed, unless\r\nthe spouses are separated and a joint petition is not filed.)</body></html>");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Seizure");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveVars();
				
				String varNameOne = "SFourBOne" + Integer.toString(table.getRowCount());		
				String varNameTwo = "SFourBTwo" + Integer.toString(table.getRowCount());
				String varNameThree = "SFourBThree" + Integer.toString(table.getRowCount());

			
				bk.setVar(varNameOne, "");
				bk.setVar(varNameTwo, "");
				bk.setVar(varNameThree, "");
		
					
				loadTable();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Seizure");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
				}


				else{
					saveVars();
					
					String varNameOne = "SFourBOne" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "SFourBTwo" + Integer.toString(table.getSelectedRow());
					String varNameThree = "SFourBThree" + Integer.toString(table.getSelectedRow());
			
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);
					bk.vars.remove(varNameThree);
			
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("SFourBOne" + Integer.toString(i), bk.vars.get("SFourBOne" + Integer.toString(i+1)));
							bk.setVar("SFourBTwo" + Integer.toString(i), bk.vars.get("SFourBTwo" + Integer.toString(i+1)));
							bk.setVar("SFourBThree" + Integer.toString(i), bk.vars.get("SFourBThree" + Integer.toString(i+1)));
				
	
						}
					}
					bk.vars.remove("SFourBOne" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SFourBTwo" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SFourBThree" + Integer.toString(table.getRowCount()-1));
			
	
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
				"Name and Address of Seizer", "Date of Seizure", "Description and Value of Property"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	public void saveVars(){
		
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("SFourBOne"); i++){
			bk.vars.remove("SFourBOne"+Integer.toString(i));
			bk.vars.remove("SFourBTwo"+Integer.toString(i));
			bk.vars.remove("SFourBThree"+Integer.toString(i));
		
		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("SFourBOne"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("SFourBTwo"+Integer.toString(i), (String)table.getValueAt(i, 1));
			bk.setVar("SFourBThree"+Integer.toString(i), (String)table.getValueAt(i, 2));
	
		}


	}
	
	public void loadTable(){
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
	
		int newRowCount = checkNumVars("SFourBOne");		
		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("SFourBOne" + Integer.toString(i)), bk.getField("SFourBTwo" + Integer.toString(i)), bk.getField("SFourBThree" + Integer.toString(i))});
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

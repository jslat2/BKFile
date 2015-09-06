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

public class DebtorAliases extends JFrame{
	public BkFile bk = new BkFile();
	private JTable table;
	public DebtorAliases() {
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
		
		JLabel lblNewLabel = new JLabel("<html><body>Please add any aliases used by joint debtor in previous eight years</body></html>");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Alias");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveVars();
		
				String varNameOne = "debtorAliasFirst" + Integer.toString(table.getRowCount());		
				String varNameTwo = "debtorAliasMiddle" + Integer.toString(table.getRowCount());
				String varNameThree = "debtorAliasLast" + Integer.toString(table.getRowCount());

			
				bk.setVar(varNameOne, "");
				bk.setVar(varNameTwo, "");
				bk.setVar(varNameThree, "");

					
				loadTable();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remove Alias");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
				}


				else{
					saveVars();
					
					String varNameOne = "debtorAliasFirst" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "debtorAliasMiddle" + Integer.toString(table.getSelectedRow());
					String varNameThree = "debtorAliasLast" + Integer.toString(table.getSelectedRow());
	
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);
					bk.vars.remove(varNameThree);
	
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("debtorAliasFirst" + Integer.toString(i), bk.vars.get("debtorAliasFirst" + Integer.toString(i+1)));
							bk.setVar("debtorAliasMiddle" + Integer.toString(i), bk.vars.get("debtorAliasMiddle" + Integer.toString(i+1)));
							bk.setVar("debtorAliasLast" + Integer.toString(i), bk.vars.get("debtorAliasLast" + Integer.toString(i+1)));
			
	
						}
					}
					bk.vars.remove("debtorAliasFirst" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("debtorAliasMiddle" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("debtorAliasLast" + Integer.toString(table.getRowCount()-1));

	
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
				"First", "Middle", "Last"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	public void saveVars(){
		
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("debtorAliasFirst"); i++){
			bk.vars.remove("debtorAliasFirst"+Integer.toString(i));
			bk.vars.remove("debtorAliasMiddle"+Integer.toString(i));
			bk.vars.remove("debtorAliasLast"+Integer.toString(i));

		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("debtorAliasFirst"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("debtorAliasMiddle"+Integer.toString(i), (String)table.getValueAt(i, 1));
			bk.setVar("debtorAliasLast"+Integer.toString(i), (String)table.getValueAt(i, 2));

		}


	}
	
	public void loadTable(){
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}

		int newRowCount = checkNumVars("debtorAliasFirst");		

		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("debtorAliasFirst" + Integer.toString(i)), bk.getField("debtorAliasMiddle" + Integer.toString(i)), bk.getField("debtorAliasLast" + Integer.toString(i))});
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
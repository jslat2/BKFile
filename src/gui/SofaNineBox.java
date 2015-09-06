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

public class SofaNineBox extends JFrame{
	public BkFile bk = new BkFile();
	private JTable table;
	public SofaNineBox() {
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
		
		JLabel lblNewLabel = new JLabel("<html><body>List all payments made or property transferred by or on behalf of the debtor to any persons, including attorneys, for\r\nconsultation concerning debt consolidation, relief under the bankruptcy law or preparation of a petition in bankruptcy\r\nwithin one year immediately preceding the commencement of this case.</body></html>");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Payments");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				saveVars();
				String varNameOne = "SNineOne" + Integer.toString(table.getRowCount());		
				String varNameTwo = "SNineTwo" + Integer.toString(table.getRowCount());
				String varNameThree = "SNineThree" + Integer.toString(table.getRowCount());
		
			
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
					
					String varNameOne = "SNineOne" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "SNineTwo" + Integer.toString(table.getSelectedRow());
					String varNameThree = "SNineThree" + Integer.toString(table.getSelectedRow());
	
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);
					bk.vars.remove(varNameThree);
	
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("SNineOne" + Integer.toString(i), bk.vars.get("SNineOne" + Integer.toString(i+1)));
							bk.setVar("SNineTwo" + Integer.toString(i), bk.vars.get("SNineTwo" + Integer.toString(i+1)));
							bk.setVar("SNineThree" + Integer.toString(i), bk.vars.get("SNineThree" + Integer.toString(i+1)));
			
	
						}
					}
					bk.vars.remove("SNineOne" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SNineTwo" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("SNineThree" + Integer.toString(table.getRowCount()-1));

	
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
				"Name and Address of Payee", "Date of Payment and Name of Payer", "Amount "
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(134);
		scrollPane.setViewportView(table);
	}
	
	public void saveVars(){
		
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("SNineOne"); i++){
			bk.vars.remove("SNineOne"+Integer.toString(i));
			bk.vars.remove("SNineTwo"+Integer.toString(i));
			bk.vars.remove("SNineThree"+Integer.toString(i));

		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("SNineOne"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("SNineTwo"+Integer.toString(i), (String)table.getValueAt(i, 1));
			bk.setVar("SNineThree"+Integer.toString(i), (String)table.getValueAt(i, 2));

		}


	}
	
	public void loadTable(){
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
	
		int newRowCount = checkNumVars("SNineOne");		
		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("SNineOne" + Integer.toString(i)), bk.getField("SNineTwo" + Integer.toString(i)), bk.getField("SNineThree" + Integer.toString(i))});
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
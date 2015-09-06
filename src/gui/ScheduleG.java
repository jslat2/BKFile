package gui;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

import java.awt.Rectangle;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import data.Contract;
import data.TxtEdit;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.awt.event.WindowAdapter;


public class ScheduleG extends JFrame{
	private JTable table;
	private TxtEdit txt = new TxtEdit();
	
	public static ArrayList<Contract> contracts = new ArrayList<>();
	
	public ScheduleG() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					txt.saveGArray("C:/Users/Gaming/Desktop/c.txt", contracts);
				} catch (FileNotFoundException f) {
					f.printStackTrace();
				}
			}
		});
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {
				loadContracts();
				
				try {
					txt.saveGArray("C:/Users/Gaming/Desktop/c.txt", contracts);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
			public void windowLostFocus(WindowEvent arg0) {
			}
		});
		setBounds(new Rectangle(0, 0, 1000, 800));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 745, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 974, SpringLayout.WEST, getContentPane());
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name and Mailing Address of Other Parties to Lease", "Description of Contract and Nature of Interest"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAddContract = new JButton("Add Contract");
		btnAddContract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				ContractBox b = new ContractBox();
				b.setVisible(true);				
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnAddContract, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, btnAddContract);
		springLayout.putConstraint(SpringLayout.NORTH, btnAddContract, 10, SpringLayout.NORTH, getContentPane());
		getContentPane().add(btnAddContract);
		
		JButton btnEditContract = new JButton("Edit Contract");
		btnEditContract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ContractBox b = new ContractBox();
				b.setOtherParty(contracts.get(table.getSelectedRow()).getOtherParty());
				b.setDescription(contracts.get(table.getSelectedRow()).getDescription());
				contracts.remove(table.getSelectedRow());
				b.setRowNum(table.getSelectedRow());
				b.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnEditContract, 0, SpringLayout.NORTH, btnAddContract);
		springLayout.putConstraint(SpringLayout.WEST, btnEditContract, 6, SpringLayout.EAST, btnAddContract);
		getContentPane().add(btnEditContract);
	}
	
	public void loadContracts(){

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		for(int i = 0; i < contracts.size(); i++){
			model.addRow(new Object[] {contracts.get(i).getOtherParty()});
		}
	}
}

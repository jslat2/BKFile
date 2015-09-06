package gui;
import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import data.Debt;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

import data.TxtEdit;
import java.awt.event.WindowAdapter;
public class ScheduleD extends JFrame{
	public static ArrayList<Debt> debt = new ArrayList<>();
	private JTable table;
	private TxtEdit txt = new TxtEdit();
	
	public ScheduleD() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					txt.saveDArray("C:/Users/Gaming/Desktop/b.txt", debt);
				} catch (FileNotFoundException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}
			}
		});
		
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {

				loadDebt();
				try {
					txt.saveDArray("C:/Users/Gaming/Desktop/b.txt", debt);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
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
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -19, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 974, SpringLayout.WEST, getContentPane());
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Creditor", "Amount Owed"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAddCreditor = new JButton("Add Creditor");
		btnAddCreditor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreditorBox b = new CreditorBox();
				b.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnAddCreditor, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, btnAddCreditor);
		springLayout.putConstraint(SpringLayout.NORTH, btnAddCreditor, 10, SpringLayout.NORTH, getContentPane());
		getContentPane().add(btnAddCreditor);
		
		JButton btnEditDebt = new JButton("Edit Debt");
		springLayout.putConstraint(SpringLayout.WEST, btnEditDebt, 6, SpringLayout.EAST, btnAddCreditor);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEditDebt, -6, SpringLayout.NORTH, scrollPane);
		
		btnEditDebt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");

				}
				else{
					
					CreditorBox b = new CreditorBox();

					b.setClaimAmount(debt.get(table.getSelectedRow()).getClaimAmount());
					b.setLiableParty(debt.get(table.getSelectedRow()).getLiableParty());
					b.setType(debt.get(table.getSelectedRow()).getType());
					b.setSecuringProperty(debt.get(table.getSelectedRow()).getSecuringProperty());
					
					b.setCredInfo(debt.get(table.getSelectedRow()).getCredInfo());
					b.setClaimInfo(debt.get(table.getSelectedRow()).getClaimInfo());
					
					b.setUnliquidated(debt.get(table.getSelectedRow()).getUnliquidated());	
					b.setContingent(debt.get(table.getSelectedRow()).getContingent());

					b.setDisputed(debt.get(table.getSelectedRow()));
									
					removeRow(table.getSelectedRow());

					b.setRowNum(table.getSelectedRow());
					b.setVisible(true);

				}
			}
		});
		getContentPane().add(btnEditDebt);
		
		JButton btnNewButton = new JButton("Remove Debt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
					}
				else{
					removeRow(table.getSelectedRow());
					loadDebt();

				}
			}
			
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 6, SpringLayout.EAST, btnEditDebt);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -6, SpringLayout.NORTH, scrollPane);
		getContentPane().add(btnNewButton);
	}
	
	public void removeRow(int x){
		debt.remove(x);
	}
	
	public void loadDebt(){

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		for(int i = 0; i < debt.size(); i++){
			model.addRow(new Object[] {debt.get(i).trimCredInfo(), debt.get(i).getClaimAmount()});
		}
	}
}

package gui;
import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;

import data.Paycheck;

import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class CheckCoBox extends JFrame {
	public JTextField textField;
	private JTable table = new JTable();
	public String currentEmp = "";
	public JTextField textField_1;
	
	public String gross = "";
	public String empName = "";
	public String empAddress = "";
	public boolean currentlyEmployed = false;
	public String empLength = "";
	public String occupation = "";
	public int checkNum = 0;
	
	public CheckCoBox() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				saveChecks();
			}
			@Override
			public void windowOpened(WindowEvent e) {
				loadChecks();
			}
		});


		
		setBounds(new Rectangle(0, 0, 600, 600));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblEmploymentInformation = new JLabel("Date of Check");
		springLayout.putConstraint(SpringLayout.NORTH, lblEmploymentInformation, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblEmploymentInformation, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblEmploymentInformation);
		
		textField = new JTextField();
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, lblEmploymentInformation);
		springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField, -415, SpringLayout.EAST, getContentPane());
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 574, SpringLayout.WEST, getContentPane());
		getContentPane().add(scrollPane);
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Deduction Name", "Deduction Amount"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAddPaycheck = new JButton("Add Deduction");
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, btnAddPaycheck);
		springLayout.putConstraint(SpringLayout.WEST, btnAddPaycheck, 0, SpringLayout.WEST, lblEmploymentInformation);
		btnAddPaycheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"", ""});
			}
		});
		getContentPane().add(btnAddPaycheck);
		
		JButton btnRemovePaycheck = new JButton("Remove Deduction");
		springLayout.putConstraint(SpringLayout.NORTH, btnRemovePaycheck, 0, SpringLayout.NORTH, btnAddPaycheck);
		springLayout.putConstraint(SpringLayout.WEST, btnRemovePaycheck, 6, SpringLayout.EAST, btnAddPaycheck);
		btnRemovePaycheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
				}
				else{
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		getContentPane().add(btnRemovePaycheck);
		
		JLabel lblGrossPay = new JLabel("Gross Pay");
		springLayout.putConstraint(SpringLayout.NORTH, lblGrossPay, 6, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, lblGrossPay, 0, SpringLayout.WEST, lblEmploymentInformation);
		getContentPane().add(lblGrossPay);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, btnAddPaycheck, 6, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblGrossPay);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, lblEmploymentInformation);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
	
	public int getCheckNum(){
		return checkNum;
	}
	
	public void setCheckNum(int x){
		checkNum = x;
	}
	
	//load all checks matching the employer currently being edited
	public void loadChecks(){
		B22CoBox b = new B22CoBox();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int index = -1;
		
		for(int i = model.getRowCount() - 1; i >= 0; i--){
			model.removeRow(i);
		}
		
		for(int i = 0; i < b.paychecks.size(); i++){
			if(b.paychecks.get(i).getEmpName().equals(currentEmp)){
				model.addRow(new Object[] {b.paychecks.get(i).getAmount().toString(), b.paychecks.get(i).getDate().toString()});
				textField.setText(b.paychecks.get(i).date);
				textField_1.setText(b.paychecks.get(i).gross);
			}
		}	

		
		
	}
	
	public void saveChecks(){
		Paycheck p = new Paycheck();
		B22CoBox b = new B22CoBox();

		
		int index = 0;
		
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		
		
		p.setEmpName(empName);
		p.setEmpAddress(empAddress);
		p.setCurrentlyEmployed(currentlyEmployed);
		p.setEmpLength(empLength);
		p.setOccupation(occupation);
		p.setPaycheckNo(checkNum);
		p.setGross(textField_1.getText());
		p.setDate(textField.getText());
		

		
		if(table.getRowCount() > 0){
			for(int i = 0; i < table.getRowCount(); i++){
				p.deductions.add((String)table.getValueAt(i, 0));
				p.deductionAmounts.add((String)table.getValueAt(i, 1));
			}
		}
		
		b.paychecks.add(p);

	}
}

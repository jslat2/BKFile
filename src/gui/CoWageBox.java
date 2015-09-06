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

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class CoWageBox extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table = new JTable();
	private JTextArea textArea = new JTextArea();
	private JCheckBox chckbxCurrentEmployer = new JCheckBox("Current Employer?");
	public String currentEmp = "";
	
	public CoWageBox() {
		
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {
				loadChecks();
			}
			public void windowLostFocus(WindowEvent arg0) {
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
			}
			@Override
			public void windowOpened(WindowEvent e) {
				loadChecks();
			}
		});


		
		setBounds(new Rectangle(0, 0, 600, 600));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblEmploymentInformation = new JLabel("Employment Information");
		springLayout.putConstraint(SpringLayout.NORTH, lblEmploymentInformation, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblEmploymentInformation, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblEmploymentInformation);
		
		JLabel lblOccupation = new JLabel("Occupation");
		springLayout.putConstraint(SpringLayout.NORTH, lblOccupation, 6, SpringLayout.SOUTH, lblEmploymentInformation);
		springLayout.putConstraint(SpringLayout.WEST, lblOccupation, 0, SpringLayout.WEST, lblEmploymentInformation);
		getContentPane().add(lblOccupation);
		
		textField = new JTextField();

		springLayout.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, lblOccupation);
		springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEmployersName = new JLabel("Employer's Name");
		springLayout.putConstraint(SpringLayout.NORTH, lblEmployersName, 6, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, lblEmployersName, 0, SpringLayout.WEST, lblEmploymentInformation);
		getContentPane().add(lblEmployersName);
		
		textField_1 = new JTextField();
		textField_1.addFocusListener(new FocusAdapter() {
			B22CoBox b = new B22CoBox();
			@Override
			public void focusGained(FocusEvent arg0) {
				currentEmp = textField_1.getText();
			}
			@Override
			public void focusLost(FocusEvent e) {
				for(int i = 0; i < b.paychecks.size(); i++){
					if(b.paychecks.get(i).getEmpName().equals(currentEmp)){
						b.paychecks.get(i).setEmpName(textField_1.getText());
					}
				}
				
				currentEmp = textField_1.getText();
			}
		});

		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblEmployersName);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmployersAddress = new JLabel("Employer's Address");
		springLayout.putConstraint(SpringLayout.NORTH, lblEmployersAddress, 6, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, lblEmployersAddress, 0, SpringLayout.WEST, lblEmploymentInformation);
		getContentPane().add(lblEmployersAddress);
		


		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textArea);
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 6, SpringLayout.SOUTH, lblEmployersAddress);
		springLayout.putConstraint(SpringLayout.WEST, textArea, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, 90, SpringLayout.SOUTH, lblEmployersAddress);
		springLayout.putConstraint(SpringLayout.EAST, textArea, 343, SpringLayout.WEST, getContentPane());
		getContentPane().add(textArea);
		
		JLabel lblHowLongEmployed = new JLabel("How Long Employed with This Employer");
		springLayout.putConstraint(SpringLayout.NORTH, lblHowLongEmployed, 6, SpringLayout.SOUTH, textArea);
		springLayout.putConstraint(SpringLayout.WEST, lblHowLongEmployed, 0, SpringLayout.WEST, lblEmploymentInformation);
		getContentPane().add(lblHowLongEmployed);
		
		textField_2 = new JTextField();

		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 6, SpringLayout.SOUTH, lblHowLongEmployed);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, lblEmploymentInformation);
		springLayout.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, lblEmploymentInformation);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 280, SpringLayout.SOUTH, textField_2);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 574, SpringLayout.WEST, getContentPane());
		getContentPane().add(scrollPane);
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Amount", "Date"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnAddPaycheck = new JButton("Add Paycheck");
		btnAddPaycheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CheckCoBox b = new CheckCoBox();
				
				b.empName = textField_1.getText();
				b.empAddress = textArea.getText();
				if(chckbxCurrentEmployer.isSelected()){
					b.currentlyEmployed = true;
				}
				b.empLength = textField_2.getText();
				b.occupation = textField.getText();
				b.setCheckNum(table.getRowCount()+1);
				b.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, btnAddPaycheck);
		springLayout.putConstraint(SpringLayout.NORTH, btnAddPaycheck, 6, SpringLayout.SOUTH, textField_2);
		springLayout.putConstraint(SpringLayout.WEST, btnAddPaycheck, 0, SpringLayout.WEST, lblEmploymentInformation);
		getContentPane().add(btnAddPaycheck);
		


		springLayout.putConstraint(SpringLayout.NORTH, chckbxCurrentEmployer, -4, SpringLayout.NORTH, lblEmploymentInformation);
		springLayout.putConstraint(SpringLayout.EAST, chckbxCurrentEmployer, 0, SpringLayout.EAST, textField);
		getContentPane().add(chckbxCurrentEmployer);
		
		JButton btnRemovePaycheck = new JButton("Remove Paycheck");
		btnRemovePaycheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
				}
				else{
					B22CoBox b = new B22CoBox();
					
					int count = 0;
					for(int i = 0; i < b.paychecks.size(); i++){
						if(b.paychecks.get(i).getEmpName().equals(textField_1.getText())){
							if(count == table.getSelectedRow()){
								b.paychecks.remove(i);
								break;
							}
							else{
								count++;
							}
						}
					}
					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.removeRow(table.getSelectedRow());
				}
				loadChecks();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnRemovePaycheck, 6, SpringLayout.SOUTH, textField_2);
		springLayout.putConstraint(SpringLayout.WEST, btnRemovePaycheck, 6, SpringLayout.EAST, btnAddPaycheck);
		getContentPane().add(btnRemovePaycheck);
		
		JButton btnEditSelected = new JButton("Edit Selected");
		btnEditSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				B22CoBox a = new B22CoBox();
				CheckCoBox b = new CheckCoBox();
			
				b.empName = textField_1.getText();
				b.empAddress = textArea.getText();
				if(chckbxCurrentEmployer.isSelected()){
					b.currentlyEmployed = true;
				}
				b.empLength = textField_2.getText();
				b.occupation = textField.getText();
				b.setCheckNum(table.getRowCount());
				b.textField.setText((String)table.getValueAt(table.getSelectedRow(), 1));
				b.textField_1.setText((String)table.getValueAt(table.getSelectedRow(), 0));
				b.setVisible(true);
				a.paychecks.remove(table.getSelectedRow());
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnEditSelected, 6, SpringLayout.EAST, btnRemovePaycheck);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEditSelected, -6, SpringLayout.NORTH, scrollPane);
		getContentPane().add(btnEditSelected);
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
			if(b.paychecks.get(i).getEmpName().equals(textField_1.getText())){
				System.out.println("S");
				model.addRow(new Object[] {b.paychecks.get(i).gross.toString(), b.paychecks.get(i).date.toString()});
				index = i;
			}
		}	
		if(index != -1){
			textField.setText(b.paychecks.get(index).getOccupation());
			textField_1.setText(b.paychecks.get(index).getEmpName());
			textArea.setText(b.paychecks.get(index).getEmpAddress());
			textField_2.setText(b.paychecks.get(index).getEmpLength());
			if(b.paychecks.get(index).isCurrentlyEmployed()){
				chckbxCurrentEmployer.setSelected(true);
			}
		}
		
		
	}
	
}

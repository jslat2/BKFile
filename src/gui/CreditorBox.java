package gui;

import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.*;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;


import data.BkFile;
import data.Debt;
import data.TxtEdit;

import java.awt.Dimension;

import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowFocusListener;

public class CreditorBox extends JFrame{
	private JComboBox comboBox = new JComboBox();
	private JTextArea textArea_1 = new JTextArea();
	private final JTextArea textArea = new JTextArea();
	private JTextField textField;
	private JCheckBox chckbxContingent = new JCheckBox("Contingent");
	private JCheckBox chckbxUnliquidated = new JCheckBox("Unliquidated");
	private JCheckBox chckbxDisputed = new JCheckBox("Disputed");
	private JLabel lblNewLabel_1 = new JLabel("Type of Debt");
	private JComboBox comboBox_1 = new JComboBox();
	private final JComboBox comboBox_2 = new JComboBox();
	private final JLabel lblNewLabel_2 = new JLabel("Property Securing Debt ");
	private ScheduleB b = new ScheduleB();
	private Debt d = new Debt();
	
	private TxtEdit txt = new TxtEdit();
	private ScheduleD schD = new ScheduleD();
	public int rowNum = 0;
	private final JButton btnAddCodebtor = new JButton("Add CoDebtor");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTable table = new JTable();
	
	public CreditorBox() {
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent e) {
				loadTable();
			}
			public void windowLostFocus(WindowEvent e) {
				saveVars();
			}
		});
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				schD.debt.add(rowNum, d);
			}
		});
		setBounds(new Rectangle(0, 0, 1000, 550));
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("276px"),
				ColumnSpec.decode("20dlu"),
				ColumnSpec.decode("287px"),
				ColumnSpec.decode("20dlu"),
				ColumnSpec.decode("300px:grow"),},
			new RowSpec[] {
				RowSpec.decode("29px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("27px:grow"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("29px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("29px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("29px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("30px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("30px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("30px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("29px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("29px:grow"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("29px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("29px"),
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("34px"),}));
		
		JLabel lblAmountOfClaim = new JLabel("Amount of Claim");
		getContentPane().add(lblAmountOfClaim, "1, 1, left, bottom");
		
		JLabel lblCreditorsNameMailing = new JLabel("Creditor's Name, Mailing Address (including Zip) and Account Number");
		lblCreditorsNameMailing.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblCreditorsNameMailing, "3, 1, left, bottom");
		
		textField = new JTextField();
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				d.setClaimAmount(textField.getText());
			}
		});
		btnAddCodebtor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BkFile bk = new BkFile();
				saveVars();
				
				String varNameOne = "codebtorName" + Integer.toString(table.getRowCount());		
				String varNameTwo = "codebtorAddress" + Integer.toString(table.getRowCount());

			
				bk.setVar(varNameOne, "");
				bk.setVar(varNameTwo, "");
					
				loadTable();
			}
		});
		
		getContentPane().add(btnAddCodebtor, "5, 1, left, top");
		textField.setPreferredSize(new Dimension(120, 20));
		textField.setMinimumSize(new Dimension(120, 50));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField.setMargin(new Insets(2, 2, 2, 10));
		getContentPane().add(textField, "1, 3, left, top");
		textField.setColumns(10);
		textArea.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				d.setCredInfo(textArea.getText());
			}
		});
		textArea.setBounds(new Rectangle(100, 100, 100, 100));
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(textArea, "3, 3, 1, 6, fill, fill");
		
		getContentPane().add(scrollPane, "5, 3, 1, 25, fill, fill");
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Address"
			}
		));
		
		scrollPane.setViewportView(table);
		
		JLabel lblLiableParties = new JLabel("Liable Parties");
		getContentPane().add(lblLiableParties, "1, 5, fill, fill");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setLiableParty((String)comboBox.getSelectedItem());
			}
		});
		comboBox.setBounds(new Rectangle(0, 0, 50, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Husband", "Wife", "Joint", "Community"}));
		getContentPane().add(comboBox, "1, 7, left, fill");
		getContentPane().add(lblNewLabel_1, "1, 9, fill, fill");
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setType((String)comboBox_1.getSelectedItem());
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Unsecured", "Priority", "Secured"}));
		getContentPane().add(comboBox_1, "1, 11, left, fill");
		
		JLabel lblDateClaimWas = new JLabel("Date Claim was Incurred and Consideration for Claim");
		lblDateClaimWas.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblDateClaimWas, "3, 11, fill, fill");
		getContentPane().add(lblNewLabel_2, "1, 13, fill, fill");
		
		JLabel lblIfClaimIs = new JLabel("if Claim is Subject to Setoff State so");
		lblIfClaimIs.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblIfClaimIs, "3, 13, fill, fill");
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setSecuringProperty((String)comboBox_2.getSelectedItem());
			}
		});
		getContentPane().add(comboBox_2, "1, 15, fill, fill");
		textArea_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				d.setClaimInfo(textArea_1.getText());
			}
		});
		textArea_1.setBounds(new Rectangle(0, 0, 100, 0));
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(textArea_1, "3, 15, 1, 5, fill, fill");
		
		JLabel lblNewLabel = new JLabel("Claim is (check all that apply) :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(lblNewLabel, "1, 21, left, bottom");
		chckbxUnliquidated.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
	
				if(chckbxUnliquidated.isSelected()){
					d.setUnliquidated("true");
				}
				else{
					d.setUnliquidated("false");
				}
			}
		});
		chckbxUnliquidated.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(chckbxUnliquidated, "1, 23, left, fill");
		chckbxContingent.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if(chckbxContingent.isSelected()){
					d.setContingent("true");
				}
				else{
					d.setContingent("false");
				}
			}
		});
		chckbxContingent.setHorizontalAlignment(SwingConstants.LEFT);
		getContentPane().add(chckbxContingent, "1, 25, left, fill");
		chckbxDisputed.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxDisputed.isSelected()){
					d.setDisputed("true");
				}
				else{
					d.setDisputed("false");
				}
			}
		});
		getContentPane().add(chckbxDisputed, "1, 27, left, fill");
		
		for(int i = 0; i < b.prop.size(); i++){
			comboBox_2.addItem(b.prop.get(i).getDescription());
		}
	}
	

	public void setLiableParty(String s){
		comboBox.setSelectedItem(s);
	}
	
	public void setType(String s){
		comboBox_1.setSelectedItem(s);
	}
	
	public void setSecuringProperty(String s){
		comboBox_2.setSelectedItem(s);
	}
	
	public String getCredInfo(){
		return textArea.getText();
	}
	
	public void setCredInfo(String s){
		textArea.setText(s);
	}
	
	public String getClaimInfo(){
		return textArea_1.getText();
	}
	
	public void setClaimInfo(String s){
		textArea_1.setText(s);
	}
	
	public String getClaimAmount(){
		return textField.getText();
	}
	
	public void setClaimAmount(String s){
		textField.setText(s);
	}
	
	
	public boolean isContingent(){
		return chckbxContingent.isSelected();
	}
	
	public void setContingent(String s){

		if(s.equals("true")){

			chckbxContingent.setSelected(true);
		}
		else{
			chckbxContingent.setSelected(false);
		}
	}
	
	public boolean isUnliquidated(){
		return chckbxUnliquidated.isSelected();
	}
	
	public void setUnliquidated(String s){
		if(s.equals("true")){
			chckbxUnliquidated.setSelected(true);
		}
		else if(s.equals("false")){
			chckbxUnliquidated.setSelected(false);
		}
	}
	
	public boolean isDisputed(){
		return chckbxDisputed.isSelected();
	}
	
	public void setDisputed(Debt d){
	
		if(d.isDisputed()){
			chckbxDisputed.setSelected(true);
		}
		else{
			chckbxDisputed.setSelected(false);
		}
	}
	
	public void setRowNum(int x){
		rowNum = x;
	}
	
	public void saveVars(){
		BkFile bk = new BkFile();
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("codebtorName"); i++){
			bk.vars.remove("codebtorName"+Integer.toString(i));
			bk.vars.remove("codebtorAddress"+Integer.toString(i));
		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("codebtorName"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("codebtorAddress"+Integer.toString(i), (String)table.getValueAt(i, 1));
		}


	}
	
	public void loadTable(){
		BkFile bk = new BkFile();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}

		int newRowCount = checkNumVars("codebtorName");		

		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("codebtorName" + Integer.toString(i)), bk.getField("codebtorAddress" + Integer.toString(i))});
		}
	}
	
	
	public int checkNumVars(String s){
		BkFile bk = new BkFile();
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

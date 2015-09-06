package gui;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import data.BkFile;
import data.Paycheck;
import data.TxtEdit;

import java.awt.event.WindowStateListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JRadioButton;
public class B22CoBox extends JFrame{
	

	public static ArrayList<String> otherSources = new ArrayList<String>();
	public static ArrayList<String> otherAmounts = new ArrayList<String>();
	public static ArrayList<String> alimonyAmounts = new ArrayList<String>();
	public static ArrayList<String> alimonyDates = new ArrayList<String>();
	public static ArrayList<String> regularPaymentsAmounts= new ArrayList<String>();
	public static ArrayList<String> regularPaymentsSources = new ArrayList<String>();
	public static ArrayList<String> regularPaymentsDates = new ArrayList<String>();
	public static ArrayList<String> businessNames = new ArrayList<String>();
	public static ArrayList<String> businessAmounts = new ArrayList<String>();
	public static ArrayList<String> businessDates = new ArrayList<String>();
	public static ArrayList<String> realAmounts = new ArrayList<String>();
	public static ArrayList<String> realDates = new ArrayList<String>();
	public static ArrayList<String> interestAmounts = new ArrayList<String>();
	public static ArrayList<String> interestDates = new ArrayList<String>();
	public static ArrayList<String> unemploymentAmounts = new ArrayList<String>();
	public static ArrayList<String> unemploymentDates = new ArrayList<String>();
	public static ArrayList<String> pensionAmounts = new ArrayList<String>();
	public static ArrayList<String> pensionDates = new ArrayList<String>();
	public static ArrayList<Paycheck> paychecks = new ArrayList<Paycheck>();
	
	
	private TxtEdit txt = new TxtEdit();
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	
	public JPanel main = new JPanel();

	public JComboBox comboBox = new JComboBox();
	public JComboBox comboBox_1 = new JComboBox();
	private JTable table_8;
	
	public B22CoBox() {
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {
				loadOtherIncome();
				loadAlimony();
				loadRegularPayments();
				loadBusiness();
				loadReal();
				loadInterest();
				loadUnemployment();
				loadPension();
				loadChecks();
			}
			public void windowLostFocus(WindowEvent arg0) {
				saveToHash();
				saveOtherSources();
				saveOtherAmounts();
				saveAlimonyAmounts();
				saveAlimonyDates();
				saveRegularPaymentsDates();
				saveRegularPaymentsSources();
				saveRegularPaymentsAmounts();
				saveBusinessNames();
				saveBusinessAmounts();
				saveBusinessDates();
				saveRealAmounts();
				saveRealDates();
				saveInterestAmounts();
				saveInterestDates();
				saveUnemploymentAmounts();
				saveUnemploymentDates();
				savePensionAmounts();
				savePensionDates();
				try {
					txt.savePaycheckArray("C:/Users/Gaming/Desktop/coPaychecks.txt", paychecks);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});



		setBounds(new Rectangle(0, 0, 800, 600));
		getContentPane().setLayout(new CardLayout(0, 0));
		
//		JPanel main = new JPanel();
		getContentPane().add(main, "name_332268747677817");
		main.setLayout(new CardLayout(0, 0));
		
		JPanel other = new JPanel();
		main.add(other, "name_332311104362370");
		SpringLayout sl_other = new SpringLayout();
		other.setLayout(sl_other);
		
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				
				else if(comboBox.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
			
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		comboBox.setSelectedIndex(9);
		sl_other.putConstraint(SpringLayout.NORTH, comboBox, 10, SpringLayout.NORTH, other);
		sl_other.putConstraint(SpringLayout.WEST, comboBox, 10, SpringLayout.WEST, other);
		other.add(comboBox);
		
		JButton btnAddOtherIncome = new JButton("Add Other Income");
		sl_other.putConstraint(SpringLayout.NORTH, btnAddOtherIncome, -1, SpringLayout.NORTH, comboBox);
		sl_other.putConstraint(SpringLayout.WEST, btnAddOtherIncome, 6, SpringLayout.EAST, comboBox);
		btnAddOtherIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				otherSources.add("");
				otherAmounts.add("");
				loadOtherIncome();
			}
		});
		other.add(btnAddOtherIncome);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_other.putConstraint(SpringLayout.NORTH, scrollPane, 4, SpringLayout.SOUTH, btnAddOtherIncome);
		sl_other.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, other);
		sl_other.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.SOUTH, other);
		sl_other.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, other);
		other.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Source", "Amount"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel front = new JPanel();
		main.add(front, "name_332690783456269");
		SpringLayout sl_front = new SpringLayout();
		front.setLayout(sl_front);
		
		
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_1.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox_1.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox_1.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				else if(comboBox_1.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox_1.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox_1.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox_1.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox_1.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox_1.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox_1.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
			}
		});
		sl_front.putConstraint(SpringLayout.NORTH, comboBox_1, 10, SpringLayout.NORTH, front);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		sl_front.putConstraint(SpringLayout.WEST, comboBox_1, 10, SpringLayout.WEST, front);
		front.add(comboBox_1);
		
		JLabel lblPleaseSelectIncome = new JLabel("Please Select Income Source");
		sl_front.putConstraint(SpringLayout.NORTH, lblPleaseSelectIncome, 0, SpringLayout.NORTH, comboBox_1);
		sl_front.putConstraint(SpringLayout.WEST, lblPleaseSelectIncome, 6, SpringLayout.EAST, comboBox_1);
		front.add(lblPleaseSelectIncome);
		
		JPanel wages = new JPanel();
		main.add(wages, "name_332277427801047");
		SpringLayout sl_wages = new SpringLayout();
		wages.setLayout(sl_wages);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox_2.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox_2.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox_2.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				
				else if(comboBox_2.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox_2.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox_2.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox_2.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox_2.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox_2.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox_2.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
			
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		comboBox_2.setSelectedIndex(1);
		sl_wages.putConstraint(SpringLayout.NORTH, comboBox_2, 10, SpringLayout.NORTH, wages);
		sl_wages.putConstraint(SpringLayout.WEST, comboBox_2, 10, SpringLayout.WEST, wages);
		wages.add(comboBox_2);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		sl_wages.putConstraint(SpringLayout.NORTH, scrollPane_8, 8, SpringLayout.SOUTH, comboBox_2);
		sl_wages.putConstraint(SpringLayout.WEST, scrollPane_8, 10, SpringLayout.WEST, wages);
		sl_wages.putConstraint(SpringLayout.SOUTH, scrollPane_8, 522, SpringLayout.SOUTH, comboBox_2);
		sl_wages.putConstraint(SpringLayout.EAST, scrollPane_8, 774, SpringLayout.WEST, wages);
		wages.add(scrollPane_8);
		
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Employer"
			}
		));
		scrollPane_8.setViewportView(table_8);
		
		JButton btnAddEmployer = new JButton("Add Employer");
		btnAddEmployer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CoWageBox b = new CoWageBox();
				b.currentEmp = null;
				b.setVisible(true);
			}
		});
		sl_wages.putConstraint(SpringLayout.NORTH, btnAddEmployer, 0, SpringLayout.NORTH, comboBox_2);
		sl_wages.putConstraint(SpringLayout.WEST, btnAddEmployer, 6, SpringLayout.EAST, comboBox_2);
		wages.add(btnAddEmployer);
		
		JButton btnEditSelected = new JButton("Edit Selected");
		btnEditSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_8.getSelectedRow() == -1){
					System.out.println("No row selected");
				}
				else{
					WageBox b = new WageBox();
					
					b.currentEmp = (String)table_8.getValueAt(table_8.getSelectedRow(), 0);
					
					b.setVisible(true);
					b.textField_1.setText(b.currentEmp);
				}
			}
		});
		sl_wages.putConstraint(SpringLayout.NORTH, btnEditSelected, 0, SpringLayout.NORTH, comboBox_2);
		sl_wages.putConstraint(SpringLayout.WEST, btnEditSelected, 6, SpringLayout.EAST, btnAddEmployer);
		wages.add(btnEditSelected);
		
		JButton btnRemoveSelected = new JButton("Remove Selected");
		btnRemoveSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_8.getSelectedRow() == -1){
					System.out.println("No row selected");
				}
				else{
					for(int i = 0; i < paychecks.size(); i++){
						if(paychecks.get(i).getEmpName().equals(table_8.getValueAt(table_8.getSelectedRow(), 0))){
							paychecks.remove(i);
						}
					}
				}
				
				
				
				loadChecks();
			}
		});
		sl_wages.putConstraint(SpringLayout.NORTH, btnRemoveSelected, 0, SpringLayout.NORTH, comboBox_2);
		sl_wages.putConstraint(SpringLayout.WEST, btnRemoveSelected, 6, SpringLayout.EAST, btnEditSelected);
		wages.add(btnRemoveSelected);
		
		JPanel alimony = new JPanel();
		main.add(alimony, "name_336137497541076");
		SpringLayout sl_alimony = new SpringLayout();
		alimony.setLayout(sl_alimony);
		
		JButton btnAddAlimonyOr = new JButton("Add Alimony or Maintenance");
		btnAddAlimonyOr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alimonyAmounts.add("");
				alimonyDates.add("");
				loadAlimony();
			}
		});
		alimony.add(btnAddAlimonyOr);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		sl_alimony.putConstraint(SpringLayout.WEST, scrollPane_1, 10, SpringLayout.WEST, alimony);
		sl_alimony.putConstraint(SpringLayout.EAST, scrollPane_1, -10, SpringLayout.EAST, alimony);
		sl_alimony.putConstraint(SpringLayout.NORTH, scrollPane_1, 39, SpringLayout.NORTH, alimony);
		sl_alimony.putConstraint(SpringLayout.SOUTH, scrollPane_1, -10, SpringLayout.SOUTH, alimony);
		alimony.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Amount", "Date"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JComboBox comboBox_3 = new JComboBox();
		sl_alimony.putConstraint(SpringLayout.NORTH, btnAddAlimonyOr, -1, SpringLayout.NORTH, comboBox_3);
		sl_alimony.putConstraint(SpringLayout.SOUTH, comboBox_3, -9, SpringLayout.NORTH, scrollPane_1);
		sl_alimony.putConstraint(SpringLayout.WEST, comboBox_3, 10, SpringLayout.WEST, alimony);
		comboBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox_3.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox_3.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox_3.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				
				else if(comboBox_3.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox_3.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox_3.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox_3.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox_3.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox_3.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox_3.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
					
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		comboBox_3.setSelectedIndex(2);
		alimony.add(comboBox_3);
		
		JButton btnRemoveAlimonyOr = new JButton("Remove Alimony or Maintenance");
		sl_alimony.putConstraint(SpringLayout.SOUTH, btnRemoveAlimonyOr, -6, SpringLayout.NORTH, scrollPane_1);
		sl_alimony.putConstraint(SpringLayout.EAST, btnAddAlimonyOr, -6, SpringLayout.WEST, btnRemoveAlimonyOr);
		sl_alimony.putConstraint(SpringLayout.EAST, btnRemoveAlimonyOr, 0, SpringLayout.EAST, scrollPane_1);
		btnRemoveAlimonyOr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table_1.getSelectedRow() == -1){
					System.out.println("No row selected");
				}
				else{
					alimonyDates.remove(table_1.getSelectedRow());
					alimonyAmounts.remove(table_1.getSelectedRow());
					loadAlimony();
				}
			}
		});
		alimony.add(btnRemoveAlimonyOr);
		
		JPanel otherPayments = new JPanel();
		main.add(otherPayments, "name_338041832232361");
		SpringLayout sl_otherPayments = new SpringLayout();
		otherPayments.setLayout(sl_otherPayments);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox_4.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox_4.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox_4.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				
				else if(comboBox_4.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox_4.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox_4.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox_4.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox_4.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox_4.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox_4.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
			}
		});
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		comboBox_4.setSelectedIndex(3);
		sl_otherPayments.putConstraint(SpringLayout.NORTH, comboBox_4, 10, SpringLayout.NORTH, otherPayments);
		sl_otherPayments.putConstraint(SpringLayout.WEST, comboBox_4, 10, SpringLayout.WEST, otherPayments);
		otherPayments.add(comboBox_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		sl_otherPayments.putConstraint(SpringLayout.NORTH, scrollPane_2, 6, SpringLayout.SOUTH, comboBox_4);
		sl_otherPayments.putConstraint(SpringLayout.WEST, scrollPane_2, 10, SpringLayout.WEST, otherPayments);
		sl_otherPayments.putConstraint(SpringLayout.SOUTH, scrollPane_2, 522, SpringLayout.SOUTH, comboBox_4);
		sl_otherPayments.putConstraint(SpringLayout.EAST, scrollPane_2, 774, SpringLayout.WEST, otherPayments);
		otherPayments.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Source", "Amount"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JButton btnAddSource = new JButton("Add Source");
		sl_otherPayments.putConstraint(SpringLayout.NORTH, btnAddSource, -1, SpringLayout.NORTH, comboBox_4);
		btnAddSource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				regularPaymentsSources.add("");
				regularPaymentsAmounts.add("");
				regularPaymentsDates.add("");
				loadRegularPayments();
			}
		});
		otherPayments.add(btnAddSource);
		
		JButton btnRemoveSource = new JButton("Remove Source");
		sl_otherPayments.putConstraint(SpringLayout.EAST, btnAddSource, -6, SpringLayout.WEST, btnRemoveSource);
		btnRemoveSource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_2.getSelectedRow() == -1){
					System.out.println("No Row Selected");
				}
				else{
					regularPaymentsDates.remove(table_2.getSelectedRow());
					regularPaymentsSources.remove(table_2.getSelectedRow());
					regularPaymentsAmounts.remove(table_2.getSelectedRow());
					loadRegularPayments();
				}
			}
		});
		sl_otherPayments.putConstraint(SpringLayout.NORTH, btnRemoveSource, 0, SpringLayout.NORTH, comboBox_4);
		sl_otherPayments.putConstraint(SpringLayout.EAST, btnRemoveSource, 0, SpringLayout.EAST, scrollPane_2);
		otherPayments.add(btnRemoveSource);
		
		JPanel business = new JPanel();
		main.add(business, "name_339895371329122");
		SpringLayout sl_business = new SpringLayout();
		business.setLayout(sl_business);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox_5.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox_5.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox_5.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				
				else if(comboBox_5.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox_5.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox_5.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox_5.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox_5.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox_5.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox_5.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
			}
		});
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		sl_business.putConstraint(SpringLayout.NORTH, comboBox_5, 10, SpringLayout.NORTH, business);
		sl_business.putConstraint(SpringLayout.WEST, comboBox_5, 10, SpringLayout.WEST, business);
		business.add(comboBox_5);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		sl_business.putConstraint(SpringLayout.NORTH, scrollPane_3, 10, SpringLayout.SOUTH, comboBox_5);
		sl_business.putConstraint(SpringLayout.WEST, scrollPane_3, 10, SpringLayout.WEST, business);
		sl_business.putConstraint(SpringLayout.SOUTH, scrollPane_3, 522, SpringLayout.SOUTH, comboBox_5);
		sl_business.putConstraint(SpringLayout.EAST, scrollPane_3, 774, SpringLayout.WEST, business);
		business.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Business Name", "Amounts Received", "Date"
			}
		));
		scrollPane_3.setViewportView(table_3);
		
		JButton btnAddIncome = new JButton("Add Income");
		sl_business.putConstraint(SpringLayout.NORTH, btnAddIncome, -1, SpringLayout.NORTH, comboBox_5);
		btnAddIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				businessNames.add("");
				businessAmounts.add("");
				businessDates.add("");
				loadBusiness();
			}
		});
		business.add(btnAddIncome);
		
		JButton btnRemoveIncome = new JButton("Remove Income");
		btnRemoveIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_3.getSelectedRow() == -1){
					System.out.println("No row selected");
				}
				
				else{
					businessNames.remove(table_3.getSelectedRow());
					businessAmounts.remove(table_3.getSelectedRow());
					businessDates.remove(table_3.getSelectedRow());
					loadBusiness();
					
				}
			}
		});
		sl_business.putConstraint(SpringLayout.EAST, btnAddIncome, -6, SpringLayout.WEST, btnRemoveIncome);
		sl_business.putConstraint(SpringLayout.NORTH, btnRemoveIncome, 0, SpringLayout.NORTH, comboBox_5);
		sl_business.putConstraint(SpringLayout.EAST, btnRemoveIncome, 0, SpringLayout.EAST, scrollPane_3);
		business.add(btnRemoveIncome);
		
		JPanel real = new JPanel();
		main.add(real, "name_341602310242716");
		SpringLayout sl_real = new SpringLayout();
		real.setLayout(sl_real);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox_6.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox_6.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox_6.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				
				else if(comboBox_6.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox_6.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox_6.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox_6.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox_6.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox_6.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox_6.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
			}
		});
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		comboBox_6.setSelectedIndex(5);
		sl_real.putConstraint(SpringLayout.NORTH, comboBox_6, 10, SpringLayout.NORTH, real);
		sl_real.putConstraint(SpringLayout.WEST, comboBox_6, 10, SpringLayout.WEST, real);
		real.add(comboBox_6);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		sl_real.putConstraint(SpringLayout.NORTH, scrollPane_4, 6, SpringLayout.SOUTH, comboBox_6);
		sl_real.putConstraint(SpringLayout.WEST, scrollPane_4, 10, SpringLayout.WEST, real);
		sl_real.putConstraint(SpringLayout.SOUTH, scrollPane_4, 522, SpringLayout.SOUTH, comboBox_6);
		sl_real.putConstraint(SpringLayout.EAST, scrollPane_4, 774, SpringLayout.WEST, real);
		real.add(scrollPane_4);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Amount"
			}
		));
		scrollPane_4.setViewportView(table_4);
		
		JButton btnAddIncome_1 = new JButton("Add Income");
		btnAddIncome_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realDates.add("");
				realAmounts.add("");
				loadReal();
			}
		});
		sl_real.putConstraint(SpringLayout.NORTH, btnAddIncome_1, 0, SpringLayout.NORTH, comboBox_6);
		sl_real.putConstraint(SpringLayout.WEST, btnAddIncome_1, 6, SpringLayout.EAST, comboBox_6);
		real.add(btnAddIncome_1);
		
		JPanel interest = new JPanel();
		main.add(interest, "name_342523958311197");
		SpringLayout sl_interest = new SpringLayout();
		interest.setLayout(sl_interest);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox_7.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox_7.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox_7.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				
				else if(comboBox_7.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox_7.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox_7.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox_7.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox_7.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox_7.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox_7.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
			
			}
		});
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		comboBox_7.setSelectedIndex(6);
		sl_interest.putConstraint(SpringLayout.NORTH, comboBox_7, 10, SpringLayout.NORTH, interest);
		sl_interest.putConstraint(SpringLayout.WEST, comboBox_7, 10, SpringLayout.WEST, interest);
		interest.add(comboBox_7);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		sl_interest.putConstraint(SpringLayout.NORTH, scrollPane_5, 8, SpringLayout.SOUTH, comboBox_7);
		sl_interest.putConstraint(SpringLayout.WEST, scrollPane_5, 10, SpringLayout.WEST, interest);
		sl_interest.putConstraint(SpringLayout.SOUTH, scrollPane_5, 522, SpringLayout.SOUTH, comboBox_7);
		sl_interest.putConstraint(SpringLayout.EAST, scrollPane_5, 774, SpringLayout.WEST, interest);
		interest.add(scrollPane_5);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Amount", "Date"
			}
		));
		scrollPane_5.setViewportView(table_5);
		
		JButton btnAddIncome_2 = new JButton("Add Income");
		btnAddIncome_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interestDates.add("");
				interestAmounts.add("");
				loadInterest();
			}
		});
		sl_interest.putConstraint(SpringLayout.NORTH, btnAddIncome_2, 0, SpringLayout.NORTH, comboBox_7);
		sl_interest.putConstraint(SpringLayout.WEST, btnAddIncome_2, 6, SpringLayout.EAST, comboBox_7);
		interest.add(btnAddIncome_2);
		
		JButton btnRemoveIncome_1 = new JButton("Remove Income");
		btnRemoveIncome_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_5.getSelectedRow()== -1){
					System.out.println("No row selected");
				}
				else{
					interestDates.remove(table_5.getSelectedRow());
					interestAmounts.remove(table_5.getSelectedRow());
					loadInterest();
				}
				
			}
		});
		sl_interest.putConstraint(SpringLayout.NORTH, btnRemoveIncome_1, 0, SpringLayout.NORTH, comboBox_7);
		sl_interest.putConstraint(SpringLayout.EAST, btnRemoveIncome_1, 0, SpringLayout.EAST, scrollPane_5);
		interest.add(btnRemoveIncome_1);
		
		JPanel unemployment = new JPanel();
		main.add(unemployment, "name_343688428449133");
		SpringLayout sl_unemployment = new SpringLayout();
		unemployment.setLayout(sl_unemployment);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox_8.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox_8.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox_8.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				
				else if(comboBox_8.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox_8.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox_8.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox_8.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox_8.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox_8.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox_8.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
			}
		});
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		sl_unemployment.putConstraint(SpringLayout.NORTH, comboBox_8, 10, SpringLayout.NORTH, unemployment);
		sl_unemployment.putConstraint(SpringLayout.WEST, comboBox_8, 10, SpringLayout.WEST, unemployment);
		unemployment.add(comboBox_8);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		sl_unemployment.putConstraint(SpringLayout.NORTH, scrollPane_6, 6, SpringLayout.SOUTH, comboBox_8);
		sl_unemployment.putConstraint(SpringLayout.WEST, scrollPane_6, 10, SpringLayout.WEST, unemployment);
		sl_unemployment.putConstraint(SpringLayout.SOUTH, scrollPane_6, 522, SpringLayout.SOUTH, comboBox_8);
		sl_unemployment.putConstraint(SpringLayout.EAST, scrollPane_6, 774, SpringLayout.WEST, unemployment);
		unemployment.add(scrollPane_6);
		
		table_6 = new JTable();
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Amount", "Date"
			}
		));
		scrollPane_6.setViewportView(table_6);
		
		JButton btnAddUnemployment = new JButton("Add Unemployment");
		btnAddUnemployment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				unemploymentAmounts.add("");
				unemploymentDates.add("");
				loadUnemployment();
			}
		});
		sl_unemployment.putConstraint(SpringLayout.NORTH, btnAddUnemployment, 0, SpringLayout.NORTH, comboBox_8);
		sl_unemployment.putConstraint(SpringLayout.WEST, btnAddUnemployment, 6, SpringLayout.EAST, comboBox_8);
		unemployment.add(btnAddUnemployment);
		
		JButton btnRemoveUnemployment = new JButton("Remove Unemployment");
		btnRemoveUnemployment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_6.getSelectedRow() == -1){
					System.out.println("No row selected");
				}
				else{
					unemploymentAmounts.remove(table_6.getSelectedRow());
					unemploymentDates.remove(table_6.getSelectedRow());
					loadUnemployment();
				}
			}
		});
		sl_unemployment.putConstraint(SpringLayout.NORTH, btnRemoveUnemployment, 0, SpringLayout.NORTH, comboBox_8);
		sl_unemployment.putConstraint(SpringLayout.EAST, btnRemoveUnemployment, 0, SpringLayout.EAST, scrollPane_6);
		unemployment.add(btnRemoveUnemployment);
		
		JPanel pension = new JPanel();
		main.add(pension, "name_344575499261357");
		SpringLayout sl_pension = new SpringLayout();
		pension.setLayout(sl_pension);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				if(comboBox_9.getSelectedItem().equals("")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332690783456269");
				}
				else if(comboBox_9.getSelectedItem().equals("Wages")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332277427801047");
				}
				else if(comboBox_9.getSelectedItem().equals("Other")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_332311104362370");
				}
				
				else if(comboBox_9.getSelectedItem().equals("Alimony and Maintenance")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_336137497541076");
				}
				else if(comboBox_9.getSelectedItem().equals("Amounts from Any Source Paid for Household Expenses")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_338041832232361");
				}
				else if(comboBox_9.getSelectedItem().equals("Net Business Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_339895371329122");
				}
				else if(comboBox_9.getSelectedItem().equals("Net Rental and Other Real Property Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_341602310242716");
				}
				else if(comboBox_9.getSelectedItem().equals("Interest, Dividends and Royalties")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_342523958311197");
				}
				else if(comboBox_9.getSelectedItem().equals("Unemployment Compensation")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_343688428449133");
				}
				else if(comboBox_9.getSelectedItem().equals("Pension or Retirement Income")){
					CardLayout cl = (CardLayout)(main.getLayout());
					cl.show(main, "name_344575499261357");
				}
				
				
			}
		});
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"", "Wages", "Alimony and Maintenance", "Amounts from Any Source Paid for Household Expenses", "Net Business Income", "Net Rental and Other Real Property Income", "Interest, Dividends and Royalties", "Unemployment Compensation", "Pension or Retirement Income", "Other"}));
		comboBox_9.setSelectedIndex(8);
		sl_pension.putConstraint(SpringLayout.NORTH, comboBox_9, 10, SpringLayout.NORTH, pension);
		sl_pension.putConstraint(SpringLayout.WEST, comboBox_9, 10, SpringLayout.WEST, pension);
		pension.add(comboBox_9);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		sl_pension.putConstraint(SpringLayout.NORTH, scrollPane_7, 6, SpringLayout.SOUTH, comboBox_9);
		sl_pension.putConstraint(SpringLayout.WEST, scrollPane_7, 10, SpringLayout.WEST, pension);
		sl_pension.putConstraint(SpringLayout.SOUTH, scrollPane_7, 522, SpringLayout.SOUTH, comboBox_9);
		sl_pension.putConstraint(SpringLayout.EAST, scrollPane_7, 774, SpringLayout.WEST, pension);
		pension.add(scrollPane_7);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Amount", "Date"
			}
		));
		scrollPane_7.setViewportView(table_7);
		
		JButton btnAddIncome_3 = new JButton("Add Income");
		btnAddIncome_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pensionAmounts.add("");
				pensionDates.add("");
				loadPension();
			}
		});
		sl_pension.putConstraint(SpringLayout.NORTH, btnAddIncome_3, 0, SpringLayout.NORTH, comboBox_9);
		sl_pension.putConstraint(SpringLayout.WEST, btnAddIncome_3, 6, SpringLayout.EAST, comboBox_9);
		pension.add(btnAddIncome_3);
		
		JButton btnRemo = new JButton("Remove Income");
		btnRemo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_7.getSelectedRow()==-1){
					System.out.println("No row Selected");
				}
				else{
					pensionAmounts.remove(table_7.getSelectedRow());
					pensionDates.remove(table_7.getSelectedRow());
					loadPension();
				}
			}
		});
		sl_pension.putConstraint(SpringLayout.NORTH, btnRemo, 0, SpringLayout.NORTH, comboBox_9);
		sl_pension.putConstraint(SpringLayout.EAST, btnRemo, -10, SpringLayout.EAST, pension);
		pension.add(btnRemo);

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				CardLayout cl = (CardLayout)(main.getLayout());
				cl.show(main, "name_332690783456269");
			}
		});
	}
	
	public void loadFromHash(){
		BkFile bk = new BkFile();
		for(int i =0; i < 1000; i++){	
			if(bk.vars.get("cootherSources"+Integer.toString(i)) != null){ 
				otherSources.add(bk.vars.get("cootherSources"+Integer.toString(i)));
			}
			if(bk.vars.get("cootherAmounts"+Integer.toString(i)) != null){ 
				otherAmounts.add(bk.vars.get("cootherAmounts"+Integer.toString(i)));
			}
			if(bk.vars.get("coalimonyAmounts"+Integer.toString(i)) != null){ 
				alimonyAmounts .add(bk.vars.get("coalimonyAmounts"+Integer.toString(i)));
			}
			if(bk.vars.get("coalimonyDates"+Integer.toString(i)) != null){ 
				alimonyDates.add(bk.vars.get("coalimonyDates"+Integer.toString(i)));
			}
			if(bk.vars.get("coregularPaymentsAmounts"+Integer.toString(i)) != null){ 
				regularPaymentsAmounts.add(bk.vars.get("coregularPaymentsAmounts"+Integer.toString(i)));
			}
			if(bk.vars.get("coregularPaymentsSources"+Integer.toString(i)) != null){ 
				regularPaymentsSources.add(bk.vars.get("coregularPaymentsSources"+Integer.toString(i)));
			}
			if(bk.vars.get("coregularPaymentsDates"+Integer.toString(i)) != null){ 
				regularPaymentsDates.add(bk.vars.get("coregularPaymentsDates"+Integer.toString(i)));
			}	
			if(bk.vars.get("cobusinessNames"+Integer.toString(i)) != null){ 
				businessNames.add(bk.vars.get("cobusinessNames"+Integer.toString(i)));
			}
			if(bk.vars.get("cobusinessAmounts"+Integer.toString(i)) != null){ 
				businessAmounts.add(bk.vars.get("cobusinessAmounts"+Integer.toString(i)));
			}
			if(bk.vars.get("cobusinessDates"+Integer.toString(i)) != null){ 
				businessDates.add(bk.vars.get("cobusinessDates"+Integer.toString(i)));
			}
			if(bk.vars.get("corealAmounts"+Integer.toString(i)) != null){ 
				realAmounts.add(bk.vars.get("corealAmounts"+Integer.toString(i)));
			} 
			if(bk.vars.get("corealDates"+Integer.toString(i)) != null){ 
				realDates.add(bk.vars.get("corealDates"+Integer.toString(i)));
			}
			if(bk.vars.get("cointerestAmounts"+Integer.toString(i)) != null){ 
				interestAmounts.add(bk.vars.get("cointerestAmounts"+Integer.toString(i)));
			}
			if(bk.vars.get("cointerestDates"+Integer.toString(i)) != null){ 
				interestDates.add(bk.vars.get("cointerestDates"+Integer.toString(i)));
			}
			if(bk.vars.get("counemploymentAmounts"+Integer.toString(i)) != null){ 
				unemploymentAmounts.add(bk.vars.get("counemploymentAmounts"+Integer.toString(i)));
			}
			if(bk.vars.get("counemploymentDates"+Integer.toString(i)) != null){ 
				unemploymentDates.add(bk.vars.get("counemploymentDates"+Integer.toString(i)));
			}
			if(bk.vars.get("copensionAmounts"+Integer.toString(i)) != null){ 
				pensionAmounts.add(bk.vars.get("copensionAmounts"+Integer.toString(i)));
			}
			if(bk.vars.get("copensionDates"+Integer.toString(i)) != null){ 
				pensionDates.add(bk.vars.get("copensionDates"+Integer.toString(i)));
			}

		}
	}
	
	public void saveToHash(){
		BkFile bk = new BkFile();
		for(int i = 0; i < 1000; i ++){
			bk.vars.remove("cootherSources"+Integer.toString(i));
			bk.vars.remove("cootherAmounts"+Integer.toString(i));
			bk.vars.remove("coalimonyAmounts"+Integer.toString(i));
			bk.vars.remove("coalimonyDates"+Integer.toString(i));
			bk.vars.remove("coregularPaymentsAmounts"+Integer.toString(i));
			bk.vars.remove("coregularPaymentsSources"+Integer.toString(i));
			bk.vars.remove("coregularPaymentsDates"+Integer.toString(i));
			bk.vars.remove("cobusinessNames"+Integer.toString(i));
			bk.vars.remove("cobusinessAmounts"+Integer.toString(i));
			bk.vars.remove("corealAmounts"+Integer.toString(i));
			bk.vars.remove("corealDates"+Integer.toString(i));
			bk.vars.remove("cointerestAmounts"+Integer.toString(i));
			bk.vars.remove("cointerestDates"+Integer.toString(i));
			bk.vars.remove("counemploymentAmounts"+Integer.toString(i));
			bk.vars.remove("counemploymentDates"+Integer.toString(i));
			bk.vars.remove("copensionAmounts"+Integer.toString(i));
			bk.vars.remove("copensionDates"+Integer.toString(i));
		}
		for(int i =0; i < otherSources.size(); i++){	
			bk.setVar("cootherSources"+Integer.toString(i), otherSources.get(i)); 
		}
		for(int i =0; i < otherAmounts.size(); i++){	
			bk.setVar("cootherAmounts"+Integer.toString(i), otherAmounts.get(i)); 
		}
		for(int i =0; i < alimonyAmounts.size(); i++){	
			bk.setVar("coalimonyAmounts"+Integer.toString(i), alimonyAmounts.get(i)); 
		}
		for(int i =0; i < alimonyDates.size(); i++){	
			bk.setVar("coalimonyDates"+Integer.toString(i), alimonyDates.get(i)); 
		}
		for(int i =0; i < regularPaymentsAmounts.size(); i++){	
			bk.setVar("coregularPaymentsAmounts"+Integer.toString(i), regularPaymentsAmounts.get(i)); 
		}	 
		for(int i =0; i < regularPaymentsSources.size(); i++){	
			bk.setVar("coregularPaymentsSources"+Integer.toString(i), regularPaymentsSources.get(i)); 
		}	 	
		for(int i =0; i < regularPaymentsDates.size(); i++){	
			bk.setVar("coregularPaymentsDates"+Integer.toString(i), regularPaymentsDates.get(i)); 
		}	 	 
		for(int i =0; i < businessNames.size(); i++){	
			bk.setVar("cobusinessNames"+Integer.toString(i), businessNames.get(i)); 
		}	
		for(int i =0; i < businessAmounts.size(); i++){	
			bk.setVar("cobusinessAmounts"+Integer.toString(i), businessAmounts.get(i)); 
		}			
		for(int i =0; i < realAmounts.size(); i++){	
			bk.setVar("corealAmounts"+Integer.toString(i), realAmounts.get(i)); 
		}
		for(int i =0; i < realDates.size(); i++){	
			bk.setVar("corealDates"+Integer.toString(i), realDates.get(i)); 
		}
		for(int i =0; i < interestAmounts.size(); i++){	
			bk.setVar("cointerestAmounts"+Integer.toString(i), interestAmounts.get(i)); 
		}
		for(int i =0; i < interestDates.size(); i++){	
			bk.setVar("cointerestDates"+Integer.toString(i), interestDates.get(i)); 
		}
		for(int i =0; i < unemploymentAmounts.size(); i++){	
			bk.setVar("counemploymentAmounts"+Integer.toString(i), unemploymentAmounts.get(i)); 
		}
		for(int i =0; i < unemploymentDates.size(); i++){	
			bk.setVar("counemploymentDates"+Integer.toString(i), unemploymentDates.get(i)); 
		}
		for(int i =0; i < pensionAmounts.size(); i++){	
			bk.setVar("copensionAmounts"+Integer.toString(i), pensionAmounts.get(i)); 
		}
		for(int i =0; i < pensionDates.size(); i++){	
			bk.setVar("copensionDates"+Integer.toString(i), pensionDates.get(i)); 
		}	
	}
	public void loadChecks(){
		DefaultTableModel model = (DefaultTableModel) table_8.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		if(paychecks.size() > 0){
			String currentEmp = null;
			for(int i = 0; i < paychecks.size(); i++){
				if(!(paychecks.get(i).getEmpName().equals(currentEmp))){
		
					model.addRow(new Object[] {paychecks.get(i).getEmpName().toString()});
					currentEmp = paychecks.get(i).getEmpName();
				}
			}
		}
	}
	
	public void loadPension(){
		DefaultTableModel model = (DefaultTableModel) table_7.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		if(pensionAmounts.size() > 0){
			for(int i = 0; i < pensionAmounts.size(); i++){
				model.addRow(new Object[] {pensionAmounts.get(i).toString(), pensionDates.get(i).toString()});
			}
		}
	}
	
	public void loadUnemployment(){
		DefaultTableModel model = (DefaultTableModel) table_6.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		if(unemploymentAmounts.size() > 0){
			for(int i = 0; i < unemploymentAmounts.size(); i++){
				model.addRow(new Object[] {unemploymentAmounts.get(i).toString(), unemploymentDates.get(i).toString()});
			}
		}
	}
	
	public void loadInterest(){
		DefaultTableModel model = (DefaultTableModel) table_5.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		if(interestAmounts.size() > 0){
			for(int i = 0; i < interestDates.size(); i++){
				model.addRow(new Object[] {interestAmounts.get(i).toString(), interestDates.get(i).toString()});
			}
		}
	}
	
	public void loadReal(){
		DefaultTableModel model = (DefaultTableModel) table_4.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		if(realDates.size() > 0){
			for(int i = 0; i < realDates.size(); i++){
				model.addRow(new Object[] {realAmounts.get(i).toString(), realDates.get(i).toString()});
			}
		}
	}
	
	public void loadBusiness(){
		DefaultTableModel model = (DefaultTableModel) table_3.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		if(businessNames.size() > 0){
			for(int i = 0; i < businessNames.size(); i++){
				model.addRow(new Object[] {businessNames.get(i).toString(), businessAmounts.get(i).toString(), businessDates.get(i).toString()});
			}
		}
	}
	
	public void loadRegularPayments(){
		DefaultTableModel model = (DefaultTableModel) table_2.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		if(regularPaymentsDates.size() > 0){
			for(int i = 0; i < regularPaymentsDates.size(); i++){
				model.addRow(new Object[] {regularPaymentsDates.get(i).toString(), regularPaymentsSources.get(i).toString(), regularPaymentsAmounts.get(i).toString()});
			}
		}
	}
	
	public void loadAlimony(){
		DefaultTableModel model = (DefaultTableModel) table_1.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		if(alimonyAmounts.size() > 0){


			for(int i = 0; i < alimonyAmounts.size(); i++){
				model.addRow(new Object[] {alimonyAmounts.get(i).toString(), alimonyDates.get(i).toString()});
			}
		}
	}
	
	public void loadOtherIncome(){
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		if(otherSources.size() > 0){


			for(int i = 0; i < otherSources.size(); i++){
				model.addRow(new Object[] {otherSources.get(i).toString(), otherAmounts.get(i).toString()});
			}
		}
	}
	
	
	public void saveOtherSources(){
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		otherSources.clear();
		for(int i = 0; i < table.getModel().getRowCount(); i++){
			if(table.getModel().getValueAt(i,0) != null){
				otherSources.add((String)table.getModel().getValueAt(i,0));
			}
		}	
		
	}
	
	
	public void saveOtherAmounts(){
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		otherAmounts.clear();
		for(int i = 0; i < table.getModel().getRowCount(); i++){
			if(table.getModel().getValueAt(i,1) != null){
				otherAmounts.add((String)table.getModel().getValueAt(i,1));
			}
		}	
	}
	
	public void saveAlimonyAmounts(){
		if(table_1.isEditing()){
			table_1.getCellEditor().stopCellEditing();
		}
		alimonyAmounts.clear();
		for(int i = 0; i < table_1.getModel().getRowCount(); i++){
			if(table_1.getModel().getValueAt(i,0) != null){
				alimonyAmounts.add((String)table_1.getModel().getValueAt(i,0));
			}
		}	
	}
	
	public void saveAlimonyDates(){
		if(table_1.isEditing()){
			table_1.getCellEditor().stopCellEditing();
		}
		alimonyDates.clear();
		for(int i = 0; i < table_1.getModel().getRowCount(); i++){
			if(table_1.getModel().getValueAt(i,1) != null){
				alimonyDates.add((String)table_1.getModel().getValueAt(i,1));
			}
		}	
	}
	
	public void saveRegularPaymentsDates(){
		if(table_2.isEditing()){
			table_2.getCellEditor().stopCellEditing();
		}
		regularPaymentsDates.clear();
		for(int i = 0; i < table_2.getModel().getRowCount(); i++){
			if(table_2.getModel().getValueAt(i,0) != null){
				regularPaymentsDates.add((String)table_2.getModel().getValueAt(i,0));
			}
		}	
	}
	
	public void saveRegularPaymentsSources(){
		if(table_2.isEditing()){
			table_2.getCellEditor().stopCellEditing();
		}
		regularPaymentsSources.clear();
		for(int i = 0; i < table_2.getModel().getRowCount(); i++){
			if(table_2.getModel().getValueAt(i,1) != null){
				regularPaymentsSources.add((String)table_2.getModel().getValueAt(i,1));
			}
		}	
	}
	
	public void saveRegularPaymentsAmounts(){
		if(table_2.isEditing()){
			table_2.getCellEditor().stopCellEditing();
		}
		regularPaymentsAmounts.clear();
		for(int i = 0; i < table_2.getModel().getRowCount(); i++){
			if(table_2.getModel().getValueAt(i,2) != null){
				regularPaymentsAmounts.add((String)table_2.getModel().getValueAt(i,2));
			}
		}	
	}
	
	public void saveBusinessNames(){
		if(table_3.isEditing()){
			table_3.getCellEditor().stopCellEditing();
		}
		businessNames.clear();
		for(int i = 0; i < table_3.getModel().getRowCount(); i++){
			if(table_3.getModel().getValueAt(i,0) != null){
				businessNames.add((String)table_3.getModel().getValueAt(i,0));
			}
		}	
	}
	
	public void saveBusinessAmounts(){
		if(table_3.isEditing()){
			table_3.getCellEditor().stopCellEditing();
		}
		businessAmounts.clear();
		for(int i = 0; i < table_3.getModel().getRowCount(); i++){
			if(table_3.getModel().getValueAt(i,1) != null){
				businessAmounts.add((String)table_3.getModel().getValueAt(i,1));
			}
		}	
	}
	
	public void saveBusinessDates(){
		if(table_3.isEditing()){
			table_3.getCellEditor().stopCellEditing();
		}
		businessDates.clear();
		for(int i = 0; i < table_3.getModel().getRowCount(); i++){
			if(table_3.getModel().getValueAt(i,2) != null){
				businessDates.add((String)table_3.getModel().getValueAt(i,2));
			}
		}	
	}
	public void saveRealAmounts(){
		if(table_4.isEditing()){
			table_4.getCellEditor().stopCellEditing();
		}
		realAmounts.clear();
		for(int i = 0; i < table_4.getModel().getRowCount(); i++){
			if(table_4.getModel().getValueAt(i,0) != null){
				realAmounts.add((String)table_4.getModel().getValueAt(i,0));
			}
		}	
	}
	
	public void saveRealDates(){
		if(table_4.isEditing()){
			table_4.getCellEditor().stopCellEditing();
		}
		realDates.clear();
		for(int i = 0; i < table_4.getModel().getRowCount(); i++){
			if(table_4.getModel().getValueAt(i,1) != null){
				realDates.add((String)table_4.getModel().getValueAt(i,1));
			}
		}	
	}
	
	public void saveInterestAmounts(){
		if(table_5.isEditing()){
			table_5.getCellEditor().stopCellEditing();
		}
		interestAmounts.clear();
		for(int i = 0; i < table_5.getModel().getRowCount(); i++){
			if(table_5.getModel().getValueAt(i,0) != null){
				interestAmounts.add((String)table_5.getModel().getValueAt(i,0));
			}
		}	
	}
	
	public void saveInterestDates(){
		if(table_5.isEditing()){
			table_5.getCellEditor().stopCellEditing();
		}
		interestDates.clear();
		for(int i = 0; i < table_5.getModel().getRowCount(); i++){
			if(table_5.getModel().getValueAt(i,1) != null){
				interestDates.add((String)table_5.getModel().getValueAt(i,1));
			}
		}	
	}
	
	public void saveUnemploymentAmounts(){
		if(table_6.isEditing()){
			table_6.getCellEditor().stopCellEditing();
		}
		unemploymentAmounts.clear();
		for(int i = 0; i < table_6.getModel().getRowCount(); i++){
			if(table_6.getModel().getValueAt(i,0) != null){
				unemploymentAmounts.add((String)table_6.getModel().getValueAt(i,0));
			}
		}	
	}
	
	public void saveUnemploymentDates(){
		if(table_6.isEditing()){
			table_6.getCellEditor().stopCellEditing();
		}
		unemploymentDates.clear();
		for(int i = 0; i < table_6.getModel().getRowCount(); i++){
			if(table_6.getModel().getValueAt(i,1) != null){
				unemploymentDates.add((String)table_6.getModel().getValueAt(i,1));
			}
		}	
	}
	public void savePensionAmounts(){
		if(table_7.isEditing()){
			table_7.getCellEditor().stopCellEditing();
		}
		pensionAmounts.clear();
		for(int i = 0; i < table_7.getModel().getRowCount(); i++){
			if(table_7.getModel().getValueAt(i,0) != null){
				pensionAmounts.add((String)table_7.getModel().getValueAt(i,0));
			}
		}	
	}
	
	public void savePensionDates(){
		if(table_7.isEditing()){
			table_7.getCellEditor().stopCellEditing();
		}
		pensionDates.clear();
		for(int i = 0; i < table_7.getModel().getRowCount(); i++){
			if(table_7.getModel().getValueAt(i,1) != null){
				pensionDates.add((String)table_7.getModel().getValueAt(i,1));
			}
		}	
	}
}

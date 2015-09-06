package gui;
import data.BkFile;

import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.SpringLayout;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;



public class VoluntaryPetition extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JComboBox<String> comboBox = new JComboBox<String>();
	private JComboBox<String> comboBox_1 = new JComboBox<String>();
	private JComboBox<String> comboBox_2 = new JComboBox<String>();
	private JComboBox<String> comboBox_3 = new JComboBox<String>();
	private JComboBox<String> comboBox_4 = new JComboBox<String>();
	private JCheckBox chckbxDebtorHasPossession = new JCheckBox("Debtor has possession of property that poses a threat to public safety");
	private JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Debtor has completed pre filing credit counseling (certificate attached)");
	private JCheckBox chckbxJointDebtorHas = new JCheckBox("Joint Debtor has completed pre filing credit counseling (certificate attached)");
	private JCheckBox chckbxDebtorHasBeen = new JCheckBox("Debtor has been domiciled in the district of this filing for the 180 days prior to filing");
	private JCheckBox chckbxLandlordHasA = new JCheckBox("Landlord has a judgment against debtor for possession of Debtor's residence ");
	private JCheckBox chckbxDebtorClaimsJudgment = new JCheckBox("Debtor claims judgment for possession should be permitted to be cured");
	private JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Debtor has included a deposit with the court for any rent due during the 30 day period after filing");
	private JCheckBox chckbxDebtorCertifiesThat = new JCheckBox("Debtor certifies that he/she has served the Landlord with this certification");
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTable table;
	
	public VoluntaryPetition() {
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent e) {
				loadTable();
			}
			public void windowLostFocus(WindowEvent e) {
				saveVars();
			}
		});

		
		DebtorAliases aliases = new DebtorAliases();
		JointDebtorAliases jAliases = new JointDebtorAliases();
		BkFile bk = new BkFile();
		setBounds(new Rectangle(0, 0, 800, 800));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, 762, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 784, SpringLayout.WEST, getContentPane());
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();



		tabbedPane.addTab("Basic Information", null, panel, null);
		tabbedPane.setEnabledAt(0, true);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("Address (street and no.)");
		lblNewLabel.setVisible(false);
		panel.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("My mailing address is different than my physical address");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, chckbxNewCheckBox);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, chckbxNewCheckBox);
		sl_panel.putConstraint(SpringLayout.SOUTH, chckbxNewCheckBox, -256, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, chckbxNewCheckBox, 10, SpringLayout.WEST, panel);

		chckbxNewCheckBox.setSelected(false);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("My mailing address is different than my physical address");
		sl_panel.putConstraint(SpringLayout.NORTH, checkBox, 0, SpringLayout.NORTH, chckbxNewCheckBox);
		sl_panel.putConstraint(SpringLayout.WEST, checkBox, 71, SpringLayout.EAST, chckbxNewCheckBox);
		checkBox.setSelected(false);
		panel.add(checkBox);
		
		textField = new JTextField();
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField", textField.getText());
			}
		});
		textField.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, panel);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("State");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 576, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_1.setVisible(false);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_1", textField_1.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_1, 596, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, lblNewLabel);
		textField_1.setVisible(false);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Zip");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 622, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_2.setVisible(false);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_2", textField_2.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2, 642, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, lblNewLabel);
		textField_2.setVisible(false);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAddressstreetAndNo = new JLabel("Address(street and no.)");
		lblAddressstreetAndNo.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, lblAddressstreetAndNo, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblAddressstreetAndNo, 0, SpringLayout.WEST, checkBox);
		panel.add(lblAddressstreetAndNo);
		
		textField_3 = new JTextField();
		textField_3.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_3", textField_3.getText());
			}
		});
		textField_3.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, textField);
		sl_panel.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, checkBox);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		sl_panel.putConstraint(SpringLayout.NORTH, lblState, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblState, 0, SpringLayout.WEST, checkBox);
		lblState.setVisible(false);
		panel.add(lblState);
		
		textField_4 = new JTextField();
		textField_4.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_4", textField_4.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.NORTH, textField_1);
		sl_panel.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField_3);
		textField_4.setVisible(false);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblZip = new JLabel("Zip");
		sl_panel.putConstraint(SpringLayout.NORTH, lblZip, 0, SpringLayout.NORTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.WEST, lblZip, 0, SpringLayout.WEST, checkBox);
		lblZip.setVisible(false);
		panel.add(lblZip);
		
		textField_5 = new JTextField();
		textField_5.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_5", textField_5.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_5, 0, SpringLayout.NORTH, textField_2);
		sl_panel.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, textField_3);
		textField_5.setVisible(false);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDebtor = new JLabel("Debtor");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDebtor, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblDebtor, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblDebtor);
		
		JLabel lblJointDebtor = new JLabel("Joint Debtor");
		sl_panel.putConstraint(SpringLayout.WEST, lblJointDebtor, 0, SpringLayout.WEST, checkBox);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblJointDebtor, 0, SpringLayout.SOUTH, lblDebtor);
		panel.add(lblJointDebtor);
		
		JLabel lblLastName = new JLabel("Last Name");
		sl_panel.putConstraint(SpringLayout.NORTH, lblLastName, 6, SpringLayout.SOUTH, lblDebtor);
		sl_panel.putConstraint(SpringLayout.WEST, lblLastName, 10, SpringLayout.WEST, panel);
		panel.add(lblLastName);
		
		textField_6 = new JTextField();
		textField_6.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("BitextField_6", textField_6.getText());
			}
		});
		
		sl_panel.putConstraint(SpringLayout.NORTH, textField_6, 6, SpringLayout.SOUTH, lblLastName);
		sl_panel.putConstraint(SpringLayout.WEST, textField_6, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("First");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 6, SpringLayout.SOUTH, textField_6);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblNewLabel_3);
		
		textField_7 = new JTextField();
		textField_7.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("BitextField_7", textField_7.getText());

			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_7, 6, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.WEST, textField_7, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblMiddle = new JLabel("Middle");
		sl_panel.putConstraint(SpringLayout.NORTH, lblMiddle, 6, SpringLayout.SOUTH, textField_7);
		sl_panel.putConstraint(SpringLayout.WEST, lblMiddle, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblMiddle);
		
		JLabel lblNewLabel_4 = new JLabel("SSN");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblNewLabel_4);
		
		textField_8 = new JTextField();
		textField_8.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_8", textField_8.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_8, 6, SpringLayout.SOUTH, lblNewLabel_4);
		sl_panel.putConstraint(SpringLayout.EAST, textField_8, 0, SpringLayout.EAST, textField);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_6", textField_9.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 6, SpringLayout.SOUTH, textField_9);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_9, 6, SpringLayout.SOUTH, lblMiddle);
		sl_panel.putConstraint(SpringLayout.WEST, textField_9, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblAddressstreetAnd = new JLabel("Address (street and no.)");
		sl_panel.putConstraint(SpringLayout.NORTH, lblAddressstreetAnd, 6, SpringLayout.SOUTH, textField_8);
		sl_panel.putConstraint(SpringLayout.WEST, lblAddressstreetAnd, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblAddressstreetAnd);
		
		textField_10 = new JTextField();
		textField_10.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_10", textField_10.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_10, 6, SpringLayout.SOUTH, lblAddressstreetAnd);
		sl_panel.putConstraint(SpringLayout.WEST, textField_10, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		sl_panel.putConstraint(SpringLayout.NORTH, lblCity, 6, SpringLayout.SOUTH, textField_10);
		sl_panel.putConstraint(SpringLayout.WEST, lblCity, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblCity);
		
		JLabel lblNewLabel_5 = new JLabel("State");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_5, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblNewLabel_5);
		
		JLabel lblZip_1 = new JLabel("Zip");
		sl_panel.putConstraint(SpringLayout.WEST, lblZip_1, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblZip_1);
		
		textField_11 = new JTextField();
		textField_11.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_11", textField_11.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 6, SpringLayout.SOUTH, textField_11);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_11, 6, SpringLayout.SOUTH, lblCity);
		sl_panel.putConstraint(SpringLayout.WEST, textField_11, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblCity_1 = new JLabel("City");
		lblCity_1.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, lblCity_1, 6, SpringLayout.SOUTH, textField);
		sl_panel.putConstraint(SpringLayout.WEST, lblCity_1, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(lblCity_1);
		
		textField_12 = new JTextField();
		textField_12.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_12", textField_12.getText());
			}
		});
		textField_12.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, textField_12, 0, SpringLayout.WEST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_12, -6, SpringLayout.NORTH, lblNewLabel_1);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblCity_2 = new JLabel("City");
		lblCity_2.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, lblCity_2, 6, SpringLayout.SOUTH, textField_3);
		sl_panel.putConstraint(SpringLayout.WEST, lblCity_2, 0, SpringLayout.WEST, checkBox);
		panel.add(lblCity_2);
		
		textField_13 = new JTextField();
		textField_13.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_13", textField_13.getText());
			}
		});
		textField_13.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_13, 0, SpringLayout.NORTH, textField_12);
		sl_panel.putConstraint(SpringLayout.WEST, textField_13, 0, SpringLayout.WEST, checkBox);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_14", textField_14.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, lblZip_1, 6, SpringLayout.SOUTH, textField_14);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_14, 6, SpringLayout.SOUTH, lblNewLabel_5);
		sl_panel.putConstraint(SpringLayout.WEST, textField_14, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_15", textField_15.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_15, 6, SpringLayout.SOUTH, lblZip_1);
		sl_panel.putConstraint(SpringLayout.WEST, textField_15, 0, SpringLayout.WEST, lblNewLabel);
		panel.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Last Name");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, checkBox);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_6, 0, SpringLayout.SOUTH, lblLastName);
		panel.add(lblNewLabel_6);
		
		textField_16 = new JTextField();
		textField_16.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_16", textField_16.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_16, 0, SpringLayout.NORTH, textField_6);
		sl_panel.putConstraint(SpringLayout.WEST, textField_16, 0, SpringLayout.WEST, checkBox);
		panel.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblFirst = new JLabel("First");
		sl_panel.putConstraint(SpringLayout.NORTH, lblFirst, 0, SpringLayout.NORTH, lblNewLabel_3);
		sl_panel.putConstraint(SpringLayout.WEST, lblFirst, 0, SpringLayout.WEST, checkBox);
		panel.add(lblFirst);
		
		textField_17 = new JTextField();
		textField_17.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_17", textField_17.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.WEST, textField_17, 0, SpringLayout.WEST, checkBox);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_17, 0, SpringLayout.SOUTH, textField_7);
		panel.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblMiddle_1 = new JLabel("Middle");
		sl_panel.putConstraint(SpringLayout.NORTH, lblMiddle_1, 0, SpringLayout.NORTH, lblMiddle);
		sl_panel.putConstraint(SpringLayout.WEST, lblMiddle_1, 0, SpringLayout.WEST, checkBox);
		panel.add(lblMiddle_1);
		
		textField_18 = new JTextField();
		textField_18.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_18", textField_18.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_18, 0, SpringLayout.NORTH, textField_9);
		sl_panel.putConstraint(SpringLayout.WEST, textField_18, 0, SpringLayout.WEST, checkBox);
		panel.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblSsn = new JLabel("SSN");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSsn, 0, SpringLayout.NORTH, lblNewLabel_4);
		sl_panel.putConstraint(SpringLayout.WEST, lblSsn, 0, SpringLayout.WEST, checkBox);
		panel.add(lblSsn);
		
		textField_19 = new JTextField();
		textField_19.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_19", textField_19.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_19, 0, SpringLayout.NORTH, textField_8);
		sl_panel.putConstraint(SpringLayout.WEST, textField_19, 0, SpringLayout.WEST, checkBox);
		panel.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblAddressstreetAndNo_1 = new JLabel("Address(street and no.)");
		sl_panel.putConstraint(SpringLayout.NORTH, lblAddressstreetAndNo_1, 0, SpringLayout.NORTH, lblAddressstreetAnd);
		sl_panel.putConstraint(SpringLayout.WEST, lblAddressstreetAndNo_1, 0, SpringLayout.WEST, checkBox);
		panel.add(lblAddressstreetAndNo_1);
		
		textField_20 = new JTextField();
		textField_20.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_20", textField_20.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_20, 0, SpringLayout.NORTH, textField_10);
		sl_panel.putConstraint(SpringLayout.WEST, textField_20, 0, SpringLayout.WEST, checkBox);
		panel.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblCity_3 = new JLabel("City");
		sl_panel.putConstraint(SpringLayout.NORTH, lblCity_3, 0, SpringLayout.NORTH, lblCity);
		sl_panel.putConstraint(SpringLayout.WEST, lblCity_3, 0, SpringLayout.WEST, checkBox);
		panel.add(lblCity_3);
		
		textField_21 = new JTextField();
		textField_21.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_21", textField_21.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_21, 0, SpringLayout.NORTH, textField_11);
		sl_panel.putConstraint(SpringLayout.WEST, textField_21, 0, SpringLayout.WEST, checkBox);
		panel.add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblState_1 = new JLabel("State");
		sl_panel.putConstraint(SpringLayout.NORTH, lblState_1, 0, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel.putConstraint(SpringLayout.WEST, lblState_1, 0, SpringLayout.WEST, checkBox);
		panel.add(lblState_1);
		
		textField_22 = new JTextField();
		textField_22.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_22", textField_22.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_22, 0, SpringLayout.NORTH, textField_14);
		sl_panel.putConstraint(SpringLayout.EAST, textField_22, 0, SpringLayout.EAST, textField_3);
		panel.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Zip");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 0, SpringLayout.NORTH, lblZip_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_7, 0, SpringLayout.WEST, checkBox);
		panel.add(lblNewLabel_7);
		
		textField_23 = new JTextField();
		textField_23.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("BitextField_23", textField_23.getText());
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, textField_23, 0, SpringLayout.NORTH, textField_15);
		sl_panel.putConstraint(SpringLayout.WEST, textField_23, 0, SpringLayout.WEST, checkBox);
		panel.add(textField_23);
		textField_23.setColumns(10);
		
		JButton btnAddAliases = new JButton("Add Aliases");
		btnAddAliases.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aliases.setVisible(true);
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnAddAliases, 0, SpringLayout.NORTH, textField_9);
		sl_panel.putConstraint(SpringLayout.WEST, btnAddAliases, 62, SpringLayout.EAST, textField_9);
		panel.add(btnAddAliases);
		
		JButton btnAddAliases_1 = new JButton("Add Aliases");
		btnAddAliases_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jAliases.setVisible(true);
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnAddAliases_1, 0, SpringLayout.NORTH, textField_9);
		sl_panel.putConstraint(SpringLayout.WEST, btnAddAliases_1, 42, SpringLayout.EAST, textField_18);
		panel.add(btnAddAliases_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Previous Bankruptcies", null, panel_1, null);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblListAnyBankruptcies = new JLabel("List any bankruptcies filed by Debtor or Joint Debtor (if applicable) within the previous 8 years");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblListAnyBankruptcies, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblListAnyBankruptcies, 10, SpringLayout.WEST, panel_1);
		panel_1.add(lblListAnyBankruptcies);
		
		JButton btnAddCase = new JButton("Add Case");
		btnAddCase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveVars();
				
				String varNameOne = "previousBkLocation" + Integer.toString(table.getRowCount());		
				String varNameTwo = "previousBkNumber" + Integer.toString(table.getRowCount());
				String varNameThree = "previousBkDate" + Integer.toString(table.getRowCount());

			
				bk.setVar(varNameOne, "");
				bk.setVar(varNameTwo, "");
				bk.setVar(varNameThree, "");

					
				loadTable();
			}
		});
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnAddCase, 6, SpringLayout.SOUTH, lblListAnyBankruptcies);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnAddCase, 0, SpringLayout.WEST, lblListAnyBankruptcies);
		panel_1.add(btnAddCase);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_panel_1.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, btnAddCase);
		sl_panel_1.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, scrollPane, -10, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, scrollPane, 769, SpringLayout.WEST, panel_1);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Location", "Case Number", "Date"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnRemoveCase = new JButton("Remove Case");
		btnRemoveCase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");
				}


				else{
					saveVars();
					
					String varNameOne = "previousBkLocation" + Integer.toString(table.getSelectedRow());
					String varNameTwo = "previousBkNumber" + Integer.toString(table.getSelectedRow());
					String varNameThree = "previousBkDate" + Integer.toString(table.getSelectedRow());
	
					bk.vars.remove(varNameOne);
					bk.vars.remove(varNameTwo);
					bk.vars.remove(varNameThree);
	
					
					if(table.getSelectedRow() != table.getRowCount()){				
						for(int i  = table.getSelectedRow(); i < table.getRowCount()-1; i++){
							bk.setVar("previousBkLocation" + Integer.toString(i), bk.vars.get("previousBkLocation" + Integer.toString(i+1)));
							bk.setVar("previousBkNumber" + Integer.toString(i), bk.vars.get("previousBkNumber" + Integer.toString(i+1)));
							bk.setVar("previousBkDate" + Integer.toString(i), bk.vars.get("previousBkDate" + Integer.toString(i+1)));
			
	
						}
					}
					bk.vars.remove("previousBkLocation" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("previousBkNumber" + Integer.toString(table.getRowCount()-1));
					bk.vars.remove("previousBkDate" + Integer.toString(table.getRowCount()-1));

	
				}
		
				loadTable();
			}
		});
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnRemoveCase, 6, SpringLayout.SOUTH, lblListAnyBankruptcies);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnRemoveCase, 6, SpringLayout.EAST, btnAddCase);
		panel_1.add(btnRemoveCase);
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		tabbedPane.addTab("Nature of Debtor", null, panel_2, null);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lblChapterOfBankruptcy = new JLabel("Chapter of Bankruptcy");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblChapterOfBankruptcy, 10, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblChapterOfBankruptcy, 10, SpringLayout.WEST, panel_2);
		panel_2.add(lblChapterOfBankruptcy);
		

		comboBox.addItem("");
		comboBox.addItem("Chapter 7");
		comboBox.addItem("Chapter 13");
		sl_panel_2.putConstraint(SpringLayout.NORTH, comboBox, 6, SpringLayout.SOUTH, lblChapterOfBankruptcy);
		sl_panel_2.putConstraint(SpringLayout.WEST, comboBox, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox, 119, SpringLayout.WEST, panel_2);
		panel_2.add(comboBox);
		
		JLabel lblTypeOfDebtor = new JLabel("Type of Debtor");
		sl_panel_2.putConstraint(SpringLayout.WEST, lblTypeOfDebtor, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(lblTypeOfDebtor);
		

		sl_panel_2.putConstraint(SpringLayout.NORTH, comboBox_1, 6, SpringLayout.SOUTH, lblTypeOfDebtor);
		sl_panel_2.putConstraint(SpringLayout.WEST, comboBox_1, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox_1, 250, SpringLayout.WEST, panel_2);

		comboBox_1.addItem("");
		comboBox_1.addItem("Individual (includes Joint Debtors)");
		panel_2.add(comboBox_1);
		
		JLabel lblNatureOfDebts = new JLabel("Nature of Debts");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNatureOfDebts, 6, SpringLayout.SOUTH, comboBox);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNatureOfDebts, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(lblNatureOfDebts);
		

		sl_panel_2.putConstraint(SpringLayout.NORTH, lblTypeOfDebtor, 6, SpringLayout.SOUTH, comboBox_2);
		sl_panel_2.putConstraint(SpringLayout.NORTH, comboBox_2, 6, SpringLayout.SOUTH, lblNatureOfDebts);
		sl_panel_2.putConstraint(SpringLayout.WEST, comboBox_2, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox_2, -529, SpringLayout.EAST, panel_2);

		comboBox_2.addItem("");
		comboBox_2.addItem("Consumer Debts: see 11 U.S.C. 101(8)");
		comboBox_2.addItem("Business Debts");
		panel_2.add(comboBox_2);
		
		JLabel lblNatureOfBusiness = new JLabel("Nature of Business");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNatureOfBusiness, 6, SpringLayout.SOUTH, comboBox_1);
		lblNatureOfBusiness.setVisible(false);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNatureOfBusiness, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(lblNatureOfBusiness);
		

		sl_panel_2.putConstraint(SpringLayout.NORTH, comboBox_3, 6, SpringLayout.SOUTH, lblNatureOfBusiness);
		sl_panel_2.putConstraint(SpringLayout.WEST, comboBox_3, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox_3, 0, SpringLayout.EAST, comboBox_1);
		comboBox_3.setVisible(false);
		panel_2.add(comboBox_3);
		
		JCheckBox chckbxDebtorIsA = new JCheckBox("Debtor is a Tax_Exempt Entity");
		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxDebtorIsA, 6, SpringLayout.SOUTH, comboBox_3);
		sl_panel_2.putConstraint(SpringLayout.EAST, chckbxDebtorIsA, -600, SpringLayout.EAST, panel_2);
		chckbxDebtorIsA.setVisible(false);
		panel_2.add(chckbxDebtorIsA);
		
		JLabel lblNewLabel_10 = new JLabel("Filing Fee");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_10, 0, SpringLayout.NORTH, lblChapterOfBankruptcy);
		panel_2.add(lblNewLabel_10);
		

		sl_panel_2.putConstraint(SpringLayout.WEST, comboBox_4, 206, SpringLayout.EAST, comboBox);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox_4, -102, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_10, 0, SpringLayout.WEST, comboBox_4);
		sl_panel_2.putConstraint(SpringLayout.NORTH, comboBox_4, 0, SpringLayout.NORTH, comboBox);

		comboBox_4.addItem("");
		comboBox_4.addItem("I am attaching the filing fee to this document");
		comboBox_4.addItem("I wish to pay the filing fee in installments (attach form 3A)");
		comboBox_4.addItem("I request a waiver of the filing fee (attach form 3B)");
		panel_2.add(comboBox_4);
		


		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxDebtorHasBeen, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(chckbxDebtorHasBeen);
		


		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxDebtorHasPossession, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(chckbxDebtorHasPossession);
		


		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxLandlordHasA, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(chckbxLandlordHasA);
		
		JLabel lblDebtorsWhoAre = new JLabel("Debtors who are tenants in residential property (check all that apply)");
		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxLandlordHasA, 6, SpringLayout.SOUTH, lblDebtorsWhoAre);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblDebtorsWhoAre, 10, SpringLayout.WEST, panel_2);
		panel_2.add(lblDebtorsWhoAre);
		


		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxDebtorClaimsJudgment, 6, SpringLayout.SOUTH, chckbxLandlordHasA);
		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxDebtorClaimsJudgment, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(chckbxDebtorClaimsJudgment);
		


		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_1, 6, SpringLayout.SOUTH, chckbxDebtorClaimsJudgment);
		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_1, 10, SpringLayout.WEST, panel_2);
		panel_2.add(chckbxNewCheckBox_1);
		


		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxDebtorCertifiesThat, 6, SpringLayout.SOUTH, chckbxNewCheckBox_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxDebtorCertifiesThat, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(chckbxDebtorCertifiesThat);
		


		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_2, 6, SpringLayout.SOUTH, chckbxDebtorHasPossession);
		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_2, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(chckbxNewCheckBox_2);
		
		JLabel lblAllDebtors = new JLabel("All Debtors (check any that apply):");
		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxDebtorHasPossession, 6, SpringLayout.SOUTH, lblAllDebtors);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblAllDebtors, 6, SpringLayout.SOUTH, chckbxDebtorIsA);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblAllDebtors, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(lblAllDebtors);
		


		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxDebtorHasBeen, 6, SpringLayout.SOUTH, chckbxJointDebtorHas);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblDebtorsWhoAre, 40, SpringLayout.SOUTH, chckbxJointDebtorHas);
		sl_panel_2.putConstraint(SpringLayout.NORTH, chckbxJointDebtorHas, 6, SpringLayout.SOUTH, chckbxNewCheckBox_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, chckbxJointDebtorHas, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		panel_2.add(chckbxJointDebtorHas);
		
		textField_42 = new JTextField();
		textField_42.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("textField_42", textField_42.getText());
			}
		});
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_42, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		textField_42.setVisible(false);
		panel_2.add(textField_42);
		textField_42.setColumns(10);
		
		JLabel lblLandlordsName = new JLabel("Landlord's name");
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_42, 6, SpringLayout.SOUTH, lblLandlordsName);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblLandlordsName, 55, SpringLayout.SOUTH, chckbxDebtorCertifiesThat);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblLandlordsName, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		lblLandlordsName.setVisible(false);
		panel_2.add(lblLandlordsName);
		
		JLabel lblLandlordsAddress = new JLabel("Landlord's address (street and no.)");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblLandlordsAddress, 6, SpringLayout.SOUTH, textField_42);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblLandlordsAddress, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		lblLandlordsAddress.setVisible(false);
		panel_2.add(lblLandlordsAddress);
		
		textField_43 = new JTextField();
		textField_43.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("textField_43", textField_43.getText());
			}
		});
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_42, 0, SpringLayout.EAST, textField_43);
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_43, 6, SpringLayout.SOUTH, lblLandlordsAddress);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_43, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_43, -474, SpringLayout.EAST, panel_2);
		textField_43.setVisible(false);
		panel_2.add(textField_43);
		textField_43.setColumns(10);
		
		JLabel lblCityStateZip = new JLabel("City, State, Zip");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblCityStateZip, 6, SpringLayout.SOUTH, textField_43);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblCityStateZip, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		lblCityStateZip.setVisible(false);
		panel_2.add(lblCityStateZip);
		
		textField_44 = new JTextField();
		textField_44.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("textField_44", textField_44.getText());
			}
		});
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_44, 6, SpringLayout.SOUTH, lblCityStateZip);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_44, 0, SpringLayout.WEST, lblChapterOfBankruptcy);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_44, 0, SpringLayout.EAST, textField_43);
		textField_44.setVisible(false);
		panel_2.add(textField_44);
		textField_44.setColumns(10);
		
		chckbxDebtorCertifiesThat.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxDebtorCertifiesThat.isSelected()){
					bk.setVar("chckbxDebtorCertifiesThat", "true");
				}
				
				else{
					bk.setVar("chckbxDebtorCertifiesThat", "false");
				}
			}
		});
		
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxNewCheckBox_1.isSelected()){
					bk.setVar("chckbxNewCheckBox_1", "true");
				}
				
				else{
					bk.setVar("chckbxNewCheckBox_1", "false");
				}
			}
		});
		
		chckbxLandlordHasA.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxLandlordHasA.isSelected()){
					bk.setVar("chckbxLandlordHasA", "true");
					lblLandlordsName.setVisible(true);
					lblCityStateZip.setVisible(true);
					lblLandlordsAddress.setVisible(true);
					textField_42.setVisible(true);
					textField_43.setVisible(true);
					textField_44.setVisible(true);
				}
				
				else{
					bk.setVar("chckbxLandlordHasA", "false");
					lblLandlordsName.setVisible(false);
					lblCityStateZip.setVisible(false);
					lblLandlordsAddress.setVisible(false);
					textField_42.setVisible(false);
					textField_43.setVisible(false);
					textField_44.setVisible(false);
				}
			}
		});
		
		chckbxDebtorHasPossession.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxDebtorHasPossession.isSelected()){
					bk.setVar("chckbxDebtorHasPossession", "true");
				}
				
				else{
					bk.setVar("chckbxDebtorHasPossession", "false");
				}
			
			}
		});
		
		chckbxDebtorClaimsJudgment.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxDebtorClaimsJudgment.isSelected()){
					bk.setVar("chckbxDebtorClaimsJudgment", "true");
				}
				
				else{
					bk.setVar("chckbxDebtorClaimsJudgment", "false");
				}
			}
		});
		
		chckbxNewCheckBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxNewCheckBox_2.isSelected()){
					bk.setVar("chckbxNewCheckBox_2", "true");
				}
				
				else{
					bk.setVar("chckbxNewCheckBox_2", "false");
				}
				
			}
		});
		
		chckbxJointDebtorHas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxJointDebtorHas.isSelected()){
					bk.setVar("chckbxJointDebtorHas", "true");
				}
				else{
					bk.setVar("chckbxJointDebtorHas", "false");
				}
			}
		});
		
		chckbxDebtorHasBeen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxDebtorHasBeen.isSelected()){
					bk.setVar("chckbxDebtorHasBeen", "true");
				}
				else{
					bk.setVar("chckbxDebtorHasBeen", "false");
				}
			}
		});
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().equals("Chapter 7")){
					bk.setVar("chapter", "Chapter 7");
				}
				else if(comboBox.getSelectedItem().equals("Chapter 13")){
					bk.setVar("chapter", "Chapter 13");
				}

			}
			
		});

		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox_2.getSelectedItem().equals("Consumer Debts: see 11 U.S.C. 101(8)")){
					bk.setVar("nature", "Consumer Debts: see 11 U.S.C. 101(8)");
				}
				else if(comboBox_2.getSelectedItem().equals("Business Debts")){
					bk.setVar("nature", "Business Debts");
				}
				
				
			}
		});
		
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox_1.getSelectedItem().equals("Individual (includes Joint Debtors)")){
					bk.setVar("type", "Individual (includes Joint Debtors)");
				}
				

			}
		});
		
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_4.getSelectedItem().equals("I am attaching the filing fee to this document")){
					bk.setVar("fee", "I am attaching the filing fee to this document");
				}
				
				else if (comboBox_4.getSelectedItem().equals("I wish to pay the filing fee in installments (attach form 3A)")){
					bk.setVar("fee", "I wish to pay the filing fee in installments (attach form 3A)");
				}
				
				else if (comboBox_4.getSelectedItem().equals("I request a waiver of the filing fee (attach form 3B)")){
					bk.setVar("fee", "I request a waiver of the filing fee (attach form 3B)");
				}
			}
		});
		
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(chckbxNewCheckBox.isSelected()){
					lblNewLabel.setVisible(true);
					textField.setVisible(true);
					lblNewLabel_1.setVisible(true);
					textField_1.setVisible(true);
					lblNewLabel_2.setVisible(true);
					textField_2.setVisible(true);
					lblCity_1.setVisible(true);
					textField_12.setVisible(true);
				}
				else{
					lblNewLabel.setVisible(false);
					textField.setVisible(false);
					lblNewLabel_1.setVisible(false);
					textField_1.setVisible(false);
					lblNewLabel_2.setVisible(false);
					textField_2.setVisible(false);
					lblCity_1.setVisible(false);
					textField_12.setVisible(false);
				}
			}
		});
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				loadVars(bk.vars);
			}
		});
		
		checkBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(checkBox.isSelected()){
					lblAddressstreetAndNo.setVisible(true);
					lblState.setVisible(true);
					lblZip.setVisible(true);
					textField_3.setVisible(true);
					textField_4.setVisible(true);
					textField_5.setVisible(true);
					lblCity_2.setVisible(true);
					textField_13.setVisible(true);
				}
				else{
					lblAddressstreetAndNo.setVisible(false);
					lblState.setVisible(false);
					lblZip.setVisible(false);
					textField_3.setVisible(false);
					textField_4.setVisible(false);
					textField_5.setVisible(false);
					lblCity_2.setVisible(false);
					textField_13.setVisible(false);
				}
			}
		});
		
		

	}

	public void saveVars(){
		BkFile bk = new BkFile();
		if(table.isEditing()){
			table.getCellEditor().stopCellEditing();
		}
		
		for(int i = 0; i < checkNumVars("previousBkLocation"); i++){
			bk.vars.remove("previousBkLocation"+Integer.toString(i));
			bk.vars.remove("previousBkNumber"+Integer.toString(i));
			bk.vars.remove("previousBkDate"+Integer.toString(i));

		}
		for(int i = 0; i < table.getRowCount(); i++){
			bk.setVar("previousBkLocation"+Integer.toString(i), (String)table.getValueAt(i, 0));
			bk.setVar("previousBkNumber"+Integer.toString(i), (String)table.getValueAt(i, 1));
			bk.setVar("previousBkDate"+Integer.toString(i), (String)table.getValueAt(i, 2));

		}
	}
	
	public void loadTable(){
		BkFile bk = new BkFile();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}

		int newRowCount = checkNumVars("previousBkLocation");		

		for(int i = 0; i < newRowCount; i++){
				model.addRow(new Object[] {bk.getField("previousBkLocation" + Integer.toString(i)), bk.getField("previousBkNumber" + Integer.toString(i)), bk.getField("previousBkDate" + Integer.toString(i))});
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
	
	public void loadVars(Map hash){
		BkFile bk = new BkFile();

		comboBox.setSelectedItem(bk.getField("chapter").toString());
		comboBox_2.setSelectedItem(bk.getField("nature").toString());
		comboBox_1.setSelectedItem(bk.getField("type").toString());
		comboBox_3.setSelectedItem(bk.getField("business").toString());
		comboBox_4.setSelectedItem(bk.getField("fee").toString());
		
		if(bk.getField("chckbxDebtorHasPossession").toString().equals("true")){
			chckbxDebtorHasPossession.setSelected(true);
		}
		
		if(bk.getField("chckbxNewCheckBox_2").toString().equals("true")){
			chckbxNewCheckBox_2.setSelected(true);
		}
		
		if(bk.getField("chckbxJointDebtorHas").toString().equals("true")){
			chckbxJointDebtorHas.setSelected(true);
		}
		
		if(bk.getField("chckbxDebtorHasBeen").toString().equals("true")){
			chckbxDebtorHasBeen.setSelected(true);
		}
		
		if(bk.getField("chckbxLandlordHasA").toString().equals("true")){
			chckbxLandlordHasA.setSelected(true);
		}
		
		if(bk.getField("chckbxDebtorClaimsJudgment").toString().equals("true")){
			chckbxDebtorClaimsJudgment.setSelected(true);
		}
		
		if(bk.getField("chckbxNewCheckBox_1").toString().equals("true")){
			chckbxNewCheckBox_1.setSelected(true);
		}
		
		if(bk.getField("chckbxDebtorCertifiesThat").toString().equals("true")){
			chckbxDebtorCertifiesThat.setSelected(true);
		}

		
	
		textField.setText(bk.getField(hash, "BitextField").toString());
		textField_1.setText(bk.getField(hash, "BitextField_1").toString());
		textField_2.setText(bk.getField(hash, "BitextField_2").toString());
		textField_3.setText(bk.getField(hash, "BitextField_3").toString());
		textField_4.setText(bk.getField(hash, "BitextField_4").toString());
		textField_5.setText(bk.getField(hash, "BitextField_5").toString());
		textField_6.setText(bk.getField(hash, "BitextField_6").toString());
		textField_7.setText(bk.getField(hash, "BitextField_7").toString());
		textField_8.setText(bk.getField(hash, "BitextField_8").toString());
		textField_9.setText(bk.getField(hash, "BitextField_9").toString());
		textField_10.setText(bk.getField(hash, "BitextField_10").toString());
		textField_11.setText(bk.getField(hash, "BitextField_11").toString());
		textField_12.setText(bk.getField(hash, "BitextField_12").toString());
		textField_13.setText(bk.getField(hash, "BitextField_13").toString());
		textField_14.setText(bk.getField(hash, "BitextField_14").toString());
		textField_15.setText(bk.getField(hash, "BitextField_15").toString());
		textField_16.setText(bk.getField(hash, "BitextField_16").toString());
		textField_17.setText(bk.getField(hash, "BitextField_17").toString());
		textField_18.setText(bk.getField(hash, "BitextField_18").toString());
		textField_19.setText(bk.getField(hash, "BitextField_19").toString());
		textField_20.setText(bk.getField(hash, "BitextField_20").toString());
		textField_21.setText(bk.getField(hash, "BitextField_21").toString());
		textField_22.setText(bk.getField(hash, "BitextField_22").toString());
		textField_23.setText(bk.getField(hash, "BitextField_23").toString());
		textField_42.setText(bk.getField(hash, "textField_42").toString());
		textField_43.setText(bk.getField(hash, "textField_43").toString());
		textField_44.setText(bk.getField(hash, "textField_44").toString());
	
	}
}

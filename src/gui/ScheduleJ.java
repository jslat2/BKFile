package gui;
import javax.swing.JFrame;

import java.awt.Rectangle;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.*;


import javax.swing.SpringLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.util.Map;




import data.BkFile;

import javax.swing.JTextArea;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
public class ScheduleJ extends JFrame{
	
	private JPanel panel_2 = new JPanel();
	private JButton btnAddDependent = new JButton("Add Dependent");
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
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JComboBox comboBox = new JComboBox();
	private JCheckBox chckbxYes = new JCheckBox("Yes. Does Debtor 2 live in a separate household?");
	private JCheckBox chckbxNo_2 = new JCheckBox("No");
	private JCheckBox chckbxNo_1 = new JCheckBox("No");
	private JCheckBox chckbxYes_1 = new JCheckBox("Yes");
	private JCheckBox chckbxYes_2 = new JCheckBox("Yes");
	private JCheckBox chckbxNo_3 = new JCheckBox("No");
	private JCheckBox chckbxNo_5 = new JCheckBox("No");
	private JCheckBox chckbxYesexplain = new JCheckBox("Yes (explain)");
	private JCheckBox chckbxNewCheckBox = new JCheckBox("Yes. Separate schedule J must be filed");
	private JCheckBox chckbxNo = new JCheckBox("No");
	
	
	
	private JComboBox comboBox_1 = new JComboBox();
	
	private JComboBox comboBox_2 = new JComboBox();
	private JComboBox comboBox_3 = new JComboBox();
	private JComboBox comboBox_4 = new JComboBox();
	
	private JComboBox comboBox_5 = new JComboBox();
	private JComboBox comboBox_6 = new JComboBox();
	private JComboBox comboBox_7 = new JComboBox();
	private JComboBox comboBox_8 = new JComboBox();
	private JComboBox comboBox_9 = new JComboBox();
	private JComboBox comboBox_10 = new JComboBox();
	private JComboBox comboBox_11 = new JComboBox();
	private JComboBox comboBox_12 = new JComboBox();
	private JComboBox comboBox_13 = new JComboBox();
	private JComboBox comboBox_14 = new JComboBox();
	private JComboBox comboBox_15 = new JComboBox();
	private JComboBox comboBox_16 = new JComboBox();
	private JComboBox comboBox_17 = new JComboBox();
	private JPanel panel_1;
	private JLabel lblMortgageOrRent;
	private JTextField textField_36;
	private JTextField textField_37;
	private JLabel lblRealEstateTaxes;
	private JLabel lblPropertyHomeownersOr;
	private JLabel lblHomeMaintenanceRepair;
	private JLabel lblHoaOrCondo;
	private JLabel lblAdditionalMortgagePayments;
	private JLabel lblElectricityHeatAnd;
	private JLabel lblWaterSewerAnd;
	private JLabel lblTelephoneSellInternet;
	private JLabel lblOther;
	private JLabel lblChildcareAndChildrens;
	private JLabel lblClothingLaundryDry;
	private JLabel lblPersonalCareProducts;
	private JLabel lblMedicalAndDental;
	private JLabel lblTransportation;
	private JLabel lblEntertainmentClubsRecreation;
	private JLabel lblCharitableContributions;
	private JLabel lblFoodAndHousekeeping;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JPanel panel_3;
	private JLabel lblInsurance_1;
	private JTextField textField_54;
	private JLabel lblLifeInsurance;
	private JLabel lblHealthInsurance;
	private JLabel lblVehicleInsurance;
	private JLabel lblOtherInsurancespecify;
	private JLabel lblTaxesspecify;
	private JLabel lblInstallmentOrLease;
	private JLabel lblCarPayment;
	private JLabel lblCarPayment_1;
	private JLabel lblOtherspecify;
	private JLabel lblOtherspecify_1;
	private JLabel lblAlimonySupportMaintenance;
	private JLabel lblPaymentsToSupport;
	private JLabel lblOtherRealProperty;
	private JLabel lblMortgages;
	private JLabel lblRealEstateTaxes_1;
	private JLabel lblPropertyHomeownersOr_1;
	private JLabel lblMaintenanceRepairAnd_1;
	private JLabel lblHoaOrCondo_1;
	private JLabel lblOtherspecify_2;
	private JLabel lblDoYouExpect;

	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextArea textArea_1;
	
	private BkFile bk = new BkFile();
	
	public ScheduleJ() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				loadVars(bk.vars);
			}
		});
		setBounds(new Rectangle(0, 0, 800, 1000));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, 952, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 774, SpringLayout.WEST, getContentPane());
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Household", null, panel, null);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		

		chckbxNo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(chckbxNo.isSelected()){
					bk.setVar("SjchckbxNo", "true");
				}
				else{
					bk.setVar("SjchckbxNo", "false");
				}
			}});
		panel.add(chckbxNo);
		
		JLabel lblIsThisA = new JLabel("Is This a Joint Case?");
		sl_panel.putConstraint(SpringLayout.WEST, lblIsThisA, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.NORTH, chckbxNo, 6, SpringLayout.SOUTH, lblIsThisA);
		sl_panel.putConstraint(SpringLayout.WEST, chckbxNo, 0, SpringLayout.WEST, lblIsThisA);
		sl_panel.putConstraint(SpringLayout.NORTH, lblIsThisA, 10, SpringLayout.NORTH, panel);
		panel.add(lblIsThisA);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, chckbxYes, 6, SpringLayout.SOUTH, chckbxNo);
		sl_panel.putConstraint(SpringLayout.WEST, chckbxYes, 0, SpringLayout.WEST, chckbxNo);
		chckbxYes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxYes.isSelected()){
					bk.setVar("SjchckbxYes", "true");
				}
				else{
					bk.setVar("SjchckbxYes", "false");
				}
			}
		});
		panel.add(chckbxYes);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, chckbxNo_1, 6, SpringLayout.SOUTH, chckbxYes);
		sl_panel.putConstraint(SpringLayout.WEST, chckbxNo_1, 29, SpringLayout.WEST, panel);
		chckbxNo_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxNo_1.isSelected()){
					bk.setVar("SjchckbxNo_1", "true");
				}
				else{
					bk.setVar("SjchckbxNo_1", "false");
				}
			}
		});
		panel.add(chckbxNo_1);
		

		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(chckbxNewCheckBox.isSelected()){
					tabbedPane.setEnabledAt(2, true);
					bk.setVar("SjchckbxNewCheckBox", "true");
				}
				else{
					tabbedPane.setEnabledAt(2, false);
					bk.setVar("SjchckbxNewCheckBox", "false");
				}
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 6, SpringLayout.SOUTH, chckbxNo_1);
		sl_panel.putConstraint(SpringLayout.WEST, chckbxNewCheckBox, 0, SpringLayout.WEST, chckbxNo_1);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblDoYouHave = new JLabel("Do you have dependents?");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDoYouHave, 6, SpringLayout.SOUTH, chckbxNewCheckBox);
		sl_panel.putConstraint(SpringLayout.WEST, lblDoYouHave, 0, SpringLayout.WEST, chckbxNo);
		panel.add(lblDoYouHave);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, chckbxNo_2, 6, SpringLayout.SOUTH, lblDoYouHave);
		sl_panel.putConstraint(SpringLayout.WEST, chckbxNo_2, 0, SpringLayout.WEST, chckbxNo);
		chckbxNo_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxNo_2.isSelected()){
					bk.setVar("SjchckbxNo_2", "true");
				}
				else{
					bk.setVar("SjchckbxNo_2", "false");
				}
			}
		});
		panel.add(chckbxNo_2);
		
		
		chckbxYes_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxYes_1.isSelected()){
					btnAddDependent.setVisible(true);
					bk.setVar("SjchckbxYes_1", "true");
				}
				else{
					btnAddDependent.setVisible(false);
					bk.setVar("SjchckbxYes_1", "false");
				}
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, chckbxYes_1, 6, SpringLayout.SOUTH, chckbxNo_2);
		sl_panel.putConstraint(SpringLayout.WEST, chckbxYes_1, 0, SpringLayout.WEST, chckbxNo);
		panel.add(chckbxYes_1);
		
		JLabel lblDoYourExpenses = new JLabel("Do your expenses include expenses of");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDoYourExpenses, 0, SpringLayout.NORTH, lblIsThisA);
		sl_panel.putConstraint(SpringLayout.WEST, lblDoYourExpenses, 220, SpringLayout.EAST, lblIsThisA);
		panel.add(lblDoYourExpenses);
		
		JLabel lblPeopleOtherThan = new JLabel("people other than yourself and your dependents?");
		sl_panel.putConstraint(SpringLayout.NORTH, lblPeopleOtherThan, 4, SpringLayout.NORTH, chckbxNo);
		sl_panel.putConstraint(SpringLayout.WEST, lblPeopleOtherThan, 0, SpringLayout.WEST, lblDoYourExpenses);
		panel.add(lblPeopleOtherThan);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, chckbxYes_2, 0, SpringLayout.NORTH, chckbxYes);
		sl_panel.putConstraint(SpringLayout.WEST, chckbxYes_2, 0, SpringLayout.WEST, lblDoYourExpenses);
		chckbxYes_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxYes_2.isSelected()){
					bk.setVar("SjchckbxYes_2", "true");
				}
				else{
					bk.setVar("SjchckbxYes_2", "false");
				}
			}
		});
		panel.add(chckbxYes_2);
		

		sl_panel.putConstraint(SpringLayout.NORTH, chckbxNo_3, 0, SpringLayout.NORTH, chckbxNo_1);
		sl_panel.putConstraint(SpringLayout.WEST, chckbxNo_3, 0, SpringLayout.WEST, lblDoYourExpenses);
		chckbxNo_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxNo_3.isSelected()){
					bk.setVar("SjchckbxNo_3", "true");
				}
				else{
					bk.setVar("SjchckbxNo_3", "false");
				}
			}
		});
		panel.add(chckbxNo_3);
		btnAddDependent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!comboBox.isVisible()){
					comboBox.setVisible(true);
					textField.setVisible(true);
					textField_1.setVisible(true);
				}
				
				else if(!comboBox_1.isVisible()){
					comboBox_1.setVisible(true);
					textField_2.setVisible(true);
					textField_3.setVisible(true);
				}
				
				else if(!comboBox_2.isVisible()){
					comboBox_2.setVisible(true);
					textField_4.setVisible(true);
					textField_5.setVisible(true);
				}
				
				else if(!comboBox_3.isVisible()){
					comboBox_3.setVisible(true);
					textField_6.setVisible(true);
					textField_7.setVisible(true);
				}
				
				else if(!comboBox_4.isVisible()){
					comboBox_4.setVisible(true);
					textField_8.setVisible(true);
					textField_9.setVisible(true);
				}
				
				else if(!comboBox_5.isVisible()){
					comboBox_5.setVisible(true);
					textField_10.setVisible(true);
					textField_11.setVisible(true);
				}
				
				else if(!comboBox_6.isVisible()){
					comboBox_6.setVisible(true);
					textField_12.setVisible(true);
					textField_13.setVisible(true);
				}
				
				else if(!comboBox_7.isVisible()){
					comboBox_7.setVisible(true);
					textField_14.setVisible(true);
					textField_15.setVisible(true);
				}
				
				else if(!comboBox_8.isVisible()){
					comboBox_8.setVisible(true);
					textField_16.setVisible(true);
					textField_17.setVisible(true);
				}
				
				else if(!comboBox_9.isVisible()){
					comboBox_9.setVisible(true);
					textField_18.setVisible(true);
					textField_19.setVisible(true);
				}
				
				else if(!comboBox_10.isVisible()){
					comboBox_10.setVisible(true);
					textField_20.setVisible(true);
					textField_21.setVisible(true);
				}
				
				else if(!comboBox_11.isVisible()){
					comboBox_11.setVisible(true);
					textField_22.setVisible(true);
					textField_23.setVisible(true);
				}
				
				else if(!comboBox_12.isVisible()){
					comboBox_12.setVisible(true);
					textField_24.setVisible(true);
					textField_25.setVisible(true);
				}
				
				else if(!comboBox_13.isVisible()){
					comboBox_13.setVisible(true);
					textField_26.setVisible(true);
					textField_27.setVisible(true);
				}
				
				else if(!comboBox_14.isVisible()){
					comboBox_14.setVisible(true);
					textField_28.setVisible(true);
					textField_29.setVisible(true);
				}
				
				else if(!comboBox_15.isVisible()){
					comboBox_15.setVisible(true);
					textField_30.setVisible(true);
					textField_31.setVisible(true);
				}
				
				else if(!comboBox_16.isVisible()){
					comboBox_16.setVisible(true);
					textField_32.setVisible(true);
					textField_33.setVisible(true);
				}
				
				else if(!comboBox_17.isVisible()){
					comboBox_17.setVisible(true);
					textField_34.setVisible(true);
					textField_35.setVisible(true);
				}
			}
		});
		

		btnAddDependent.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, btnAddDependent, 6, SpringLayout.SOUTH, chckbxYes_1);
		sl_panel.putConstraint(SpringLayout.WEST, btnAddDependent, 0, SpringLayout.WEST, chckbxNo);
		panel.add(btnAddDependent);
		
		JLabel lblDependentsRelationshipTo = new JLabel("Dependent's relationship to Debtor (or Codebtor)");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDependentsRelationshipTo, 30, SpringLayout.SOUTH, btnAddDependent);
		sl_panel.putConstraint(SpringLayout.WEST, lblDependentsRelationshipTo, 0, SpringLayout.WEST, chckbxNo);
		panel.add(lblDependentsRelationshipTo);
		
		JLabel lblDependentsAge = new JLabel("Dependent's age");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDependentsAge, 0, SpringLayout.NORTH, lblDependentsRelationshipTo);
		sl_panel.putConstraint(SpringLayout.WEST, lblDependentsAge, 52, SpringLayout.EAST, lblDependentsRelationshipTo);
		panel.add(lblDependentsAge);
		
		JLabel lblDoesDependentLive = new JLabel("Does dependent live with you?");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDoesDependentLive, 0, SpringLayout.NORTH, lblDependentsRelationshipTo);
		panel.add(lblDoesDependentLive);
		
		textField = new JTextField();
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			}
		});

		textField.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, lblDependentsRelationshipTo);
		sl_panel.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField, -45, SpringLayout.EAST, chckbxNewCheckBox);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblDependentsAge);
		sl_panel.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		comboBox_1.setVisible(false);

		comboBox.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, lblDoesDependentLive, 0, SpringLayout.WEST, comboBox);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 0, SpringLayout.NORTH, textField_1);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 51, SpringLayout.EAST, textField_1);
		comboBox.setSize(new Dimension(28, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		panel.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2, 6, SpringLayout.SOUTH, textField);
		sl_panel.putConstraint(SpringLayout.WEST, textField_2, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_3, 6, SpringLayout.SOUTH, textField_1);
		sl_panel.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_3);
		textField_3.setColumns(10);
		


		sl_panel.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, comboBox_1);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_1, 0, SpringLayout.NORTH, textField_2);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_1, 51, SpringLayout.EAST, textField_3);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		panel.add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_4, 6, SpringLayout.SOUTH, textField_2);
		sl_panel.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_5, 6, SpringLayout.SOUTH, textField_3);
		sl_panel.putConstraint(SpringLayout.WEST, textField_5, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_6, 6, SpringLayout.SOUTH, textField_4);
		sl_panel.putConstraint(SpringLayout.WEST, textField_6, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, textField);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_7, 6, SpringLayout.SOUTH, textField_5);
		sl_panel.putConstraint(SpringLayout.WEST, textField_7, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_8, 6, SpringLayout.SOUTH, textField_6);
		sl_panel.putConstraint(SpringLayout.WEST, textField_8, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_8, 0, SpringLayout.EAST, textField);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_9, 6, SpringLayout.SOUTH, textField_7);
		sl_panel.putConstraint(SpringLayout.WEST, textField_9, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_10, 6, SpringLayout.SOUTH, textField_8);
		sl_panel.putConstraint(SpringLayout.WEST, textField_10, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_10, 0, SpringLayout.EAST, textField);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_11, 6, SpringLayout.SOUTH, textField_9);
		sl_panel.putConstraint(SpringLayout.WEST, textField_11, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_12, 6, SpringLayout.SOUTH, textField_10);
		sl_panel.putConstraint(SpringLayout.WEST, textField_12, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_12, 0, SpringLayout.EAST, textField);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_13, 6, SpringLayout.SOUTH, textField_11);
		sl_panel.putConstraint(SpringLayout.WEST, textField_13, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_14, 6, SpringLayout.SOUTH, textField_12);
		sl_panel.putConstraint(SpringLayout.WEST, textField_14, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_14, 0, SpringLayout.EAST, textField);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_15, 6, SpringLayout.SOUTH, textField_13);
		sl_panel.putConstraint(SpringLayout.WEST, textField_15, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_16, 6, SpringLayout.SOUTH, textField_14);
		sl_panel.putConstraint(SpringLayout.WEST, textField_16, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_16, 0, SpringLayout.EAST, textField);
		panel.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_17, 6, SpringLayout.SOUTH, textField_15);
		sl_panel.putConstraint(SpringLayout.WEST, textField_17, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_18, 6, SpringLayout.SOUTH, textField_16);
		sl_panel.putConstraint(SpringLayout.WEST, textField_18, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_18, 0, SpringLayout.EAST, textField);
		panel.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_19, 6, SpringLayout.SOUTH, textField_17);
		sl_panel.putConstraint(SpringLayout.WEST, textField_19, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_20, 6, SpringLayout.SOUTH, textField_18);
		sl_panel.putConstraint(SpringLayout.WEST, textField_20, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_20, 0, SpringLayout.EAST, textField);
		panel.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_21, 6, SpringLayout.SOUTH, textField_19);
		sl_panel.putConstraint(SpringLayout.WEST, textField_21, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_22, 6, SpringLayout.SOUTH, textField_20);
		sl_panel.putConstraint(SpringLayout.WEST, textField_22, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_22, 0, SpringLayout.EAST, textField);
		panel.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_23, 6, SpringLayout.SOUTH, textField_21);
		sl_panel.putConstraint(SpringLayout.WEST, textField_23, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, textField_24, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_24, 0, SpringLayout.EAST, textField);
		panel.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_24, 0, SpringLayout.NORTH, textField_25);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_25, 6, SpringLayout.SOUTH, textField_23);
		sl_panel.putConstraint(SpringLayout.WEST, textField_25, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_26, 6, SpringLayout.SOUTH, textField_24);
		sl_panel.putConstraint(SpringLayout.WEST, textField_26, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_26, 0, SpringLayout.EAST, textField);
		panel.add(textField_26);
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_27, 6, SpringLayout.SOUTH, textField_25);
		sl_panel.putConstraint(SpringLayout.WEST, textField_27, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_28, 6, SpringLayout.SOUTH, textField_26);
		sl_panel.putConstraint(SpringLayout.WEST, textField_28, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_28, 0, SpringLayout.EAST, textField);
		panel.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_29, 6, SpringLayout.SOUTH, textField_27);
		sl_panel.putConstraint(SpringLayout.WEST, textField_29, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_29);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_30, 6, SpringLayout.SOUTH, textField_28);
		sl_panel.putConstraint(SpringLayout.WEST, textField_30, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_30, 0, SpringLayout.EAST, textField);
		panel.add(textField_30);
		textField_30.setColumns(10);
		
		textField_31 = new JTextField();
		textField_31.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_31, 6, SpringLayout.SOUTH, textField_29);
		sl_panel.putConstraint(SpringLayout.WEST, textField_31, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_31);
		textField_31.setColumns(10);
		
		textField_32 = new JTextField();
		textField_32.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_32, 6, SpringLayout.SOUTH, textField_30);
		sl_panel.putConstraint(SpringLayout.WEST, textField_32, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_32, 0, SpringLayout.EAST, textField);
		panel.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_33, 6, SpringLayout.SOUTH, textField_31);
		sl_panel.putConstraint(SpringLayout.WEST, textField_33, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_34, 6, SpringLayout.SOUTH, textField_32);
		sl_panel.putConstraint(SpringLayout.WEST, textField_34, 0, SpringLayout.WEST, chckbxNo);
		sl_panel.putConstraint(SpringLayout.EAST, textField_34, 0, SpringLayout.EAST, textField);
		panel.add(textField_34);
		textField_34.setColumns(10);
		
		textField_35 = new JTextField();
		textField_35.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_35, 6, SpringLayout.SOUTH, textField_33);
		sl_panel.putConstraint(SpringLayout.WEST, textField_35, 0, SpringLayout.WEST, lblDependentsAge);
		panel.add(textField_35);
		textField_35.setColumns(10);
		

		comboBox_2.setVisible(false);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, comboBox_2);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_2, 0, SpringLayout.NORTH, textField_4);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_2, 51, SpringLayout.EAST, textField_5);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		panel.add(comboBox_2);
		

		comboBox_3.setVisible(false);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_2, 0, SpringLayout.EAST, comboBox_3);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_3, 0, SpringLayout.NORTH, textField_6);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_3, 51, SpringLayout.EAST, textField_7);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		panel.add(comboBox_3);
		
	
		comboBox_4.setVisible(false);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_3, 0, SpringLayout.EAST, comboBox_4);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_4, 0, SpringLayout.NORTH, textField_8);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_4, 51, SpringLayout.EAST, textField_9);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		panel.add(comboBox_4);
		

		comboBox_5.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_5, 51, SpringLayout.EAST, textField_11);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_5, 0, SpringLayout.NORTH, textField_10);
		panel.add(comboBox_5);
		
	
		comboBox_6.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_6, 51, SpringLayout.EAST, textField_13);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_6, 0, SpringLayout.NORTH, textField_12);
		panel.add(comboBox_6);
		
	
		comboBox_7.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_7, 51, SpringLayout.EAST, textField_15);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_7, 0, SpringLayout.NORTH, textField_14);
		panel.add(comboBox_7);
		

		comboBox_8.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_8, 51, SpringLayout.EAST, textField_17);
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_8, 0, SpringLayout.NORTH, textField_16);
		panel.add(comboBox_8);
		
	
		comboBox_9.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_9, 51, SpringLayout.EAST, textField_19);
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_9, 0, SpringLayout.NORTH, textField_18);
		panel.add(comboBox_9);
		
	
		comboBox_10.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_10, 51, SpringLayout.EAST, textField_21);
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_10, 0, SpringLayout.NORTH, textField_20);
		panel.add(comboBox_10);
		
	
		comboBox_11.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_11, 51, SpringLayout.EAST, textField_23);
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_11, 0, SpringLayout.NORTH, textField_22);
		panel.add(comboBox_11);
		
	
		comboBox_12.setVisible(false);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_12, 6, SpringLayout.SOUTH, comboBox_11);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_12, 51, SpringLayout.EAST, textField_25);
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		panel.add(comboBox_12);
		
	
		comboBox_13.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_13, 51, SpringLayout.EAST, textField_27);
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_13, 0, SpringLayout.NORTH, textField_26);
		panel.add(comboBox_13);
		
	
		comboBox_14.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_14, 51, SpringLayout.EAST, textField_29);
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_14, 0, SpringLayout.NORTH, textField_28);
		panel.add(comboBox_14);
		
	
		comboBox_15.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_15, 51, SpringLayout.EAST, textField_31);
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_15, 0, SpringLayout.NORTH, textField_30);
		panel.add(comboBox_15);
		
	
		comboBox_16.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_16, 51, SpringLayout.EAST, textField_33);
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_16, 0, SpringLayout.NORTH, textField_32);
		panel.add(comboBox_16);
		
	
		comboBox_17.setVisible(false);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_17, 51, SpringLayout.EAST, textField_35);
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_17, 0, SpringLayout.NORTH, textField_34);
		panel.add(comboBox_17);
		panel_2.setVisible(false);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Expenses", null, panel_1, null);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("left:max(171dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(13dlu;default):grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(30dlu;default)"),}));
		
		lblMortgageOrRent = new JLabel("Mortgage or rent");
		panel_1.add(lblMortgageOrRent, "4, 4");
		
		textField_36 = new JTextField();
		panel_1.add(textField_36, "22, 4, left, default");
		textField_36.setColumns(10);
		
		lblRealEstateTaxes = new JLabel("Real estate taxes");
		panel_1.add(lblRealEstateTaxes, "4, 6");
		
		textField_37 = new JTextField();
		panel_1.add(textField_37, "22, 6, left, default");
		textField_37.setColumns(10);
		
		lblPropertyHomeownersOr = new JLabel("Property, homeowner's or renter's insurance");
		panel_1.add(lblPropertyHomeownersOr, "4, 8");
		
		textField_38 = new JTextField();
		panel_1.add(textField_38, "22, 8, left, default");
		textField_38.setColumns(10);
		
		lblHomeMaintenanceRepair = new JLabel("Home maintenance, repair, and upkeep");
		panel_1.add(lblHomeMaintenanceRepair, "4, 10");
		
		textField_39 = new JTextField();
		panel_1.add(textField_39, "22, 10, left, default");
		textField_39.setColumns(10);
		
		lblHoaOrCondo = new JLabel("Hoa or condo dues");
		panel_1.add(lblHoaOrCondo, "4, 12");
		
		textField_40 = new JTextField();
		panel_1.add(textField_40, "22, 12, left, default");
		textField_40.setColumns(10);
		
		lblAdditionalMortgagePayments = new JLabel("Additional mortgage payments (if second mortgage)");
		panel_1.add(lblAdditionalMortgagePayments, "4, 14");
		
		textField_41 = new JTextField();
		panel_1.add(textField_41, "22, 14, left, default");
		textField_41.setColumns(10);
		
		lblElectricityHeatAnd = new JLabel("Electricity, heat, and natural gas");
		panel_1.add(lblElectricityHeatAnd, "4, 16");
		
		textField_42 = new JTextField();
		panel_1.add(textField_42, "22, 16, left, default");
		textField_42.setColumns(10);
		
		lblWaterSewerAnd = new JLabel("Water, sewer, and garbage collection");
		panel_1.add(lblWaterSewerAnd, "4, 18");
		
		textField_43 = new JTextField();
		panel_1.add(textField_43, "22, 18, left, default");
		textField_43.setColumns(10);
		
		lblTelephoneSellInternet = new JLabel("Telephone, sell, internet, satellite, cable");
		panel_1.add(lblTelephoneSellInternet, "4, 20");
		
		textField_44 = new JTextField();
		panel_1.add(textField_44, "22, 20, left, default");
		textField_44.setColumns(10);
		
		lblOther = new JLabel("Other (specify)");
		panel_1.add(lblOther, "4, 22, left, default");
		
		textField_54 = new JTextField();
		panel_1.add(textField_54, "6, 22, left, default");
		textField_54.setColumns(10);
		
		textField_45 = new JTextField();
		panel_1.add(textField_45, "22, 22, left, default");
		textField_45.setColumns(10);
		
		lblFoodAndHousekeeping = new JLabel("Food and housekeeping supplies");
		panel_1.add(lblFoodAndHousekeeping, "4, 24");
		
		textField_46 = new JTextField();
		panel_1.add(textField_46, "22, 24, left, default");
		textField_46.setColumns(10);
		
		lblChildcareAndChildrens = new JLabel("Childcare and children's education");
		panel_1.add(lblChildcareAndChildrens, "4, 26");
		
		textField_47 = new JTextField();
		panel_1.add(textField_47, "22, 26, left, default");
		textField_47.setColumns(10);
		
		lblClothingLaundryDry = new JLabel("Clothing, laundry, dry cleaning");
		panel_1.add(lblClothingLaundryDry, "4, 28");
		
		textField_48 = new JTextField();
		panel_1.add(textField_48, "22, 28, left, default");
		textField_48.setColumns(10);
		
		lblPersonalCareProducts = new JLabel("Personal care products and services");
		panel_1.add(lblPersonalCareProducts, "4, 30");
		
		textField_49 = new JTextField();
		panel_1.add(textField_49, "22, 30, left, default");
		textField_49.setColumns(10);
		
		lblMedicalAndDental = new JLabel("Medical and dental expenses");
		panel_1.add(lblMedicalAndDental, "4, 32");
		
		textField_50 = new JTextField();
		panel_1.add(textField_50, "22, 32, left, default");
		textField_50.setColumns(10);
		
		lblTransportation = new JLabel("Transportation");
		panel_1.add(lblTransportation, "4, 34");
		
		textField_51 = new JTextField();
		panel_1.add(textField_51, "22, 34, left, default");
		textField_51.setColumns(10);
		
		lblEntertainmentClubsRecreation = new JLabel("Entertainment, clubs, recreation");
		panel_1.add(lblEntertainmentClubsRecreation, "4, 36");
		
		textField_52 = new JTextField();
		panel_1.add(textField_52, "22, 36, left, default");
		textField_52.setColumns(10);
		
		lblCharitableContributions = new JLabel("Charitable contributions");
		panel_1.add(lblCharitableContributions, "4, 38");
		
		textField_53 = new JTextField();
		panel_1.add(textField_53, "22, 38, left, default");
		textField_53.setColumns(10);
		textField_36.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_36", textField_36.getText());
		}});
		textField_37.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_37", textField_37.getText());
		}});
		textField_38.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_38", textField_38.getText());
		}});
		textField_39.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_39", textField_39.getText());
		}});
		textField_40.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_40", textField_40.getText());
		}});
		textField_41.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_41", textField_41.getText());
		}});
		textField_42.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_42", textField_42.getText());
		}});
		textField_43.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_43", textField_43.getText());
		}});
		textField_44.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_44", textField_44.getText());
		}});
		textField_45.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_45", textField_45.getText());
		}});
		textField_46.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_46", textField_46.getText());
		}});
		textField_47.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_47", textField_47.getText());
		}});
		textField_48.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_48", textField_48.getText());
		}});
		textField_49.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_49", textField_49.getText());
		}});
		textField_50.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_50", textField_50.getText());
		}});
		textField_51.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_51", textField_51.getText());
		}});
		textField_52.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_52", textField_52.getText());
		}});
		textField_53.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_53", textField_53.getText());
		}});
		textField_54.addCaretListener(new CaretListener() {
		public void caretUpdate(CaretEvent arg0) {
		bk.setVar("SjtextField_54", textField_54.getText());
		}});
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Expenses (continued)", null, panel_3, null);
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(102dlu;default):grow"),}));
		
		lblInsurance_1 = new JLabel("Insurance");
		panel_3.add(lblInsurance_1, "4, 4");
		
		textField_55 = new JTextField();
		panel_3.add(textField_55, "14, 4, left, default");
		textField_55.setColumns(10);
		
		lblLifeInsurance = new JLabel("Life Insurance");
		panel_3.add(lblLifeInsurance, "4, 6");
		
		textField_56 = new JTextField();
		panel_3.add(textField_56, "14, 6, left, default");
		textField_56.setColumns(10);
		
		lblHealthInsurance = new JLabel("Health insurance");
		panel_3.add(lblHealthInsurance, "4, 8");
		
		textField_57 = new JTextField();
		panel_3.add(textField_57, "14, 8, left, default");
		textField_57.setColumns(10);
		
		lblVehicleInsurance = new JLabel("Vehicle insurance");
		panel_3.add(lblVehicleInsurance, "4, 10");
		
		textField_58 = new JTextField();
		panel_3.add(textField_58, "14, 10, left, default");
		textField_58.setColumns(10);
		
		lblOtherInsurancespecify = new JLabel("Other insurance (specify)");
		panel_3.add(lblOtherInsurancespecify, "4, 12");
		
		textField_73 = new JTextField();
		panel_3.add(textField_73, "8, 12, left, default");
		textField_73.setColumns(10);
		
		textField_59 = new JTextField();
		panel_3.add(textField_59, "14, 12, left, default");
		textField_59.setColumns(10);
		
		lblTaxesspecify = new JLabel("Taxes (specify)");
		panel_3.add(lblTaxesspecify, "4, 14");
		
		textField_74 = new JTextField();
		panel_3.add(textField_74, "8, 14, left, default");
		textField_74.setColumns(10);
		
		textField_60 = new JTextField();
		panel_3.add(textField_60, "14, 14, left, default");
		textField_60.setColumns(10);
		
		lblInstallmentOrLease = new JLabel("Installment or lease payments");
		panel_3.add(lblInstallmentOrLease, "4, 16");
		
		lblCarPayment = new JLabel("Car payment 1");
		panel_3.add(lblCarPayment, "4, 18");
		
		textField_61 = new JTextField();
		panel_3.add(textField_61, "14, 18, left, default");
		textField_61.setColumns(10);
		
		lblCarPayment_1 = new JLabel("Car payment 2");
		panel_3.add(lblCarPayment_1, "4, 20");
		
		textField_62 = new JTextField();
		panel_3.add(textField_62, "14, 20, left, default");
		textField_62.setColumns(10);
		
		lblOtherspecify = new JLabel("Other (specify)");
		panel_3.add(lblOtherspecify, "4, 22");
		
		textField_75 = new JTextField();
		panel_3.add(textField_75, "8, 22, left, default");
		textField_75.setColumns(10);
		
		textField_63 = new JTextField();
		panel_3.add(textField_63, "14, 22, left, default");
		textField_63.setColumns(10);
		
		lblOtherspecify_1 = new JLabel("Other (specify)");
		panel_3.add(lblOtherspecify_1, "4, 24");
		
		textField_76 = new JTextField();
		panel_3.add(textField_76, "8, 24, left, default");
		textField_76.setColumns(10);
		
		textField_64 = new JTextField();
		panel_3.add(textField_64, "14, 24, left, default");
		textField_64.setColumns(10);
		
		lblAlimonySupportMaintenance = new JLabel("Alimony, support, maintenance");
		panel_3.add(lblAlimonySupportMaintenance, "4, 26");
		
		textField_65 = new JTextField();
		panel_3.add(textField_65, "14, 26, left, default");
		textField_65.setColumns(10);
		
		lblPaymentsToSupport = new JLabel("Payments to support others not living with you");
		panel_3.add(lblPaymentsToSupport, "4, 28");
		
		textField_66 = new JTextField();
		panel_3.add(textField_66, "14, 28, left, default");
		textField_66.setColumns(10);
		
		lblOtherRealProperty = new JLabel("Other real property expenses not already included");
		panel_3.add(lblOtherRealProperty, "4, 30");
		
		lblMortgages = new JLabel("Mortgages");
		panel_3.add(lblMortgages, "4, 32");
		
		textField_67 = new JTextField();
		panel_3.add(textField_67, "14, 32, left, default");
		textField_67.setColumns(10);
		
		lblRealEstateTaxes_1 = new JLabel("Real estate taxes");
		panel_3.add(lblRealEstateTaxes_1, "4, 34");
		
		textField_68 = new JTextField();
		panel_3.add(textField_68, "14, 34, left, default");
		textField_68.setColumns(10);
		
		lblPropertyHomeownersOr_1 = new JLabel("Property, homeowner's or renter's insurance");
		panel_3.add(lblPropertyHomeownersOr_1, "4, 36");
		
		textField_69 = new JTextField();
		panel_3.add(textField_69, "14, 36, left, default");
		textField_69.setColumns(10);
		
		lblMaintenanceRepairAnd_1 = new JLabel("Maintenance, repair and upkeep");
		panel_3.add(lblMaintenanceRepairAnd_1, "4, 38");
		
		textField_70 = new JTextField();
		panel_3.add(textField_70, "14, 38, left, default");
		textField_70.setColumns(10);
		
		lblHoaOrCondo_1 = new JLabel("Hoa or condo dues");
		panel_3.add(lblHoaOrCondo_1, "4, 40");
		
		textField_71 = new JTextField();
		panel_3.add(textField_71, "14, 40, left, default");
		textField_71.setColumns(10);
		
		lblOtherspecify_2 = new JLabel("Other (specify)");
		panel_3.add(lblOtherspecify_2, "4, 42");
		
		textField_77 = new JTextField();
		panel_3.add(textField_77, "8, 42, left, default");
		textField_77.setColumns(10);
		
		textField_72 = new JTextField();
		panel_3.add(textField_72, "14, 42, left, default");
		textField_72.setColumns(10);
		
		lblDoYouExpect = new JLabel("Do you expect an increase in expenses within 1 year?");
		panel_3.add(lblDoYouExpect, "4, 46");
		

		chckbxNo_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(chckbxNo_5.isSelected()){
					bk.setVar("SjchckbxNo_5", "true");
				}
				else{
					bk.setVar("SjchckbxNo_5", "false");
				}
			}
		});
		panel_3.add(chckbxNo_5, "8, 46");
		chckbxYesexplain.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(chckbxYesexplain.isSelected()){
					bk.setVar("SjchckbxYesexplain", "true");
				}
				else{
					bk.setVar("SjchckbxYesexplain", "false");
				}
			}
		});
		
		
		panel_3.add(chckbxYesexplain, "8, 48");
		
		textArea_1 = new JTextArea();
		textArea_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("SjtextArea_1", textArea_1.getText());
			}
		});
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea_1.setPreferredSize(new Dimension(12, 50));
		panel_3.add(textArea_1, "7, 50, 2, 1, default, top");
		tabbedPane.addTab("Co-Debtor Expenses", null, panel_2, null);
		tabbedPane.setEnabledAt(3, false);
		
			textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField", textField.getText());
			}});
			textField_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_1", textField_1.getText());
			}});
			textField_2.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_2", textField_2.getText());
			}});
			textField_3.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_3", textField_3.getText());
			}});
			textField_4.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_4", textField_4.getText());
			}});
			textField_5.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_5", textField_5.getText());
			}});
			textField_6.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_6", textField_6.getText());
			}});
			textField_7.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_7", textField_7.getText());
			}});
			textField_8.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_8", textField_8.getText());
			}});
			textField_9.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_9", textField_9.getText());
			}});
			textField_10.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_10", textField_10.getText());
			}});
			textField_11.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_11", textField_11.getText());
			}});
			textField_12.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_12", textField_12.getText());
			}});
			textField_13.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_13", textField_13.getText());
			}});
			textField_14.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_14", textField_14.getText());
			}});
			textField_15.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_15", textField_15.getText());
			}});
			textField_16.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_16", textField_16.getText());
			}});
			textField_17.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_17", textField_17.getText());
			}});
			textField_18.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_18", textField_18.getText());
			}});
			textField_19.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_19", textField_19.getText());
			}});
			textField_20.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_20", textField_20.getText());
			}});
			textField_21.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_21", textField_21.getText());
			}});
			textField_22.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_22", textField_22.getText());
			}});
			textField_23.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_23", textField_23.getText());
			}});
			textField_24.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_24", textField_24.getText());
			}});
			textField_25.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_25", textField_25.getText());
			}});
			textField_26.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_26", textField_26.getText());
			}});
			textField_27.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_27", textField_27.getText());
			}});
			textField_28.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_28", textField_28.getText());
			}});
			textField_29.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_29", textField_29.getText());
			}});
			textField_30.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_30", textField_30.getText());
			}});
			textField_31.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_31", textField_31.getText());
			}});
			textField_32.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_32", textField_32.getText());
			}});
			textField_33.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_33", textField_33.getText());
			}});
			textField_34.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_34", textField_34.getText());
			}});
			textField_35.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_35", textField_35.getText());
			}});
			textField_55.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_55", textField_55.getText());
			}});
			textField_56.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_56", textField_56.getText());
			}});
			textField_57.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_57", textField_57.getText());
			}});
			textField_58.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_58", textField_58.getText());
			}});
			textField_59.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_59", textField_59.getText());
			}});
			textField_60.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_60", textField_60.getText());
			}});
			textField_61.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_61", textField_61.getText());
			}});
			textField_62.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_62", textField_62.getText());
			}});
			textField_63.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_63", textField_63.getText());
			}});
			textField_64.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_64", textField_64.getText());
			}});
			textField_65.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_65", textField_65.getText());
			}});
			textField_66.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_66", textField_66.getText());
			}});
			textField_67.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_67", textField_67.getText());
			}});
			textField_68.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_68", textField_68.getText());
			}});
			textField_69.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_69", textField_69.getText());
			}});
			textField_70.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_70", textField_70.getText());
			}});
			textField_71.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_71", textField_71.getText());
			}});
			textField_72.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_72", textField_72.getText());
			}});
			textField_73.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_73", textField_73.getText());
			}});
			textField_74.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_74", textField_74.getText());
			}});
			textField_75.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_75", textField_75.getText());
			}});
			textField_76.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_76", textField_76.getText());
			}});
			textField_77.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
			bk.setVar("SjtextField_77", textField_77.getText());
			}});
			
				comboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox", (String)comboBox.getSelectedItem());
				}});
			
				comboBox_1.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_1", (String)comboBox_1.getSelectedItem());
				}});
				comboBox_2.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_2", (String)comboBox_2.getSelectedItem());
				}});
				comboBox_3.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_3", (String)comboBox_3.getSelectedItem());
				}});
				comboBox_4.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_4", (String)comboBox_4.getSelectedItem());
				}});
				comboBox_5.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_5", (String)comboBox_5.getSelectedItem());
				}});
				comboBox_6.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_6", (String)comboBox_6.getSelectedItem());
				}});
				comboBox_7.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_7", (String)comboBox_7.getSelectedItem());
				}});
				comboBox_8.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_8", (String)comboBox_8.getSelectedItem());
				}});
				comboBox_9.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_9", (String)comboBox_9.getSelectedItem());
				}});
				comboBox_10.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_10", (String)comboBox_10.getSelectedItem());
				}});
				comboBox_11.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_11", (String)comboBox_11.getSelectedItem());
				}});
				comboBox_12.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_12", (String)comboBox_12.getSelectedItem());
				}});
				comboBox_13.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_13", (String)comboBox_13.getSelectedItem());
				}});
				comboBox_14.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_14", (String)comboBox_14.getSelectedItem());
				}});
				comboBox_15.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_15", (String)comboBox_15.getSelectedItem());
				}});
				comboBox_16.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_16", (String)comboBox_16.getSelectedItem());
				}});
				comboBox_17.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("SjcomboBox_17", (String)comboBox_17.getSelectedItem());
				}});
	}
	
	public void loadVars(Map hash){

		
		
		if(bk.getField(hash, "SjchckbxNo").equals("true")){
			chckbxNo.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxNewCheckBox").equals("true")){
			chckbxNewCheckBox.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxNo_5").equals("true")){
			chckbxNo_5.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxYesexplain").equals("true")){
			chckbxYesexplain.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxYes").equals("true")){
			chckbxYes.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxNo_2").equals("true")){
			chckbxNo_2.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxNo_1").equals("true")){
			chckbxNo_1.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxYes_1").equals("true")){
			chckbxYes_1.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxYes_2").equals("true")){
			chckbxYes_2.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxNo_3").equals("true")){
			chckbxNo_3.setSelected(true);
		}
		if(bk.getField(hash, "SjchckbxNo_5").equals("true")){
			chckbxNo_5.setSelected(true);
		}

		comboBox.setSelectedItem(bk.getField(hash, "SjcomboBox"));
		comboBox_1.setSelectedItem(bk.getField(hash, "SjcomboBox_1"));
		comboBox_2.setSelectedItem(bk.getField(hash, "SjcomboBox_2"));
		comboBox_3.setSelectedItem(bk.getField(hash, "SjcomboBox_3"));
		comboBox_4.setSelectedItem(bk.getField(hash, "SjcomboBox_4"));
		comboBox_5.setSelectedItem(bk.getField(hash, "SjcomboBox_5"));
		comboBox_6.setSelectedItem(bk.getField(hash, "SjcomboBox_6"));
		comboBox_7.setSelectedItem(bk.getField(hash, "SjcomboBox_7"));
		comboBox_8.setSelectedItem(bk.getField(hash, "SjcomboBox_8"));
		comboBox_9.setSelectedItem(bk.getField(hash, "SjcomboBox_9"));
		comboBox_10.setSelectedItem(bk.getField(hash, "SjcomboBox_10"));
		comboBox_11.setSelectedItem(bk.getField(hash, "SjcomboBox_11"));
		comboBox_12.setSelectedItem(bk.getField(hash, "SjcomboBox_12"));
		comboBox_13.setSelectedItem(bk.getField(hash, "SjcomboBox_13"));
		comboBox_14.setSelectedItem(bk.getField(hash, "SjcomboBox_14"));
		comboBox_15.setSelectedItem(bk.getField(hash, "SjcomboBox_15"));
		comboBox_16.setSelectedItem(bk.getField(hash, "SjcomboBox_16"));
		comboBox_17.setSelectedItem(bk.getField(hash, "SjcomboBox_17"));

		
		textArea_1.setText(bk.getField(hash, "SjtextArea"));
		textField.setText(bk.getField(hash, "SjtextField").toString());
		textField_1.setText(bk.getField(hash, "SjtextField_1").toString());
		textField_2.setText(bk.getField(hash, "SjtextField_2").toString());
		textField_3.setText(bk.getField(hash, "SjtextField_3").toString());
		textField_4.setText(bk.getField(hash, "SjtextField_4").toString());
		textField_5.setText(bk.getField(hash, "SjtextField_5").toString());
		textField_6.setText(bk.getField(hash, "SjtextField_6").toString());
		textField_7.setText(bk.getField(hash, "SjtextField_7").toString());
		textField_8.setText(bk.getField(hash, "SjtextField_8").toString());
		textField_9.setText(bk.getField(hash, "SjtextField_9").toString());
		textField_10.setText(bk.getField(hash, "SjtextField_10").toString());
		textField_11.setText(bk.getField(hash, "SjtextField_11").toString());
		textField_12.setText(bk.getField(hash, "SjtextField_12").toString());
		textField_13.setText(bk.getField(hash, "SjtextField_13").toString());
		textField_14.setText(bk.getField(hash, "SjtextField_14").toString());
		textField_15.setText(bk.getField(hash, "SjtextField_15").toString());
		textField_16.setText(bk.getField(hash, "SjtextField_16").toString());
		textField_17.setText(bk.getField(hash, "SjtextField_17").toString());
		textField_18.setText(bk.getField(hash, "SjtextField_18").toString());
		textField_19.setText(bk.getField(hash, "SjtextField_19").toString());
		textField_20.setText(bk.getField(hash, "SjtextField_20").toString());
		textField_21.setText(bk.getField(hash, "SjtextField_21").toString());
		textField_22.setText(bk.getField(hash, "SjtextField_22").toString());
		textField_23.setText(bk.getField(hash, "SjtextField_23").toString());
		textField_24.setText(bk.getField(hash, "SjtextField_24").toString());
		textField_25.setText(bk.getField(hash, "SjtextField_25").toString());
		textField_26.setText(bk.getField(hash, "SjtextField_26").toString());
		textField_27.setText(bk.getField(hash, "SjtextField_27").toString());
		textField_28.setText(bk.getField(hash, "SjtextField_28").toString());
		textField_29.setText(bk.getField(hash, "SjtextField_29").toString());
		textField_30.setText(bk.getField(hash, "SjtextField_30").toString());
		textField_31.setText(bk.getField(hash, "SjtextField_31").toString());
		textField_32.setText(bk.getField(hash, "SjtextField_32").toString());
		textField_33.setText(bk.getField(hash, "SjtextField_33").toString());
		textField_34.setText(bk.getField(hash, "SjtextField_34").toString());
		textField_35.setText(bk.getField(hash, "SjtextField_35").toString());
		textField_36.setText(bk.getField(hash, "SjtextField_36").toString());
		textField_37.setText(bk.getField(hash, "SjtextField_37").toString());
		textField_38.setText(bk.getField(hash, "SjtextField_38").toString());
		textField_39.setText(bk.getField(hash, "SjtextField_39").toString());
		textField_40.setText(bk.getField(hash, "SjtextField_40").toString());
		textField_41.setText(bk.getField(hash, "SjtextField_41").toString());
		textField_42.setText(bk.getField(hash, "SjtextField_42").toString());
		textField_43.setText(bk.getField(hash, "SjtextField_43").toString());
		textField_44.setText(bk.getField(hash, "SjtextField_44").toString());
		textField_45.setText(bk.getField(hash, "SjtextField_45").toString());
		textField_46.setText(bk.getField(hash, "SjtextField_46").toString());
		textField_47.setText(bk.getField(hash, "SjtextField_47").toString());
		textField_48.setText(bk.getField(hash, "SjtextField_48").toString());
		textField_49.setText(bk.getField(hash, "SjtextField_49").toString());
		textField_50.setText(bk.getField(hash, "SjtextField_50").toString());
		textField_51.setText(bk.getField(hash, "SjtextField_51").toString());
		textField_52.setText(bk.getField(hash, "SjtextField_52").toString());
		textField_53.setText(bk.getField(hash, "SjtextField_53").toString());
		textField_54.setText(bk.getField(hash, "SjtextField_54").toString());
		textField_55.setText(bk.getField(hash, "SjtextField_55").toString());
		textField_56.setText(bk.getField(hash, "SjtextField_56").toString());
		textField_57.setText(bk.getField(hash, "SjtextField_57").toString());
		textField_58.setText(bk.getField(hash, "SjtextField_58").toString());
		textField_59.setText(bk.getField(hash, "SjtextField_59").toString());
		textField_60.setText(bk.getField(hash, "SjtextField_60").toString());
		textField_61.setText(bk.getField(hash, "SjtextField_61").toString());
		textField_62.setText(bk.getField(hash, "SjtextField_62").toString());
		textField_63.setText(bk.getField(hash, "SjtextField_63").toString());
		textField_64.setText(bk.getField(hash, "SjtextField_64").toString());
		textField_65.setText(bk.getField(hash, "SjtextField_65").toString());
		textField_66.setText(bk.getField(hash, "SjtextField_66").toString());
		textField_67.setText(bk.getField(hash, "SjtextField_67").toString());
		textField_68.setText(bk.getField(hash, "SjtextField_68").toString());
		textField_69.setText(bk.getField(hash, "SjtextField_69").toString());
		textField_70.setText(bk.getField(hash, "SjtextField_70").toString());
		textField_71.setText(bk.getField(hash, "SjtextField_71").toString());
		textField_72.setText(bk.getField(hash, "SjtextField_72").toString());
		textField_73.setText(bk.getField(hash, "SjtextField_73").toString());
		textField_74.setText(bk.getField(hash, "SjtextField_74").toString());
		textField_75.setText(bk.getField(hash, "SjtextField_75").toString());
		textField_76.setText(bk.getField(hash, "SjtextField_76").toString());
		textField_77.setText(bk.getField(hash, "SjtextField_77").toString());
	}
}

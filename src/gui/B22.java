package gui;
import javax.swing.JFrame;

import java.awt.CardLayout;
import java.awt.Rectangle;

import javax.swing.SpringLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;


public class B22 extends JFrame{
	private JTable table;
	private JTable table_1;
	private B22Box b = new B22Box();
	private B22CoBox c = new B22CoBox();
	
	public B22() {
		b.comboBox.setSelectedIndex(0);
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {
				loadTable();
				loadCoTable();
			}
			public void windowLostFocus(WindowEvent arg0) {
			}
		});
		setBounds(new Rectangle(0, 0, 1200, 600));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, -18, SpringLayout.SOUTH, getContentPane());
		getContentPane().add(scrollPane);
		
		JButton btnAddIncomeSource = new JButton("Add Income Source (Debtor)");
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, btnAddIncomeSource);
		springLayout.putConstraint(SpringLayout.WEST, btnAddIncomeSource, 10, SpringLayout.WEST, getContentPane());
		btnAddIncomeSource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B22Box b = new B22Box();
				b.setVisible(true);
			}
		});
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Source", "Amount", "Date"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().add(btnAddIncomeSource);
		
		JLabel lblDebtor = new JLabel("Debtor");
		springLayout.putConstraint(SpringLayout.NORTH, btnAddIncomeSource, 6, SpringLayout.SOUTH, lblDebtor);
		springLayout.putConstraint(SpringLayout.NORTH, lblDebtor, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblDebtor, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblDebtor);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane_1, -18, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -6, SpringLayout.WEST, scrollPane_1);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane_1, 529, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane_1, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(scrollPane_1);
		
		JLabel lblCodebtor = new JLabel("Co-Debtor (if applicable)");
		springLayout.putConstraint(SpringLayout.NORTH, lblCodebtor, 0, SpringLayout.NORTH, lblDebtor);
		springLayout.putConstraint(SpringLayout.WEST, lblCodebtor, 486, SpringLayout.EAST, lblDebtor);
		getContentPane().add(lblCodebtor);
		
		JButton btnAddIncomeSource_1 = new JButton("Add Income Source (Co-Debtor)");
		btnAddIncomeSource_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c = new B22CoBox();
				c.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane_1, 6, SpringLayout.SOUTH, btnAddIncomeSource_1);
		springLayout.putConstraint(SpringLayout.NORTH, btnAddIncomeSource_1, 0, SpringLayout.NORTH, btnAddIncomeSource);
		springLayout.putConstraint(SpringLayout.WEST, btnAddIncomeSource_1, 0, SpringLayout.WEST, scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Source", "Amount", "Date"
			}
		));
		scrollPane_1.setViewportView(table_1);
		getContentPane().add(btnAddIncomeSource_1);
		

	}
	
	public void loadTable(){
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		
		if(b.paychecks.size() > 0){
			for(int i = 0; i < b.paychecks.size(); i++){
				model.addRow(new Object[] {"Wages - " + b.paychecks.get(i).getEmpName(), "", ""});
			}
		}
		
		if(b.alimonyAmounts.size() > 0){
			for(int i = 0; i < b.alimonyAmounts.size(); i++){
				model.addRow(new Object[] {"Alimony", b.alimonyAmounts.get(i).toString(), b.alimonyDates.get(i).toString()});
			}
		}
		
		if(b.regularPaymentsAmounts.size() > 0){
			for(int i = 0; i < b.regularPaymentsAmounts.size(); i++){
				model.addRow(new Object[] {b.regularPaymentsSources.get(i).toString(), b.regularPaymentsAmounts.get(i).toString(), b.regularPaymentsDates.get(i).toString()});
			}
		}
		
		if(b.businessNames.size() > 0){
			for(int i = 0; i < b.businessNames.size(); i++){
				model.addRow(new Object[] {b.businessNames.get(i).toString(), b.businessAmounts.get(i).toString(), b.businessDates.get(i).toString()});
			}
		}
		
		if(b.realAmounts.size() > 0){
			for(int i = 0; i < b.realAmounts.size(); i++){
				model.addRow(new Object[] {"Real Estate", b.realAmounts.get(i).toString(), b.realDates.get(i).toString()});
			}
		}
		
		if(b.interestAmounts.size() > 0){
			for(int i = 0; i < b.interestAmounts.size(); i++){
				model.addRow(new Object[] {"Interest and Dividends", b.interestAmounts.get(i).toString(), b.interestDates.get(i).toString()});
			}
		}
		
		if(b.unemploymentAmounts.size() > 0){
			for(int i = 0; i < b.unemploymentAmounts.size(); i++){
				model.addRow(new Object[] {"Unemployment", b.unemploymentAmounts.get(i).toString(), b.unemploymentDates.get(i).toString()});
			}
		}
		
		if(b.pensionAmounts.size() > 0){
			for(int i = 0; i < b.pensionAmounts.size(); i++){
				model.addRow(new Object[] {"Pension and Retirement", b.pensionAmounts.get(i).toString(), b.pensionDates.get(i).toString()});
			}
		}
		
	}
	
	public void loadCoTable(){
		DefaultTableModel model = (DefaultTableModel) table_1.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		
		if(c.paychecks.size() > 0){
			for(int i = 0; i < c.paychecks.size(); i++){
				model.addRow(new Object[] {"Wages - " + c.paychecks.get(i).getEmpName(), "", ""});
			}
		}
		
		if(c.alimonyAmounts.size() > 0){
			for(int i = 0; i < c.alimonyAmounts.size(); i++){
				model.addRow(new Object[] {"Alimony", c.alimonyAmounts.get(i).toString(), c.alimonyDates.get(i).toString()});
			}
		}
		
		if(c.regularPaymentsAmounts.size() > 0){
			for(int i = 0; i < c.regularPaymentsAmounts.size(); i++){
				model.addRow(new Object[] {c.regularPaymentsSources.get(i).toString(), c.regularPaymentsAmounts.get(i).toString(), c.regularPaymentsDates.get(i).toString()});
			}
		}
		
		if(c.businessNames.size() > 0){
			for(int i = 0; i < c.businessNames.size(); i++){
				model.addRow(new Object[] {c.businessNames.get(i).toString(), c.businessAmounts.get(i).toString(), c.businessDates.get(i).toString()});
			}
		}

		if(c.realAmounts.size() > 0){

			for(int i = 0; i < c.realAmounts.size(); i++){
				model.addRow(new Object[] {"Real Estate", c.realAmounts.get(i).toString(), c.realDates.get(i).toString()});
			}
		}
		
		if(c.interestAmounts.size() > 0){
			for(int i = 0; i < c.interestAmounts.size(); i++){
				model.addRow(new Object[] {"Interest and Dividends", c.interestAmounts.get(i).toString(), c.interestDates.get(i).toString()});
			}
		}
		
		if(c.unemploymentAmounts.size() > 0){
			for(int i = 0; i < c.unemploymentAmounts.size(); i++){
				model.addRow(new Object[] {"Unemployment", c.unemploymentAmounts.get(i).toString(), c.unemploymentDates.get(i).toString()});
			}
		}
		
		if(c.pensionAmounts.size() > 0){
			for(int i = 0; i < c.pensionAmounts.size(); i++){
				model.addRow(new Object[] {"Pension and Retirement", c.pensionAmounts.get(i).toString(), c.pensionDates.get(i).toString()});
			}
		}
		
	}
	public String findEditType(){

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = table.getSelectedRow();
		int tracker = -1;
		String currentType = "Alimony and Maintenance";
		
		for(int i = 0; i < b.alimonyAmounts.size(); i++){
			tracker++;
			if(tracker == rowCount){
				return "Alimony and Maintenance";
			}
		}
		
		for(int i = 0; i < b.regularPaymentsAmounts.size(); i++){
			tracker++;
			if(tracker == rowCount){
				return "Amounts from Any Source Paid for Household Expenses";
			}
		}
		
		for(int i = 0; i < b.businessAmounts.size(); i++){
			tracker++;
			if(tracker == rowCount){
				return "Net Business Income";
			}
		}
		
		for(int i = 0; i < b.realAmounts.size(); i++){
			tracker++;
			if(tracker == rowCount){
				return "Net Rental and Other Real Property Income";
			}
		}
		
		for(int i = 0; i < b.interestAmounts.size(); i++){
			tracker++;
			if(tracker == rowCount){
				return "Interest, Dividends and Royalties";
			}
		}
		
		for(int i = 0; i < b.unemploymentAmounts.size(); i++){
			tracker++;
			if(tracker == rowCount){
				return "Unemployment Compensation";
			}
		}
		
		for(int i = 0; i < b.pensionAmounts.size(); i++){
			tracker++;
			if(tracker == rowCount){
				return "Pension or Retirement Income";
			}
		}
		
		for(int i = 0; i < b.otherAmounts.size(); i++){
			tracker++;
			if(tracker == rowCount){
				return "Other";
			}
		}
		
		return "none";
	}
}


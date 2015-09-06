package gui;
import javax.swing.JFrame;





import java.awt.Rectangle;

import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import data.Property;
import data.TxtEdit;
import gui.PropertyBox;

import java.awt.event.WindowFocusListener;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.awt.event.WindowAdapter;

public class ScheduleB extends JFrame{
	private JTable table;
	public static ArrayList<Property> prop = new ArrayList<>();
	public TxtEdit txt = new TxtEdit();
	
	public ScheduleB() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				try {
					txt.saveArray("C:/Users/Gaming/Desktop/a.txt", prop);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		addWindowFocusListener(new WindowFocusListener() {
			public void windowGainedFocus(WindowEvent arg0) {

				loadProp();
				try {
					txt.saveArray("C:/Users/Gaming/Desktop/a.txt", prop);
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
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 723, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 974, SpringLayout.WEST, getContentPane());
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Description and Location of Property", "Claimed Exemption (if applicable)"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(205);
		table.getColumnModel().getColumn(0).setMinWidth(60);
		scrollPane.setViewportView(table);
		
		JButton btnAddProperty = new JButton("Add Property");
		btnAddProperty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PropertyBox b = new PropertyBox();
				b.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, btnAddProperty);
		springLayout.putConstraint(SpringLayout.NORTH, btnAddProperty, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnAddProperty, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnAddProperty);
		
		JButton btnRemoveProperty = new JButton("Remove Selected");
		btnRemoveProperty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");

				}
				else{
					removeRow(table.getSelectedRow());
					loadProp();
			
				}
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnRemoveProperty, 6, SpringLayout.EAST, btnAddProperty);
		springLayout.putConstraint(SpringLayout.SOUTH, btnRemoveProperty, -6, SpringLayout.NORTH, scrollPane);
		getContentPane().add(btnRemoveProperty);
		
		JButton btnEditSelected = new JButton("Edit Selected");
		btnEditSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(table.getSelectedRow() == -1){
					System.out.println("No row selected");

				}
				else{
					PropertyBox b = new PropertyBox();
					b.setCategory(prop.get(table.getSelectedRow()).getCategory());
					b.setOwn(prop.get(table.getSelectedRow()).getOwner());
					b.setValue(prop.get(table.getSelectedRow()).getValue());
					b.setDescription(prop.get(table.getSelectedRow()).getDescription());
					b.setExemption(prop.get(table.getSelectedRow()).getExemption());
					b.setExemptionAmount(prop.get(table.getSelectedRow()).getExemptionAmount());
					removeRow(table.getSelectedRow());
					b.setRowNum(table.getSelectedRow());
					b.setVisible(true);
				}
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnEditSelected, 6, SpringLayout.EAST, btnRemoveProperty);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEditSelected, -6, SpringLayout.NORTH, scrollPane);
		getContentPane().add(btnEditSelected);
	}
	

	public void removeRow(int row){
		prop.remove(row);
	}
	
	public void loadProp(){

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int rowCount = model.getRowCount();
		for(int i = rowCount - 1; i >= 0; i--){
			model.removeRow(i);
		}
		for(int i = 0; i < prop.size(); i++){
			model.addRow(new Object[] {prop.get(i).getDescription()});
		}
	}
	
	public ArrayList<Property> getProp(){
		return prop;
	}
}

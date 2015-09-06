package gui;
import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

import data.Contract;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ContractBox extends JFrame{
	
	private JTextArea textArea = new JTextArea();
	private JTextArea textArea_1 = new JTextArea();
	private int rowNum = 0;
	
	public ContractBox() {
		
		
		Contract contract = new Contract();
		ScheduleG schG = new ScheduleG();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				schG.contracts.add(rowNum, contract);
			}
		});
		
		
		setBounds(new Rectangle(0, 0, 600, 200));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNameAndMailing = new JLabel("Name and Mailing Address of");
		springLayout.putConstraint(SpringLayout.NORTH, lblNameAndMailing, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNameAndMailing, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblNameAndMailing);
		
		JLabel lblOtherPartiesTo = new JLabel("Other Parties to Lease or Contract");
		springLayout.putConstraint(SpringLayout.NORTH, lblOtherPartiesTo, 6, SpringLayout.SOUTH, lblNameAndMailing);
		springLayout.putConstraint(SpringLayout.WEST, lblOtherPartiesTo, 0, SpringLayout.WEST, lblNameAndMailing);
		getContentPane().add(lblOtherPartiesTo);
		
		
		textArea.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				contract.setOtherParty(textArea.getText());
			}
		});
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 6, SpringLayout.SOUTH, lblOtherPartiesTo);
		springLayout.putConstraint(SpringLayout.WEST, textArea, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, 101, SpringLayout.SOUTH, lblOtherPartiesTo);
		springLayout.putConstraint(SpringLayout.EAST, textArea, 234, SpringLayout.WEST, getContentPane());
		getContentPane().add(textArea);
		
		JLabel lblDescriptionOfContract = new JLabel("Description of contract or lease");
		springLayout.putConstraint(SpringLayout.NORTH, lblDescriptionOfContract, 0, SpringLayout.NORTH, lblNameAndMailing);
		springLayout.putConstraint(SpringLayout.WEST, lblDescriptionOfContract, 110, SpringLayout.EAST, lblNameAndMailing);
		getContentPane().add(lblDescriptionOfContract);
		
		JLabel lblAndNatureOf = new JLabel("and Nature of Debtor's interest");
		springLayout.putConstraint(SpringLayout.NORTH, lblAndNatureOf, 0, SpringLayout.NORTH, lblOtherPartiesTo);
		springLayout.putConstraint(SpringLayout.WEST, lblAndNatureOf, 0, SpringLayout.WEST, lblDescriptionOfContract);
		getContentPane().add(lblAndNatureOf);
		

		textArea_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				contract.setDescription(textArea_1.getText());
			}
		});
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		springLayout.putConstraint(SpringLayout.NORTH, textArea_1, 0, SpringLayout.NORTH, textArea);
		springLayout.putConstraint(SpringLayout.WEST, textArea_1, 24, SpringLayout.EAST, textArea);
		springLayout.putConstraint(SpringLayout.SOUTH, textArea_1, 0, SpringLayout.SOUTH, textArea);
		springLayout.putConstraint(SpringLayout.EAST, textArea_1, 271, SpringLayout.EAST, textArea);
		getContentPane().add(textArea_1);
	}
	
	public void setOtherParty(String s){
		textArea.setText(s);
	}
	
	public void setDescription(String s){
		textArea_1.setText(s);
	}
	
	public void setRowNum(int x){
		rowNum = x;
	}
	
}

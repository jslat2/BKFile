package data;

import javax.swing.JFrame;
import java.awt.Rectangle;
import javax.swing.SpringLayout;
import javax.swing.JTextField;

public class Aliases extends JFrame{
	public Aliases() {
		setBounds(new Rectangle(0, 0, 400, 300));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 28, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 18, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_2, 23, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_3, 17, SpringLayout.SOUTH, textField_2);
		springLayout.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_4, 23, SpringLayout.SOUTH, textField_3);
		springLayout.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, textField);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_5, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_5, -10, SpringLayout.SOUTH, getContentPane());
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_6, 0, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField_6, 28, SpringLayout.EAST, textField);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_7, 0, SpringLayout.WEST, textField_6);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_7, 0, SpringLayout.SOUTH, textField_1);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_8, 0, SpringLayout.NORTH, textField_2);
		springLayout.putConstraint(SpringLayout.WEST, textField_8, 0, SpringLayout.WEST, textField_6);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_9, 0, SpringLayout.WEST, textField_6);
		springLayout.putConstraint(SpringLayout.SOUTH, textField_9, 0, SpringLayout.SOUTH, textField_3);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_10, 0, SpringLayout.NORTH, textField_4);
		springLayout.putConstraint(SpringLayout.WEST, textField_10, 0, SpringLayout.WEST, textField_6);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_11, 0, SpringLayout.NORTH, textField_5);
		springLayout.putConstraint(SpringLayout.EAST, textField_11, 0, SpringLayout.EAST, textField_6);
		getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_12, 0, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField_12, 23, SpringLayout.EAST, textField_6);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_13, 0, SpringLayout.NORTH, textField_1);
		springLayout.putConstraint(SpringLayout.EAST, textField_13, 0, SpringLayout.EAST, textField_12);
		getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_14, 0, SpringLayout.SOUTH, textField_2);
		springLayout.putConstraint(SpringLayout.EAST, textField_14, 0, SpringLayout.EAST, textField_12);
		getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_15, 0, SpringLayout.SOUTH, textField_3);
		springLayout.putConstraint(SpringLayout.EAST, textField_15, 0, SpringLayout.EAST, textField_12);
		getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField_16, 0, SpringLayout.NORTH, textField_4);
		springLayout.putConstraint(SpringLayout.EAST, textField_16, 0, SpringLayout.EAST, textField_12);
		getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, textField_17, 0, SpringLayout.SOUTH, textField_5);
		springLayout.putConstraint(SpringLayout.EAST, textField_17, 0, SpringLayout.EAST, textField_12);
		getContentPane().add(textField_17);
		textField_17.setColumns(10);
	}

	private static final long serialVersionUID = 1L;
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
}

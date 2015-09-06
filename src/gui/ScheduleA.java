package gui;
import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;

import data.BkFile;

import java.awt.Dimension;
import java.util.Map;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ScheduleA extends JFrame{
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
	private JTextArea textArea = new JTextArea();
	private JTextArea textArea_1 = new JTextArea();
	private JTextArea textArea_2 = new JTextArea();
	private JTextArea textArea_3 = new JTextArea();
	private JTextArea textArea_4 = new JTextArea();
	private JTextArea textArea_5 = new JTextArea();
	private JTextArea textArea_6 = new JTextArea();
	private JTextArea textArea_7 = new JTextArea();
	private JComboBox comboBox = new JComboBox();
	private JComboBox comboBox_1 = new JComboBox();
	private JComboBox comboBox_2 = new JComboBox();
	private JComboBox comboBox_3 = new JComboBox();
	private JComboBox comboBox_4 = new JComboBox();
	private JComboBox comboBox_5 = new JComboBox();
	private JComboBox comboBox_6 = new JComboBox();
	private JComboBox comboBox_7 = new JComboBox();

	
	public ScheduleA() {
		BkFile bk = new BkFile();

		setBounds(new Rectangle(0, 0, 1000, 800));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(103, 10));
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 762, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 984, SpringLayout.WEST, getContentPane());
		getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btnAddRealProperty = new JButton("Add Continuation Page");
		sl_panel.putConstraint(SpringLayout.NORTH, btnAddRealProperty, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnAddRealProperty, 10, SpringLayout.WEST, panel);
		panel.add(btnAddRealProperty);
		
		JLabel lblDescriptionAndLocation = new JLabel("Description and Location of Property");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDescriptionAndLocation, 6, SpringLayout.SOUTH, btnAddRealProperty);
		sl_panel.putConstraint(SpringLayout.WEST, lblDescriptionAndLocation, 0, SpringLayout.WEST, btnAddRealProperty);
		panel.add(lblDescriptionAndLocation);
		
		
		sl_panel.putConstraint(SpringLayout.WEST, textArea, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, textArea, -619, SpringLayout.SOUTH, panel);

		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textArea);
		
		JLabel lblNatureOfInterest = new JLabel("Nature of Interest in Property");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNatureOfInterest, 0, SpringLayout.NORTH, lblDescriptionAndLocation);
		sl_panel.putConstraint(SpringLayout.WEST, lblNatureOfInterest, 82, SpringLayout.EAST, lblDescriptionAndLocation);
		panel.add(lblNatureOfInterest);
		
		textField = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textArea, -37, SpringLayout.WEST, textField);
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 31, SpringLayout.SOUTH, lblNatureOfInterest);
		sl_panel.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, lblNatureOfInterest);
		sl_panel.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, lblNatureOfInterest);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblValueOfInterest = new JLabel("Value of Interest in Property");
		sl_panel.putConstraint(SpringLayout.NORTH, lblValueOfInterest, 0, SpringLayout.NORTH, lblDescriptionAndLocation);
		sl_panel.putConstraint(SpringLayout.WEST, lblValueOfInterest, 35, SpringLayout.EAST, lblNatureOfInterest);
		panel.add(lblValueOfInterest);
		
		textField_1 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_1, 31, SpringLayout.SOUTH, lblValueOfInterest);
		sl_panel.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, lblValueOfInterest);
		sl_panel.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, lblValueOfInterest);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblhusbandWifeJoint = new JLabel("Owner (Husband, Wife, Joint, or Community)");
		sl_panel.putConstraint(SpringLayout.WEST, lblhusbandWifeJoint, 29, SpringLayout.EAST, lblValueOfInterest);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblhusbandWifeJoint, 0, SpringLayout.SOUTH, lblDescriptionAndLocation);
		panel.add(lblhusbandWifeJoint);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 1, SpringLayout.NORTH, textArea);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, lblhusbandWifeJoint);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, -166, SpringLayout.EAST, lblhusbandWifeJoint);
		comboBox.setMinimumSize(new Dimension(103, 20));
		comboBox.setBounds(new Rectangle(0, 0, 103, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "H", "W", "J", "C"}));
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Property 1");
		sl_panel.putConstraint(SpringLayout.NORTH, textArea, 10, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 6, SpringLayout.SOUTH, lblDescriptionAndLocation);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, btnAddRealProperty);
		panel.add(lblNewLabel);
		
		JLabel lblProperty = new JLabel("Property 2");
		sl_panel.putConstraint(SpringLayout.NORTH, lblProperty, 6, SpringLayout.SOUTH, textArea);
		sl_panel.putConstraint(SpringLayout.WEST, lblProperty, 0, SpringLayout.WEST, btnAddRealProperty);
		panel.add(lblProperty);
		
		
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "H", "W", "J", "C"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_1, 65, SpringLayout.SOUTH, comboBox);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, comboBox);
		comboBox_1.setMinimumSize(new Dimension(103, 20));
		panel.add(comboBox_1);
		
		JLabel lblProperty_1 = new JLabel("Property 3");
		sl_panel.putConstraint(SpringLayout.NORTH, lblProperty_1, 72, SpringLayout.SOUTH, lblProperty);
		sl_panel.putConstraint(SpringLayout.WEST, lblProperty_1, 0, SpringLayout.WEST, btnAddRealProperty);
		panel.add(lblProperty_1);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, textArea_1, 6, SpringLayout.SOUTH, lblProperty);
		sl_panel.putConstraint(SpringLayout.WEST, textArea_1, 0, SpringLayout.WEST, btnAddRealProperty);
		sl_panel.putConstraint(SpringLayout.SOUTH, textArea_1, -20, SpringLayout.SOUTH, lblProperty_1);
		sl_panel.putConstraint(SpringLayout.EAST, textArea_1, 0, SpringLayout.EAST, textArea);
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textArea_1);
		
		JLabel lblProperty_2 = new JLabel("Property 4");
		sl_panel.putConstraint(SpringLayout.NORTH, lblProperty_2, 72, SpringLayout.SOUTH, lblProperty_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblProperty_2, 0, SpringLayout.WEST, btnAddRealProperty);
		panel.add(lblProperty_2);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, textArea_2, 6, SpringLayout.SOUTH, lblProperty_1);
		sl_panel.putConstraint(SpringLayout.WEST, textArea_2, 0, SpringLayout.WEST, btnAddRealProperty);
		sl_panel.putConstraint(SpringLayout.SOUTH, textArea_2, -20, SpringLayout.SOUTH, lblProperty_2);
		sl_panel.putConstraint(SpringLayout.EAST, textArea_2, 0, SpringLayout.EAST, textArea);
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textArea_2);
		
		JLabel lblProperty_3 = new JLabel("Property 5");
		sl_panel.putConstraint(SpringLayout.NORTH, lblProperty_3, 72, SpringLayout.SOUTH, lblProperty_2);
		sl_panel.putConstraint(SpringLayout.WEST, lblProperty_3, 10, SpringLayout.WEST, panel);
		panel.add(lblProperty_3);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, textArea_3, 6, SpringLayout.SOUTH, lblProperty_2);
		sl_panel.putConstraint(SpringLayout.WEST, textArea_3, 0, SpringLayout.WEST, btnAddRealProperty);
		sl_panel.putConstraint(SpringLayout.SOUTH, textArea_3, -20, SpringLayout.SOUTH, lblProperty_3);
		sl_panel.putConstraint(SpringLayout.EAST, textArea_3, 0, SpringLayout.EAST, textArea);
		textArea_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textArea_3);
		
		JLabel lblNewLabel_1 = new JLabel("Property 6");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 72, SpringLayout.SOUTH, lblProperty_3);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, btnAddRealProperty);
		panel.add(lblNewLabel_1);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, textArea_4, 6, SpringLayout.SOUTH, lblProperty_3);
		sl_panel.putConstraint(SpringLayout.WEST, textArea_4, 0, SpringLayout.WEST, btnAddRealProperty);
		sl_panel.putConstraint(SpringLayout.SOUTH, textArea_4, -20, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.EAST, textArea_4, 0, SpringLayout.EAST, textArea);
		textArea_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textArea_4);
		
		JLabel lblProperty_4 = new JLabel("Property 7");
		sl_panel.putConstraint(SpringLayout.NORTH, lblProperty_4, 72, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblProperty_4, 0, SpringLayout.WEST, btnAddRealProperty);
		panel.add(lblProperty_4);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, textArea_5, 6, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, textArea_5, 0, SpringLayout.WEST, btnAddRealProperty);
		sl_panel.putConstraint(SpringLayout.SOUTH, textArea_5, -20, SpringLayout.SOUTH, lblProperty_4);
		sl_panel.putConstraint(SpringLayout.EAST, textArea_5, 0, SpringLayout.EAST, textArea);
		textArea_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textArea_5);
		
		JLabel lblProperty_5 = new JLabel("Property 8");
		sl_panel.putConstraint(SpringLayout.NORTH, lblProperty_5, 72, SpringLayout.SOUTH, lblProperty_4);
		sl_panel.putConstraint(SpringLayout.WEST, lblProperty_5, 0, SpringLayout.WEST, btnAddRealProperty);
		panel.add(lblProperty_5);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, textArea_6, 6, SpringLayout.SOUTH, lblProperty_4);
		sl_panel.putConstraint(SpringLayout.WEST, textArea_6, 0, SpringLayout.WEST, btnAddRealProperty);
		sl_panel.putConstraint(SpringLayout.SOUTH, textArea_6, -20, SpringLayout.SOUTH, lblProperty_5);
		sl_panel.putConstraint(SpringLayout.EAST, textArea_6, 0, SpringLayout.EAST, textArea);
		textArea_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textArea_6);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, textArea_7, 6, SpringLayout.SOUTH, lblProperty_5);
		sl_panel.putConstraint(SpringLayout.WEST, textArea_7, 0, SpringLayout.WEST, btnAddRealProperty);
		sl_panel.putConstraint(SpringLayout.SOUTH, textArea_7, 410, SpringLayout.SOUTH, lblProperty_2);
		sl_panel.putConstraint(SpringLayout.EAST, textArea_7, 0, SpringLayout.EAST, textArea);
		textArea_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.add(textArea_7);
		
		textField_2 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2, 65, SpringLayout.SOUTH, textField);
		sl_panel.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, lblNatureOfInterest);
		sl_panel.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, lblNatureOfInterest);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_1, 29, SpringLayout.EAST, textField_3);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_3, 65, SpringLayout.SOUTH, textField_1);
		sl_panel.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, lblValueOfInterest);
		sl_panel.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, lblValueOfInterest);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_4, 66, SpringLayout.SOUTH, textField_2);
		sl_panel.putConstraint(SpringLayout.WEST, textField_4, 0, SpringLayout.WEST, lblNatureOfInterest);
		sl_panel.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, lblNatureOfInterest);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_5, 66, SpringLayout.SOUTH, textField_3);
		sl_panel.putConstraint(SpringLayout.WEST, textField_5, 0, SpringLayout.WEST, lblValueOfInterest);
		sl_panel.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, lblValueOfInterest);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_6, 66, SpringLayout.SOUTH, textField_4);
		sl_panel.putConstraint(SpringLayout.WEST, textField_6, 37, SpringLayout.EAST, textArea_3);
		sl_panel.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, lblNatureOfInterest);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_7, 66, SpringLayout.SOUTH, textField_5);
		sl_panel.putConstraint(SpringLayout.WEST, textField_7, 35, SpringLayout.EAST, textField_6);
		sl_panel.putConstraint(SpringLayout.EAST, textField_7, 0, SpringLayout.EAST, lblValueOfInterest);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_8, 66, SpringLayout.SOUTH, textField_6);
		sl_panel.putConstraint(SpringLayout.WEST, textField_8, 37, SpringLayout.EAST, textArea_4);
		sl_panel.putConstraint(SpringLayout.EAST, textField_8, 0, SpringLayout.EAST, lblNatureOfInterest);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_9, 66, SpringLayout.SOUTH, textField_7);
		sl_panel.putConstraint(SpringLayout.WEST, textField_9, 35, SpringLayout.EAST, textField_8);
		sl_panel.putConstraint(SpringLayout.EAST, textField_9, 0, SpringLayout.EAST, lblValueOfInterest);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_10, 66, SpringLayout.SOUTH, textField_8);
		sl_panel.putConstraint(SpringLayout.WEST, textField_10, 37, SpringLayout.EAST, textArea_5);
		sl_panel.putConstraint(SpringLayout.EAST, textField_10, 0, SpringLayout.EAST, lblNatureOfInterest);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_11, 66, SpringLayout.SOUTH, textField_9);
		sl_panel.putConstraint(SpringLayout.WEST, textField_11, 35, SpringLayout.EAST, textField_10);
		sl_panel.putConstraint(SpringLayout.EAST, textField_11, 0, SpringLayout.EAST, lblValueOfInterest);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_12, 66, SpringLayout.SOUTH, textField_10);
		sl_panel.putConstraint(SpringLayout.WEST, textField_12, 37, SpringLayout.EAST, textArea_6);
		sl_panel.putConstraint(SpringLayout.EAST, textField_12, 0, SpringLayout.EAST, lblNatureOfInterest);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_13, 66, SpringLayout.SOUTH, textField_11);
		sl_panel.putConstraint(SpringLayout.WEST, textField_13, 35, SpringLayout.EAST, textField_12);
		sl_panel.putConstraint(SpringLayout.EAST, textField_13, 0, SpringLayout.EAST, lblValueOfInterest);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_14, 1, SpringLayout.NORTH, textArea_7);
		sl_panel.putConstraint(SpringLayout.WEST, textField_14, 0, SpringLayout.WEST, lblNatureOfInterest);
		sl_panel.putConstraint(SpringLayout.EAST, textField_14, 0, SpringLayout.EAST, lblNatureOfInterest);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_15, 1, SpringLayout.NORTH, textArea_7);
		sl_panel.putConstraint(SpringLayout.WEST, textField_15, 0, SpringLayout.WEST, lblValueOfInterest);
		sl_panel.putConstraint(SpringLayout.EAST, textField_15, 0, SpringLayout.EAST, lblValueOfInterest);
		panel.add(textField_15);
		textField_15.setColumns(10);
		
		
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "H ", "W", "J", "C"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_2, 0, SpringLayout.NORTH, textArea_2);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_2, 29, SpringLayout.EAST, textField_5);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_2, 0, SpringLayout.EAST, comboBox);
		panel.add(comboBox_2);
		
		
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "H", "W", "J", "C"}));
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_3, 66, SpringLayout.SOUTH, comboBox_2);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_3, 29, SpringLayout.EAST, textField_7);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_3, 0, SpringLayout.EAST, comboBox);
		panel.add(comboBox_3);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_4, 1, SpringLayout.NORTH, textArea_4);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_4, 0, SpringLayout.WEST, lblhusbandWifeJoint);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_4, 0, SpringLayout.EAST, comboBox);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"", "H", "W", "J", "C"}));
		panel.add(comboBox_4);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_5, 1, SpringLayout.NORTH, textArea_5);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_5, 29, SpringLayout.EAST, textField_11);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_5, 0, SpringLayout.EAST, comboBox);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"", "H", "W", "J", "C\t"}));
		panel.add(comboBox_5);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_6, 1, SpringLayout.NORTH, textArea_6);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_6, 0, SpringLayout.WEST, lblhusbandWifeJoint);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_6, 0, SpringLayout.EAST, comboBox);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"", "H", "W", "J", "C"}));
		panel.add(comboBox_6);
		
		
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_7, 66, SpringLayout.SOUTH, comboBox_6);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_7, 0, SpringLayout.WEST, lblhusbandWifeJoint);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_7, 0, SpringLayout.EAST, comboBox);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"", "H", "W", "J", "C"}));
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {
				loadVars();
			}
		});
		panel.add(comboBox_7);
		
		textArea.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("AtextArea", textArea.getText());
			}
		});
		
		textArea_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("AtextArea_1", textArea_1.getText());
			}
		});
		
		textArea_2.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("AtextArea_2", textArea_2.getText());
			}
		});
		
		textArea_3.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("AtextArea_3", textArea_3.getText());
			}
		});
		
		textArea_4.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("AtextArea_4", textArea_4.getText());
			}
		});
		
		textArea_5.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("AtextArea_5", textArea_5.getText());
			}
		});
		
		textArea_6.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("AtextArea_6", textArea_6.getText());
			}
		});
		
		textArea_7.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				bk.setVar("AtextArea_7", textArea_7.getText());
			}
		});
		
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField", textField.getText());
			}
		});
		
		textField_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_1", textField_1.getText());
			}
		});
		
		textField_2.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_2", textField_2.getText());
			}
		});
		textField_3.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_3", textField_3.getText());
			}
		});
		textField_4.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_4", textField_4.getText());
			}
		});
		textField_5.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_5", textField_5.getText());
			}
		});
		textField_6.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_6", textField_6.getText());
			}
		});
		textField_7.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_7", textField_7.getText());
			}
		});
		textField_8.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_8", textField_8.getText());
			}
		});
		textField_9.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_9", textField_9.getText());
			}
		});
		textField_10.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_10", textField_10.getText());
			}
		});
		textField_11.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_11", textField_11.getText());
			}
		});
		textField_12.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_12", textField_12.getText());
			}
		});
		textField_13.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_13", textField_13.getText());
			}
		});
		textField_14.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_14", textField_14.getText());
			}
		});
		textField_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				bk.setVar("AtextField_15", textField_15.getText());
			}
		});
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("AcomboBox", (String)comboBox.getSelectedItem());
			}
		});
		
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("AcomboBox_1", (String)comboBox_1.getSelectedItem());
			}
		});
		
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("AcomboBox_2", (String)comboBox_2.getSelectedItem());
			}
		});
		
		comboBox_3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("AcomboBox_3", (String)comboBox_3.getSelectedItem());
			}
		});
		comboBox_4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("AcomboBox_4", (String)comboBox_4.getSelectedItem());
			}
		});
		comboBox_5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("AcomboBox_5", (String)comboBox_5.getSelectedItem());
			}
		});
		comboBox_6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("AcomboBox_6", (String)comboBox_6.getSelectedItem());
			}
		});
		comboBox_7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				bk.setVar("AcomboBox_7", (String)comboBox_7.getSelectedItem());
			}
		});
	}
	
	public void loadVars(){
		BkFile bk = new BkFile();
		
		comboBox.setSelectedItem(bk.getField("AcomboBox").toString());
		comboBox_1.setSelectedItem(bk.getField("AcomboBox_1").toString());
		comboBox_2.setSelectedItem(bk.getField("AcomboBox_2").toString());
		comboBox_3.setSelectedItem(bk.getField("AcomboBox_3").toString());
		comboBox_4.setSelectedItem(bk.getField("AcomboBox_4").toString());
		comboBox_5.setSelectedItem(bk.getField("AcomboBox_5").toString());
		comboBox_6.setSelectedItem(bk.getField("AcomboBox_6").toString());
		comboBox_7.setSelectedItem(bk.getField("AcomboBox_7").toString());
		
		textArea.setText(bk.getField("AtextArea").toString());
		textArea_1.setText(bk.getField("AtextArea_1").toString());
		textArea_2.setText(bk.getField("AtextArea_2").toString());
		textArea_3.setText(bk.getField("AtextArea_3").toString());
		textArea_4.setText(bk.getField("AtextArea_4").toString());
		textArea_5.setText(bk.getField("AtextArea_5").toString());
		textArea_6.setText(bk.getField("AtextArea_6").toString());
		textArea_7.setText(bk.getField("AtextArea_7").toString());
		textField.setText(bk.getField("AtextField").toString());
		textField_1.setText(bk.getField("AtextField_1").toString());
		textField_2.setText(bk.getField("AtextField_2").toString());
		textField_3.setText(bk.getField("AtextField_3").toString());
		textField_4.setText(bk.getField("AtextField_4").toString());
		textField_5.setText(bk.getField("AtextField_5").toString());
		textField_6.setText(bk.getField("AtextField_6").toString());
		textField_7.setText(bk.getField("AtextField_7").toString());
		textField_8.setText(bk.getField("AtextField_8").toString());
		textField_9.setText(bk.getField("AtextField_9").toString());
		textField_10.setText(bk.getField("AtextField_10").toString());
		textField_11.setText(bk.getField("AtextField_11").toString());
		textField_12.setText(bk.getField("AtextField_12").toString());
		textField_13.setText(bk.getField("AtextField_13").toString());
		textField_14.setText(bk.getField("AtextField_14").toString());
		textField_15.setText(bk.getField("AtextField_15").toString());
	
		
	}
}

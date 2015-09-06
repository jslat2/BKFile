package gui;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Rectangle;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

import data.Property;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
public class PropertyBox extends JFrame{
	private JTextField textField;
	private JComboBox comboBox = new JComboBox();
	private JComboBox comboBox_1 = new JComboBox();
	private JTextArea textArea = new JTextArea();
	private ScheduleB b = new ScheduleB();
	private Property p = new Property();
	private int rowNum = 0;
	private JComboBox comboBox_2 = new JComboBox();
	private JTextField textField_1 = new JTextField();
	
	public PropertyBox() {


		setBounds(new Rectangle(0, 0, 800, 400));
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox_1, 0, SpringLayout.NORTH, comboBox);
		springLayout.putConstraint(SpringLayout.EAST, comboBox_1, -42, SpringLayout.EAST, getContentPane());
		getContentPane().setLayout(springLayout);
		
		JLabel lblDescriptionOfProperty = new JLabel("Description of Property");
		getContentPane().add(lblDescriptionOfProperty);
		
		JLabel lblValue = new JLabel("Value");
		getContentPane().add(lblValue);
		
		JLabel lblScheduleBCategory = new JLabel("Schedule B Category");
		springLayout.putConstraint(SpringLayout.NORTH, lblValue, 0, SpringLayout.NORTH, lblScheduleBCategory);
		springLayout.putConstraint(SpringLayout.NORTH, lblScheduleBCategory, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblDescriptionOfProperty, 0, SpringLayout.WEST, lblScheduleBCategory);
		springLayout.putConstraint(SpringLayout.WEST, lblScheduleBCategory, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblScheduleBCategory);
		
		JLabel lblOwner = new JLabel("Owner");
		springLayout.putConstraint(SpringLayout.NORTH, lblOwner, 0, SpringLayout.NORTH, lblValue);
		springLayout.putConstraint(SpringLayout.WEST, lblOwner, 0, SpringLayout.WEST, comboBox_1);
		getContentPane().add(lblOwner);
		
		

		springLayout.putConstraint(SpringLayout.NORTH, textArea, 6, SpringLayout.SOUTH, lblDescriptionOfProperty);
		springLayout.putConstraint(SpringLayout.WEST, textArea, 0, SpringLayout.WEST, lblDescriptionOfProperty);
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textArea, -242, SpringLayout.EAST, getContentPane());

		getContentPane().add(textArea);
		
		
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, comboBox, -242, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblDescriptionOfProperty, 6, SpringLayout.SOUTH, comboBox);

		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1. Cash On Hand", "2. Checking, savings, or other financial accounts", "3. Security deposits", "4. Household goods and furnishings", "5. Books, pictures, and other art objects", "6. Wearing apparrel", "7. Furs and jewelry", "8. Firearms and sports, photographic and other hobby equipment", "9. Interests in insurance policies", "10. Annuities", "11. Interests in an educational IRA or other qualified State tuition plan", "12. Interests in IRA, ERISA, Keogu, or other pension or profit sharing plans", "13. Stock and interests in incorporated and unincorporated businesses", "14. Interests in partnerships or joint ventures", "15. Government and corporate bonds and other instruments", "16. Accounts receivable", "17. Alimony, maintenance, support and property settlements ", "18. Other liquidated debts owed to debtor (including tax refunds)", "19. Equitable or future interests, life estates", "20. Interests in estate of a decedent, death benefit plan, life insurance policy, or trust", "21. Other contingent and unliquidated claims of every nature", "22. Patents, copyrights and other intellectual property", "23. Licenses, franchises and other general intangibles", "24. Customer lists and other compilations containing personally identifialbe information", "25. Automobiles, trucks, trailers, and other vehicles and accessories", "26. Boats, motors, and accessories", "27. Aircraft and accessories", "28. Office equipment, furnishings, and supplies", "29. Machinery, fixtures, equipment, and supplies used in business", "30. Inventory", "31. Animals", "32. Crops", "33. Farming equipment and implements", "34. Farm supplies, chemicals, and feed", "35. Other personal property of any kind not already listed"}));
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 6, SpringLayout.SOUTH, lblScheduleBCategory);
		getContentPane().add(comboBox);
		
		textField = new JTextField();


		springLayout.putConstraint(SpringLayout.WEST, comboBox_1, 6, SpringLayout.EAST, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, comboBox);
		springLayout.putConstraint(SpringLayout.WEST, lblValue, 0, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, comboBox);
		getContentPane().add(textField);
		textField.setColumns(10);

		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "H", "W", "J", "C"}));
		getContentPane().add(comboBox_1);
		
		JLabel lblExemptionClaimedif = new JLabel("Exemption Claimed (if applicable)");
		springLayout.putConstraint(SpringLayout.NORTH, lblExemptionClaimedif, 0, SpringLayout.NORTH, textArea);
		springLayout.putConstraint(SpringLayout.WEST, lblExemptionClaimedif, 0, SpringLayout.WEST, lblValue);
		getContentPane().add(lblExemptionClaimedif);
		
		

		springLayout.putConstraint(SpringLayout.NORTH, comboBox_2, 6, SpringLayout.SOUTH, lblExemptionClaimedif);
		springLayout.putConstraint(SpringLayout.WEST, comboBox_2, 6, SpringLayout.EAST, textArea);
		springLayout.putConstraint(SpringLayout.EAST, comboBox_2, 69, SpringLayout.EAST, lblExemptionClaimedif);
		getContentPane().add(comboBox_2);
		
		JLabel lblAmountOfClaimed = new JLabel("Amount of Claimed Exemption");
		springLayout.putConstraint(SpringLayout.NORTH, lblAmountOfClaimed, 6, SpringLayout.SOUTH, comboBox_2);
		springLayout.putConstraint(SpringLayout.WEST, lblAmountOfClaimed, 0, SpringLayout.WEST, lblValue);
		getContentPane().add(lblAmountOfClaimed);
		


		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblAmountOfClaimed);
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, lblValue);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, comboBox_2);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
			
				b.prop.add(rowNum, p);
				
			}
		});

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent arg0) {

		
				b.loadProp();
			}
		});
		
		textField_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				p.setExemptionAmount(getExemptionAmount());
			}
		});
		
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p.setExemption(getExemption());
			}
		});
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setCategory(getCategory());
			}
		});

		textArea.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				p.setDescription(getDescription());
			}
		});
		
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				p.setValue(getValue());
			}
		});
		
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.setOwner(getOwn());
			}
		});
	
	}
	
	public void setRowNum(int x){
		rowNum = x;
	}
	
	public String getDescription(){
		return textArea.getText();
	}
	
	public String getCategory(){
		return (String)comboBox.getSelectedItem();
	}
	
	public String getOwn(){
		return (String)comboBox_1.getSelectedItem();
	}
	
	public String getValue(){
		return textField.getText();
	}
	
	public void setDescription(String s){
		textArea.setText(s);
	}
	
	public void setCategory(String s){
		comboBox.setSelectedItem(s);
	}
	
	public void setOwn(String s){
		comboBox_1.setSelectedItem(s);
	}
	
	public void setValue(String s){
		textField.setText(s);
	}
	
	public void setExemption(String s){
		comboBox_2.setSelectedItem(s);
	}
	
	public void setExemptionAmount(String s){
		textField_1.setText(s);
	}
	public String getExemption(){
		return (String)comboBox.getSelectedItem();
	}
	
	public String getExemptionAmount(){
		return textField_1.getText();
	}
}


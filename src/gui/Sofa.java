package gui;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLayeredPane;
import javax.swing.JButton;

import java.awt.Rectangle;

import javax.swing.JLabel;

import data.BkFile;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Sofa extends JFrame{
	private BkFile bk = new BkFile();
	
	public Sofa() {
		JLabel lblSofa = new JLabel("Sofa 1");
		JLabel lblSofa_1 = new JLabel("Sofa 2");
		JLabel lblSofa_2 = new JLabel("Sofa 3A");
		JLabel lblSofa_3 = new JLabel("Sofa 3B");
		JLabel lblSofac = new JLabel("Sofa 3C");
		JLabel lblSofaa = new JLabel("Sofa 4A");
		JLabel lblSofab = new JLabel("Sofa 4B");
		JLabel lblSofa_4 = new JLabel("Sofa 5");
		JLabel lblSofaa_1 = new JLabel("Sofa 6A");
		JLabel lblSofab_1 = new JLabel("Sofa 6B");
		JLabel lblSofa_5 = new JLabel("Sofa 7");
		JLabel lblSofa_6 = new JLabel("Sofa 8");
		JLabel lblSofa_7 = new JLabel("Sofa 9");
		JLabel lblSofaa_2 = new JLabel("Sofa 10A");
		
		setBounds(new Rectangle(0, 0, 800, 1000));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		
		lblSofa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaOneBox b = new SofaOneBox();
					b.setVisible(true);
				}
			}
		});
		
		lblSofa_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaTwoBox b = new SofaTwoBox();
					b.setVisible(true);
				}
			}
		});
		lblSofa_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaThreeABox b = new SofaThreeABox();
					b.setVisible(true);
				}
			}
		});
		
		lblSofa_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaThreeBBox b = new SofaThreeBBox();
					
					b.setVisible(true);
				}
			}
		});
		
		lblSofac.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaThreeCBox b = new SofaThreeCBox();
			
					b.setVisible(true);
				}
			}
		});
		
		
		lblSofaa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaFourBox b = new SofaFourBox();
				
					b.setVisible(true);
				}
			}
		});
		
		
		lblSofab.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaFourBBox b = new SofaFourBBox();
				
					b.setVisible(true);
				}
			}
		});
		
		lblSofa_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaFiveBox b = new SofaFiveBox();
			
					b.setVisible(true);
				}
			}
		});
		
		
		lblSofaa_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaSixABox b = new SofaSixABox();		
					b.setVisible(true);
				}
			}
		});
		
		lblSofab_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaSixBBox b = new SofaSixBBox();
					b.setVisible(true);
				}
			}
		});
		
		lblSofa_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaSevenBox b = new SofaSevenBox();
					b.setVisible(true);
				}
			}
		});
		
		lblSofa_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaEightBox b = new SofaEightBox();
					b.setVisible(true);
				}
			}
		});
		
		lblSofa_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaNineBox b = new SofaNineBox();
					b.setVisible(true);
				}
			}
		});
		
		
		lblSofaa_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() ==2){
					SofaTenABox b = new SofaTenABox();
					b.setVisible(true);
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, lblSofa, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblSofa, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblSofa);
		
		
		springLayout.putConstraint(SpringLayout.NORTH, lblSofa_1, 6, SpringLayout.SOUTH, lblSofa);
		springLayout.putConstraint(SpringLayout.WEST, lblSofa_1, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofa_1);
		
		
		springLayout.putConstraint(SpringLayout.NORTH, lblSofa_2, 6, SpringLayout.SOUTH, lblSofa_1);
		springLayout.putConstraint(SpringLayout.WEST, lblSofa_2, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofa_2);
		
		
		springLayout.putConstraint(SpringLayout.NORTH, lblSofa_3, 6, SpringLayout.SOUTH, lblSofa_2);
		springLayout.putConstraint(SpringLayout.WEST, lblSofa_3, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofa_3);
		

		springLayout.putConstraint(SpringLayout.NORTH, lblSofac, 6, SpringLayout.SOUTH, lblSofa_3);
		springLayout.putConstraint(SpringLayout.WEST, lblSofac, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofac);
		

		springLayout.putConstraint(SpringLayout.NORTH, lblSofaa, 6, SpringLayout.SOUTH, lblSofac);
		springLayout.putConstraint(SpringLayout.WEST, lblSofaa, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofaa);
		

		springLayout.putConstraint(SpringLayout.NORTH, lblSofab, 6, SpringLayout.SOUTH, lblSofaa);
		springLayout.putConstraint(SpringLayout.WEST, lblSofab, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofab);
		

		springLayout.putConstraint(SpringLayout.NORTH, lblSofa_4, 6, SpringLayout.SOUTH, lblSofab);
		springLayout.putConstraint(SpringLayout.WEST, lblSofa_4, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofa_4);
		

		springLayout.putConstraint(SpringLayout.NORTH, lblSofaa_1, 6, SpringLayout.SOUTH, lblSofa_4);
		springLayout.putConstraint(SpringLayout.WEST, lblSofaa_1, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofaa_1);
		

		springLayout.putConstraint(SpringLayout.NORTH, lblSofab_1, 6, SpringLayout.SOUTH, lblSofaa_1);
		springLayout.putConstraint(SpringLayout.WEST, lblSofab_1, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofab_1);
		

		springLayout.putConstraint(SpringLayout.NORTH, lblSofa_5, 6, SpringLayout.SOUTH, lblSofab_1);
		springLayout.putConstraint(SpringLayout.WEST, lblSofa_5, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofa_5);
		

		springLayout.putConstraint(SpringLayout.NORTH, lblSofa_6, 6, SpringLayout.SOUTH, lblSofa_5);
		springLayout.putConstraint(SpringLayout.WEST, lblSofa_6, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofa_6);
		
		
		springLayout.putConstraint(SpringLayout.NORTH, lblSofa_7, 6, SpringLayout.SOUTH, lblSofa_6);
		springLayout.putConstraint(SpringLayout.WEST, lblSofa_7, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofa_7);
		

		springLayout.putConstraint(SpringLayout.NORTH, lblSofaa_2, 6, SpringLayout.SOUTH, lblSofa_7);
		springLayout.putConstraint(SpringLayout.WEST, lblSofaa_2, 0, SpringLayout.WEST, lblSofa);
		getContentPane().add(lblSofaa_2);
	}
}

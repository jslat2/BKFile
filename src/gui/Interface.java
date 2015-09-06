package gui;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import data.BkFile;
import data.TxtEdit;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;

public class Interface extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private final Action action = new SwingAction();
	public TxtEdit txt = new TxtEdit();
	ScheduleA schA = new ScheduleA();
	ScheduleB schB = new ScheduleB();
	ScheduleD schD = new ScheduleD();
	ScheduleG schG = new ScheduleG();
	ScheduleJ schJ = new ScheduleJ();
	Sofa sofa = new Sofa();
	B22 b22 = new B22();
	
	public Interface() {
		
		BkFile bk = new BkFile();
		VoluntaryPetition vp = new VoluntaryPetition();
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				bk.setRunning(false);
				txt.saveHash(bk.vars);
				try {
					txt.saveArray("C:/Users/Gaming/Desktop/a.txt", schB.prop);
					txt.saveDArray("C:/Users/Gaming/Desktop/b.txt", schD.debt);
					txt.saveGArray("C:/Users/Gaming/Desktop/c.txt", schG.contracts);
				} catch (FileNotFoundException a) {
					// TODO Auto-generated catch block
					a.printStackTrace();
				}

			System.exit(0);
			}
		});
	

		
		setBounds(new Rectangle(0, 0, 1280, 720));
		setBackground(Color.WHITE);
		getContentPane().setBackground(Color.WHITE);
		

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		JButton voluntaryPetitionButton = new JButton("Voluntary Petition");
		voluntaryPetitionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vp.setVisible(true);		
			}
		});
		fileMenu.add(voluntaryPetitionButton);
		
		JButton btnScheduleA = new JButton("Schedule A");
		btnScheduleA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				schA.setVisible(true);
			}
		});
		fileMenu.add(btnScheduleA);
		
		JButton btnScheduleB = new JButton("Schedule B");
		btnScheduleB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				schB.setVisible(true);
			}
		});
		fileMenu.add(btnScheduleB);
		
		JButton btnScheduleD = new JButton("Schedule D");
		btnScheduleD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				schD.setVisible(true);
			}
		});
		fileMenu.add(btnScheduleD);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton btnScheduleG = new JButton("Schedule G");
		btnScheduleG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				schG.setVisible(true);
			}
		});
		fileMenu.add(btnScheduleG);
		
		JButton btnScheduleJ = new JButton("Schedule J");
		btnScheduleJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				schJ.setVisible(true);
			}
		});
		fileMenu.add(btnScheduleJ);
		
		JButton btnSofa = new JButton("Sofa");
		btnSofa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sofa.setVisible(true);
			}
		});
		fileMenu.add(btnSofa);
		
		JButton btnB = new JButton("B22");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b22.setVisible(true);
			}
		});
		fileMenu.add(btnB);
		fileMenu.add(btnExit);
		
		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);
	}


	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

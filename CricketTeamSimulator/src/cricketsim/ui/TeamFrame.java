package cricketsim.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import cricketsim.model.CollectionOfCricketers;

public class TeamFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = -4850706096538947479L;
	
	public TeamFrame() {
		setTitle("Cricket Team Simulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(400, 450));
		
		JPanel teamManager = new JPanel(new BorderLayout());
		teamManager.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		// TODO: Support scrolling
		// XXX: Change this to store a list of Cricketers
		DefaultListModel<CollectionOfCricketers> listModel = new DefaultListModel<CollectionOfCricketers>();
		//listModel.addElement("Foo");
		//listModel.addElement("Bar");
		//listModel.addElement("Baz");
		JList<CollectionOfCricketers> teamList = new JList<>(listModel);
		
		JPanel teamManagerControls = new JPanel();
		teamManagerControls.setLayout(new BoxLayout(teamManagerControls, BoxLayout.Y_AXIS));
		teamManagerControls.setBorder(new EmptyBorder(0, 10, 0, 0));
		
		JButton btnAdd = new JButton("Add...");
		btnAdd.setMinimumSize(btnAdd.getPreferredSize());
		btnAdd.setMaximumSize(btnAdd.getPreferredSize());
		
		JButton btnEdit = new JButton("Edit...");
		btnEdit.setMinimumSize(btnAdd.getPreferredSize());
		btnEdit.setMaximumSize(btnAdd.getPreferredSize());
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setMinimumSize(btnAdd.getPreferredSize());
		btnDelete.setMaximumSize(btnAdd.getPreferredSize());
		
		teamManagerControls.add(btnAdd);
		teamManagerControls.add(Box.createVerticalStrut(5));
		teamManagerControls.add(btnEdit);
		teamManagerControls.add(Box.createVerticalStrut(5));
		teamManagerControls.add(btnDelete);
		
		teamManager.add(teamList, BorderLayout.CENTER);
		teamManager.add(teamManagerControls, BorderLayout.EAST);
		
		JPanel playerSelector = new JPanel();
		playerSelector.setBorder(new TitledBorder(
				new LineBorder(Color.black),
				"Select cricketers for a team"));
		// TODO: Add content to the player selector
		
		getContentPane().add(teamManager, BorderLayout.CENTER);
		getContentPane().add(playerSelector, BorderLayout.SOUTH);
		
		setLocationRelativeTo(null); // Centre window in middle of screen
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "") {
			
		}
	}
	
	/* private OptionPanel op;
	private JMenuBar jmb;
	private JMenu menu;
	private JMenuItem close;
	public TeamFrame(){
		jmb = new JMenuBar();
		setJMenuBar(jmb);
		menu = new JMenu("File");
		close = new JMenuItem("Exit");
		jmb.add(menu);
		menu.add(close);
		close.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setSize(400,400);
		op = new OptionPanel();
		this.add(op);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == close){
			System.exit(0);
		}
	} */
}

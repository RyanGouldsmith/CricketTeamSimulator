package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class OptionPanel extends JPanel{
	private JButton add; 
	private JButton edit;
	private JButton team;
	
	
	OptionPanel(){
		add = new JButton("Add to the Team");
		edit = new JButton("Edit Team");
		team = new JButton("View Team");
		add(add);
		add(edit);
		add(team);
		setBackground(Color.white);
		setSize(400,400);
		
	}
	
	
	
	
	
	
}

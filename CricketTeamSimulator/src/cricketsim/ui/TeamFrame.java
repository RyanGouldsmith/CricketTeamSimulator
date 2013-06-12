package cricketsim.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import cricketsim.model.Cricketer;

/**
 * The frame where a team of cricketers are passed into and can be viewed 
 * @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
 * @author Josh Tumath (josh@joshtumath.me.uk)
 */
public class TeamFrame extends JFrame {
	private static final long serialVersionUID = 2306204931609853516L;
	
	/**
	 * Constructs a JFrame with a type of team that has been passed in.
	 * @param type the type of cricket team to be displayed
	 * @param cricketers a list of all the cricketers in the team
	 */
	public TeamFrame(TeamType type, List<Cricketer> cricketers) {
		String typeString;
		
		switch(type) {
		case ATTACK:
			typeString = "Attack";
			break;
		case DEFENSE:
			typeString = "Defence";
			break;
		case NEUTRAL:
			typeString = "Neutral";
			break;
		default:
			typeString = null;
			break;
		}
		
		setTitle("Best " + typeString + " Team");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(400, 450));
		
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String[] columnNames = {
				"Name",
				"Age",
				"Position"};
		JTable table = new JTable(generateTable(cricketers), columnNames);
		JScrollPane tableScroll = new JScrollPane(table);
		contentPane.add(tableScroll, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		// TODO: Add labels for showing stats about the team
		contentPane.add(panel, BorderLayout.EAST);
		
		setLocationRelativeTo(null); // Centre window in middle of screen
	}
	
	private String[][] generateTable(List<Cricketer> cricketers) {
		// TODO
		
		// XXX: Test data
		String[][] foo = {
			{"Ryan Gouldsmith", "19", "Foo"},
			{"Josh Tumath", "19", "Bar"}
		};
		
		return foo;
	}
}

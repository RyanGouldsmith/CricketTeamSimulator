package cricketsim.ui;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;

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
		setTitle("Best " + type + " Team");
		setMinimumSize(new Dimension(400, 450));
		
		setLocationRelativeTo(null); // Centre window in middle of screen
	}
}

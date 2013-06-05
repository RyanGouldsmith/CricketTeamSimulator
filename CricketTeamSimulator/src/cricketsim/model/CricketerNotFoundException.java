package cricketsim.model;

import javax.swing.JOptionPane;
/**
 * Cricketer NotFoundException thrown at runtime if they can't find the cricketer
 * @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
 * @author Josh Tumath(josh@joshtumath.me.uk)
 *
 */
public class CricketerNotFoundException extends Exception {
	
	CricketerNotFoundException(){
		JOptionPane.showMessageDialog(null, "Unable to find the cricketer!");
	}

}

package cricketsim.ui;

import javax.swing.JFrame;

import cricketsim.model.Cricketer;

/**
 * The frame where the user can create and edit cricketers
 * @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
 * @author Josh Tumath (josh@joshtumath.me.uk)
 */
public class EditorFrame extends JFrame {
	private static final long serialVersionUID = -4964057070380152636L;
	
	/**
	 * Construct a frame with empty fields to create a new cricketer
	 */
	public EditorFrame() {
		// TODO: Create the frame's content
	}
	
	public EditorFrame(Cricketer cricketer) {
		this();
		
		// TODO: Populate the frame's content with data from the cricketer
	}
}

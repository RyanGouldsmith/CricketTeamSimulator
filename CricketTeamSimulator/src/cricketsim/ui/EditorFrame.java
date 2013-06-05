package cricketsim.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
		setTitle("Cricket Team Simulator");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMinimumSize(new Dimension(400, 450));
		JPanel editorManager = new JPanel(new BorderLayout());
		editorManager.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JPanel editorManagerControls = new JPanel();
		editorManagerControls.setLayout(new BoxLayout(editorManagerControls, BoxLayout.Y_AXIS));
		editorManagerControls.setBorder(new EmptyBorder(0, 10, 0, 0));
		
		
		
		getContentPane().add(editorManager, BorderLayout.CENTER);
		setLocationRelativeTo(null); // Centre window in middle of screen
	}
	
	/**
	 * Construct a frame with data from an already existing cricketer to
	 * edit their details.
	 * @param cricketer a cricketer
	 */
	public EditorFrame(Cricketer cricketer) {
		this();
		
		// TODO: Populate the frame's content with data from the cricketer
	}
}

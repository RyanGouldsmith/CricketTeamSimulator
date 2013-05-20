package cricketsim;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import cricketsim.GUI.OptionFrame;

/**
* @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
* @author Josh Tumath (josh@joshtumath.me.uk)
*/
public class Main {
	public static void main(String[] args) {
		// Set the look and feel to a native system UI.
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException|ClassNotFoundException
				|InstantiationException|IllegalAccessException e) {
			e.printStackTrace();
		}
		
		// Open the app's window.
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				OptionFrame mainWindow = new OptionFrame();
				mainWindow.setVisible(true);
			}
		});
	}
}

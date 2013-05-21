package cricketsim;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import cricketsim.ui.TeamFrame;

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
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				TeamFrame mainWindow = new TeamFrame();
				mainWindow.setVisible(true);
			}
		});
	}
}

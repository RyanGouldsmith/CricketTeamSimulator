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
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import cricketsim.model.CollectionOfCricketers;
import cricketsim.model.Cricketer;
import cricketsim.model.CricketerNotFoundException;

/**
 * The frame where the user can manage the team of cricketers
 * @author Ryan Gouldsmith (ryangouldsmith@gmail.com)
 * @author Josh Tumath (josh@joshtumath.me.uk)
 */
public class TeamFrame extends JFrame {
	private static final long serialVersionUID = -4850706096538947479L;
	
	private DefaultListModel<CollectionOfCricketers> cricketerList = new DefaultListModel<CollectionOfCricketers>();
	private CollectionOfCricketers cricketerCollection = new CollectionOfCricketers();
	/**
	 * Construct a new window to manage a team of cricketers
	 */
	public TeamFrame() {
		setTitle("Cricket Team Simulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(400, 450));
		
		JPanel teamManager = new JPanel(new BorderLayout());
		teamManager.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		// TODO: Support scrolling
		
		JList<CollectionOfCricketers> teamList = new JList<>(cricketerList);
		
		JPanel teamManagerControls = new JPanel();
		teamManagerControls.setLayout(new BoxLayout(teamManagerControls, BoxLayout.Y_AXIS));
		teamManagerControls.setBorder(new EmptyBorder(0, 10, 0, 0));
		
		JButton btn;
		
		btn = new JButton("Add...");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addCricketer();
			}
		});
		teamManagerControls.add(btn);
		
		teamManagerControls.add(Box.createVerticalStrut(5));
		
		btn = new JButton("Edit...");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				editCricketer(null);
			}
		});
		teamManagerControls.add(btn);
		
		teamManagerControls.add(Box.createVerticalStrut(5));
		
		btn = new JButton("Delete");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					deleteCricketer(null);
				} catch (CricketerNotFoundException e1) {
				}
			}
		});
		teamManagerControls.add(btn);
		
		teamManager.add(teamList, BorderLayout.CENTER);
		teamManager.add(teamManagerControls, BorderLayout.EAST);
		
		JPanel playerSelector = new JPanel();
		playerSelector.setBorder(new TitledBorder(
				new LineBorder(Color.black),
				"Select cricketers for a team"));
		
		// TODO: Add content to the playerSelector panel
		
		getContentPane().add(teamManager, BorderLayout.CENTER);
		getContentPane().add(playerSelector, BorderLayout.SOUTH);
		
		setLocationRelativeTo(null); // Centre window in middle of screen
	}
	
	/**
	 * Open the editor window to add a new cricketer to the list
	 */
	private void addCricketer() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				EditorFrame window = new EditorFrame();
				window.setVisible(true);
			}
		});
		
		// TODO: Find a way to detect when the dialog window closes so that the
		//       new cricketer can be added to the cricketerList.
	}
	
	/**
	 * Open the editor window to edit the currently selected cricketer in the
	 * list
	 * @param cricketer the selected cricketer
	 */
	private void editCricketer(final Cricketer cricketer) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				EditorFrame window = new EditorFrame(cricketer);
				window.setVisible(true);
			}
		});
		
		// TODO: Get the selected cricketer in the cricketerList and open it
	}
	
	/**
	 * Delete the currently selected cricketer in the list
	 * @param cricketer
	 * @throws CricketerNotFoundException 
	 * @param cricketer the selected cricketer
	 */
	private void deleteCricketer(final Cricketer cricketer) throws CricketerNotFoundException {
		cricketerCollection.removeCricketer(cricketer);
	}
}

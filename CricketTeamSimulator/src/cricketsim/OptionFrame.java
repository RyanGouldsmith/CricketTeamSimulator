package cricketsim;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class OptionFrame extends JFrame implements ActionListener{
	private OptionPanel op;
	private JMenuBar jmb;
	private JMenu menu;
	private JMenuItem close;
	OptionFrame(){
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

}
}

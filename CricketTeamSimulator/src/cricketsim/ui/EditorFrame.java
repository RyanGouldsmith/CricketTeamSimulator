package cricketsim.ui;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JEditorPane;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import cricketsim.model.Cricketer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditorFrame extends JDialog {
	private JTextField nameField;
	private String name = "";

	/**
	 * Create the dialog.
	 */
	public EditorFrame() {
		setBounds(100, 100, 305, 342);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("106px"),
				ColumnSpec.decode("30px"),
				ColumnSpec.decode("59px"),
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("81px"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("78px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("19px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("24px"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormFactory.PARAGRAPH_GAP_ROWSPEC,
				RowSpec.decode("25px"),}));
		{
			JEditorPane userPhotoBox = new JEditorPane();
			userPhotoBox.setForeground(Color.ORANGE);
			userPhotoBox.setFont(new Font("Dialog", Font.BOLD, 30));
			userPhotoBox.setText("User Photo");
			userPhotoBox.setBackground(Color.GRAY);
			getContentPane().add(userPhotoBox, "2, 2, fill, fill");
		}
		{
			JLabel nameLabel = new JLabel("Name");
			getContentPane().add(nameLabel, "2, 4, left, center");
		}
		{
			nameField = new JTextField();
			getContentPane().add(nameField, "4, 4, 3, 1, fill, top");
			nameField.setColumns(10);
			
			
		}
		{
			JLabel genderLabel = new JLabel("Gender");
			getContentPane().add(genderLabel, "2, 6, left, center");
		}
		{
			JRadioButton maleRadioBtn = new JRadioButton("Male");
			getContentPane().add(maleRadioBtn, "4, 6, left, top");
			maleRadioBtn.setVerticalAlignment(SwingConstants.BOTTOM);
		}
		{
			JRadioButton femaleRadioBtn = new JRadioButton("Female");
			femaleRadioBtn.setVerticalAlignment(SwingConstants.TOP);
			getContentPane().add(femaleRadioBtn, "6, 6, left, top");
		}
		{
			JLabel positionLabel = new JLabel("Position");
			getContentPane().add(positionLabel, "2, 8, fill, center");
		}
		{
			JComboBox positionCombo = new JComboBox();
			positionCombo.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "E", "D"}));
			getContentPane().add(positionCombo, "4, 8, 3, 1, fill, top");
		}
		{
			JLabel appearanceLabel = new JLabel("Appearances");
			getContentPane().add(appearanceLabel, "2, 10, fill, center");
		}
		{
			JSpinner appearanceSelector = new JSpinner();
			getContentPane().add(appearanceSelector, "4, 10, fill, top");
		}
		{
			JLabel wicketsLabel = new JLabel("Wickets");
			getContentPane().add(wicketsLabel, "2, 12, fill, center");
		}
		{
			JSpinner wicketSelector = new JSpinner();
			getContentPane().add(wicketSelector, "4, 12, fill, top");
		}
		{
			JLabel totalRunsLabel = new JLabel("Total Runs");
			getContentPane().add(totalRunsLabel, "2, 14, left, center");
		}
		{
			JSpinner totalRunSelector = new JSpinner();
			getContentPane().add(totalRunSelector, "4, 14, fill, top");
		}
		{
			JButton okButton = new JButton("OK");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					getAllContents();
					System.out.print(name);
			
				}
			});
			getContentPane().add(okButton, "4, 16, left, top");
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancel");
			getContentPane().add(cancelButton, "6, 16, left, top");
			cancelButton.setActionCommand("Cancel");
		}
	}
	
	protected void getAllContents(){
		name = nameField.getText();
		
	}
	

}

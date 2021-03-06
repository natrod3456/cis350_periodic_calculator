package cis350;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
/**********************************************************************
 * The Gui component containing the display of values and
 * functional buttons
 * @author Eric,Greg,Richard,Natalie
 * @version 10/18/2017
 *********************************************************************/
public class MathGui extends JPanel {
	
	/******************************************************************
	 * Generated serialVersionUID.
	 *****************************************************************/
	private static final long serialVersionUID = -6505079102457304012L;
	
	/** molecule is the output representing elements **/
	private JLabel molecule;

	 /** atomicWt is the output of the overall weight **/
	private JLabel atomicWt;
	
	 /** mode is the output of which mode the buttons are in **/
	private JLabel mode;

	 /** clear button to empty the string **/
	private JButton clear;
	
	/** currently empty button to be used later **/
	private JButton undo;
	
	/** Changes between add and remove modes **/
	private JButton switchMode;
	

	
	

	/******************************************************************
	 * default constructor for class
	 *****************************************************************/
	public MathGui() {
		this.setLayout(new GridBagLayout());
		molecule = new JLabel(); 
		atomicWt = new JLabel();
		mode = new JLabel();
		
		clear = new JButton("Clear");
		undo = new JButton("");
		switchMode = new JButton("Add/Remove");

		//add(molecule);
		GridBagConstraints loc = new GridBagConstraints();
		loc.gridx = 0;
		loc.gridy = 0;
		add(clear, loc);
		
		//add(atomicWt);
		//add(undo);
		loc.gridx = 1;
		loc.insets = new Insets(5,5,5,5);
		add(mode, loc);
		
		loc.gridx = 2;
		add(switchMode, loc);
		
		
		
		
	}

	/******************************************************************
	 * returns the clear button to the controller
	 * @return clear the button to be used
	 *****************************************************************/
	public JButton getClear() {
		return clear;
	}
	
	/******************************************************************
	 * returns the mode switch button to the controller
	 * @return switchMode the button to be sent
	 *****************************************************************/
	public JButton getMode() {
		return switchMode;
	}
	
	/******************************************************************
	 * sets the display text for the molecule
	 * @param text the text to be displayed
	 *****************************************************************/
	public void updateMolecule(final String text) {
		molecule.setText(text);
	}
	
	/******************************************************************
	 * sets the displayed weight to the argument weight.
	 * @param string the mass number to be used
	 *****************************************************************/
	public void updateWeight(final String string) {
		atomicWt.setText(String.valueOf(string));
	}
	
	/******************************************************************
	 * sets the text for the mode on the display
	 * @param newMode the text to be used
	 *****************************************************************/
	public void updateMode(final String newMode) {
		mode.setText(newMode);
	}
}

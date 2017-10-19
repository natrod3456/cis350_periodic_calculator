package cis350;

/**********************************************************************
 * The controller class that holds the various gui elements
 * and manages the math class containing the calculations
 * @author Gregory, Eric, Natalie, Richard
 * @date 10/18/2017
 *********************************************************************/

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;

/**
 * PeriodicCalculator holds the gui functions.
 *
 */
public class PeriodicCalculator extends JFrame implements ActionListener {
	
	/** default generated Serial ID. */
	private static final long serialVersionUID = 1L;

	/** The clickable periodic table for calling functions. */
	PeriodicTable table;

	/** The class containing the math functions. */
	MathCalc calculator;
	
	/** Allows switching between adding and removing elements. */
	Boolean remove;
	
	/** Decimal format used for the display. */
	DecimalFormat format;
	
	/******************************************************************
	 * the default constructor for the class.
	 *****************************************************************/
	public PeriodicCalculator() {
		format = new DecimalFormat("#.000");
		table = new PeriodicTable();
		calculator = new MathCalc();
		remove = false;
		
		// initializes some values for the table
		table.getDisplay().updateMode("Mode: Add");
		table.getDisplay().updateMolecule("empty");
		table.getDisplay().updateWeight("0");
		
		setLayout(new BorderLayout());
		add(table, BorderLayout.CENTER);
		
		// creates an actionlistener for each button on the table
		for (int i = 1; i < 118; i++) {
			table.findButton(i).addActionListener(this);
		}
		
		// creates actionlisteners for the additional buttons
		table.getDisplay().getClear().addActionListener(this);
		table.getDisplay().getMode().addActionListener(this);
		setVisible(true);
		
	}
	
	/******************************************************************
	 * Contains all actions that are performed by actionlisteners.
	 *****************************************************************/
	public void actionPerformed(ActionEvent e) {
		
		// loops through all periodic table buttons
		for (int i = 1; i < 118; i++) {
			if (e.getSource() == table.findButton(i)) {
				
				// checks to see which Mode is active
				if (!remove) {
					calculator.addElement(Elements.values()
							[i - 1]);
				} else {
					calculator.removeElement(Elements
							.values()[i - 1]);
				}
			}
			
			// if clear button is pressed, empties arraylist
			if (e.getSource() == table.getDisplay().getClear()) {
				calculator.clearList();
				table.getDisplay().updateMolecule("empty");
				table.getDisplay().updateWeight("0");
				return;
			}
			
			// switches the active Mode
			if (e.getSource() == table.getDisplay().getMode()) {
				if (remove) {
					remove = false;
					table.getDisplay().updateMode(
							"Mode: Add");
				} else {
					remove = true;
					table.getDisplay().updateMode(
							"Mode: Remove");
				}
			}
			
			// updates the text for the display after each action
			table.getDisplay().updateMolecule(
					calculator.toString());
			table.getDisplay().updateWeight(
					format.format(calculator.getWeight()));

		}
	}
}

		



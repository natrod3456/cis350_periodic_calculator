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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PeriodicCalculator extends JFrame implements ActionListener {
	
	/** default generated Serial ID */
	private static final long serialVersionUID = 1L;

	/** The clickable periodic table for calling functions */
	PeriodicTable table;
	
	/** The class containing the math functions */
	MathCalc calculator;
	
	/** Allows switching between adding and removing elements */
	Boolean remove;
	
	/** Decimal format used for the display */
	DecimalFormat format;
	
	private JMenu menu;
	
	private JMenu inputMenu;
	
	private JMenuBar menuBar;
	
	private JMenuItem stoicMenu;
	
	private JMenuItem inputOutputMenu;
	
	/******************************************************************
	 * the default constructor for the class.
	 *****************************************************************/
	public PeriodicCalculator() {
		format = new DecimalFormat("#.000");
		table = new PeriodicTable();
		calculator = new MathCalc();
		remove = false;
		
		menu = new JMenu("Functions");
		menuBar = new JMenuBar();
		inputMenu = new JMenu("Input/Output");
		menuBar.add(menu);
		menuBar.add(inputMenu);
		stoicMenu = new JMenuItem("Stoichiometry");
		stoicMenu.addActionListener(this);
		inputOutputMenu = new JMenuItem("Change Mode");
		inputOutputMenu.addActionListener(this);
		menu.add(stoicMenu);
		inputMenu.add(inputOutputMenu);
		this.setJMenuBar(menuBar);
		
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
					//calculator.addElement(Elements.values()[i - 1]);
					if (table.getMode()){
						table.addToInputList(Elements.values()[i - 1]);
					}else{
						table.addToOutputList(Elements.values()[i - 1]);
					}
					
				} else {
					//calculator.removeElement(Elements.values()[i - 1]);
					if (table.getMode()){
						table.removeFromInputList(Elements.values()[i - 1]);
					}else{
						table.removeFromOutputList(Elements.values()[i - 1]);
					}
				}
			}
			
			// if clear button is pressed, empties arraylist
			if (e.getSource() == table.getDisplay().getClear()) {
				if (table.getMode()){
					table.clearInput();
				}else{
					table.clearOutput();
				}
			}
			
			// switches the active Mode
			if (e.getSource() == table.getDisplay().getMode()){
				if (remove){
					remove = false;
					table.getDisplay().updateMode("Mode: Add");
				}else{
					remove = true;
					table.getDisplay().updateMode("Mode: Remove");
				}
			}
			
			if (e.getSource() == stoicMenu){
				//mathcalc.stoichiometry();
			}
			
			if (e.getSource() == inputOutputMenu){
				table.modeSwitch();
			}
			
			// updates the text for the display after each action
			table.getDisplay().updateMolecule(calculator.toString());
			table.getDisplay().updateWeight(format.format(calculator.getWeight()));
			table.refresh();

		}
	}
}

		



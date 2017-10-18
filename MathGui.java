package cis350;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author Eric,Greg,Richard,Natalie
 *
 */
public class MathGui extends JPanel {
	/**
	 * Generated serialVersionUID.
	 */
	private static final long serialVersionUID = -6505079102457304012L;
	/**
	 * molecule is the output representing elements.
	 */
	private JLabel molecule;
	/**
	 * atomicWt is the output of the overall weight.
	 */
	private JLabel atomicWt;
	/**
	 * mode is the output of which mode the buttons are in.
	 */
	private JLabel mode;
	/**
	 * clear button to empty the string.
	 */
	private JButton clear;
	/**
	 * undo makes an empty space.
	 */
	private JButton undo;
	/**
	 * switchMode changes the behavior of the buttons.
	 */
	private JButton switchMode;
	/**
	 * MathGui is the gui for the program.
	 */
	public MathGui() {
		this.setLayout(new GridLayout(3, 3));
		molecule = new JLabel(); 
		atomicWt = new JLabel();
		mode = new JLabel();
		
		clear = new JButton("Clear");
		undo = new JButton("");
		switchMode = new JButton("Add/Remove");

		add(molecule);
		add(clear);
		add(atomicWt);
		add(undo);
		add(mode);
		add(switchMode);
		
	}
	/**
	 * return undo.
	 * @return return undo
	 */
	public JButton getUndo() {
		return undo;
	}
	/**
	 * returns clear.
	 * @return returns clear
	 */
	public JButton getClear() {
		return clear;
	}
	/**
	 * returns switch mode.
	 * @return returns switch mode
	 */
	public JButton getMode() {
		return switchMode;
	}
	/**
	 * updateMolecule sets molecule to text.
	 * @param text text of elements for molecule
	 */
	public void updateMolecule(final String text) {
		molecule.setText(text);
	}
	/**
	 * updateWeight sets atomicWt to the argument weight.
	 * @param weight atomic mass
	 */
	public void updateWeight(final double weight) {
		atomicWt.setText(String.valueOf(weight));
	}
	/**
	 * undateMode takes string argument and sets mode.
	 * @param newMode new string for mode
	 */
	public void updateMode(final String newMode) {
		mode.setText(newMode);
	}
}

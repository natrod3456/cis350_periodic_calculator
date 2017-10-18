/**
 * ElementButton is used to produce the element's JButton in our periodic table.
 * 
 * @since 10/18/2017
 * @author Greg, Eric, Natalie, Richard
 * @version 1.0
 */

package cis350;

import java.awt.Insets;

import javax.swing.JButton;

/**
 * Creates the JButton for the elements used in the periodic table.
 * @param
 */
public class ElementButton extends JButton {
	
	private static final long serialVersionUID = 999;
	
	/**
	 *  Value of the height for the JButton.
	 *  @param
	 */
	private final int HEIGHT = 43;
	
	/**
	 * Value of the length for the JButton.
	 * @param
	 */
	private final int LENGTH = 50;
	
	/**
	 * This is the class constructor. 	
	 * @param element gets the element from the periodic table.
	 */
	public ElementButton(final Elements element) {
		setSize(HEIGHT, LENGTH);
		this.setIcon(element.getIcon());
		this.setMargin(new Insets(0, 0, 0, 0));
		this.setVisible(true);
	}
	
}

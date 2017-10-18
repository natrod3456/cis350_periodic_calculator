package cis350;

import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
/**
 * 
 * @author Greg, Eric, Natalie, Richard
 *
 */
public class PeriodicTable extends JPanel {
	/**
	 * ArrayList of ElemenButtons. 
	 */
	private ArrayList<ElementButton> buttonList;

	/**
	 * A private MathGui variable. 
	 */
	private MathGui display;

/**
 * Constructor for PeriodicTable.
 */
public PeriodicTable() {
	GridBagLayout gridBagLayout = new GridBagLayout();
	setLayout(gridBagLayout);
	display = new MathGui();
	
	
	buttonList = new ArrayList<ElementButton>();
	ElementButton none = new ElementButton(Elements.H);
	buttonList.add(none);
	
	for (
			Elements element : Elements.values()) {
		ElementButton temp = new ElementButton(element);
		buttonList.add(temp);
	}
	
	
	GridBagConstraints loc = new GridBagConstraints();
	loc.fill = GridBagConstraints.NONE;
	loc.gridx = 0;
	loc.gridy = 0;
	add(buttonList.get(1), loc);
	
	loc.gridx = 17;
	add(buttonList.get(2), loc);
	
	loc.gridx = 0;
	loc.gridy = 1;
	add(buttonList.get(3), loc);
	
	loc.gridx = 1;
	add(buttonList.get(4), loc);
	
	int count1 = 5;
	for (
			int i = 12; i <= 17; i++) {
		loc.gridx = i;
		add(buttonList.get(count1), loc);
		count1++;
	}
	
	loc.gridx = 0;
	loc.gridy = 2;
	add(buttonList.get(11), loc);
	
	loc.gridx = 1;
	add(buttonList.get(12), loc);
	
	int count2 = 13;
	for (
			int i = 12; i <= 17; i++) {
		loc.gridx = i;
		add(buttonList.get(count2), loc);
		count2++;
	}
	
	for (
			int i = 3; i <= 4; i++) {
		loc.gridy = i;
		for (
				int j = 0; j < 18; j++) {
			loc.gridx = j;
			add(buttonList.get(count2),  loc);
			count2++;
		}
	}
	
	loc.gridy = 5;
	loc.gridx = 0;
	add(buttonList.get(count2), loc);
	count2++;
	
	loc.gridx = 1;
	add(buttonList.get(count2), loc);
	count2++;

	loc.gridx = 2;
	ImageIcon range1 = new ImageIcon("src/E57_71.png");
	JButton bRange1 = new JButton(range1);
	Insets inset = new Insets(0, 0, 0, 0);
	bRange1.setMargin(inset);
	bRange1.setContentAreaFilled(false);
	add(bRange1, loc);
	
	loc.gridx = 2;
	loc.gridy = 6;
	ImageIcon range2 = new ImageIcon("src/E89_103.png");
	JButton bRange2 = new JButton(range2);
	bRange2.setMargin(inset);
	bRange2.setContentAreaFilled(false);
	add(bRange2, loc);

	loc.gridy = 5;
	count2 = 72;
		for (
				int j = 3; j < 18; j++) {
			loc.gridx = j;
			add(buttonList.get(count2), loc);
			count2++;
		}
	
	loc.gridy = 6;
	loc.gridx = 0;
	add(buttonList.get(count2), loc);
	count2++;
	
	loc.gridx = 1;
	add(buttonList.get(count2), loc);
	count2++;
	
	count2 = 104;
	for (
			int i = 3; i < 18; i++) {
		loc.gridx = i;
		add(buttonList.get(count2), loc);
		count2++;
	}
	
	loc.insets = new Insets(10, 0, 0, 0);
	
	count2 = 57;
	loc.gridy = 7;
	for (int i = 2; i < 17; i++) {
		loc.gridx = i;
		add(buttonList.get(count2), loc);
		count2++;
	}
	
	loc.insets = new Insets(0, 0, 0, 0);
	loc.gridy = 8;
	count2 = 89;
	for (
			int i = 2; i < 17; i++) {
		loc.gridx = i;
		add(buttonList.get(count2), loc);
		count2++;
	}
	
	loc.gridx = 2;
	loc.gridy = 0;
	loc.gridwidth = 10;
	loc.gridheight = 3;
	add(display, loc);
	

	setVisible(true);
}
/**
 * 
 * @param number to find element button
 * @return an elementButton according to atomic number in periodic table
 */
	public ElementButton findButton(final int number) {
		return buttonList.get(number);
	}
	
	/**
	 * 
	 * @return display of periodic table
	 */
public MathGui getDisplay() {
		return display;
	}

/**
 * 
 * @return an array list of buttons
 */
public ArrayList<ElementButton> getButtonList() {
	return buttonList;
}

}



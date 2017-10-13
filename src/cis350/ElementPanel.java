package cis350;

import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ElementPanel extends JPanel {
	private JLabel title;
	private JLabel number;
	private JLabel weight;
	private JButton button;
	private final int HEIGHT = 43;
	private final int LENGTH = 50;
	
	public ElementPanel() {
		setLayout(new GridLayout(1,1));
		setSize(HEIGHT, LENGTH);
		setVisible(true);
	}
	
	public ElementPanel(Elements element) {
		setLayout(new GridLayout(1,1));
		setSize(HEIGHT, LENGTH);
		button = new JButton(element.getIcon());
		button.setContentAreaFilled(false);
		Insets inset = new Insets(0,0,0,0);
		button.setMargin(inset);
		add(button);
		button.setVisible(true);
		
	}
}

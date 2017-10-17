package cis350;

import java.awt.Insets;

import javax.swing.JButton;

public class ElementButton extends JButton{
	private final int HEIGHT = 43;
	private final int LENGTH = 50;
	
	public ElementButton(Elements element){
		setSize(HEIGHT, LENGTH);
		this.setIcon(element.getIcon());
		this.setMargin(new Insets(0,0,0,0));
		this.setVisible(true);
	}
	
}

package cis350;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MathGui extends JPanel{
	JLabel molecule;
	JLabel atomicWt;
	JLabel mode;
	JButton clear;
	JButton undo;
	JButton switchMode;
	
	public MathGui(){
		this.setLayout(new GridLayout(3,3));
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
	
	public JButton getUndo(){
		return undo;
	}
	
	public JButton getClear(){
		return clear;
	}
	
	public JButton getMode(){
		return switchMode;
	}
	
	public void updateMolecule(String text){
		molecule.setText(text);
	}
	
	public void updateWeight(double weight){
		atomicWt.setText(String.valueOf(weight));
	}
	
	public void updateMode(String newMode){
		mode.setText(newMode);
	}
}

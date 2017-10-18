package cis350;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MathGui extends JPanel{
	JLabel molecule;
	JLabel atomicWt;
	JButton clear;
	JButton undo;
	
	public MathGui(){
		this.setLayout(new GridBagLayout());
		molecule = new JLabel();
		atomicWt = new JLabel();
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		
		GridBagConstraints loc = new GridBagConstraints();
		loc.gridx = 0;
		loc.gridy = 0;
		add(molecule, loc);
		
		loc.gridy = 1;
		add(atomicWt, loc);
		
		loc.gridy = 2;
		add(clear);
		
		loc.gridx = 1;
		add(undo);
	}
	
	public JButton getUndo(){
		return undo;
	}
	public JButton getClear(){
		return clear;
	}
	public void updateMolecule(String text){
		molecule.setText(text);
	}
	
	public void updateWeight(double weight){
		atomicWt.setText(String.valueOf(weight));
	}
}

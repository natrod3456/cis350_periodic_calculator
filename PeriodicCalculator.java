package cis350;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class PeriodicCalculator extends JFrame implements ActionListener{
	PeriodicTable table;
	MathCalc calculator;
	MathGui display;
	
	public PeriodicCalculator(){
		table = new PeriodicTable();
		calculator = new MathCalc();
		display = new MathGui();
		display.updateMolecule("empty");
		display.updateWeight(0);
		
		setLayout(new BorderLayout());
		add(table, BorderLayout.CENTER);
		add(display, BorderLayout.NORTH);
		
		for (int i = 1; i < 118; i++){
			table.findButton(i).addActionListener(this);
		}
		
		display.getClear().addActionListener(this);
		display.getUndo().addActionListener(this);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		for (int i = 1; i < 118; i++){
			if (e.getSource() == table.findButton(i)){
				calculator.addElement(Elements.values()[i - 1]);
			}
			
			if (e.getSource() == display.getClear()){
				calculator.clearList();
				display.updateMolecule("empty");
				display.updateWeight(0);
				return;
			}
			
			if (e.getSource() == display.getUndo()){
				calculator.undo();
			}
			
			display.updateMolecule(calculator.toString());
			display.updateWeight(calculator.getWeight());

		}
		
	}

}

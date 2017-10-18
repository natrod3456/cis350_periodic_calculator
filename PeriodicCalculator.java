package cis350;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PeriodicCalculator extends JFrame implements ActionListener {
	PeriodicTable table;
	MathCalc calculator;
	Boolean remove;
	
	public PeriodicCalculator() {
		table = new PeriodicTable();
		calculator = new MathCalc();
		remove = false;
		table.display.updateMode("Mode: Add");
		
		table.display.updateMolecule("empty");
		table.display.updateWeight(0);
		
		setLayout(new BorderLayout());
		add(table, BorderLayout.CENTER);
		
		for (int i = 1; i < 118; i++){
			table.findButton(i).addActionListener(this);
		}
		
		table.display.getClear().addActionListener(this);
		table.display.getMode().addActionListener(this);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		for (int i = 1; i < 118; i++){
			if (e.getSource() == table.findButton(i)){
				if (!remove){
					calculator.addElement(Elements.values()[i - 1]);
				}else{
					calculator.removeElement(Elements.values()[i - 1]);
				}
			}
			
			if (e.getSource() == table.display.getClear()){
				calculator.clearList();
				table.display.updateMolecule("empty");
				table.display.updateWeight(0);
				return;
			}
			
			
			if (e.getSource() == table.display.getMode()){
				if (remove){
					remove = false;
					table.display.updateMode("Mode: Add");
				}else{
					remove = true;
					table.display.updateMode("Mode: Remove");
				}
			}
			
			table.display.updateMolecule(calculator.toString());
			table.display.updateWeight(calculator.getWeight());

		}
	}
}

		



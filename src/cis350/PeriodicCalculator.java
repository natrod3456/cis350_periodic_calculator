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
		table.getDisplay().updateMode("Mode: Add");
		
		table.getDisplay().updateMolecule("empty");
		table.getDisplay().updateWeight(0);
		
		setLayout(new BorderLayout());
		add(table, BorderLayout.CENTER);
		
		for (int i = 1; i < 118; i++){
			table.findButton(i).addActionListener(this);
		}
		
		table.getDisplay().getClear().addActionListener(this);
		table.getDisplay().getMode().addActionListener(this);
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
			
			if (e.getSource() == table.getDisplay().getClear()){
				calculator.clearList();
				table.getDisplay().updateMolecule("empty");
				table.getDisplay().updateWeight(0);
				return;
			}
			
			
			if (e.getSource() == table.getDisplay().getMode()){
				if (remove){
					remove = false;
					table.getDisplay().updateMode("Mode: Add");
				}else{
					remove = true;
					table.getDisplay().updateMode("Mode: Remove");
				}
			}
			
			table.getDisplay().updateMolecule(calculator.toString());
			table.getDisplay().updateWeight(calculator.getWeight());

		}
	}
}

		



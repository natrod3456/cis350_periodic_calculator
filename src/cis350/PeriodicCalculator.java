package cis350;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class PeriodicCalculator extends JFrame implements ActionListener{
	PeriodicTable table;
	public PeriodicCalculator(){
		table = new PeriodicTable();
		setLayout(new BorderLayout());
		add(table, BorderLayout.CENTER);
		
		for (int i = 1; i < 118; i++){
			table.findButton(i).addActionListener(this);
		}
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		for (int i = 1; i < 118; i++){
			if (e.getSource() == table.findButton(i)){
				//mathCalc.addElement(i);
				System.out.println(i);
			}

		}
		
	}

}

package cis350;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PeriodicCalculator extends JFrame implements ActionListener{
	PeriodicTable table;
	int count = 0;
	private JButton testButton;
	
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
		JButton b = (JButton) e.getSource();
		for (int i = 1; i < 118; i++){
			if (e.getSource() == table.findButton(i)){
				if(testButton == b){
				//mathCalc.addElement(i);
				count++;
				}
				else
					count = 1;
				System.out.println(table.addElement(i, count));
				testButton = b;
			}

		}
		
		
	}

}

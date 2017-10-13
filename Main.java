package cis350;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		PeriodicTable table = new PeriodicTable();
		frame.add(table);
		frame.setVisible(true);
	}
}
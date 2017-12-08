package cis350;

/**********************************************************************
 * A convenience tool for chemistry students that performs calculations
 * related to chemistry, such as getting atomic weight
 * @author Gregory, Eric, Richard, Natalie
 * @date 10/18/2017
 *********************************************************************/
public class Main {

	/******************************************************************
	 * The main class that creates the Gui.
	 * @param args
	 *****************************************************************/
	public static void main(String[] args) {
		PeriodicCalculator test = new PeriodicCalculator();
		test.setSize(1200,600);
		test.setTitle("Periodic Calculator");
	}
}
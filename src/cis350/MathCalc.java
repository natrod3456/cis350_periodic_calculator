package cis350;

import java.util.ArrayList;
import java.util.Stack;

public class MathCalc {
	ArrayList<Elements> mList;
	String display;
	Stack<ArrayList<Elements>> previous;
	
	/******************************************************************
	 * default constructor for class
	 *****************************************************************/
	public MathCalc(){
		mList = new ArrayList<Elements>();
		display = "";
		previous = new Stack<ArrayList<Elements>>();
	}
	
	/******************************************************************
	 * converts the list of elements into a string for display
	 *****************************************************************/
	public String toString(){
		int count = 1;
		Elements current = null;
		display = "";
		
		// loops through all elements in list
		for (Elements e : mList){
			// if element is the same as last element, increments count
			if (e == current && count < 10){
				if (display.endsWith(Integer.toString(count))){
					display = display.substring(0, display.length() - 1);
				}
				count++;
				display += count;
			// if element is the same and count is 2 digits, increments count
			}else if (e == current && count >= 10 && count < 99){
				if (display.endsWith(Integer.toString(count))){
					display = display.substring(0, display.length() - 2);
				}
				count++;
				display += count;
				// does nothing if count is > 99
			}else if (e == current && count > 99){
				
			}
			else{
			count = 1;
			display += e;
			current = e;
			}
		}
		
		return display;
	}
	
	/******************************************************************
	 * adds a new instance of an element to the list
	 * @param e the element to be added
	 *****************************************************************/
	public void addElement(Elements e){
		previous.push(mList);
		mList.add(e);
	}
	
	/******************************************************************
	 * removes the last element entered from the list
	 *****************************************************************/
	public void removeElement(){
		if (mList.size() != 0){
		mList.remove(mList.size() - 1);
		}
	}
	
	public void undo(){
		if (previous.isEmpty()){
			return;
		}
		mList = previous.pop();
	}
	
	/******************************************************************
	 * clears the entire molecule list
	 *****************************************************************/
	public  void clearList(){
		mList.clear();
	}
	
	/******************************************************************
	 * calculates the atomic weight of the molecule
	 * @return weight the total weight of the molecule
	 *****************************************************************/
	public double getWeight(){
		double weight = 0;
		for (Elements e : mList){
			weight += e.getAtomicWeight();
		}
		return weight;
	}
}

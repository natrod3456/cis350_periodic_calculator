package cis350;

/**********************************************************************
 * The math class handling the storage of data for the gui
 * and performing the math functions
 * @author Gregory, Eric, Richard, Natalie
 *********************************************************************/
import java.util.ArrayList;
import java.util.Stack;

public class MathCalc {
	
  /** contains all the elements used and their amount. */
  ArrayList<Elements> mlist;
  
  /** contains the converted string of elements to be displayed. */
  String display;

  /******************************************************************
   * default constructor for class.
   *****************************************************************/
  public MathCalc() {
    mlist = new ArrayList<Elements>();
    display = "";
  }

  /******************************************************************
   * converts the list of elements into a string for display.
   *****************************************************************/
  public String toString() {
    int count = 1;
    Elements current = null;
    display = "";
    
    if (mlist.isEmpty()){
    	display = "empty";
    	return display;
    }

    // loops through all elements in list
    for (Elements e : mlist) {
      // if element is the same as last element, increments count
      if (e == current && count < 10) {
        if (display.endsWith(Integer.toString(count))) {
          display = display.substring(0, display.length() - 1);
        }
        count++;
        display += count;
        // if element is the same and count is 2 digits, increments count
      } else if (e == current && count >= 10 && count < 99) {
        if (display.endsWith(Integer.toString(count))) {
          display = display.substring(0, display.length() - 2);
        }
        count++;
        display += count;
        // does nothing if count is > 99
      } else {
        count = 1;
        display += e;
        current = e;
      }
    }

    return display;
  }

  /********************************************************************
   * adds a new instance of an element to the list.
   * @param e the element to be added.
   *******************************************************************/
  public void addElement(Elements e) {
    ArrayList<Elements> dumb = new ArrayList<Elements>();
    for (int i = 0; i < mlist.size(); i++) {
      dumb.add(mlist.get(i));
    }
    mlist.clear();
    Boolean firstTime = true;
    for (int i = 0; i < dumb.size(); i++) {
      if (firstTime && dumb.get(i) == e) {
        mlist.add(e);
        firstTime = false;
      }
      mlist.add(dumb.get(i));
    }
    if (firstTime) {
      mlist.add(e);
    }
  }

  /******************************************************************
   * removes the first instance of an element from the list
   * @param e the element to be removed.
   *****************************************************************/
  public void removeElement(Elements e) {
    mlist.remove(e);
  }
  
  /******************************************************************
   * clears the entire molecule list.
   *****************************************************************/
  public  void clearList() {
    mlist.clear();
  }

  /******************************************************************
   * calculates the atomic weight of the molecule.
   * @return weight the total weight of the molecule
   *****************************************************************/
  public double getWeight() {
    double weight = 0;
    for (Elements e : mlist) {
      weight += e.getAtomicWeight();
    }
    return weight;
  }
}

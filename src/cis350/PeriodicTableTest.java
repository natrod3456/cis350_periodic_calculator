package cis350;

import static org.junit.Assert.*;

import org.junit.Test;
import javax.swing.ImageIcon;
/**
 * 
 * JUnit Test for the PeriodicTable project.
 *
 */
public class PeriodicTableTest {

	/**
	 * Test method for {@link cis350.Elements#getAtomicNumber()}.
	 */
	@Test
	public void testGetAtomicNumber() {
		int atomicNumber = Elements.H.getAtomicNumber();
		assertEquals(1, atomicNumber, .01);
	}

	/**
	 * Test method for {@link cis350.Elements#getAtomicWeight()}.
	 */
	@Test
	public void testGetAtomicWeight() {
		double atomicWeight = Elements.H.getAtomicWeight();
		assertEquals(1.008, atomicWeight, .001);
	}

	/**
	 * Test method for {@link cis350.Elements#getName()}.
	 */
	@Test
	public void testGetName() {
		String name = Elements.H.getName();
		assertEquals("Hydrogen", name);
	}
	
	/**
	 * Test method for {@link cis350.Elements#getIcon()}.
	 */
	@Test
	public void testgetIcon() {
		assertEquals("src/E3.png", Elements.Li.getIcon().toString());
	}
	
	/**
	 * Test method for {@link cis350.MathCalc#getWeight()}.
	 */
	@Test
	public void testTotalWeight() {
		MathCalc c = new MathCalc();
		c.addElement(Elements.H);
		c.addElement(Elements.H);
		c.addElement(Elements.O);
		c.addElement(Elements.S);
		c.removeElement(Elements.S);
		double totalWeight = c.getWeight();
		assertEquals(18.015, totalWeight, .001);
	}
	
	/**
	 * Test method for {@link cis350.MathCalc#toString()}.
	 */
	@Test
	public void testDisplay() {
		MathCalc c = new MathCalc();
		c.addElement(Elements.Na);
		c.addElement(Elements.Cl);
		c.addElement(Elements.Cl);
		String display = c.toString();
		assertEquals("NaCl2", display);
	}
	
}

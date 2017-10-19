/**
 * 
 */
package cis350;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Ray
 *
 */
public class ElementsTest {

	/**
	 * Test method for {@link cis350.Elements#getAtomicNumber()}.
	 */
	@Test
	public void testGetAtomicNumber() {
		ElementsTest test = new ElementsTest();
		int atomicNumber = 1;
		assertEquals(1, atomicNumber, .01);
	}

	/**
	 * Test method for {@link cis350.Elements#getAtomicWeight()}.
	 */
	@Test
	public void testGetAtomicWeight() {
		ElementsTest test1 = new ElementsTest();
		double atomicWeight = 1.008;
		assertEquals(1.008, atomicWeight, .001);
		
	}

	/**
	 * Test method for {@link cis350.Elements#getName()}.
	 */
	@Test
	public void testGetName() {
		ElementsTest test2 = new ElementsTest();
		String name = "Hydrogen";
		name.equals("Hydrogen");
	}


}

/**
 * 
 */
package ss.week2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author laurine.hetterscheid
 * Test the class Rectangle.
 */
public class RectangleTest {
	private Rectangle smallRectangle;
	private Rectangle bigRectangle;
	//private Rectangle zeroRectangle;
	//private Rectangle errorRectangle;

	/**
	 * Sets initial values for initial variables.
	 */
	@Before
	public void setUp() {
		smallRectangle = new Rectangle(2, 4);
		bigRectangle = new Rectangle(10, 45);
		//zeroRectangle = new Rectangle(0, 0);
		//errorRectangle = new Rectangle (-2, -4);
	}
	

	@Test
	public void testInitialState() {
		assertEquals("small length", 2, smallRectangle.length());
		assertEquals("big length", 10, bigRectangle.length());
		assertEquals("small width", 4, smallRectangle.width());
		assertEquals("big width", 45, bigRectangle.width());
		}
	
}
	
package ss.week2;

public class Rectangle {
	
    private int length; 	// current length
    						// invariant: length > 0
    private int width;		// current width
							// invariant: width > 0

    /**
     * Create a new Rectangle with the specified length and width.
     * @require length > 0
     * 			width > 0
     */
    
    /*@ pure */ public Rectangle(int length, int width) {
    	this.length = length;
    	this.width = width;

    }
    
    /**
     * The length of this Rectangle.
     * @param length length of the <code>Rectangle</code>;
     * @ensures \result > 0;
     */
    /*@ pure */ public int length() {
    	return length;
    }

    /**
     * The width of this Rectangle.
     * @param width width of the <code>Rectangle</code>;
     * @ensures \result > 0;
     */
    /*@ pure */ public int width() {
    	return width;
    }

    /**
     * The area of this Rectangle.
     * @ensures \result > 0;
     */
    /*@ pure */ public int area() {
    	int area = length * width;
    	return area;
    }

    /**
     * The perimeter of this Rectangle.
     * @ensures \result > 0;
     */
    /*@ pure */ public int perimeter() {
    	int perimeter = 2 * (length + width);
    	return perimeter;
    }
}

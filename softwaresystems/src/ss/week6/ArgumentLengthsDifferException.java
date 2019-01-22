/**
 * 
 */
package ss.week6;

/**
 * @author laurine.hetterscheid
 *
 */
public class ArgumentLengthsDifferException extends WrongArgumentException {

	/**
	 * @param j 
	 * @param i 
	 * 
	 */
	public ArgumentLengthsDifferException(int lengthFirstInput, int lengthSecondInput) {
		super("error: length of command line arguments " + "differ (" + lengthFirstInput + "," + lengthSecondInput + ")");
	}

	/**
	 * @param message
	 */
	public ArgumentLengthsDifferException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public ArgumentLengthsDifferException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ArgumentLengthsDifferException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ArgumentLengthsDifferException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

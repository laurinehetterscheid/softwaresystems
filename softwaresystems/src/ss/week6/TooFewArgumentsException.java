/**
 * 
 */
package ss.week6;

/**
 * @author laurine.hetterscheid
 *
 */
public class TooFewArgumentsException extends WrongArgumentException {

	/**
	 * 
	 */
	public TooFewArgumentsException() {
		super("error: too few command line arguments, arguments cannot be null");
	}

	/**
	 * @param message
	 */
	public TooFewArgumentsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public TooFewArgumentsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public TooFewArgumentsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public TooFewArgumentsException(String message, Throwable cause, boolean enableSuppression,
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

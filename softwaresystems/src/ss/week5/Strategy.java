/**
 * 
 */
package ss.week5;

import ss.week4.tictactoe.*;

/**
 * @author laurine.hetterscheid
 *
 */
public interface Strategy {
	
	
	/**
	 * 
	 * @return the name of the strategy
	 */
	public String getName();
	
	/**
	 * 
	 * @param b TicTacToe board
	 * @param m Mark, OO or XX
	 * @return a next legal move
	 */
	public int determineMove (Board b, Mark m);
	

}

/**
 * 
 */
package ss.week5;

import ss.week4.tictactoe.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ss.week4.tictactoe.Mark;

/**
 * @author laurine.hetterscheid
 *
 */
public class NaiveStrategy implements Strategy {

	@Override
	public String getName() {
		return "Naive";
	}

	@Override
	public int determineMove(Board b, Mark m) {
    	
		List<Integer> collectionOfEmptyFields = new ArrayList<Integer>(Board.DIM * Board.DIM);
		
    	for (int i = 0; i < Board.DIM * Board.DIM; i++) {
    		if (b.isEmptyField(i)) {
    			collectionOfEmptyFields.add(i);
    		}
    	}
		    	
    	Random rand = new Random();
    	int leegVeldIndex = rand.nextInt(collectionOfEmptyFields.size());
    	    	
		return collectionOfEmptyFields.get(leegVeldIndex);
	}
}
